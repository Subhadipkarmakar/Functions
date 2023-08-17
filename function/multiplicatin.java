public class multiplicatin {
    public static int mul(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factonum(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String args[]) {
        // int a=3;
        // int b=9;
        // int cal=mul(a, b);

        System.out.println(factonum(8));
    }
}
