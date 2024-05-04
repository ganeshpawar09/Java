// Input scanner class

import java.util.Scanner;

public class M_04_Scanner {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        System.out.println("Sum of a and b is :"+(a+b));

        float c=sc.nextFloat();
        System.out.println(c);

        boolean b1=sc.hasNextInt();
        System.out.println(b1);

        String word=sc.next();
        System.out.println(word); //for word and word before first space  


        String str=sc.nextLine(); // for lint 
        System.out.println(str);

        sc.close();

    }
}
