import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame {

  private JLabel firstNameLabel, lastNameLabel, emailLabel, passwordLabel;
  private JTextField firstNameField, lastNameField, emailField;
  private JPasswordField passwordField;
  private JButton loginButton, signupButton;
  private JRadioButton loginRadioButton, signupRadioButton;
  private ButtonGroup modeButtonGroup;
  private JPanel loginPanel, signupPanel;

  public login() {
    super("Login/Sign up");
    setLayout(new GridLayout(5, 1));
    modeButtonGroup = new ButtonGroup();
    loginRadioButton = new JRadioButton("Login", true);
    signupRadioButton = new JRadioButton("Sign up");
    modeButtonGroup.add(loginRadioButton);
    modeButtonGroup.add(signupRadioButton);
    JPanel modePanel = new JPanel();
    modePanel.setLayout(new FlowLayout());
    modePanel.add(loginRadioButton);
    modePanel.add(signupRadioButton);
    add(modePanel);
    loginPanel = new JPanel();
    loginPanel.setLayout(new GridLayout(2, 2));
    emailLabel = new JLabel("Email: ");
    loginPanel.add(emailLabel);
    emailField = new JTextField(10);
    loginPanel.add(emailField);
    passwordLabel = new JLabel("Password: ");
    loginPanel.add(passwordLabel);
    passwordField = new JPasswordField(10);
    loginPanel.add(passwordField);
    loginButton = new JButton("Login");
    loginPanel.add(loginButton);
    add(loginPanel);
    signupPanel = new JPanel();
    signupPanel.setLayout(new GridLayout(4, 2));
    firstNameLabel = new JLabel("First Name: ");
    signupPanel.add(firstNameLabel);
    firstNameField = new JTextField(10);
    signupPanel.add(firstNameField);
    lastNameLabel = new JLabel("Last Name: ");
    signupPanel.add(lastNameLabel);
    lastNameField = new JTextField(10);
    signupPanel.add(lastNameField);
    emailLabel = new JLabel("Email: ");
    signupPanel.add(emailLabel);
    emailField = new JTextField(10);
    signupPanel.add(emailField);
    passwordLabel = new JLabel("Password: ");
    signupPanel.add(passwordLabel);
    passwordField = new JPasswordField(10);
    signupPanel.add(passwordField);
    signupButton = new JButton("Sign up");
    signupPanel.add(signupButton);
    add(signupPanel);
    loginRadioButton.addActionListener(new RadioButtonListener());
    signupRadioButton.addActionListener(new RadioButtonListener());
  }

  private class RadioButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == loginRadioButton) {
        loginPanel.setVisible(true);
        signupPanel.setVisible(false);
      } else if (e.getSource() == signupRadioButton) {
        signupPanel.setVisible(true);
        loginPanel.setVisible(false);
      }
    }
  }

  public static void main(String[] args) {
    
    login frame = new login();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 300);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
  }
}

