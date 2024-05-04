
import java.util.Scanner;

class Employee{
    public int id;
    public String post;
    private long salary;
    private int age;

    Scanner sc= new Scanner(System.in);
    Employee(){}
    Employee(int id, String post, long salary, int age)
    {
        this.id=id;
        this.post=post;
        this.salary=salary;
        this.age=age;
    }
    void set_data()
    {
        System.out.println("Enter the id :");
        id=sc.nextInt();

        System.out.println("Enter the post :");
        post=sc.next();

        System.out.println("Enter the salary :");
        salary=sc.nextLong();

        System.out.println("Enter the age :");
        age=sc.nextInt();
    }
    void get_data()
    {
        System.out.println("Id: "+id);
        System.out.println("Post: "+post);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
    }
}

public class M_15_OOP2 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.set_data();
        e1.get_data();
    }
}
