public class recursionQ4 {
    //  count digit with return

    static int countDigit(int num, int count) {

        if (num == 0) {
            // System.out.println(count);
            return count;
        }
        return countDigit(num / 10, count + 1);
        // int r =countDigit(num / 10, count + 1);
        // return r;

    }

    public static void main(String[] args) {

        
        int e =countDigit(12345355, 0);
        System.out.println(e);
    }

}
    
