public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Ricky", 20);
        Person p3 = new Person("Sam");
        Person p4 = new Person(18);
        p1.info();
        p2.info();
        p3.info();
        p4.info();
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String pname, int page) {
        name = pname;
        age = page;
    }
		//构造器3
    public Person(String name) {
        this.name = name;
    }
		//构造器4
    public Person(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("name is " + name + "\nage is " +  age);
    }
}
