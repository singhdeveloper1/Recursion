public class recursionQ7 {

    // 5
    // 3
    // 1
    // 2
    // 4

    static void prn(int num) {
        if (num == 0) {

            return;

        }
        if (num % 2 != 0)
            System.out.println(num);

       
        prn(num - 1);
        if (num % 2 == 0)
        
            System.out.println(num);
    }

    public static void main(String[] args) {

        prn(5);
    }

}
