// String methods

import java.util.Scanner;

public class M_06_StringMethods {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a="Ganesh";
        String b=new String("Atharva");
        System.out.println(a); 
        System.out.println(b); 

        // String s1=sc.next(); //takes first word or single word 
        // System.out.println(s1);
        // String s2=sc.nextLine(); //takes whole line
        // System.out.println(s2);
        


        System.out.println("\n"+a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.length());


        String st="       Ganesh Pawar        ";
        // st.toUpperCase(); //does not work we have to make its copy
        String st2=st.toUpperCase();

        System.out.println(st);
        System.out.println(st2);

        System.out.println(st2);
        System.out.println(st2.trim());//remove all extra spaces

        String str="Ganesh Avachit Pawar";
        System.out.println(str.substring(5,10));//end index is not includes
        System.out.println(str.substring(4));

        
        System.out.println(str.replace('G', 'M'));

        System.out.println(str.startsWith("Gan"));
        System.out.println(str.endsWith("war"));

        System.out.println(str.repeat(4));

        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("Ava"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a",4));

        System.out.println(str.equals("ganesh avachit pawar"));
        System.out.println(str.equalsIgnoreCase("ganesh avachit pawar"));


        sc.close();


        



    }
    
}
