import java.util.*;
public class minimum_numeric_value {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        if(str.length() == 1) {
            System.out.println(str);
        }
        else {
            call(str);
        }
    }
    private static void call(String str) {
        int max=0,index=0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > max) {
                index=i;
            }
        }
        if(index==1){
            System.out.println(str.substring(1));
        }
        else{
            System.out.println(charRemoveAt(str, index));
        }
    }
    private static String charRemoveAt(String str, int i) {
        return str.substring(0, i) + str.substring(i + 1);
    }
}
