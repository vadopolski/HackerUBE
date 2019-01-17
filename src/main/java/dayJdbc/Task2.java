package dayJdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3333/employees",
                "root",
                "HackerU2018");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                     new StringBuilder()
                             .append("SELECT CONCAT(e.first_name, ' ', e.last_name) AS FullName, count(t.title) AS QNT\n")
                             .append("  FROM employees e JOIN titles t on e.emp_no = t.emp_no\n")
                             .append("  GROUP BY FullName\n")
                             .append("  HAVING QNT = 1;").toString()))
        {
            while (rs.next()){
                System.out.println("Employee with one title: " + rs.getString(1));

            }
        }
    }
}
