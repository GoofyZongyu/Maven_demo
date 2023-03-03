package Frame;

import javax.swing.*;

public class loginFrame extends JFrame {
    public loginFrame() {
        initLoginFrame();
        initLoginMenu();

        this.setVisible(true);
    }

    public void initLoginMenu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu helpMenu = new JMenu("help");
        jMenuBar.add(helpMenu);

        JMenuItem ruleItem = new JMenuItem("rules");
        JMenuItem aboutItem = new JMenuItem("about us");
        helpMenu.add(ruleItem);
        helpMenu.add(aboutItem);

        this.setJMenuBar(jMenuBar);
    }

    public void initLoginFrame() {
        this.setSize(600, 450);
        this.setTitle("login DarkWar Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public void initLoginPanel(){

    }
}
