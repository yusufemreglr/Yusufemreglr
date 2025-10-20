import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        try(Connection conn = Database.connect()){
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO users(username, password) VALUES (?, ?)"
            );
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            System.out.println("User registered successfully!");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
