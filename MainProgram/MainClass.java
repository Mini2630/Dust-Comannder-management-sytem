package MainProgram;

import java.util.List;
import java.util.Scanner;

import Livestock_Register.DustCommanderFarm;
import Livestock_Register.Livestock;

public class MainClass {

    private static Scanner input = new Scanner(System.in);
    private static DustCommanderFarm dustCommanderFarm;

    public static void main(String[] args) {
        dustCommanderFarm = new DustCommanderFarm();
        prompts();
    }

    private static void prompts() {
        System.out.println(
                "What do you want to do next?\n1. Add new livestock\n2. Update livestock information\n3. Find livestock by ID\n4. Find lineage by ID\n5. Exit");
        String option = input.nextLine();

        switch (option) {
            case "1":
                addNewLiveStock();
                break;
            case "2":
                updateLiveStockInfo();
                break;
            case "3":
                findLiveStock();
                break;
            case "4":
                findLineage();
                break;
            case "5":
                System.out.println("Exiting application. Goodbye!!!");
                System.exit(0);
            default:
                System.out.println("Invalid option please try again.");
                break;
        }

        prompts();
    }

    private static void findLineage() {
        System.out.println("Please enter lineageID to find");
        int id = Integer.parseInt(input.nextLine());

        List<Livestock> lineage = dustCommanderFarm.getLineage(id);

        if (lineage.size() > 0) {
            System.out.println("Found " + lineage.size() + " results.");
            System.out.println(lineage.iterator().next());
        } else {
            System.out.println("No lineage found with ID: " + id);
        }

    }

    private static void findLiveStock() {
        System.out.println("Please enter livestock ID to find");
        int id = Integer.parseInt(input.nextLine());

        Livestock livestock = dustCommanderFarm.getLivestockById(id);

        if (livestock == null) {
            System.out.println("Livestock with id : " + id + " could not be found.");
            System.out.println("Enter 1 to try again or any key to return to main menu");
            if (input.nextLine().equals("1")) {
                findLiveStock();
            }
            return;
        }

        System.out.println(livestock);
    }

    private static void updateLiveStockInfo() {
        System.out.println("Please enter livestock ID to update");
        int id = Integer.parseInt(input.nextLine());

        Livestock livestock = dustCommanderFarm.getLivestockById(id);

        if (livestock == null) {
            System.out.println("Livestock with id : " + id + " could not be found.");
            System.out.println("Enter 1 to try again or any key to return to main menu");
            if (input.nextLine().equals("1")) {
                updateLiveStockInfo();
            } else {
                return;
            }
        }

        System.out.println("1. Update immunizations\n2. Update Births");
        String update = input.nextLine();

        switch (update) {
            case "1":
                System.out
                        .println("The livestock currently has had " + livestock.getImmunizations() + " immunizations:");
                System.out.println("Enter the amounts of shots since last immunization");
                int newImmunization = Integer.parseInt(input.nextLine());
                livestock.updateImmunizations(newImmunization);
                break;
            case "2":
                System.out
                        .println("The livestock currently has had " + livestock.getBirths() + " births");
                System.out.println("Enter the amounts of births");
                int newBirth = Integer.parseInt(input.nextLine());
                livestock.updateBirths(newBirth);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

    }

    private static void addNewLiveStock() {
        String gender = "";

        while (!gender.equals("M") && !gender.equals("F")) {
            System.out.println("Please enter the new livestock: (M - male or F - female)");
            gender = input.nextLine().toUpperCase();
        }

        System.out.println("Please enter the new livestock ID:");
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Please enter the livestock lineageID:");
        int lineageID = Integer.parseInt(input.nextLine());

        System.out.println("Please enter the lineage livestock age:");
        int lineageAge = Integer.parseInt(input.nextLine());

        System.out.println("Please enter the number of immunizations:");
        int immunizations = Integer.parseInt(input.nextLine());

        Livestock livestock = new Livestock(id, lineageID, lineageAge, immunizations, gender);

        dustCommanderFarm.addLivestock(livestock);
        System.out.println("Livestock added successfully");
    }

}
