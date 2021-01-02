import java.util.*;
public class Utkarsh4 {
    static int tribonacci(int n) {
        if(n == 0)
            return 0;
        else if(n<3)
            return 1;
        else return(tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
            System.out.println("negative number");
        else
            System.out.println(tribonacci(n));
        sc.close();
    }
}
