import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class library extends JFrame {

  private JLabel booksLabel, imageLabel;
  private JComboBox<String> booksComboBox;
  private ImageIcon bookImage;
  private JButton borrowButton, returnButton;

  public library() {
    super("Library Management");
    setLayout(new BorderLayout());
    booksLabel = new JLabel("Books: ");
    booksComboBox = new JComboBox<>();
    booksComboBox.addItem("Book 1");
    booksComboBox.addItem("Book 2");
    booksComboBox.addItem("Book 3");
    booksComboBox.setSelectedIndex(0);
    borrowButton = new JButton("Borrow");
    returnButton = new JButton("Return");
    JPanel topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout());
    topPanel.add(booksLabel);
    topPanel.add(booksComboBox);
    topPanel.add(borrowButton);
    topPanel.add(returnButton);
    add(topPanel, BorderLayout.NORTH);
    imageLabel = new JLabel();
    bookImage = new ImageIcon("New folder/download.jfif");
    imageLabel.setIcon(bookImage);
    add(imageLabel, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    library frame = new library();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(450, 300);
    frame.setVisible(true);
  }

}
