import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener  {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;

    private static JButton createUserButton;
    private static JLabel accessGranted;




    GUI() {

        JPanel panel = new JPanel(); //create panel
        JFrame frame = new JFrame(); //create frame
        frame.setTitle("Welcome to Popcorn Time 2.0"); // Sets the GUI Title
        frame.setSize(350,200); // sets the x-dimension, and y-dimension of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        userLabel = new JLabel("Username");// UserLabel
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165, 25 );
        panel.add(userText);


        passwordLabel = new JLabel("Password");// PasswordLabel
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);


        button = new JButton("Login"); //Login button
        button.setBounds(10,80,80,25);
        button.addActionListener(this);
        panel.add(button);

        createUserButton = new JButton("Create a New User");// Create a new user button
        createUserButton.setBounds(120,80,140,25);
        createUserButton.addActionListener(this);
        panel.add(createUserButton);


        accessGranted = new JLabel(""); //AccessGrantedLabel
        accessGranted.setBounds(20,110,300,25);
        panel.add(accessGranted);

        frame.setVisible(true);//make frame visible




    }
    //Here we get the persons username and password.
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if(user.equals("Morten") && (password.equals("Fede"))){
            System.out.println("Login successful");
        } else{
            System.out.println("Username or password incorrect");
        }

    }
}
