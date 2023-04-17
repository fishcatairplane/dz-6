public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 4, 5, 6, 7};
        int[] sums = sumOfEvenAndOddNumbers(arr);
        System.out.println("Sum of even numbers: " + sums[0]);
        System.out.println("Sum of odd numbers: " + sums[1]);
    }
    public static int[] sumOfEvenAndOddNumbers(int[] arr) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }
        return new int[]{sumOfEven, sumOfOdd};
    }
}

