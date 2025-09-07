import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
    private String name;

    public DeleteStudent(Scanner sc) {
        System.out.print("Enter student name to delete: ");
        this.name = sc.nextLine();
    }

    public void delete(Connection con) {
        try {
            String sql = "DELETE FROM students WHERE name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            int rows = ps.executeUpdate();
            System.out.println("Deleted " + rows + " student(s).");
        } catch (Exception e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }
}
