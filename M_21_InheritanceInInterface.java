
interface Base{
    void meth1();
    void meth2();
}
interface Derived extends Base{
    void meth3();
    void meth4();
}

class C implements Derived
{
    public void meth3(){
        System.out.println("3");
    }
    public void meth4(){
        System.out.println("4");
    }
    public void meth2(){
        System.out.println("2");
    }
    public void meth1(){
        System.out.println("1");
    }

}

public class M_21_InheritanceInInterface{
    public static void main(String[] args) {
        Derived d=new C();
        d.meth1();
        d.meth2();
        d.meth3();
        d.meth4();
    }
}