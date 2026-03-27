import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            // SAFE INPUT FOR CHOICE
            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("❌ Enter numbers only!");
                sc.next();
                continue;
            }

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter ID: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("❌ Invalid ID!");
                        sc.next();
                        break;
                    }
                    int id = sc.nextInt();

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("❌ Invalid Salary!");
                        sc.next();
                        break;
                    }
                    double salary = sc.nextDouble();

                    dao.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:
                    dao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("❌ Invalid ID!");
                        sc.next();
                        break;
                    }
                    int uid = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    if (!sc.hasNextDouble()) {
                        System.out.println("❌ Invalid Salary!");
                        sc.next();
                        break;
                    }
                    double sal = sc.nextDouble();

                    dao.updateEmployee(uid, sal);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("❌ Invalid ID!");
                        sc.next();
                        break;
                    }
                    int did = sc.nextInt();

                    dao.deleteEmployee(did);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}