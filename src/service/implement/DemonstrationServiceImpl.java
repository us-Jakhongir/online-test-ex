package service.implement;

import model.User;
import realization.TestDemo;
import service.DemonstrationService;

import java.util.Scanner;

public class DemonstrationServiceImpl implements DemonstrationService {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void showAdminMenu() {
        User admin = TestDemo.currentUser;
        scanner = new Scanner(System.in);


        while (true) {

            System.out.println("==================MENU ADMIN==================");
            System.out.println("1. Add Subject");
            System.out.println("2. Delete Subject");
            System.out.println("3. Update Subject");
            System.out.println("4. Result test");
            System.out.println("5. View Cash");
            System.out.println("0. Sign out");
            System.out.println("==============================================");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 0:
                    admin.setSignedIn(false);
                    System.out.println("Bye!");
                    break;
            }

        }


    }

    @Override
    public void showStudentMenu() {
        scanner = new Scanner(System.in);
        User applicant = TestDemo.currentUser;
        System.out.println("Welcome, " + applicant.getFullName().substring(0, applicant.getFullName().indexOf(" ")) + "!");

        System.out.println();

        System.out.println("1. Select subject");
        System.out.println("2. View test histories");
        System.out.println("3. Balance");
        System.out.println("0. Sign out");

        System.out.println();

        System.out.print("Menu: ");
        int choice = -1;
        try {
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                case 2:
                case 3:
                    System.out.println("Not implemented yet!");
                    break;
                case 0:
                    applicant.setSignedIn(false);
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong menu option!");




            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
