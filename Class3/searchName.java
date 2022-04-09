import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class searchName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
			FileReader rdr = new FileReader("outFile.txt");
			Scanner fin = new Scanner(rdr);
            boolean i=false;
            String name;
            String id;
            System.out.print("Name to search Student: ");
            String searchStudent = scan.nextLine();



			while(fin.hasNextLine()){
				name = fin.nextLine();
				id = fin.nextLine();
				if(name.equals(searchStudent)){
				System.out.println("Student Name: "+name);
				System.out.println("Student Id: "+id);
				i=true;
				}
			}
			if(!i){
				System.out.println("No student Found with this name");
			}

            rdr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}