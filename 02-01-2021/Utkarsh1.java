import java.util.*;
public class Utkarsh1 {
    static int count(int n){
        if(n==2)
            return 3;
        else
            return (1+count(n-1)*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(count(n));
        }
        sc.close();
    }
}
