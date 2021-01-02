import java.util.*;
public class Utkarsh3 {
    static private int fib(int n){
        if(n<3)
            return 1;
        else return (fib(n-1)+fib(n-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
}
