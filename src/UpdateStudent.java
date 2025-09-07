import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStudent {
    private String name;
    private int newAge;

    public UpdateStudent(Scanner sc) {
        System.out.print("Enter student name to update: ");
        this.name = sc.nextLine();

        System.out.print("Enter new age: ");
        this.newAge = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    public void update(Connection con) {
        try {
            String sql = "UPDATE students SET age = ? WHERE name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newAge);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println("Updated " + rows + " student(s).");
        } catch (Exception e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }
}
