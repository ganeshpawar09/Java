
public class M_13_Recurssion {
    static long factorial(int n)
    {
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
