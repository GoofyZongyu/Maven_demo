package Frame;

import utils.Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startFrame extends JFrame {
    public startFrame() {
        initStartFrame();
        initStartPanel();
        this.setVisible(true);
    }

    public void initStartFrame() {
        this.setTitle("Welcome to the DarkWar Game");
        this.setSize(600, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initStartPanel() {
        JPanel startPanel = new JPanel();
        startPanel.setLayout(null);
        startPanel.setBackground(Color.pink);
        //注册按钮
        JButton registerButton = new JButton("register");
        startPanel.add(registerButton);
        registerButton.setBounds(200, 200, 200, 70);
        registerButton.addActionListener(e -> new registerFrame());
        //登录按钮
        JButton loginButton = new JButton("login");
        startPanel.add(loginButton);
        loginButton.setBounds(200,100,200,70);
        loginButton.addActionListener(e -> new loginFrame());

        this.setContentPane(startPanel);
    }
}
