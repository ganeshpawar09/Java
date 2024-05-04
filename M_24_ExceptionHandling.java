// Syntax Error;
// Logic Error;
// Runtime Error;



public class M_24_ExceptionHandling {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try
        {
            int c=a/b;
            System.out.println("a/b: "+c);
            
        }catch(Exception e)
        {
            System.out.println("We fail to divide ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
