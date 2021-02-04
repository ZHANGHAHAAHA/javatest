package day_01_24;
/**
 * 最近的请求次数
 * 写一个 RecentCounter 类来计算特定时间范围内最近的请求。
 *
 * 请你实现 RecentCounter 类：
 *
 * RecentCounter() 初始化计数器，请求数为 0 。
 * int ping(int t) 在时间 t 添加一个新请求，其中 t 表示以毫秒为单位的某个时间，并返回过去 3000 毫秒内发生的所有请求数（包括新请求）。确切地说，返回在 [t-3000, t] 内发生的请求数。
 * 保证 每次对 ping 的调用都使用比之前更大的 t 值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-recent-calls
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }
    public int ping(int t) {
        // 用队列来实现，队列中元素个数就是调用ping的次数
        while (!queue.isEmpty()){
            // 若 a < b - 3000,就说明不在题目给定区间，需要从队列中删除
            if (queue.peek() >= t -3000){
                // 在给定区间的话，所有队列中的元素个数就是ping的调用次数
                break;
            }
            // 如果不在给定区间，删除队首元素，继续循环
            queue.poll();
        }
        // 将当前ping的时间点进行入队
        queue.add(t);
        return queue.size();
    }
}
