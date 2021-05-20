import java.util.*;
public class patten_printing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        for (int j = 1; j <= num; j++) {
            for (int i = 0; i < (2*j + 1); i++) {
                System.out.print("*");
            }  
            System.out.print(j);
            for (int i = 0; i < (2*j - 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}