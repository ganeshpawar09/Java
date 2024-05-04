
public class M_12_Var {
    static int sum(int a,int b)
    {
        return a+b;
    }
    static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

    static int sum(int ...arr)
    {
        int total=0;
        for (var i : arr) {
            total+=i;
        }
        return total; 
    }
    
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(4,5));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,3));
        System.out.println(sum(4,5,6,3,23,43,234,23,423,4,234,234,23));

    }
}
