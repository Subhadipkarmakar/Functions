import java.util.*;

public class input {
    public static void calculatesum(int a,int b) {

     
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);
    }
}
