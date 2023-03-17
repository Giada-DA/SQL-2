import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/newdb?", "root", "root00");

        statement = conn.createStatement();

        String query = "CREATE TABLE students ( student_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, last_name VARCHAR(45), first_name VARCHAR(45) )";
        statement.execute(query);

        query = "INSERT INTO students (last_name, first_name) VALUES ('Luca', 'Rossi'), ('Alice', 'Bianchi'), ('Matteo', 'Verdi')";
        statement.execute(query);
    }
}
