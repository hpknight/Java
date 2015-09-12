import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login {
    public static void main(String[] args) {
        String dataSourceName = "login";
        String dbUrl = "jdbc:odbc:" + dataSourceName;

        try {
            //This is the kind of driver you use
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            //Connection variable or object param: dbPath, userName, password
            Connection con = DriverManager.getConnection(dbUrl, "root", "");

            Statement s = con.createStatement();

            //s.execute("create table School2(Grade integer, Remark text)");
            s.execute("create table login(user text, pass text)");

            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error1" + e);
        }


        JFrame frame = new JFrame("General Login System");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        setLocation(panel);

        frame.setVisible(true);
    }

    private static void setLocation(JPanel frame) {

        frame.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 75, 80, 25);
        frame.add(loginButton);
    }

    // For Use Later
    public static boolean authenticate(String username, String password) {
        // This Method we Will replace with the select statement to check for the string, right
        // now it is temporarily set to hardcode - H.P.
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}