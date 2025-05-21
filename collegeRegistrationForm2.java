import java.awt.*;
import javax.swing.*;

public class collegeRegistrationForm2 extends JFrame {

    public collegeRegistrationForm2() {
        setTitle("College Admission Registration Form");
        setSize(600, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 240, 250));
        setLayout(null);

        JLabel heading = new JLabel("College Admission Form");
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setBounds(180, 20, 300, 30);
        heading.setForeground(new Color(0, 51, 102));
        add(heading);

        int y = 70;

        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();
        nameLabel.setBounds(50, y, 120, 30);
        nameField.setBounds(180, y, 300, 30);
        add(nameLabel);
        add(nameField);

        y += 40;
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        ageLabel.setBounds(50, y, 120, 30);
        ageField.setBounds(180, y, 300, 30);
        add(ageLabel);
        add(ageField);

        y += 40;
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        emailLabel.setBounds(50, y, 120, 30);
        emailField.setBounds(180, y, 300, 30);
        add(emailLabel);
        add(emailField);

        y += 40;
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneField = new JTextField();
        phoneLabel.setBounds(50, y, 120, 30);
        phoneField.setBounds(180, y, 300, 30);
        add(phoneLabel);
        add(phoneField);

        y += 40;
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        passwordLabel.setBounds(50, y, 120, 30);
        passwordField.setBounds(180, y, 300, 30);
        add(passwordLabel);
        add(passwordField);

        y += 40;
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordLabel.setBounds(50, y, 120, 30);
        confirmPasswordField.setBounds(180, y, 300, 30);
        add(confirmPasswordLabel);
        add(confirmPasswordField);

        y += 40;
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, y, 120, 30);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        male.setBounds(180, y, 70, 30);
        female.setBounds(260, y, 80, 30);
        other.setBounds(350, y, 80, 30);
        male.setBackground(new Color(230, 240, 250));
        female.setBackground(new Color(230, 240, 250));
        other.setBackground(new Color(230, 240, 250));
        add(genderLabel);
        add(male);
        add(female);
        add(other);

        y += 40;
        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"B.Tech", "M.Tech", "BBA", "MBA", "BCA", "MCA"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseLabel.setBounds(50, y, 120, 30);
        courseBox.setBounds(180, y, 300, 30);
        add(courseLabel);
        add(courseBox);

        y += 40;
        JLabel departmentLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();
        departmentLabel.setBounds(50, y, 120, 30);
        deptField.setBounds(180, y, 300, 30);
        add(departmentLabel);
        add(deptField);

        y += 40;
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();
        addressLabel.setBounds(50, y, 120, 30);
        addressField.setBounds(180, y, 300, 30);
        add(addressLabel);
        add(addressField);

        y += 40;
        JLabel cityLabel = new JLabel("City:");
        JTextField cityField = new JTextField();
        cityLabel.setBounds(50, y, 120, 30);
        cityField.setBounds(180, y, 300, 30);
        add(cityLabel);
        add(cityField);

        y += 40;
        JLabel stateLabel = new JLabel("State:");
        JTextField stateField = new JTextField();
        stateLabel.setBounds(50, y, 120, 30);
        stateField.setBounds(180, y, 300, 30);
        add(stateLabel);
        add(stateField);

        y += 40;
        JLabel countryLabel = new JLabel("Country:");
        JTextField countryField = new JTextField("India");
        countryLabel.setBounds(50, y, 120, 30);
        countryField.setBounds(180, y, 300, 30);
        add(countryLabel);
        add(countryField);

        y += 50;
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBackground(new Color(0, 102, 204));
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setBounds(230, y, 120, 40);
        add(submitBtn);

        submitBtn.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Other");
            String course = (String) courseBox.getSelectedItem();
            String dept = deptField.getText();
            String address = addressField.getText();
            String city = cityField.getText();
            String state = stateField.getText();
            String country = countryField.getText();

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StringBuilder info = new StringBuilder();
            info.append("Name: ").append(name).append("\n")
                .append("Age: ").append(age).append("\n")
                .append("Email: ").append(email).append("\n")
                .append("Phone: ").append(phone).append("\n")
                .append("Gender: ").append(gender).append("\n")
                .append("Course: ").append(course).append("\n")
                .append("Department: ").append(dept).append("\n")
                .append("Address: ").append(address).append("\n")
                .append("City: ").append(city).append("\n")
                .append("State: ").append(state).append("\n")
                .append("Country: ").append(country);

            JOptionPane.showMessageDialog(null, info.toString(), "Registration Details", JOptionPane.INFORMATION_MESSAGE);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new collegeRegistrationForm2();
    }
}
