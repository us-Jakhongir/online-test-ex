package service.implement;

import enums.Role;
import exceptions.UserNotFoundException;
import model.User;
import realization.TestDemo;
import service.RegistrationService;

import java.util.Scanner;
import java.util.Set;


public class RegistrationServicveImpl implements RegistrationService {

    static Scanner scanner;
    @Override
    public boolean signUp() {


        System.out.println("====================REGISTRATION======================");
        scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
        String fullname = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.println("Your balance:");
        Double balance = scanner.nextDouble();

        System.out.println("Choose the role: ");
        int indexOfRole = 1;
        for (Role value : Role.values()) {
            System.out.println(indexOfRole + ". " + value);
            indexOfRole++;
        }


        int roleIndex = scanner.nextInt();
        Role role = Role.values()[roleIndex -1];

        Set<User> users = TestDemo.users;
        int lastIndex = users.size() +1;

        User newUser = new User(
                Long.valueOf(lastIndex),
                fullname,
                email,
                password,
                role,
                balance
        );

        TestDemo.users.add(newUser);
        return true;

    }

    @Override
    public boolean signIn() {
        return false;
    }
}
