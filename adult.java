import java.util.*;

public class adult 
{
    public static void main(String args[])
    {
        int age=10;
        if(age >= 18)
        {
            System.out.println("Adult");
        }
        else if(age >13 && age <18)
        {
            System.out.println("Teenager");
        }
        else if(age < 13)
        {
            System.out.println("They might be boys and girls");
        }
        else
        {
            System.out.println("Not a adult");
        }
    }
}