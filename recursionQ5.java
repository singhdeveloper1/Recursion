public class recursionQ5 {
    //  count without 2nd argument
    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        return 1+ countDigit( num/10);

    }
    public static void main(String[] args) {
        System.out.println(countDigit(2354));
    }
    
}
