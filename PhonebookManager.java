// Jace (Joy) Schwarting
// CS 145 Assignment 2

import java.util.*;

public class PhonebookManager{

      static LinkedList list = new LinkedList();
      
      public static void menu(){
            System.out.println("Menu options:");
            System.out.println("[1]add a contact");
            System.out.println("[2]Display contacts");
            System.out.println("[3]Search contacts");
            System.out.println("[4]Edit a contact");
            System.out.println("[5]Delete a contact");
            System.out.println("[6]Exit");
      }
      
      public static void makeChoice(PhonebookNode entry){
            Scanner scanInput = new Scanner(System.in);
            String usersChoice = scanInput.next();
            
                  if (usersChoice.equals("1")) {
                        choiceOne(scanInput);
                  } else if (usersChoice.equals("2")) {
                        choiceTwo();
                  } else if (usersChoice.equals("3")) {
                        choiceThree(scanInput, entry );
                  } else if(usersChoice.equals("4")) {
                        System.out.println("Work in progress");
                  } else if(usersChoice.equals("5")) {
                        System.out.println("Work in progress");
                  } else if (usersChoice.equals("6")) {
                        chooseExit();
                  } else {
                        System.out.println("please enter a valid command");
                  }
     }
     
     //Users choices
     public static void choiceOne(Scanner scanInput){
         int index = 0;
         index++;
         System.out.println("Please enter information with no spaces.");
         System.out.println("Example Address: 321JohnWayneRoad");
         System.out.println();
         System.out.println("Enter First Name: ");
               String firstname = scanInput.next();
         System.out.println("Enter Last Name: ");
               String lastname = scanInput.next();
         System.out.println("Enter Address: ");
               String address = scanInput.next();         
         System.out.println("Enter City: ");
               String city = scanInput.next();
         System.out.println("Enter Phone Number: ");
               String number = scanInput.next();
               String fullName = firstname + " " + lastname;
         
         PhonebookNode entry = new PhonebookNode(firstname, lastname, fullName, address, city, number);
         entry.addmidend(firstname, lastname, fullName, address, city, number);
         
         list.add(entry);
         System.out.println();
         
         System.out.println(entry.toString());
         System.out.println("Contact added to phonebook");
         System.out.println();
     }
         
     public static void choiceTwo(){
         System.out.println(list);
     }

     public static void choiceThree(Scanner scanInput, PhonebookNode entry) {
               
               System.out.println("Work in progress, I'm so sorry!");
     }
     
     public static void chooseExit(){
            System.out.println("Goodbye.");
            System.exit(0);
     }
      
}