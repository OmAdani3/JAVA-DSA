import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0; 

        for(int i = 0; i<=n; i++){
            int rem = n%10;
            n/=10;
            rev = rem + n/10;
            System.out.println(rem);
        }
        System.out.println(rev);

    }
}
