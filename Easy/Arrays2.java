import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        //Reverse Elements
        for(int i=0; i<=n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversed Elements: ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
