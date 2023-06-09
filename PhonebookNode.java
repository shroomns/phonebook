// Jace (Joy) Schwarting
// CS 145 Assignment 2

public class PhonebookNode{

      public String index;
      public PhonebookNode next;
      public PhonebookNode front;
      
      public String address;
      public String city;
      public String phonenumber;
      public String firstname;
      public String lastname;
      public String fullName;
      
      public void Phonebooknode(){
            front = null;
            this.firstname = firstname;
            this.lastname = lastname;
            this.fullName = fullName;
            this.address = address;
            this.city = city;
            this.phonenumber = phonenumber;
            this.index = index;
            this.next = next;
            }
            
      public PhonebookNode(String firstname, String lastname, String fullName, String address, String city, String phonenumber){
            this.firstname = firstname;
            this.lastname = lastname;
            this.fullName = fullName;
            this.address = address;
            this.city = city;
            this.phonenumber = phonenumber;
            this.index = index;
            this.next = next;
            }
            
    public PhonebookNode(String firstname, String lastname, String fullName,String address, String city, 
    String phonenumber, PhonebookNode next){
         this.firstname = firstname;
         this.lastname = lastname;
         this.fullName = fullName;
         this.address = address;
         this.city = city;
         this.phonenumber = phonenumber;
         this.index = index;
         this.next = next;
         }
         
    public void addmidend(String firstname, String lastname, String fullName, String address, String city, String number){
         this.firstname = firstname;
         this.lastname = lastname;
         this.fullName = fullName;
         this.address = address;
         this.city = city;
         this.phonenumber = number;
         this.index = index;
         this.next = next;
         
         if (front == null){
               front = new PhonebookNode(firstname, lastname, fullName,address, city,number, next);
         }else{
               PhonebookNode current = front;
               
               while(current.next != null) {
                     current = current.next;
               }
               
               current.next = new PhonebookNode(firstname, lastname,fullName,address, city, number, next);
               }
         }
         
         public String toString(){
               String fullName = firstname +" "+ lastname;
               
               return "\n\nIndex Location:" + index + "\n" + "Full name: " +
               fullName + "\n" + "Address: " + address + "\n" + "City: " + 
               city + "\n" + "Phone Number: " + phonenumber +"\n\n";
               }
         }