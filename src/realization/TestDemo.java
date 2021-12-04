package realization;

import enums.Role;
import exceptions.UserNotFoundException;
import model.User;
import service.DemonstrationService;
import service.RegistrationService;
import service.implement.DemonstrationServiceImpl;
import service.implement.RegistrationServicveImpl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestDemo {
    static Scanner scanner;

    public static Set<User> users = new HashSet<>();

    static RegistrationService registrationService;
    static DemonstrationService demonstrationService;

    public static User currentUser;



    public static void main(String[] args) {


        users.add(new User(1L, "Ali Aliyev", "ali@gmail.com", "123", Role.ADMIN,  100000.0));
        users.add(new User(2L, "Vali Valiyev", "vali@mail.ru", "456", Role.STUDENT, 200000.0));



        while (true) {
            showMainMenu();

            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    signIn();
                    break;

                case 2:
                    signUp();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Incorrect option!");
            }


        }


    }

    private static void signUp() {
        registrationService = new RegistrationServicveImpl();
        boolean isSuccess = registrationService.signUp();

        try {
            if (isSuccess)
                System.out.println("Success!");

        } catch (UserNotFoundException userNotFoundException) {
            System.out.println("User Not Found!");
        }
    }




    private static void signIn() {
        registrationService = new RegistrationServicveImpl();
        boolean isSuccess = registrationService.signIn();

        if (isSuccess) {
            demonstrationService = new DemonstrationServiceImpl();

            switch (currentUser.getRole()) {
                case ADMIN:
                    demonstrationService.showAdminMenu();
                    break;

                case STUDENT:
                    demonstrationService.showStudentMenu();

            }

        }

    }

    private static void showMainMenu() {
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("0. Exit");
    }

}
