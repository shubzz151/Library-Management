package project;
import java.util.Scanner;

public class Library {
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
  
        System.out.println(
            "****************WELCOME TO LIBRARY********************");
        System.out.println(
            "                  Select From Below Options:               ");
        System.out.println(
            "**********************************************************************");
  
        // We create object of class book
        books ob = new books();
        // We create object of class student
        students obStudent = new students();
  
        int choice;
        int searchChoice;
  
        // We create menu
        do {
  
            ob.dispMenu();
            choice = input.nextInt();
  
            switch (choice) {
  
            case 1:
                book b = new book();
                ob.addBook(b);
                break;
  
            case 2:
                ob.upgradeBookQty();
                break;
  
            case 3:
  
                System.out.println(
                    " press 1 to Search with Book Serial No.");
                System.out.println(
                    " Press 2 to Search with Book's Author Name.");
                searchChoice = input.nextInt();
  
                switch (searchChoice) {
  
                case 1:
                    ob.searchBySno();
                    break;
  
                case 2:
                    ob.searchByAuthorName();
                }
                break;
  
            case 4:
                ob.showAllBooks();
                break;
  
            case 5:
                
            	student s = new student();
            	obStudent.addStudent(s);
                break;
  
            case 6:
                obStudent.showAllStudents();
                break;
  
            case 7:
                obStudent.checkOutBook(ob);
                break;
  
            case 8:
                obStudent.checkInBook(ob);
                break;
  
            default:
  
                System.out.println("ENTER BETWEEN 0 TO 8.");
            }
  
        }
        while (choice != 0);
    }
}
