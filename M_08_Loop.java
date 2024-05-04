public class M_08_Loop {
    public static void main(String[] args)
    {
        int i=0;
        while(i<10)
        {
            if(i==5)
                break;
            System.out.println(i);
            
            i++;
        }
        for (int j = 0; j < 10; j++) 
        {
            if(j>5 && j<9)
            {
                continue;
            }
            System.out.println(j);

        }   
    
        do
        {
            System.out.println(i);
            i--;
        }while(i>=0);
    }
}
