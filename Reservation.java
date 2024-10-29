import java.util.*;
public class Reservation {
        public static boolean[] seats = new boolean[25];
        static Scanner s = new Scanner(System.in);
        static User currentuser;
        public static void main(String arg[]){
        System.out.println("Please register yourself:");
        registerUser();
        System.out.printf("Please login\n");
        if (authenticateUser()) {
            System.out.printf("Login successful!\n");
            menu();
        } else {
            System.out.printf("Invalid credentials!\n");
        }
    }
        static void registerUser(){
            System.out.printf("Enter Name:\n");
            String name = s.nextLine();
            System.out.printf("Enter Password:\n");
            String password = s.nextLine();
            currentuser = new User(name, password);    
        }
        static boolean authenticateUser(){
            System.out.printf("Enter Username:\n");
            String userid = s.nextLine();
            System.out.printf("Enter Password:\n");
            String userpin = s.nextLine();
            return userid.equals(currentuser.getname()) && userpin.equals(currentuser.getpass());    
        }
        static void menu(){
            int option;
            do {
            System.out.printf("-----------Train Ticket Reservation-----------\n");
            System.out.printf("Please enter your choice\n");
            System.out.printf("1.View Available Seats\n");
            System.out.printf("2.Reserve a Seat\n");
            System.out.printf("3.Cancel a Seat Reservation\n");
            System.out.printf("4.Exit\n");
            option = s.nextInt();
    
                switch (option) {
                    case 1-> viewseats();
                    case 2-> reserveseat();
                    case 3-> cancelseat();
                    case 4-> System.out.println("Thank you for using the Train Reservation System.");
                    default-> System.out.println("Invalid option. Please try again.");
                }
              }while (option != 4);  
            }
        private static void reserveseat(){
            System.out.println("Enter seat number(1-25):");
            int seatno = s.nextInt();
            if(seatno < 1 || seatno > 25){
                System.out.println("Invalid seat number entered!");
            }
            else if(seats[seatno - 1]){
                System.out.println("Seat already Reserved!");
            }
            else {
                seats[seatno - 1] = true;
                System.out.println("Seat Reserved!");
            }
        }
        private static void viewseats(){
            System.out.println("Currently Available seats:");
            for(int i = 0; i < seats.length; i++){
                if(seats[i]){
                    System.out.println("X ");
                }
                else{
                    System.out.println((i + 1) + " ");
                }
            }
            System.out.println();
        }
        private static void cancelseat() {
            System.out.println("Enter seat number (1-25):");
            int seatno = s.nextInt();
            if (seatno < 1 || seatno > 25) {
                System.out.println("Invalid seat number entered!");
            } else if (!seats[seatno - 1]) {
                System.out.println("Seat not Reserved!");
            } else {
                seats[seatno - 1] = false;
                System.out.println("Reservation canceled!");
            }
    }
}
class User {
    String name;
    String password;
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
    public String getname(){
        return name;
    }
    public String getpass(){
        return password;
    }
}
