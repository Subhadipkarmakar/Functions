import java.util.*;
public class swaping {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("valu of a is :");
    int a=sc.nextInt();
    System.out.println("valu of b is :");
    int b=sc.nextInt();
    swap(a, b);
    }
}
