// made by JIBIN WILSON S7 CSE
import java.sql.*;

public class JDBCDisplayAllRecords {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java JDBCDisplayAllRecords <jdbcUrl> <user> <password> <tableName>");
            return;
        }
        String url = args[0];
        String user = args[1];
        String pass = args[2];
        String table = args[3];

        String sql = "SELECT * FROM " + table;
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();

            // Header
            for (int i = 1; i <= cols; i++) {
                System.out.print(meta.getColumnLabel(i));
                if (i < cols) System.out.print("\t");
            }
            System.out.println();

            // Rows
            while (rs.next()) {
                for (int i = 1; i <= cols; i++) {
                    Object val = rs.getObject(i);
                    System.out.print(val);
                    if (i < cols) System.out.print("\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}


