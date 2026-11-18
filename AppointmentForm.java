import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class AppointmentForm extends JFrame {

    JTextField nameField, phoneField, dobField, appointmentField;
    JComboBox<String> genderBox;

    public AppointmentForm() {

        setTitle("Appointment Registration Form");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Full Name
        panel.add(new JLabel("Full Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Gender
        panel.add(new JLabel("Gender:"));
        String[] gender = {"Select Gender", "Male", "Female"};
        genderBox = new JComboBox<>(gender);
        panel.add(genderBox);

        // Phone Number
        panel.add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        // Date of Birth
        panel.add(new JLabel("Date of Birth:"));
        dobField = new JTextField();
        panel.add(dobField);

        // Appointment Date
        panel.add(new JLabel("Appointment Date:"));
        appointmentField = new JTextField();
        panel.add(appointmentField);

        // Save Button
        JButton saveButton = new JButton("Save Information");
        panel.add(saveButton);

        JButton clearButton = new JButton("Clear");
        panel.add(clearButton);

        // Save Button Action
        saveButton.addActionListener(e -> saveData());

        // Clear Button Action
        clearButton.addActionListener(e -> {
            nameField.setText("");
            genderBox.setSelectedIndex(0);
            phoneField.setText("");
            dobField.setText("");
            appointmentField.setText("");
        });

        add(panel);
        setVisible(true);
    }

    // Method to save information
    public void saveData() {

        String name = nameField.getText();
        String gender = (String) genderBox.getSelectedItem();
        String phone = phoneField.getText();
        String dob = dobField.getText();
        String appointment = appointmentField.getText();

        if (name.isEmpty() || phone.isEmpty() ||
            dob.isEmpty() || appointment.isEmpty() ||
            genderBox.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(this,
                "Please fill in all fields!");

            return;
        }

        try {
            FileWriter writer = new FileWriter("Appointment.txt", true);

            writer.write("Full Name: " + name + "\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Phone Number: " + phone + "\n");
            writer.write("Date of Birth: " + dob + "\n");
            writer.write("Appointment Date: " + appointment + "\n");
            writer.write("--------------------------------\n");

            writer.close();

            JOptionPane.showMessageDialog(this,
                "Information saved successfully!");

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(this,
                "Error saving information: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new AppointmentForm();
    }
}