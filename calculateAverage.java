package Starting_Java_Code;

import java.util.Scanner;

public class calculateAverage {
    // public static int calculateAverage(int a, int b, int c) {
    //     int avg = (a+b+c)/3;
    //     return avg;
    // }

    // public static int calculateSum(int n) {
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         if(i%122 != 0) {
    //             sum = sum + i;
    //         }
    //     }
    //     return sum;
    // }

    // public static double calculateCircumference(double radius){
    //     double circleCircumference = (2*Math.PI*radius);
    //     return circleCircumference;
    // }

    // public static String checkEligiblity(int age){
    //     if (age >= 18) {
    //         return "Yes, This person is eligible for vote";
    //     }
    //     else
    //         return "No, This person is not eligible for vote";
    // }

    // public static double calculatePower(double a, double b){
    //     double res = Math.pow(a, b);
    //     return res;
    // }

    // public static int calculateGCD(int a, int b){
    //     int res = 1;
    //     int n = 1;
    //     int m = 1;
    //     int gcd = 1;
    //     if(a >= b){
    //         n = a;
    //         m = b;
    //     } else {
    //         n = b;
    //         m = a;
    //     }
    //     while (m != 0) {
    //         int temp = m;
    //         m = n % m;
    //         n = temp;
    //     }
    //     return n;
    // }

    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        // int x = sc.nextInt();
        int n = sc.nextInt();
        printFibonacci(n);


        // System.out.println(" GCD of two numbers is: "+ calculateGCD(x, n));

        // System.out.println(x + " raised to the power of "+ n + " is: "+ calculatePower(x, n));

        
        // double radius = sc.nextDouble();
        // double circumferenceOfCircle = calculateCircumference(radius);
        // System.out.println("circumferenceOfCircle of odd numbers is: " + circumferenceOfCircle);

        // int age = sc.nextInt();
        // System.out.println(checkEligiblity(age));

        // infinite loop using do while
        // int i = 1;
        // do{
        //     System.out.println("This is an infinite loop!");
        //     i++;
        // }while(i > 0);

        // int positive = 0, negative = 0, zeros = 0;
        // System.out.println("Press 1 to continue & 0 to stop: ");
        // int input = sc.nextInt();
        // while(input == 1){
        //     System.out.println("Please Enter your Number: " + input);
        //     int number = sc.nextInt();
        //     if(number > 0){
        //         positive++;
        //     } else if (number < 0) {
        //         negative++;
        //     } else {
        //         zeros++;
        //     }
        //     System.out.println("Press 1 to continue & 0 to stop: ");
        //     input = sc.nextInt();
        // }
        // System.out.println("Positive: " + positive);
        // System.out.println("Negative: " + negative);
        // System.out.println("Zeros: " + zeros);
    }
    
}
