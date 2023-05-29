public class recursionQ2 {


    // count digit 12345


    static void countDigit(int num, int count) {

        if (num == 0) {
            System.out.println(count);
            return;
        }

        countDigit(num / 10, count + 1);

    }

    public static void main(String[] args) {

        
        countDigit(12345, 0);
    }

}
