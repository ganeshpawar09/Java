
import java.util.Scanner;

public class M_10_MultiDimensionalArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

        int [][][]arr1=new int [4][2][5];
        int arr4[][][]=new int [4][2][5];
        System.out.println(arr1);
        System.out.println(arr4);
        sc.close();
    }
}