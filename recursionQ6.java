public class recursionQ6 {

    // Armstrong number with return

    static boolean isArmStrongNumber(int org, int compute , int compare){
        

        if(org==0){
            if(compute==compare){
                return true;
            }
            return false;
        }

        int a= org%10;
     compute=compute+a*a*a;
        return isArmStrongNumber(org/10, compute, compare);

        


        }
    public static void main(String[] args) {

       System.out.println(isArmStrongNumber(153, 0,153));
  }
}
