import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class FileOperations
 {
    public static void main(String args[]) 
    {
        String inputFile = "numbers.txt";
        String evenFile = "even_numbers.txt";
        String oddFile = "odd_numbers.txt";

        writeRandomNumbers(inputFile, 20);
        splitEvenOddNumbers(inputFile, evenFile, oddFile);
        printFile(inputFile);
        printFile(evenFile);
        printFile(oddFile);
    }

    private static void writeRandomNumbers(String fileName, int count) 
    {
    	int i;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) 
        {
            Random rand = new Random();
            for (i = 0; i < count; i++) 
            {
                writer.write(rand.nextInt(100) + " ");
            }
            System.out.println("Generated numbers saved to " + fileName);
        } catch (IOException e) 
        {
            System.err.println("Write error: " + e.getMessage());
        }
    }

    private static void splitEvenOddNumbers(String inputFile, String evenFile, String oddFile)
     {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile));
             BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile))) 
             {

            String[] numbers = reader.readLine().trim().split(" ");
            for (String numStr : numbers) 
            {
                if (!numStr.isEmpty())
                 {
                    int num = Integer.parseInt(numStr);
                    (num % 2 == 0 ? evenWriter : oddWriter).write(num + " ");
                }
            }
            System.out.println("Even and odd numbers separated into files.");
        } catch (IOException e) 
        {
            System.err.println("File processing error: " + e.getMessage());
        }
    }

    private static void printFile(String fileName) 
    {
        System.out.println("Contents of " + fileName + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
         {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }
}

