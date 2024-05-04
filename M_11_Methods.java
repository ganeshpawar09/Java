public class M_11_Methods {
    public static int sum(int  a, int b)
    {
        return a+b;  
    }
    public int Add(int  a, int b)
    {
        return a+b;  
    }
    public static void main(String[] args)
    {
        int a=32;
        int b=23;

        M_11_Methods obj=new M_11_Methods();

        int d=obj.Add(43, 23);
        System.out.println(d);

        int c= sum(a,b);
        System.out.println(c);
        System.out.println(sum(a,b));
        
    }
     
}

