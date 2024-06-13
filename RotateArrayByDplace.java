import java.util.Scanner;

public class RotateArrayByDplace {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of d: ");
        d = sc.nextInt();
        letRotate(arr, arr.length, d);
        System.out.println("Array after rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void letRotate(int arr[], int n, int d) {
//        d = d % n;
//        int temp[] = new int[d];
//        for (int i = 0; i < d; i++) {
//            temp[i] = arr[i];
//        }
//        for (int i = d; i < n; i++) {
//            arr[i - d] = arr[i];
//        }
//        for (int i = n - d; i < n; i++) {
//            arr[i] = temp[i - (n - d)];
//        }
        //using reverse  method for left rotate
     // Reverse(arr, 0, n-d-1);
    //  Reverse(arr, n-d, n-1);
    //  Reverse(arr, 0,n-1);

        //using reverse  method for right rotate
        Reverse(arr, 0, n-1);
        Reverse(arr, 0, d-1);
        Reverse(arr, d,n-1);
    }
    static void Reverse(int arr[], int si, int ei){
        while (si<=ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
}
