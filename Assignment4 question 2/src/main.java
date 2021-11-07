import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class main {

	/*
	 * Write a program that reads words from a text file and displays all the nonduplicate words in ascending order. (Use a
	 * TreeSet to hold the words)
	 */
	
	public static void main(String[] args) {
        File file = new File(args[0]);
        
        try {
            Scanner scan = new Scanner(file);
            TreeSet<String> words = new TreeSet<>();
            
            while (scan.hasNext()) {
                words.add(scan.next());
            }
            
            for(String word: words) {
                System.out.println(word);
            }
            
            scan.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}

