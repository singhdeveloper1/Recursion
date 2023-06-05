

public class recursionQ11 {
    //  count zero in digit

    static int zero(int num,int rev,int count){
if(num==0){
    
   return count;
}

if(rev==0){
count++;  

   //   System.out.println(count);    
}

rev=num%10;

num=num/10;


        return zero(num,rev , count);
        
    }
    
    public static void main(String[] args) {
        
      System.out.println( zero(1224500500, 1, 0));
     
    }
}
