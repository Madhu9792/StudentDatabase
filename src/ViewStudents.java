import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewStudents {
    public void viewAll(Connection con) {
        try {
            String sql = "SELECT * FROM students";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- All Students ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (Exception e) {
            System.out.println("View failed: " + e.getMessage());
        }
    }
}
