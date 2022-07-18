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

        System.out.println("Press 0 to list all users");
        System.out.println("Press 1 to Signup");
        System.out.println("Press 2 for Login");
        System.out.println("Press 3 to Exit");

        String name, email, password, street, city, state;
        int phone;

        SignupLogin signupLogin = new SignupLogin();

        int choice = sc.nextInt();
        sc.nextLine();
        while (choice != 3) {
            switch (choice) {
                case 0:
                    List<Users> usersList = signupLogin.getUsers();
                    if(usersList.size() == 0)
                        System.out.println("No users found!");
                    else {
                        for (Users user: usersList) {
                            System.out.println(user);
                        }
                    }
                    break;
                case 1:
                    System.out.println("Enter name");
                    name = sc.nextLine();
                    System.out.println("Enter email");
                    email = sc.nextLine();
                    System.out.println("Enter password");
                    password = sc.nextLine();
                    System.out.println("Enter street");
                    street = sc.nextLine();
                    System.out.println("Enter city");
                    city = sc.nextLine();
                    System.out.println("Enter state");
                    state = sc.nextLine();
                    System.out.println("Enter phone number");
                    phone = sc.nextInt();

                    System.out.println(signupLogin.Signup(name, phone, email, street, city, state, password));
                    break;
                case 2:
                    System.out.println("Enter email");
                    email = sc.nextLine();
                    System.out.println("Enter password");
                    password = sc.nextLine();
                    String result = signupLogin.Login(email, password);
                    System.out.println(result);
                    if (!"login successful".equalsIgnoreCase(result))
                        break;

                    System.out.println("Press 4 to search for a bus");
                    System.out.println("Press 5 to update");
                    System.out.println("Press 6 to get User details");
                    System.out.println("Press 7 to go back");
                    choice = sc.nextInt();
                    sc.nextLine();
                    while (choice != 7) {
                        switch (choice) {
                            case 4:
                                System.out.println("Enter source");
                                String source = sc.nextLine();
                                System.out.println("Enter destination");
                                String destination = sc.nextLine();
                                List<Bus> list = (busOperations.searchBus(source, destination));
                                if(list.size() == 0) {
                                    System.out.println("No buses found!😶 Try to search for a different location");
                                    break;
                                }
                                for (Bus bus: list) {
                                    System.out.println(bus);
                                }
                                System.out.println("\nPress 8 to book tickets");
                                choice = sc.nextInt();
                                if(choice == 8) {
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
                            case 6:
                                Users user = signupLogin.getUser(email);
                                if(user == null)
                                    System.out.println("User not found");
                                else
                                    System.out.println(user);
                                break;
                            default:
                                System.out.println("Invalid choice..");
                        }
                        System.out.println("Press 4 to search for a bus");
                        System.out.println("Press 5 to update");
                        System.out.println("Press 6 to get User details");
                        System.out.println("Press 7 to go back");
                        choice = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                default:
                    System.out.println("Invalid Choice..");
            }
            System.out.println("Press 0 to list all users");
            System.out.println("Press 1 to Signup");
            System.out.println("Press 2 to Login");
            System.out.println("Press 3 to Exit");
            choice = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Hope to see you soon..");
        sc.close();
    }
}