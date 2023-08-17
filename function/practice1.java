import java.util.*;
public class practice1 {
public static float avg(Float a,Float b, Float c){
    float avg=(a+b+c)/3;
    return avg;
}
public static boolean isEven(int n){
    if(n%2==0){
        return true;
    }else {
        return false;
    }
    
}
    public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // float a=sc.nextInt();
    // float b=sc.nextInt();
    // float c=sc.nextInt();
    // System.out.println("the avarege is :"+avg(a, b, c));
    System.out.println(isEven(5));
    }
}
