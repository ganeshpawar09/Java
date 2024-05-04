
abstract class Base19{
    public int multi(int a,int b)
    {
        return a*b;
    }
    abstract public int add(int a,int b);
    abstract public int sub(int a,int b);
}
class Derived19 extends Base19{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}

public class M_19_AbstractClass {
    public static void main(String[] args) {
        Derived19 d= new Derived19();
        System.out.println(d.add(20, 32));
        System.out.println(d.sub(30, 20));
        System.out.println(d.multi(23, 34));
        Base19 b=new Derived19();
        System.out.println(b.add(23, 34));
        System.out.println(b.multi(323, 4));
    } 
}
