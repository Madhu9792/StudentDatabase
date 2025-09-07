import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        try {
            // Connect to DB
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/StudentDatabase",
                    "root",
                    "97liyanaghe@"
            );

            System.out.println("Connected to MySQL Database!");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n---- Menu ----");
                System.out.println("1. Insert Student");
                System.out.println("2. Update Student Age");
                System.out.println("3. Delete Student");
                System.out.println("4. View All Students");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        InsertStudent insert = new InsertStudent(sc);
                        insert.insert(con);
                        break;
                    case 2:
                        UpdateStudent update = new UpdateStudent(sc);
                        update.update(con);
                        break;
                    case 3:
                        DeleteStudent delete = new DeleteStudent(sc);
                        delete.delete(con);
                        break;
                    case 4:
                        ViewStudents view = new ViewStudents();
                        view.viewAll(con);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } while (choice != 5);

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
