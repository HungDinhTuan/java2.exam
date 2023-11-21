import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomerBE customerBE = new CustomerBE();
        int choice;

        do {
            System.out.println("|=========================================MENU=========================================|");
            System.out.println("| 1. Add the customer in the list customer.                                            |");
            System.out.println("| 2. Find the customers by name.                                                       |");
            System.out.println("| 3. Display all customers in the list students.                                       |");
            System.out.println("| 4. Exit app.                                                                         |");
            System.out.println("|======================================================================================|");
            System.out.println("Please choose the right function : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    customerBE.addCustomerInList();
                    break;
                }
                case 2: {
                    customerBE.findCustomersByName();
                    break;
                }
                case 3: {
                    customerBE.displayListCustomers();
                    break;
                }
                case 4: {
                    System.out.println("See you again!");
                }
                default:
                    System.out.println("Please again choose the right function!");
            }
        } while (choice != 0);
    }
}
