public class recursionQ15 {
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    static int k=0;
    static void printstar(int col){
        
        if(col==0){
            return;
        }
        k++;
        
        System.out.print(k);
        printstar(col-1);
       
    }
    static void printpattern(int row,int col){
        if(row==0){
            return;
        }
        printstar(col);
        System.out.println();
        printpattern(row-1,col+1);
    }
    public static void main(String[] args) {
        printpattern(5,0);    }
    
}
