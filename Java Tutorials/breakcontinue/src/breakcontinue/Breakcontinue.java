package breakcontinue;

public class Breakcontinue {

    public static void main(String[] args) {
        
        //Nested Loop Example
        for(int j = 1; j <= 10; j++)
        {
        
            for (int i = 1; i <= 10; i++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
            System.out.println("---------------------------");
        }
        
        // 
        for (int k = 0; k < 10; k++ )
        {
            //if (k == 6) // Specific case to skip
            //if(k%2 == 0)   // Use Modulo and it checks for the value for even
            if (k % 2 != 0) // Use Modulo and check if odd
                continue; // CONTINUE will just skip when the condition is met
                          // BREAK will completely stop the process and exit
            System.out.println(k);
        }
    }
    
}
