import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
public class SearchInFile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
			FileReader rdr = new FileReader("outFile.txt");
			Scanner fin = new Scanner(rdr);
            boolean i=false;
            String name;
            String id;
            System.out.print("Id to search Student: ");
            String searchStudent = scan.nextLine();



			while(fin.hasNextLine()){
				name = fin.nextLine();
				id = fin.nextLine();
				if(id.equals(searchStudent)){
				System.out.println("Student name: "+name);
				System.out.println("Student Id: "+id);
				i=true;
				}
			}
			if(!i){
				System.out.println("No Student found with this Id");
			}

            rdr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}