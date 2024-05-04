import java.util.Scanner;



class college{
    protected int student_id;
    protected int student_marks;
    protected String student_name;
    Scanner sc=new Scanner(System.in);
    public void set_data()
    {
        System.out.println("Enter the id of student :");
        student_id=sc.nextInt();
        System.out.println("Enter the marks of student :");
        student_marks=sc.nextInt();
        System.out.println("Enter the name of student :");
        student_name=sc.next();
    }
    public void get_data()
    {
        System.out.println("The id of student "+ student_id);
        System.out.println("The marks of student "+student_marks);
        System.out.println("The name of student "+student_name);
    }
}
class Teacher extends college
{
    protected String Teacher_name;
    Scanner sc=new Scanner(System.in);
    public void set_data()
    {
        System.out.println("Enter the marks of student :");
        student_marks=sc.nextInt();
        System.out.println("Enter the name of student :");
        student_name=sc.next();
    }
    public void get_data()
    {
        System.out.println("The id of student "+ student_id);
        System.out.println("The marks of student "+student_marks);
        System.out.println("The name of student "+student_name);
    }
}

public class Practicejava{
    public static void main(String args[])
    {
        college ganesh=new college();
        ganesh.set_data();
        ganesh.get_data();
    }
}