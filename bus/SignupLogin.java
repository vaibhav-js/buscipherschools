//package bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SignupLogin {

    List<Users> usersList = new ArrayList<>();
    public String Signup (String name, int phone, String email, String street, String city, String state, String password) {
        
        for(Users users : usersList) {
            if(users.getContact().getEmailID().equals(email))
                return ("Already resistered");
        }
        
        Contact contact = new Contact(name, phone, email);
        Address address = new Address(street, city, state);
        Users users = new Users(contact, address, password);
        usersList.add(users);
        return "Signup Successful";
    }
    
    public String Login (String email, String password) {
        for (Users users : usersList) {
            if (email.equals(users.getContact().getEmailID()) && password.equals(users.getPassword()))
                return "Login successful";
        }
        return "Incorrect useremail/password!";
    }

    public void updateUser(String email) {
        String name, password, street, state, city;
        int phone;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for(Users users : usersList) {
            if(users.getContact().getEmailID().equalsIgnoreCase(email)) {
                flag = true;
                System.out.println("Enter name");
                name = sc.next();
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
                users.setPassword(password);
                users.getContact().setEmailID(email);
                users.getContact().setName(name);
                users.getContact().setPhonenumber(phone);
                users.getAddress().setCity(city);
                users.getAddress().setState(state);
                users.getAddress().setStreet(street);
                System.out.println("User details updated successfully!");
            }
//            sc.close();
        }
        if (!flag) {
            System.out.println("User not found..");
        }
        return;
    }
}
