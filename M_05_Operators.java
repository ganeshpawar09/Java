//Operators
public class M_05_Operators {
    public static void main(String[] args)
    {
        int a=34;
        int b=43;
        System.out.println("\nArihtmatic operation\n");
        System.out.println();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        System.out.println("\nComparion operation\n");

        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        System.out.println("\nLogical operation\n");

        System.out.println((a==b)&&(a!=b));
        System.out.println((a==b)||(a!=b));
        System.out.println(!(a==b)&&(a!=b));
        System.out.println(!(a==b)||(a!=b));

        System.out.println("]nBitwise operator\n");

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        System.out.println("\nAssignment operator\n");

        System.out.println(a);
        a=b;
        System.out.println(a);
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);
        a/=b;
        System.out.println(a);
        


    }
}
