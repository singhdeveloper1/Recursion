// import java.util.Scanner;

public class recursionQ3 {


    // factorial 

    
    static void fact(int num, int result){

        if(num==1)
        

    //  if(result==5)
     {
            System.out.println(result);
        return ;
     }
    
        fact(num-1,num*result);

        // fact(num*result,result+1);

    }

    public static void main(String[] args) {

        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the no.");
        // int a=sc.nextInt();
        // int x=a;
        fact(5,1);
    }
}
