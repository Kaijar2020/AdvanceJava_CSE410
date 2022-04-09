
public class P9_4StringBuffer {
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("Object language");
        System.out.println("Original String: "+str);
        System.out.println("Length of String: "+str.length());
        for(int i=0; i<str.length(); i++){
            int p = i+1;
            System.out.println("Character at position: "+p+" "+str.charAt(i));
        }
        String aString = new String(str.toString());
        int pos = aString.indexOf(" language");
        str.insert(pos, " Oriented ");
        System.out.println("Modified String: " +str);
        str.insert(6, '-');
        System.out.println("String now: " +str);
        str.append(" improves security");
        System.out.println("Appended String "+str);
    }
}
