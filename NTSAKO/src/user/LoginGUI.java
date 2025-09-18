/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {
    private JTextField usernameField, cellField, emailField;
    private JPasswordField passwordField;
    private JTextArea messageArea;
    private LoginSystem system = new LoginSystem();

    public LoginGUI() {
        setTitle("Registration & Login");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Cellphone (+27...):"));
        cellField = new JTextField();
        add(cellField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        JButton registerBtn = new JButton("Register");
        JButton loginBtn = new JButton("Login");
        add(registerBtn);
        add(loginBtn);

        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setBackground(new Color(240, 248, 255));
        add(new JScrollPane(messageArea));

        registerBtn.addActionListener(e -> handleRegister());
        loginBtn.addActionListener(e -> handleLogin());

        setVisible(true);
    }

    private void handleRegister() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String cell = cellField.getText().trim();
        String email = emailField.getText().trim();

        StringBuilder msg = new StringBuilder();

        if (!Validator.isValidUsername(username))
            msg.append("❌ Username must contain '_' and be ≤ 5 characters.\n");
        else
            msg.append("✅ Username captured.\n");

        if (!Validator.isValidPassword(password))
            msg.append("❌ Password must be ≥8 chars, with uppercase, number, and special char.\n");
        else
            msg.append("✅ Password captured.\n");

        if (!Validator.isValidCellPhone(cell))
            msg.append("❌ Cellphone must start with +27 and have 9 digits.\n");
        else
            msg.append("✅ Cellphone captured.\n");

        if (!Validator.isValidEmail(email))
            msg.append("❌ Email format is invalid.\n");
        else
            msg.append("✅ Email captured.\n");

        if (system.register(username, password, cell, email))
            msg.append("🎉 Registration successful!\n");

        messageArea.setText(msg.toString());
    }

    private void handleLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (system.login(username, password))
            messageArea.setText("👋 Welcome back, " + username + "!");
        else
            messageArea.setText("⚠️ Login failed. Check your credentials.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginGUI::new);
    }
}
