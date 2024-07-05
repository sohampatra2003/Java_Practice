import java.util.*;

public class odd_even_detection
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The number is a Even number");
        }
        else
        {
            System.out.println("The number is a Odd Number");
        }
 
    }
}