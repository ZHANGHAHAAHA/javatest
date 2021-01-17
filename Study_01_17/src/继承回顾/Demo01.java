package 继承回顾;
class Shape{
    public void draw(){

    }
}


class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⭕");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个菱形");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}



public class Demo01 {
    //代码简洁其逻辑结构相对复杂
    public static void main(String[] args) {
        Shape [] shapes = {new Rect(),new Circle(),new Flower(),new Circle()};//此处发生向上转型
        for (Shape s:shapes
             ) {
            s.draw();
        }

    }
    public static void main2(String[] args) {
        Rect rect = new Rect();
        Circle circle = new Circle();
        Flower flower = new Flower();
        String []shapes = {"rect","circle","flower","circle"};
        for (String s:shapes
        ) {
            if (s.equals("rect")){
                rect.draw();
            }else if (s.equals("circle")){
                circle.draw();
            }else if (s.equals("flower")){
                flower.draw();
            }
        }
    }
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main1(String[] args) {
        //Shape shape  = new Circle();//发生向上转型
        Rect rect = new Rect();
        Circle circle = new Circle();
        Flower flower = new Flower();
        rect.draw();
        //或者调用方法
        drawMap(new Rect());
        drawMap(new Circle());
        drawMap(new Flower());
        //当需要打印的数量过多，可以建立一个数组

    }
}
