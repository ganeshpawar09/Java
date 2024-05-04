
class Base16{
    int x;
    Base16(){
        System.out.println("Base");
    }
    Base16(int x){
        this.x=x;
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

}
class Derived16 extends Base16{ 
    int y;

    Derived16(int x, int y)
    {
        System.out.println("Derived");
        super.x=x;
        this.y=y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

}

public class M_16_Inhertitance{
    public static void main(String[] args) {
        Derived16 d1=new Derived16(23,43);
        System.out.println(d1.getX());
        System.out.println(d1.getY());
    }
}