public class recursionQ1 {

    // print value from  1 to 10 { 1 2 3 4 5 6 7 8 9 10}....

    static void printValue(int num) {
        if (num < 1) {
            return;
        }

        System.out.println(num);   // from 10 to 1   


        printValue(num - 1);


        //  System.out.println(num);   // from 1 to 10
    }

    public static void main(String[] args) {

        printValue(10);
    }

}
