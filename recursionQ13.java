

public class recursionQ13 {
    // *
    // * *
    // * * *
    // * * * *
    

    static void printstar(int col){
        if(col==0){
            return;
        }
        System.out.print("*");
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
