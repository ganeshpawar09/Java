
import java.util.Scanner;

public class M_07_ConditionStatement {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0)
        {
            System.out.println("Your are not yet born");
        }
        else if(age<18)
        {
            System.out.println("Your are under age");
        }
        else
        {
            System.out.println("Your good to go");
        }

        switch(age)
        {
            case 18:
            System.out.println("Your age is 18");
            break;
            case 1:
            System.out.println("Your age is 1");
            break;
            default:
            System.out.println("Nikal ****** pheli fursat me nikal");
            break;
        } 
        sc.close();


    }
}
