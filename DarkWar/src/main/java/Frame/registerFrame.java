package Frame;

import javax.swing.*;

public class registerFrame extends JFrame {
    public registerFrame() {
        initRegisterFrame();
        initRegisterPanel();
        this.setVisible(true);
    }

    public void initRegisterFrame() {
        this.setTitle("register");
        this.setSize(600, 450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void initRegisterPanel() {
        JPanel registerPanel=new JPanel();
        registerPanel.setLayout(null);
        this.setContentPane(registerPanel);

    }
}
