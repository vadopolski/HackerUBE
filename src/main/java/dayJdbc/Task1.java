package dayJdbc;

import java.sql.*;

public class Task1 {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3333/employees",
                "root",
                "HackerU2018");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                     new StringBuilder()
                             .append("select d.dept_name, avg(s.salary) from salaries s\n")
                             .append("  join dept_emp de on s.emp_no = de.emp_no\n")
                             .append("  join departments d on d.dept_no = de.dept_no\n")
                             .append("  group by de.dept_no;").toString())) {
            while (rs.next())
                System.out.println(rs.getString(1) + " : " + rs.getDouble(2));
        }
    }

}
