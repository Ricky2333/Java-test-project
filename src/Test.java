public class Test {
    public static void main(String[] args) {
        Pupil p = new Pupil();
        p.name = "明世隐";
        p.getAlias("小明");
    }

}

class Pupil {
    String name; 

    public void getAlias(String name) {
        System.out.println("我的本名是：" + this.name + "\n我的小名是：" + name);
    }
}
