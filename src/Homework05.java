
// （1）编写类 `Circle`，包含 `double` 类型的 `radius` 属性代表圆的半径，`findArea` 方法返回圆的面积。
// （2）编写类 `PassObject`，包含方法 `printAreas`，定义如下： `public void printAreas(Circle c, int times)`。
// （3）在 `printAreas` 方法中打印输出半径为 1 到 `times` 的圆的面积。
// （4）在 `main` 方法中调用 `printAreas` 方法。

public class Homework05 {
    public static void main(String[] args) {
        Circle c = new Circle();
        int times = 5;
        PassObject passObject = new PassObject();
        passObject.printAreas(c, times);
    }

}

class Circle {
    double radius;

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

class PassObject {

    public void printAreas(Circle c, int times) {
        System.out.println("radius\t" + "areas");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(c.radius + "\t" + c.findArea());
        }
    }

}
