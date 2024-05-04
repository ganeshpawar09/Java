import java.util.Scanner;

public class M_25_SpecificError {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=32;
        arr[1]=32324;
        arr[2]=32345;
        Scanner sc= new Scanner(System.in);
        int index=sc.nextInt();
        int div=sc.nextInt();
        try
        {
            System.out.println(arr[index]);
            System.out.println(arr[index]/div);
        }catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception");
            System.out.println(e);
        }
        sc.close();

        
    }
}
