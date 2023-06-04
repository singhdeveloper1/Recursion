public class recursionQ9 {

    // sum of digit

static int sumof(int num,int res,int sum){
    if(num==0)
    return sum;


    res=num%10;
    sum=sum+res;
    num=num/10;
    return sumof(num,res,sum);
}



    public static void main(String[] args) {
       System.out.println(sumof(1234,0, 0));
    }
    
}
