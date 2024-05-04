
class Base18{

    public void rushi(){
        System.out.println("rushi");
    }

    public void Print(){
        System.out.println("This is Base class");
    }
}
class Derived18 extends Base18{
    public void ganesh(){
        System.out.println("ganesh");
    }

    public void Print(){
        System.out.println("This is Derived class");
    }
    
}


public class M_18_DynamicDipatch {
    public static void main(String[] args) {
        Base18 d=new Derived18();
        d.Print();
        d.rushi();
        //d.ganesh(); //Not allowed
    }
    
}
