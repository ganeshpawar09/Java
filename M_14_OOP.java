
import java.util.Scanner;

class Ganesh{
    int a;
    int b;
    int c;
    Scanner sc=new Scanner(System.in);
    Ganesh(){}
    Ganesh(int a1, int b1, int c1)
    {
        a=a1;
        b=b1;
        c=c1;
    }
    void set_data()
    {
        System.out.print("Enter the value of a,b,c :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
    void get_data()
    {
        System.out.println("The values of a,b,c is: "+ a +" " + b +" " + c +" ");
    }

}
public class M_14_OOP {
   
    public static void main(String[] args)
    {
        Ganesh g1=new Ganesh(12, 32, 23);
        g1.get_data();
        g1.set_data();
        g1.get_data();


    }
}
