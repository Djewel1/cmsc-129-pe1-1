
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CMSC_PE1 extends JFrame implements ActionListener{

    Container c;
    JButton load_file;
    JButton process;
    JLabel transition_table;
    JLabel input;
    JLabel output;
    JLabel status;

    // font/s
    Font font = new Font("Helvetica", Font.PLAIN, 15);
    
    public CMSC_PE1() {
        setBounds(300, 90, 600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);

        load_file = new JButton("Load File");
        load_file.setFont(font);
        load_file.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        c.add(load_file, gbc);

        process = new JButton("Process", null);
        process.setFont(font);
        process.addActionListener(this);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        c.add(process, gbc);

        pack();
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) throws Exception{
        new CMSC_PE1();
    }

}