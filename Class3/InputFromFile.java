import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class InputFromFile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        File outfile = new File("outFile.txt");
        try{
			Scanner fin = new Scanner(outfile);
            int i=0;
            String name;
            String id;

            while(fin.hasNextLine()){
            	name = fin.nextLine();
            	System.out.println("Name: "+name);
            	id = fin.nextLine();
            	System.out.println("ID: "+id+"\n");
			}

            fin.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}