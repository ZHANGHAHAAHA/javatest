package Demo01;
class Node{
    public int val;
    public Node next;
}
public class Demo01 {
    public static Node reverse(Node head){
        Node cur = new Node();
        Node curPrev = null;
        Node temp = null;

        while (cur!=null){
            if (cur.next==null){
                temp = cur;
            }
            Node curNext = cur.next;
            cur.next = curPrev;
            curPrev = cur;
            cur = curNext;
        }
        return temp;
    }
    public static void main(String[] args) {
        //构建链表
        Node head = new Node();
        head.val = 1;
        head.next = new Node();
        head.next.val = 2;
        head.next.next = new Node();
        head.next.next.val = 3;

        //打印链表
        Node cur = new Node();
        cur = head;

        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }


}
