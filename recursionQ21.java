public class recursionQ21 {
    // Adjacent series
    // i/p : abbabaab
    // o/p : ab*baba*ab

    static String output = "";

    static void replace(String str, int i) {
        output = output + str.charAt(i);
        if (i == str.length() - 1) {
            return;
        }
        if (str.charAt(i) == str.charAt(i + 1)) {
            output += "*";
        }
        replace(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "abbabaab";
        replace(str, 0);
        System.out.println(output);
    }

}
