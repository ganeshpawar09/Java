
interface bicycle{
    int a=434; //we can not change it
    void applybreak(int decrement);
    void applyaccelerator(int increment);
    default void dash_cam(int cam) // this can be overwrite in derived class else this defination used
    {
        System.out.println("Recording with cam");
    }
}
interface bicycle2{
    int a=434; //we can not change it
    void applybreak2(int decrement);
    void applyaccelerator2(int increment);
}
abstract class bicycle1{
    abstract void applybreak1(int decrement);
    abstract void applyaccelerator1(int increment);
}


class Avoncycle extends bicycle1 implements bicycle,bicycle2 {
    int a=234;
    public void applybreak(int decrement)
    {
        System.out.println("Applying breaks");
    }
    public void applyaccelerator(int increment)
    {
        System.out.println("Applying accelerator");
    }
    public void applybreak1(int decrement)
    {
        System.out.println("Applying breaks");
    }
    public void applyaccelerator1(int increment)
    {
        System.out.println("Applying accelerator");
    }
    public void applybreak2(int decrement)
    {
        System.out.println("Applying breaks");
    }
    public void applyaccelerator2(int increment)
    {
        System.out.println("Applying accelerator");
    }
}

public class M_20_Interface {
    public static void main(String[] args) {
        bicycle b=new Avoncycle();
        b.applyaccelerator(23);
        b.applybreak(32);
        Avoncycle a=new Avoncycle();
        a.applyaccelerator(13);
        a.applybreak(13);
        System.out.println(a.a);
    }
    
}
