import java.util.*;

public class calories_burned {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cal=sc.nextInt();
        int r=sc.nextInt();
        int A=sc.nextInt(); 
        int B=sc.nextInt();
        float P=r*2*(A+B);
        float j=r/P;
        float c_b = cal*j;
        System.out.println(c_b); 
    }
}
