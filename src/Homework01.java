public class Homework01 {
    public static void main(String[] args) {
        double[] arr = { 1.0, 2.34, 9.89, 3.23, 4.56, 7.89 };
        Sort s = new Sort();
        s.getMax(arr);
    }
}

class Sort {
    public void getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
