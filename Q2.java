// Q2) Create a User class with fields: firstname, lastname, age, phonenumber.
// Write a program which accepts values of user fields from commandline,
// create object and append that to a text file.
// After every user creation the program should prompt:
// "Do you want to continue creating users? (Type QUIT to exit)"

import java.io.*;
import java.util.Scanner;

class User {
    String firstName, lastName;
    int age;
    long phoneNumber;

    public User(String firstName, String lastName, int age, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + phoneNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(BufferedWriter bc = new BufferedWriter(new FileWriter("Test.txt", true))) {
            while(true) {
                System.out.println("Enter firstName :");
                String firstName = sc.nextLine();

                System.out.println("Enter lastName :");
                String lastName = sc.nextLine();

                System.out.println("Enter age :");
                int age = Integer.parseInt(sc.nextLine());

                System.out.println("Enter phoneNumber :");
                long phoneNumber = Long.parseLong(sc.nextLine());
                System.out.println();

                User user = new User(firstName, lastName, age, phoneNumber);

                bc.write(user.toString() + '\n');
                bc.flush();

                System.out.println("DO YOU WANT TO CONTINUE? TO QUIT ENTER \"QUIT\"");
                String line = sc.nextLine();

                if(line.contains("QUIT")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program closed successfully");
        }
    }
}
