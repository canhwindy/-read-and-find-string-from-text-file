
package getstringfromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GetStringFromFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.print("Please enter directory of file: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.next();
        File file = new File(name);
        
        System.out.print("Please enter string to search: ");
        String keyword = sn.next();
        
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            String dong;
            while ((dong = br.readLine()) != null) {
                String[] words = dong.split(" ");
                for (String word : words) {
                    if (word.contains(keyword)) {
                        System.out.println(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + name);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
    }
    

