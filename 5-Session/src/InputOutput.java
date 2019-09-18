import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[]args){
        /* Appending Text to A File */
            FileWriter fw;

        /* Writing Text to A File */
            PrintWriter outputFile;

        /* Reading Data From a Text File */
            File myFile = new File("Customers.txt");
            Scanner inputFile = new Scanner(myFile);



    {
        try {
            fw = new FileWriter("Manes.txt", true);
            outputFile = new PrintWriter(fw);
            outputFile.println("kathy");
            outputFile.println("billy");
            outputFile.println("bobby");
            outputFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}}

