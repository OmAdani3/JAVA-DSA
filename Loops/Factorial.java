import java.util.*;

public class Factorial {
    public static void main(String[] args) {
    // You are given an integer N.

    // Find the factorial of by writing a function that takes N as a parameter and returns N!, where:
    // N!=1×2×3×⋯×N

    // Input
    // The first line contains an integer N (0≤N≤20).
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        
    }
}