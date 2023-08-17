public class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    // public static int sum(int a,int b,int c){
    // return a+b+c;
    // }
    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean isprime(int n) {
        if(n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void bintodec(int BinNum) {
        int mynum = BinNum;
        int pow = 0;
        int decNum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            decNum = decNum + lastdigit * (int) Math.pow(2, pow);
            pow++;
            BinNum = BinNum / 10;

        }
        System.out.println("decimel of " + mynum + "=" + decNum);
    }

    public static void dectobin(int n) {
        int myNum = n;
        int pow = 0;
        int binnum = 0;
        while (n > 0) {
            int rem = n % 2;

            binnum = binnum + rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;

        }
        System.out.println("binomial of " + myNum + "= " + binnum);
    }

    public static void main(String args[]) {
        System.out.println(isprime(2));
    }
}
 