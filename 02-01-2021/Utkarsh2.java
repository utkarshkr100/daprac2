import java.util.Scanner;

class Utkarsh2 {
    static private boolean sorted(int[] arr, int index, int num){
        if(index == (arr.length))
            return true;
        else if(num>arr[index])
            return false;
        else return sorted(arr,index+1,arr[index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr, 0, Integer.MIN_VALUE));
        sc.close();

    }
}