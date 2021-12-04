package service.implement;

import service.DemonstrationService;

import java.util.Scanner;

public class DemonstrationServiceImpl implements DemonstrationService {

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void showAdminMenu() {
        scanner = new Scanner(System.in);


        while (true) {

            System.out.println("==================MENU ADMIN==================");
            System.out.println("1. Add Subject");
            System.out.println("2. Delete Subject");
            System.out.println("3. Update Subject");
            System.out.println("4. Result test");
            System.out.println("5. View Cash");
            System.out.println("0. Exit");
            System.out.println("==============================================");

            int choice = scanner.nextInt();

            switch (choice) {


                case 1:
                    System.out.println("---------------------------");

                    System.out.println("");

                    break;
            }

        }


    }

    @Override
    public void showStudentMenu() {

    }
}
