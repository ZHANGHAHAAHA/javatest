package LinkList;

public class Demo01 {
    public static void main(String[] args) {
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(3);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(1);
       boolean ret =  myLinkList1.chkPalindrome();
        System.out.println(ret);
    }
    public static void main7(String[] args) {
        //链表反转测试
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(3);
        myLinkList1.addFirst(4);
        myLinkList1.addFirst(2);
        myLinkList1.display();
        Node ret = myLinkList1.reverseList1();
        myLinkList1.display(ret);
    }
    public static void main6(String[] args) {
        //链表删除key元素测试
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(3);
        myLinkList1.addFirst(4);
        myLinkList1.addFirst(2);
        myLinkList1.display();
        myLinkList1.removeAllKey(2);
        myLinkList1.display();
    }
    public static void main5(String[] args) {
        //链表找中间元素测试
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(3);
        myLinkList1.addFirst(4);
        myLinkList1.addFirst(5);
        myLinkList1.display();
        Node ret = myLinkList1.middleNode(myLinkList1.head);
        System.out.println(ret.val);
    }
    public static void main4(String[] args) {
        //链表查找最后元素的测试
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(2);
        myLinkList1.addFirst(3);
        myLinkList1.addFirst(4);
        myLinkList1.display();
        Node ret = myLinkList1.FindLastKNode(myLinkList1.head,2);
        System.out.println(ret.val);
    }
    public static void main3(String[] args) {
        //两个链表结合测试
        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(1);
        myLinkList1.addFirst(5);
        myLinkList1.addFirst(7);
        myLinkList1.addFirst(8);
        MyLinkList myLinkList2 = new MyLinkList();
        myLinkList2.addFirst(4);
        myLinkList2.addFirst(3);
        myLinkList2.addFirst(2);
        myLinkList2.addFirst(1);
        Node node =  myLinkList1.mergeTwoLists(myLinkList1.head,myLinkList2.head);
        myLinkList2.display(node);

    }
    public static void main2(String[] args) {

        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(2);
        myLinkList.addFirst(12);
        myLinkList.addLast(1);
        myLinkList.addLast(3);
        myLinkList.addFirst(2);
        //myLinkList.display();//12 2 1 3
        myLinkList.addIndex(0,10);
        //myLinkList.display();//10 12 2 1 3
        myLinkList.addIndex(5,20);
        //myLinkList.display();//10 12 2 1 3 20
        myLinkList.addIndex(2,30);
        myLinkList.display();//10 30 12 2 1 3 20
        myLinkList.removeAllKey(2);
        myLinkList.display();


    }
    public static void main1(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.createLinkList();
        myLinkList.display();

        Node a = myLinkList.findNNode(2);
        System.out.println("第n个节点是"+a.val);

        int b = myLinkList.size();
        System.out.println(b);

        boolean c = myLinkList.contains(42);
        System.out.println(c);

        Node ret = myLinkList.findLastTwoNode();
        System.out.println(ret.val);

        myLinkList.addFirst(2);
        myLinkList.display();

    }
}
