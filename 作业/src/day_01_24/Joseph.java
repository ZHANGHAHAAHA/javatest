package day_01_24;

import java.util.LinkedList;

/**
 * 现有n个人围坐一圈，顺时针给大家编号，第一个人编号为1，然后顺时针开始报数。
 * 第一轮依次报1，2，1，2...没报1的人出局。
 * 接着第二轮再从上一轮最后一个报数的人开始依次报1，2，3，1，2，3...没报1的人都出局。
 * 以此类推直到剩下以后一个人。现给定一个int n，要求返回最后一个人的编号。
 *
 *
 * */
public class Joseph {
    public static int getResult(int n) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        int round = 2, i = 0, curr = 0;
        for (i = 1; i <= n; i++) {
            res.add(i);//链表初始化
        }
        while (res.size() > 1) {
            i = 0;
            while (res.size() > 1 && i < res.size()) {
                curr = (curr + 1) % round;
                if (curr != 1){//数的不是1便踢出
                    res.remove(i);
                }else{
                    i++;
                }
            }
            for (Integer integer : res) {
                System.out.print(integer+" ");
            }
            System.out.println();
            round++;//从2,3,4递增
            curr = 0;
            if (res.size() > 1) {
                //完成链表中元素的逆序
                int last = res.removeLast();//返回链表中最后一个元素
                res.addFirst(last);//放到头
            }
            for (Integer integer : res) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
        return res.pop();
    }

    public static void main(String[] args) {
        System.out.println(getResult(10));
    }

}
