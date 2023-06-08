public class recursionQ14 {
    // * * * *
    // * * *
    // * * 
    // *
    static void printstar(int col){
        if(col==0){
            return;
        }
        System.out.print("*");
        printstar(col-1);
    }
    // static void printpattern(int row,int col){
        static void printpattern(int row){
        if(row==0){
            return;
        }
        printstar(row);
        System.out.println();
        printpattern(row-1);
    }
    public static void main(String[] args) {
        printpattern(5);    }
    
}
