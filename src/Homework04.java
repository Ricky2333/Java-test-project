public class Homework04 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sam", "male", 20, "engineer", 2000.0);
        employee1.info();
    }

}

class Employee {
    public String name;
    public String gender;
    public int age;
    public String job;
    public double sal;

    // 题干中要求使用“构造器的复用”，因此先写属性少的构造器
    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public void info() {
        System.out.println(this.name + "\t" + this.gender + "\t" + this.age + "\t" + this.job + "\t" + this.sal);
    }

    public Employee(String name, String gender, int age, String job, double sal) {
        this(name, gender, age); // 利用this实现构造器复用
        this.job = job;
        this.sal = sal;
    }

}
