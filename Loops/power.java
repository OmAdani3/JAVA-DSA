import  java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int pow = 1;
        //  System.out.println("Before Loop" + x);
        for(int i = 1; i<=n; i++){
            pow = pow* x;
            //  System.out.println("Inside Loop" + x);
        }

        System.out.println("Result: " + pow);
    
    }
}
