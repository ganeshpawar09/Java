
class Base17{
    public void print(){
        System.out.println("Hello Ganesh, How are you?");
    }
}
class Derived17 extends Base17{
    public void print(){
        System.out.println("Hello Ganesh");
    }
    public void print1(){
        super.print();
    }
}
public class M_17_Overriding {
    public static void main(String[] args) {
        Derived17 d1=new Derived17();
        d1.print1();
    }
}
