

public class recursionQ8 {

    // prime no. using recursion

   static boolean prime(int num,int i){
    if(num%i==0){
        return false;
    }
    
  if(i==num-1){
  return true;
  }
    return prime(num,i+1);
    
    

   }
   public static void main(String[] args) {
   System.out.println(prime(25,2));
   }

    }

