// Q3) Write a program to count number of occurrences of a word in a file.
// The file name and word should be supplied through commandline.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        int count = 0;

        try(BufferedReader bc = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bc.readLine()) != null) {
                String[] Word = line.split("\\W+");

                for(String word : Word) {
                    if(word.equals(searchWord)) {
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Word is found " + count + " times.");
        }
    }
}
