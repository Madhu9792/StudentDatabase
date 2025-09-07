import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
    private String name;
    private int age;

    public InsertStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();

        System.out.print("Enter student age: ");
        this.age = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    public void insert(Connection con) {
        try {
            String sql = "INSERT INTO students(name, age) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            int rows = ps.executeUpdate();
            System.out.println("Inserted " + rows + " student(s).");
        } catch (Exception e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
}
