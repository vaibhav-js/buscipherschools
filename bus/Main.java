//package bus;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BusOperations busOperations = new BusOperations();
        busOperations.addBus("Hr001", "govind", "lucknow", "kanpur", 1500, 100);
        busOperations.addBus("Hr002", "arvind", "mumbai", "goa", 2500, 100);
        busOperations.addBus("Hr003", "mahesh", "kanpur", "lucknow", 1500, 100);
        busOperations.addBus("Hr004", "babu", "lucknow", "kanpur", 500, 100);

        System.out.println("Press 1 to Signup");
        System.out.println("Press 2 for Login");
        System.out.println("Press 3 to Exit");

        String name, email, password, street, city, state;
        int phone;

        SignupLogin signupLogin = new SignupLogin();

        int choice = sc.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    name = sc.next();
                    System.out.println("Enter email");
                    email = sc.next();
                    System.out.println("Enter password");
                    password = sc.next();
                    System.out.println("Enter street");
                    street = sc.next();
                    System.out.println("Enter city");
                    city = sc.next();
                    System.out.println("Enter state");
                    state = sc.next();
                    System.out.println("Enter phone number");
                    phone = sc.nextInt();

                    System.out.println(signupLogin.Signup(name, phone, email, street, city, state, password));
                    break;
                case 2:
                    System.out.println("Enter email");
                    email = sc.next();
                    System.out.println("Enter password");
                    password = sc.next();
                    String result = signupLogin.Login(email, password);
                    System.out.println(result);
                    if (!"login successful".equalsIgnoreCase(result))
                        break;

                    System.out.println("Press 4 to search for a bus");
                    System.out.println("Press 5 to update");
                    System.out.println("Press 6 to go back");
                    choice = sc.nextInt();
                    while (choice != 6) {
                        switch (choice) {
                            case 4:
                                System.out.println("Enter source");
                                String source = sc.next();
                                System.out.println("Enter destination");
                                String destination = sc.next();
                                List<Bus> list = (busOperations.searchBus(source, destination));
                                if(list.size() == 0) {
                                    System.out.println("No buses found!😶 Try to search for a different location");
                                    break;
                                }
                                for (Bus bus: list) {
                                    System.out.println(bus);
                                }
                                System.out.println("\nPress 7 to book tickets");
                                choice = sc.nextInt();
                                if(choice == 7) {
                                    System.out.println("Enter bus number");
                                    String busNumber = sc.next();
                                    System.out.println("How many tickets you want to book ?");
                                    int bookTickets = sc.nextInt();
                                    busOperations.updateBus(busNumber, bookTickets);
                                } else {
                                    System.out.println("Enter valid choice");
                                }
                                break;
                            case 5:
                                signupLogin.updateUser(email);
                                break;
                            default:
                                System.out.println("Invalid choice..");
                        }
                        System.out.println("Press 4 to search for a bus");
                        System.out.println("Press 5 to update");
                        System.out.println("Press 6 to go back");
                        choice = sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("Invalid Choice..");
            }
            System.out.println("Press 1 to Signup");
            System.out.println("Press 2 to Login");
            System.out.println("Press 3 to Exit");
            choice = sc.nextInt();
        }

        System.out.println("Hope to see you soon..");
        sc.close();
    }
}