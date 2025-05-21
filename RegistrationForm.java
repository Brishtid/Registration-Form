
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {

    public static JLabel labelColor(JLabel l) {
        l.setForeground(Color.white);
        return l;
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");// creating instance of JFrame
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel l1 = new JLabel("Name");
        l1.setBounds(20, 30, 100, 35);
        f.add(l1);
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 30, 300, 35);
        f.add(tf1);

        JLabel l2 = new JLabel("Roll No");
        l2.setBounds(20, 80, 100, 35);
        f.add(l2);
        JTextField tf2 = new JTextField();
        tf2.setBounds(150, 80, 300, 35);
        f.add(tf2);

        JLabel l3 = new JLabel("E-mail");
        l3.setBounds(20, 130, 100, 35);
        f.add(l3);
        JTextField tf3 = new JTextField();
        tf3.setBounds(150, 130, 300, 35);
        f.add(tf3);

        JLabel l4 = new JLabel("Address");
        l4.setBounds(20, 180, 100, 35);
        f.add(l4);
        JTextField tf4 = new JTextField();
        tf4.setBounds(150, 180, 300, 35);
        f.add(tf4);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = Integer.toString(i + 1);
        }
        JLabel l5 = new JLabel("Date of Birth");
        l5.setBounds(20, 230, 100, 35);
        f.add(l5);
        JComboBox dayDropdown = new JComboBox<>(days);
        dayDropdown.setBounds(150, 230, 50, 35);
        f.add(dayDropdown);

        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        JComboBox monthDropdown = new JComboBox<>(months);
        monthDropdown.setBounds(210, 230, 100, 35);
        f.add(monthDropdown);

        String[] years = new String[50];
        for (int i = 0; i < 50; i++) {
            years[i] = Integer.toString(2024 - i);
        }
        JComboBox yearDropdown = new JComboBox<>(years);
        yearDropdown.setBounds(320, 230, 75, 35);
        f.add(yearDropdown);

        JLabel l6 = new JLabel("Courses");
        l6.setBounds(20, 280, 100, 35);
        f.add(l6);
        ButtonGroup BG1 = new ButtonGroup();
        JRadioButton course1 = new JRadioButton("B.Tech");
        course1.setBounds(150, 280, 70, 35);
        f.add(course1);
        JRadioButton course2 = new JRadioButton("M.Tech");
        course2.setBounds(240, 280, 70, 35);
        f.add(course2);
        BG1.add(course1);
        BG1.add(course2);

        JLabel l7 = new JLabel("Branch");
        l7.setBounds(20, 330, 100, 35);
        f.add(l7);
        JCheckBox branch1 = new JCheckBox("CSE");
        branch1.setBounds(150, 330, 50, 35);
        f.add(branch1);
        JCheckBox branch2 = new JCheckBox("IT");
        branch2.setBounds(240, 330, 50, 35);
        f.add(branch2);
        JCheckBox branch3 = new JCheckBox("ECE");
        branch3.setBounds(315, 330, 50, 35);
        f.add(branch3);
        JCheckBox branch4 = new JCheckBox("ME");
        branch4.setBounds(400, 330, 50, 35);
        f.add(branch4);

        JLabel l8 = new JLabel("Gender");
        l8.setBounds(20, 380, 100, 35);
        f.add(l8);
        ButtonGroup BG2 = new ButtonGroup();
        JRadioButton gender1 = new JRadioButton("Male");
        gender1.setBounds(150, 380, 60, 35);
        f.add(gender1);
        JRadioButton gender2 = new JRadioButton("Female");
        gender2.setBounds(240, 380, 70, 35);
        f.add(gender2);
        JRadioButton gender3 = new JRadioButton("Other");
        gender3.setBounds(340, 380, 60, 35);
        f.add(gender3);
        BG2.add(gender1);
        BG2.add(gender2);
        BG2.add(gender3);

        JLabel l9 = new JLabel("Phone No");
        l9.setBounds(20, 430, 100, 35);
        f.add(l9);
        JTextField PhNo = new JTextField();
        PhNo.setBounds(150, 430, 300, 35);
        f.add(PhNo);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(210, 500, 100, 40);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String roll = tf2.getText();
                String email = tf3.getText();
                String Address = tf4.getText();
                String day = (String) dayDropdown.getSelectedItem();
                String month = (String) monthDropdown.getSelectedItem();
                String year = (String) yearDropdown.getSelectedItem();
                String course = "";
                if (course1.isSelected()) {
                    course = course1.getText();
                } else if (course2.isSelected()) {
                    course = course2.getText();
                }
                String branch = (branch1.isSelected() ? branch1.getText() + " " : "") +
                        (branch2.isSelected() ? branch2.getText() + " " : "") +
                        (branch3.isSelected() ? branch3.getText() + " " : "") + (branch4.isSelected()
                                ? branch4.getText() + " "
                                : "");

                String gender = (gender1.isSelected() ? gender1.getText()
                        : (gender2.isSelected() ? gender2.getText() : (gender3.isSelected() ? gender3.getText() : "")));
                String phone = PhNo.getText();

                System.out.println("Name : " + name);
                System.out.println("Roll No : " + roll);
                System.out.println("Email : " + email);
                System.out.println("Address : " + Address);
                System.out.println("Date of Birth : " + day + " " + month + " " + year);
                System.out.println("Course : " + course);
                System.out.println("Branch : " + branch);
                System.out.println("Gender : " + gender);
                System.out.println("Phone No : " + phone);

            }
        });

        f.add(submit);

        // f.add(b);// adding button in JFrame

        f.setSize(530, 600);// 400 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
}