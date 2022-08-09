public class Tools {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Tool tool = new Tool();
        // tool.getSum();
        // tool.getSum(10);
        // tool.getSum(10, 20, 30);
        // tool.getSum(10, 20, 30, 40);
        tool.getSum(arr);

    }
}

class Tool {
    public void getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

