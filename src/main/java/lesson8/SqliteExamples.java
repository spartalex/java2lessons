package lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteExamples {
    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:geekbrains.db");
            statement = connection.createStatement();
            int count = statement.executeUpdate("update students set name = 'Андрей' where name = 'Александр'");

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                System.out.print(resultSet.getString("name") + ",");
                System.out.print(resultSet.getInt("fac_id"));
            }
            System.out.println(count);

            //Long time = System.currentTimeMillis();
            //for (int i = 0; i < 10000; i++) {
            //    statement.executeUpdate(String.format(
            //            "insert into students (name, fac_id) values ('%s', %d)", "Student" + i, i));
            //}
            //System.out.println(System.currentTimeMillis() - time);
//
            //connection.setAutoCommit(false);
            //time = System.currentTimeMillis();
            //for (int i = 0; i < 10000; i++) {
            //    statement.executeUpdate(String.format(
            //            "insert into students (name, fac_id) values ('%s', %d)", "Student" + i, i));
            //}
            //connection.commit();
            //System.out.println(System.currentTimeMillis() - time);

            preparedStatement = connection.prepareStatement(
                    "insert into students (name, fac_id) values (?, ?)");
            preparedStatement.setString(1, "Алексей");
            preparedStatement.setInt(2, 10);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Алена");
            preparedStatement.setInt(2, 12);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
