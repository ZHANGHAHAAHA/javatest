package 堆;







import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        HeapDemo heapDemo = new HeapDemo();
            int [] nums1 = {1,7,11};
            int [] nums2 = {2,4,6};
        List<List<Integer>> ret = heapDemo.kSmallestPairs(nums1,nums2,3);
        System.out.println(ret);

    }
    /**
     * 堆排序
     * */
    public static void main7(String[] args) {
        int []array = {27,15,19,18,28,34,68,49,25,37};
        HeapDemo heapDemo = new HeapDemo();
        heapDemo.creatBigHeap(array);
        //已经创建一个大根堆  可以获得从小到大的排序  在类中写一个堆排方法
        heapDemo.heapSort();
        heapDemo.show();
    }

    public static void main6(String[] args) {
        /*
        * 求前K个最大的元素 建一个小根堆
        * O（n*log2k）
        * */
        //1.建一个大小为K的小堆
        int []array = {27,15,19,18,28,34,68,49,25,37};
        HeapDemo heapDemo = new HeapDemo();
        heapDemo.topK(array,3);
    }
    public static void main5(String[] args) {
        /**
         * 默认是一个小根堆
         * 如果我想要一个大堆，自定义比较器
         * */
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override//函数式接口
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;
                return o2 - o1;//大堆的方式进行存储
            }
        });
        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(4);
        pq.add(2);
        System.out.println(pq.toString());
        pq.peek();

    }
    public static void main4(String[] args) {
        int [] stones = {2,7,4,1,8,1};
        HeapDemo heapDemo = new HeapDemo();
        heapDemo.creatBigHeap(stones);

        for(int i = 0; i < stones.length-1; i++){
            int first = stones[0];
            stones[0] = 0;
            heapDemo.adjustUp(0);
            stones[0] = first - stones[0];
            heapDemo.adjustUp(0);
        }

        System.out.println(stones[0]);
    }
//    public static int lastStoneWeight(int [] stones){
//
//    }

//    public static int lastStoneWeight(int[] stones) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
//        for (int stone : stones)
//            pq.offer(stone);
//        int distant = 0;
//        while (pq.size() > 1)
//            if ((distant = pq.poll() - pq.poll()) > 0)
//                pq.offer(distant);
//        return pq.isEmpty() ? 0 : pq.poll();
//
//    }
    public static void main3(String[] args) {
        HeapDemo heapDemo = new HeapDemo();
        int []array = {27,15,19,18,28,34,68,49,25,37};
        heapDemo.creatBigHeap(array);

        heapDemo.show();
        heapDemo.push(100);
        heapDemo.show();
    }
    public static void main2(String[] args) {
        /**
         * 默认是一个小根堆
         * 每次存数据时 一定要保证数据依然是一个小根堆
         * 取完数据也要保证 剩下的元素调整为大堆
         * */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(4);
        pq.add(2);
        System.out.println(pq.toString());
        pq.peek();

    }
    public static void main1(String[] args) {
        HeapDemo heapDemo = new HeapDemo();
        int []array = {27,15,19,18,28,34,68,49,25,37};
        System.out.println(Arrays.toString(array));
        heapDemo.creatBigHeap(array);
        heapDemo.show();
    }
}
