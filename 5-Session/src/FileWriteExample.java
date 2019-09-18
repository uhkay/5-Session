import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName;    //File name
        String friendName;  //Friend's name
        int numFriends;     //Number of Friends

        //Create a Scanner object for Keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get the number of Friends
        System.out.println("How many friends do you have?");
        numFriends = keyboard.nextInt();

        //Consume the remaining newline character
        keyboard.nextLine();

        //Get the filename
        System.out.println("Enter the filename: ");
        fileName = keyboard.nextLine();

        //Open the file
        FileWriter fwriter = new FileWriter(fileName);
        PrintWriter outputFile = new PrintWriter(fwriter);

        //Get data and write it to the file
        for (int i = 1; i <= numFriends; i++)
        {
            System.out.println("Enter the name of friend "
            + "number " + i + ": ");
            friendName = keyboard.nextLine();

            //Write the name to the file.
            outputFile.println(friendName);
        }

        //Close the File.
        outputFile.close();
    }
}
