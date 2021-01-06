package LinkList;
class Node{
    public int val;
    public Node next;

    public Node(){

    }

    public Node(int val){
        this.val = val;
    }
}
public class MyLinkList {
    public Node head;

    public void createLinkList() {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;

    }

    //找最后一个节点
    public Node findLastNode() {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找倒数第二个节点
    public Node findLastTwoNode() {
        Node cur = this.head;
        if (cur.next == null) {
            System.out.println("没有节点");
        }
        if (cur.next.next == null) {
            System.out.println("就一个节点");
        }
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找是否包含某个元素
    public Node findNNode(int n) {
        if (this.head == null) {
            System.out.println("null");
            return null;
        }
        if (n <= 0) {
            System.out.println("n不合法");
            return null;
        }
        if (n > size()) {
            System.out.println("n太大了");
            return null;
        }
        int count = 1;
        Node cur = this.head;
        while (count != n) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //求链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {//这样才能遍历完
            cur = cur.next;
            count++;
        }
        return count;
    }

    //是否包含某个元素
    public boolean contains(int toFind) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == toFind) {
                return true;
            }
            cur = cur.next;
        }
        return false;

    }

    //遍历链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    /**
     * 从指定的位置newHead
     * 开始进行打印
     * @param newHead
     */
    public void display(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print (cur.val +" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        //首先得有节点
        Node node = new Node(data);
        //判断链表是不是空
        if (this.head != null) {
            //插入
            node.next = this.head;
        }
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        //创建节点
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            //遍历链表到最后
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * 该函数是找到index-1对应的位置
     */
    public Node moveIndex(int index) {
        Node cur = this.head;
        int count = 0;
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //找到某个节点插入
    public void addIndex(int index, int data) {
        //判断位置是否合法
        if (index < 0 || index > size()) {
            System.out.println("插入位置不合法");
            return;
        }
        //如果index=0就是头插法
        if (index == 0) {
            addFirst(data);
            return;
        }//如果index=size就是尾插法
        if (index == size()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = moveIndex(index);
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 查找关键值的前驱节点
     *
     * @param key
     * @return
     */
    public Node searchPrev(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.val == key) {//判断头节点是否为关键值
            this.head = this.head.next;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("null");
        } else {
            Node del = prev.next;//定义删除节点
            prev.next = del.next;
        }

    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
    }

    /* ********************************************************************* */
    //输入一个链表,输出该链表中倒数第k个结点
    public Node FindLastKNode(Node head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node pre = head;
        Node last = head;
        for (int i = 1; i < k; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;

    }

    //返回链表的中间结点
    public Node middleNode(Node head) {
        // 先排除特殊情况
        if (head == null) {
            return null;
        }
        int size = size();
        for (int i = 0; i < size / 2; i++) {
            head = head.next;
        }
        return head;
    }

    //反转一个单链表
    public Node reverseList1() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }



//        public Node reverseList() {
//            Node cur = this.head;
//            Node prev = null;
//            Node newHead = null;
//            while (cur != null) {
//                Node curNext = cur.next;
//                if(curNext == null) {
//                    newHead = cur;
//                }
//                cur.next = prev;
//                prev = cur;
//                cur = curNext;
//            }
//            return newHead;
//        }

    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public Node mergeTwoLists(Node l1,Node l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        Node newhead=null;
        Node newTail=null;
        Node cur1=l1;
        Node cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                if(newTail==null){
                    newhead=cur1;
                    newTail=cur1;
                }else{
                    newTail.next=cur1;
                    newTail=newTail.next;
                }
                cur1=cur1.next;
            }else{
                if(newTail==null){
                    newhead=cur2;
                    newTail=cur2;
                }else{
                    newTail.next=cur2;
                    newTail=newTail.next;
                }
                cur2=cur2.next;
            }
        }
        if(cur1==null){
            newTail.next=cur2;
        }else{
            newTail.next=cur1;
        }
        return newhead;
    }
    //判断一个链表是否是回文
    public boolean chkPalindrome(){
        if(this.head==null){
            return false;
        }
        //找到当前链表的中间位置
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //从中间位置开始 后半部分进行反转
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //head从头往后走  slow从后往前走
        while (slow!=head){
            //只要发现对应的val值不一样，就返回false  直到head和slow相遇
            if(head.val!=slow.val){
                return false;
            }
            if(head.next==slow)
            {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    //判断链表是否有环
    public boolean hasCycle(Node head){
        if(head==null)return false;
        Node fast = head;
        Node slow = head;
        while (fast!=null&&slow!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast == slow){
            return true;
        }
        if(fast ==null||fast.next==null){
            return false;
        }
        return true;
        ////////////////////////////////////
//        if(fast ==null||fast.next==null){
//            return null;
//        }
//        slow = this.head;
//        while (fast !=slow){
//            slow=slow.next;
//            fast = fast.next;
//        }
    }




}
