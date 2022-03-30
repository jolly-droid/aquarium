import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
this is the user interface, where we select the number of fish and the mode
 */
public class aquariumGUI implements ActionListener {

    JButton normalB = new JButton("normal mode");
    JButton partyB = new JButton("party mode");
    JTextField numberOfFish = new JTextField();

    //constructor
    public aquariumGUI() {
        prepareGUI();

        int mode = 0;
        int number = 0;

        //generateAquarium(number,mode);
    }

    private void generateAquarium(int number, int mode) {
        new aquarium(number, mode);
    }

    /*
        standardsettings for the userinterface gui
         */
    private void prepareGUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        normalB.addActionListener(this);
        partyB.addActionListener(this);
        numberOfFish.setText("0");

        panel.setBorder(BorderFactory.createEmptyBorder(130, 130, 110, 300));
        panel.add(normalB);
        panel.add(partyB);
        panel.add(numberOfFish);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("aquarium menu");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int mode = 3;
        if (e.getSource() == normalB) {
            mode = 0;
        } else if (e.getSource() == partyB) {
            mode = 1;
        } else {
            System.out.println("error");
        }
        generateAquarium(Integer.parseInt(numberOfFish.getText()), mode);
    }


}
