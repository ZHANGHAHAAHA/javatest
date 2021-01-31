package 堆;

import java.util.*;

public class HeapDemo {
    public int [] elem ;
    public int useSize;

    public  HeapDemo(){
        this.elem = new int[10];
    }
    public void adjustDown2(int [] nums,int start){
        int next = 2 * start + 1;
        int tmp = nums[start];
        while(next < nums.length){
            if(next < nums.length-1 && nums[next+1] > nums[next])
                next++;
            if(nums[next] > tmp){
                nums[start] = nums[next];
                start = next;
                next = 2 * start + 1;
            }else{
                break;
            }
        }
        nums[start] = tmp;
    }


    public void adjustDown(int parent,int len){
        int child = 2*parent+1;
        //child<len说明有左孩子 但不一定有右孩子
        while (child<len){
            //child+1<len说明有右孩子
            if (child+1<len&&this.elem[child]<this.elem[child+1]){
                child++;
            }
            //child一定是左右孩子的最大值下标
            if(this.elem[child]>this.elem[parent]){
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                //从最后一颗树开始  只要child《=parent 后续就不需要调整了
                break;
            }
        }
    }
    public void creatBigHeap2(int [] array){
        for (int i = 0; i <array.length ; i++) {
            this.elem[i] = array[i];
            this.useSize++;
        }
        for (int i = ((useSize-1-1)/2); i >=0 ; i--) {
            adjustDown2(array,i);
        }
    }

    public void creatBigHeap(int [] array){
        for (int i = 0; i <array.length ; i++) {
            this.elem[i] = array[i];
            this.useSize++;
        }
        for (int i = ((useSize-1-1)/2); i >=0 ; i--) {
            adjustDown(i,useSize);
        }
    }
    public void show(){
        for (int i = 0; i <useSize-1 ; i++) {
            System.out.println(this.elem[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){
        return this.useSize == this.elem.length;
    }

    public  void  push(int val){
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.useSize] = val;
        this.useSize++;
        adjustUp(this.useSize-1);
    }
    public void adjustUp(int child){
        int parent = (child-1)/2;
        while (child>0){
            //child和parent比较
            if(this.elem[child]>this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            }else {
                break;
            }
        }
    }
    public int poll(){
        if (isEmpty()){
            throw new  RuntimeException("数组为空");
        }
        int ret = this.elem[0];
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.useSize-1];
        this.elem[this.useSize-1] = tmp;

        this.useSize--;
        adjustDown(0,useSize-1);
        return ret;

    }
    public boolean isEmpty(){
        return this.useSize == 0;
    }
    public int peek(){
        if (isEmpty()){
            throw new  RuntimeException("数组为空");
        }
        return this.elem[0];
    }
        //求前K个最小的元素 建一个大根堆
        public  void topK(int [] array,int k){
            PriorityQueue<Integer> pq = new PriorityQueue<>(k,new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0;i < array.length;i++){
                if (pq.size()<k){
                    pq.offer(array[i]);
                }else {
                    Integer top = pq.peek();
                    if (top != null){
                        if (array[i] > top ){
                            pq.poll();
                            pq.offer(array[i]);
                        }
                    }
                }

            }
            for (int i = 0; i <k ; i++) {
                System.out.println(pq.poll());
            }

        }
        //堆排序
    public void heapSort(){

        int end = this.elem.length-1;
        while (end > 0){
            //end与第一个元素交换
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            //交换完成后进行重排
            adjustDown(0,end);
            //end向前移动
            end--;
        }
    }
    /**
     * 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
     * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
     * 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
     *
     * */
    // 大顶堆，比较器使用lambda表达式，更简洁
//        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, (o1, o2)->{
//            return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
//        });
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
            }
        });
        // 遍历所有可能的集合
        for(int i = 0; i < Math.min(nums1.length, k); i++){
            for(int j = 0; j < Math.min(nums2.length, k); j++){
                // 如果当前的两个数之和超过了堆顶元素，数组已经排序，后面的元素只会更大，因此无需继续遍历
                if(queue.size() == k && nums1[i]+nums2[j] > queue.peek().get(0) + queue.peek().get(1)){
                    break;
                }

                // 若比堆顶小，则弹出堆顶元素，把当前数对加入
                if(queue.size() == k){
                    queue.poll();
                }
                List<Integer> list = new ArrayList<>();
                list.add(nums1[i]);
                list.add(nums2[j]);
                queue.add(list);
            }
        }

        // 最后将元素弹出，倒序插入数组即可
        List<List<Integer>> ret = new LinkedList<>();
        for(int i =0; i < k && !queue.isEmpty(); i++){
            ret.add(0, queue.poll());
        }
        return ret;
    }


}
