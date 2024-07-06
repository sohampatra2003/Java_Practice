import java.util.*;

public class Income_Tax_Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax;


        if(salary <= 500000)
        {
            tax = (int) 0;
        }
        else if(salary >=  500000  &&  salary <= 100000)
        {
            tax = (int) (salary * 0.2);
        }
        else
        {
            tax = (int) (salary * 0.3);
        }

        System.out.println("Your tax will be:" +tax);
    }
}