public class recursionQ20 {
    //  replace all pi values with 3.14
    // i/p : str = "2*pi + 3*pi = 5*pi"
    // o/p : str = "2*3.14 + 3*3.14 = 5*3.14"
    
static String replace(String str, int i){
    if(i==str.length()){
        return "";
    }
    if(str.charAt(i)=='p' && str.charAt(i+1)=='i'){
        return "3.14" + replace(str,i+2);
    }
    else{
        return str.charAt(i) + replace(str,i+1);

    }
}
public static void main(String[] args) {
    String str ="2*pi + 3*pi = 5*pi";
    String r=replace(str,0);
    System.out.println(r);
}
    
}
