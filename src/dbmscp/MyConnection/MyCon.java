package dbmscp.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyCon {
    
    public static void closeConnection() {
        Connection conn = null;
        try {
            // Check if the connection is open before attempting to close it
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");
            Statement s = conn.createStatement();
            int rowsUpdated = s.executeUpdate(query); // Use executeUpdate for INSERT statements
            conn.close(); // Close the database connection when done
            System.out.println(rowsUpdated + " row(s) affected.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int updateData(String query) {
        int rowsUpdated = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");
            Statement s = conn.createStatement();
            rowsUpdated = s.executeUpdate(query); // Use executeUpdate for UPDATE statements
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowsUpdated;
    }

    public static ResultSet retrieveData(String query) {
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");
            Statement s = conn.createStatement();
            resultSet = s.executeQuery(query);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static int deleteData(String query) {
        int rowsDeleted = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");
            Statement s = conn.createStatement();
            rowsDeleted = s.executeUpdate(query); // Use executeUpdate for DELETE statements
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowsDeleted;
    }

    public static java.sql.PreparedStatement getPreparedStatement(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");
            return conn.prepareStatement(query);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; // Return null on error
        }
    }

    public static boolean checkIfExists(String query) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish a database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms", "root", "Darshan123");

            // Create a statement and execute the query
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            // Check if the query returned any results
            if (resultSet.next()) {
                return true; // Record exists
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false; // Record doesn't exist
    }

    private static class PreparedStatement {

        public PreparedStatement() {
        }
    }

}
