import java.util.Scanner;

public class TheaterKiosk {

    void main () {
        Scanner input = new Scanner(System.in);
        String trash = "";
        int age = 1;
        final int AGE_CUTOFF = 21;

        IO.print("Enter your age, Must be 21 to see this film!: ");
        if (input.hasNextInt())
        {
        age = input.nextInt();

            if(age >= AGE_CUTOFF)
        {
        IO.print("You get a wrist band");
         }
        {
         if( age < AGE_CUTOFF);

        IO.print("You dont get a wrist band");
        }

        }

        else
        {
            trash = input.nextLine();
            IO.println("You must enter a valid age not: " + trash);
        }
    }




}
