 

class a{

}
class b{}
 public class M_01_First extends a{
    public static void main(String[] args) {
        // System.out.println("Hello world");
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println("hl");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println("S1 and S2");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("S3 and S4");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}