public class recursionQ12 {
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    static void printstar(int col){
        if(col==5){
            return;
        }
        System.out.print("*");
        printstar(col+1);
    }
    static void printpattern(int row,int col){
        if(row==0){
            return;
        }
        printstar(col);
        System.out.println();
        printpattern(row-1,col);
    }

        public static void main(String[] args) {
            printpattern(5, 0);
        }

    }
    

