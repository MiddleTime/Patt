
package TestBase;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&useJDBCCompliantTimezoneShift="
                + "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("Host") + " " + resultSet.getString("User")); //выведем данные по второй колонке
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
