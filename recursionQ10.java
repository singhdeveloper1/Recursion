import java.util.Scanner;

public class recursionQ10 {

    // pallidrome using recursion
         static boolean pal(int num,int rem,int sum,int b){
     
        if(sum==b){
            return true ;
        }
        
  
      
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        
          return  pal(num, rem, sum,b);
          
        }
        public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no.");

        int a= sc.nextInt();
        
            System.out.println(pal(a, 0, 0,a));

        sc.close();
        }
    
}
