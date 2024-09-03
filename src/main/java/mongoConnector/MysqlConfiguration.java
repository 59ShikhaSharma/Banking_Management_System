package mongoConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MysqlConfiguration {
    private Scanner scanner;

    public MysqlConfiguration(Scanner scanner) {
        this.scanner = scanner;
    }

    public Connection connection = null;
    private String url,username,password;
    public Connection getConnection(){
        System.out.print("Enter Mysql url : ");
        url = scanner.nextLine();
        System.out.print("Enter username : ");
        username = scanner.nextLine();
        System.out.print("Enter password : ");
        password = scanner.nextLine();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            connection = DriverManager.getConnection(url, username, password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
