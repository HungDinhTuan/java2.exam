import entity.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerBE {

    private Map<String, Customer> customerMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addCustomerInList(){
        String choose;
        System.out.println("Enter the information of a customer : ");
        do{
            System.out.println("Enter customer's name : ");
            String name = scanner.nextLine();
            System.out.println("Enter customer's email : ");
            String email = scanner.nextLine();
            System.out.println("Enter customer's phone : ");
            String phone = scanner.nextLine();

            Customer customer = new Customer(name, email, phone);
            customerMap.put(name, customer);

            System.out.println("Enter 1 to continue to add a student in the list.");
            System.out.println("Enter 0 to end to add the student in the list.");
            choose = scanner.nextLine();
        }while (choose.equals("1"));
    }

    public void displayListCustomers(){
        System.out.println("The list customers : ");
        for(Map.Entry<String, Customer> customerEntry : customerMap.entrySet()){
            Customer customer = customerEntry.getValue();
            customer.outputInfoCustomer();
            System.out.println("------------------------------------");
        }
    }

    public void findCustomersByName(){
        System.out.println("Enter customer's name to find : ");
        String name = scanner.nextLine();

        Customer customer = customerMap.get(name);
        if(customer != null){
            System.out.println("The customer needs to find : ");
            customer.outputInfoCustomer();
        }else {
            System.out.println("Don't have any customer to find with name " + name);
        }
    }
}
