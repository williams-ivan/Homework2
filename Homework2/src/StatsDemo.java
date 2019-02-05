import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class StatsDemo
{
	public static void main(String[] args) throws Exception //throws clause
	{
		double sum = 0; // The sum of the numbers
		int count = 0; // The number of numbers added
		double mean = 0; // The average of the numbers
		double stdDev = 0; // The standard deviation
		String line; // To hold a line from the file
		double difference; // The value and mean difference

		//Create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);
		String filename; // The user input file name
		//Prompt the user and read in the file name
		System.out.println("This program calculates " +
				"statistics on a file " +
				"containing a series of numbers");
		System.out.print("Enter the file name: ");
		filename = keyboard.nextLine(); 
		//FileWriter object
		//the FileWriter and PrintWriter objects removes the contents of the .txt file?
		//FileWriter fw = new FileWriter(filename);
		//PrintWriter pw = new PrintWriter(fw); //PrintWriter object
		FileReader fr = new FileReader("C:\\Users\\Ivan\\eclipse-workspace\\Homework2\\" + filename); //FileReader object
		BufferedReader br = new BufferedReader(fr); //BufferedReader object
		while(br.readLine() != null) { //runs as long as the line isn't null
			line = br.readLine(); //sets line to the line in the file
			mean += Double.parseDouble(line); //converts the string to double and adds it into mean
			count++; //adds 1 to count
		}
		mean /= count; //divides mean by count to get the mean
		//Print the results to the output file
		System.out.printf("The mean is %.3f.\n", mean);
		//Close the output file
		//fw.close(); //closes the FileWriter
		//pw.close(); //closes the PrintWriter
		fr.close(); //closes the FileReader
	}
}