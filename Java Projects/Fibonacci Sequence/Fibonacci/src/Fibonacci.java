public class Fibonacci {

    public static int[] fillFibonacci(int[] data) {
        if (data == null) {
            return null;
        }

        if (data.length == 0) {
            return data;
        }

        data[0] = 1;


        if (data.length > 1) {
            data[1] = 1;
        }

        for (int i = 2; i < data.length; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }

        return data;
    }

    public static void printFibonacci(int[] data) {
        System.out.println("Term\tFib");
        for (int i = 1; i < data.length; i = i + 1) {
            System.out.println(String.format("%2d", i) + "\t" + data[i]);
        }
    }

    // main method
    public static void main(String[] args){

        int[] fibs1 = new int[7];
        fillFibonacci(fibs1);
        printFibonacci(fibs1);
    }
}
