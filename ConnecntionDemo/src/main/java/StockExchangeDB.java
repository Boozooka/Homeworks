import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class StockExchangeDB {

    public static void main(String[] args) {
        String name = "root";
        String password = "Tchepigo1!";
        String url = "jdbc:mysql://localhost:3306/testing";
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException ex){
            System.out.println("Error1: " + ex.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement st = connection.createStatement();
            ResultSet set = st.executeQuery("SELECT * FROM abubabu");
            set.next();

            System.out.println(set.isAfterLast());
            System.out.println(set.isLast());
            System.out.println(set.isFirst());
            System.out.println(set.isBeforeFirst());

            set.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error2: " + ex.getMessage());
        }
    }
}
