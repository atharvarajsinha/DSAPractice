//Maximum and minimum of an array using minimum number of comparisons
import java.util.*;
class Arrays1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        int min,max;
        min=max=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Minimum Element is: "+min);
        System.out.println("Maximum Element is: "+max);
    }
}
/*
* 
import java.util.*;
class Arrays1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Minimum Element is: "+arr[0]);
        System.out.println("Maximum Element is: "+arr[n-1]);
    }
}
*/