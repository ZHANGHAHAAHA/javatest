package day_02_02;

import java.util.Arrays;
/**
 *N  辆车沿着一条车道驶向位于 target 英里之外的共同目的地。
 *
 * 每辆车 i 以恒定的速度 speed[i] （英里/小时），从初始位置 position[i] （英里） 沿车道驶向目的地。
 *
 * 一辆车永远不会超过前面的另一辆车，但它可以追上去，并与前车以相同的速度紧接着行驶。
 *
 * 此时，我们会忽略这两辆车之间的距离，也就是说，它们被假定处于相同的位置。
 *
 * 车队 是一些由行驶在相同位置、具有相同速度的车组成的非空集合。注意，一辆车也可以是一个车队。
 *
 * 即便一辆车在目的地才赶上了一个车队，它们仍然会被视作是同一个车队。
 * 会有多少车队到达目的地?

 *  */
class Car{
    public int position;
    public int time;

    public Car(int position, int time) {
        this.position = position;
        this.time = time;
    }
}
public class Demo02 {
    public static void main(String[] args) {
        int target = 12;//路程长度为12
        int []position = {10,8,0,5,3};
        int []speed = {2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
    }
    public static int carFleet(int target, int[] position, int[] speed){
        int N = position.length;//车辆总数为起始位置的个数
        Car [] cars = new Car[N];//创建N个车放在对象数组中
        for (int i = 0; i <cars.length ; i++) {
            cars[i] = new Car(position[i],(target-position[i])/speed[i]);//输入每辆车的信息
        }
        //依据每辆车的起始位置进行排序
        Arrays.sort(cars,(a,b)->Integer.compare(a.position,b.position));//
        int ret = 0;
        int c = N;
        while (--c>0){
            if (cars[c].time < cars[c-1].time){//前车时间小于后车 则不可能追上
                ret++;//在不同的车队
            }else {
                cars[c-1] = cars[c];
            }
        }
        return ret+(c == 0?1:0);
    }
}
