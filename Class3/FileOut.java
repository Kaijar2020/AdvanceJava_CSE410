import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileOut {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        File outfile = new File("outFile.txt");
        try{
            PrintWriter output= new PrintWriter( outfile);

            int i=0;
            String name;
            int id;
            System.out.print("Number of Student: ");

            int numberStudent = scan.nextInt();
            for( i=0; i<numberStudent; i++){
            	scan.nextLine();
            	System.out.print("Input Name: ");
            	name = scan.nextLine();
           	 	output.println(name);
            	System.out.print("Input ID: ");
            	id = scan.nextInt();
            	output.println(id);
			}

            output.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}