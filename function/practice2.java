import java.util.*;
public class practice2 {
    public static boolean ispalindrome(int number){
        int palindrome=number;
        int reverse=0;
        while (palindrome!=0){
        int reminder=palindrome%10;
        reverse=reverse*10+reminder; 
    palindrome/=10;

        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   int number=sc.nextInt();
   if(ispalindrome(number)){
    System.out.println(
        "the number is palindrome" );
   }
   else{System.out.println("the number is not a palindrome");}
   

   
    }
}