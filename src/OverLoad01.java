public class OverLoad01 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(10);
        methods.m(10, 20);
        methods.m("Hello,I'm Ricky");
        methods.max(200, 900);
        methods.max(33.3, 78543.324);
    }
}

class Methods {
    public void m(int n) {
        System.out.println(n * n);
    }

    public void m(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void m(String s) {
        System.out.println(s);
    }

    public void max(int n1, int n2) {
        System.out.println(n1 > n2 ? n1 : n2);
    }

    public void max(double n1, double n2) {
        System.out.println(n1 > n2 ? n1 : n2);
    }

}
