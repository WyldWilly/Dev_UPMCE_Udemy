
package summingvalues;

public class Summingvalues {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 412, -4, 5, 56};
        
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("i = " + i);
            System.out.println("Numbers is " + numbers[i]);
            System.out.println("sum = " + sum);
            System.out.println();
            sum = sum + numbers[i];
        }
        System.out.println("The Final Sum is " + sum);
        System.out.println();
        System.out.println();
        sum = 0;
        for (int number: numbers)
        {
            sum += number;
        }
        System.out.println(sum);
        
    }
    
}
