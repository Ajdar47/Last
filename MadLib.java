import java.util.Scanner; // I imported the neccessary files to be able to get an input from the user

public class MadLib {       // the program starts from here with the name MadLib
    public static void main(String[] args) {

        Scanner letters = new Scanner(System.in);       // here i have defined letters from the scanner class

        System.out.println("Hi, this is a game called Mad libs from the assignment 1 in chapter 2");        // from here I have included a bunch of information for the user
        System.out.println("So the game works by inputing a bunch of strings");
        System.out.println("im going to ask you those strings and put them in diffrent sentences");
        System.out.println("Please enter the first string and it should be noun");                          // the user will have to in put 4 strings 
        String first = letters.nextLine();
        System.out.println("Please enter the second string and it should be verb");
        String second = letters.nextLine();
        System.out.println("Please enter the third string and it should be adjective");
        String third = letters.nextLine();
        System.out.println("Please enter the fourth string and it should be noun");
        String fourth = letters.nextLine();

        System.out.println("The doctor asked for a "+ first);                                           // the four strings are going to be used in these sentences and will be outputted 
        System.out.println("Jason did "+ second+" to a shop and found a "+first);
        System.out.println("Jason was "+ third);
        System.out.println("But he found out that he picked up a "+ fourth+" instead of a "+first);


    }
}
