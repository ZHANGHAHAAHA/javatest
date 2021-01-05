import java.util.Arrays;

public class MyArrayList {
//    public int [] elem = new int[10];
//    public int useSize = 0;
    private int [] elem;//通过构造方法来实现更好一点
    private  int useSize;
    public  MyArrayList(){
        this.elem = new int[5];
    }
    public  MyArrayList(int capacity){
        this.elem = new int [capacity];
    }
    //打印顺序表
    public void display(){
        for (int i = 0; i <this.useSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){
        if(this.useSize == this.elem.length){
            return true;
        }
        return false;
    }
    public void reSize(){
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
    }
    //默认插入到数组最后
    public void add1(int data){
        if(isFull()){
           // System.out.println("顺序表为满");进行扩容
            reSize();

        }
        this.elem[this.useSize] = data;
        this.useSize++;
    }
    //在pos位置插入一个数据 1.是否为null或者full  2.判断是否合法 3.插入前要有唯一的前驱 前面必须有数据（pos的值不可以超过有效数据）
    public void add(int pos,int data){
        if(isFull()){
            //System.out.println("顺序表为满");
            reSize();

        }
        if(pos < 0 || pos>this.useSize){
            System.out.println("插入位置不合法");
            return;
        }
        for (int i = this.useSize-1;i>=pos;i--){
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.useSize++;
    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i <this.useSize ; i++) {
            if(this.elem[i] == toFind){
                return true;
            }

        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i <this.useSize ; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    //获取顺序表的长度
    public int size(){
        return this.useSize;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(pos < 0 || pos>=this.useSize){
            System.out.println("查询位置不合法");
            return -1;
        }
        return this.elem[pos-1];
    }
    //清空顺序表
    public void clear(){
        this.useSize = 0;
    }
    //将pos位置的元素修改为value
    public void setPos(int pos,int value){
        if(pos < 0 || pos>=this.useSize){
            System.out.println("查询位置不合法");
            return ;
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int key){
        //1.查找是否有key index
        int index = search(key);
        if(index == -1){
            System.out.println("没有");
            return;
        }
        //2.i = index    i<useSize-1
        for (int i = index; i <this.useSize-1 ; i--) {
            this.elem[i] =  this.elem[i+1];
        }
        //3.this.useSize--
        this.useSize--;
    }
}
