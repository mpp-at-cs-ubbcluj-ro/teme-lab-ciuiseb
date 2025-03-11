package ro.mpp;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();
        printReferees(connection);
        addReferee(connection, "Ion", "lionel", "pas");
        printReferees(connection);
        updateRefereePassword(connection, "lionel", "newpass");
        printReferees(connection);
    }

    private static void printReferees(Connection connection) {
        try {
            String selectQuery = "SELECT * FROM Referee r WHERE r.username LIKE 'l%'";
            try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(selectQuery)) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String username = resultSet.getString("username");
                    String password = resultSet.getString("password");

                    System.out.println("ID: " + id + ", Name: " + name + ", Username: " + username + ", Password: " + password);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addReferee(Connection connection, String name, String username, String password) {
        String insertSQL = "INSERT INTO Referee (name, username, password) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            int rowsAffected = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateRefereePassword(Connection connection, String username, String newPassword) throws SQLException {
        String updateSQL = "UPDATE Referee SET password = ? WHERE username = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            int rowsAffected = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
