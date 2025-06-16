import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Please enter your age: ");
        age = 22;

        if (age >= 21)
        {
            System.out.println("You get a paper wrist band.");
        }

        input.close();
    }
}
