package Starting_Java_Code.Oops;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.replaceAll("[^a-z]", "");
        b = b.replaceAll("[^a-z]", "");

        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        if (Arrays.equals(charArrayA, charArrayB)) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
