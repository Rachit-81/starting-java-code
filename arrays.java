package Starting_Java_Code;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // sc.nextLine();
        int[][] numbers = new int[n][m];
        System.out.println("Put your input :\n");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your spiral matrix output :\n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            
            // System.out.println();
        }
        // System.out.print("Write the names in your array: ");
        // for(int i = 0; i < size; i++){
        //     System.out.print("Enter name " + (i + 1) + ": ");
        //     names[i] = sc.nextLine();
        // }
        // System.out.println("\nThe names you entered are:");
        // for(int i = 0; i < names.length; i++){
        //     System.out.println(names[i]);

        // }
        // System.out.println("\nThe names you entered are:");
        // for (String name : names) {
        //     System.out.println(name);
        // }
        // System.out.println("Write the number which you want to search: ");
        // int n = sc.nextInt();

        // for(int j = 0; j < size; j++){
        //     if(marks[j] == n){
        //         System.out.println("Your number "+ n +" is placed on the "+ j +" position of your array.");
        //     } 
        // }
    }
}
