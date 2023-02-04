import java.awt.*;
import javax.swing.*;

public class cab extends JFrame {

  private JLabel pickupLabel, destinationLabel, dateLabel, timeLabel;
  private JTextField pickupField, destinationField, dateField, timeField;
  private JRadioButton standardRadioButton, premiumRadioButton;
  private ButtonGroup carTypeButtonGroup;
  private JButton bookButton;

  public cab() {
    super("Cab Booking System");
    setLayout(new GridLayout(5, 2));
    pickupLabel = new JLabel("Pickup Location: ");
    add(pickupLabel);
    pickupField = new JTextField(10);
    add(pickupField);
    destinationLabel = new JLabel("Destination: ");
    add(destinationLabel);
    destinationField = new JTextField(10);
    add(destinationField);
    dateLabel = new JLabel("Date (DD/MM/YYYY): ");
    add(dateLabel);
    dateField = new JTextField(10);
    add(dateField);
    timeLabel = new JLabel("Time (HH:MM): ");
    add(timeLabel);
    timeField = new JTextField(10);
    add(timeField);
    standardRadioButton = new JRadioButton("Standard", true);
    premiumRadioButton = new JRadioButton("Premium");
    carTypeButtonGroup = new ButtonGroup();
    carTypeButtonGroup.add(standardRadioButton);
    carTypeButtonGroup.add(premiumRadioButton);
    add(standardRadioButton);
    add(premiumRadioButton);
    bookButton = new JButton("Book");
    add(bookButton);
  }

  public static void main(String[] args) {
    cab frame = new cab();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 200);
    frame.setVisible(true);
  }

}
