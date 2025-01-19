public class Day_1 {
    // Multiplication table of a number class
    static void multiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

    public static void main(String[] args) {
        // Arithmetic operations Add, Sub Multiply
        int a = 15;
        int b = 10;
        System.out.println("Sum of a and b is: " + (a + b));
        System.out.println("Difference of a and b is: " + (a - b));
        System.out.println("Product of a and b is: " + (a * b));
        System.out.println();
        int arr[] = { 10, 15, 20, 25, 30, 31 };
        int sum = 0;
        int odd = 0;
        int even = 0;

        // Sum, Average, Odd, Even numbers in arr
        for (int i : arr) {
            sum += i;
            if (i % 2 == 0) {
                System.out.println(i + " is even");
                even += i;
            } else {
                System.out.println(i + " is odd");
                odd += i;
            }
        }
        System.out.println("Sum of array elements is: " + sum);
        float avg = (float) sum / arr.length;
        System.out.println("Average of array elements is: " + avg);
        System.out.println("Sum of even numbers in array is: " + even);
        System.out.println("Sum of odd numbers in array is: " + odd);
        System.out.println();

        // Prime number check in arr elements
        for (int i : arr) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println();

        // Multiplication table of arr elements
        multiplication(12);
    }
}