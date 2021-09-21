ackage com.company;

import java.util.Scanner;

public class Main {
    static void reverseFib(int V1){
        int arr[] = new int[V1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i =2; i < V1; i++)
        {
            arr[i] = arr[i-2]+ arr[i-1];
        }
        for (int i = V1 - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int V1 = sc.nextInt();
        reverseFib(V1);

    }
}

