
public class M_09_Array {
    public static void main(String[] args)
    {
        // first way

        int arr1[]={322,32,32,32,32,42,42,42,4,343,43,43,3,424,23,42,34,23,4,234,23,4,234,23,4,234,23,42,34,23,4,23,4252,3,324,3,4,3,43,43,234,234,2,432,4,2,42};
        System.out.println(arr1[0]);
        System.out.println(arr1.length);
        for (int i : arr1) 
        {
            System.out.println(i);
        }

        // second way 

        int arr[]=new int[20];
        arr[0]=1989;
        arr[1]=199;
        arr[2]=19;
        arr[3]=1;
        arr[4]=9;
        arr[5]=190;
        arr[6]=1909;
        arr[7]=1099;
        // arr[21]=23;run time error

        System.out.println(arr[4]);

        //third way
        int []arr3;
        arr3=new int[34];
        System.out.println(arr3.length);

        String [] arr5={"ganesh","yash","atharva","rushi"};
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }


    }
}
