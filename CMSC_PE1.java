
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CMSC_PE1 extends JFrame implements ActionListener{

    Container c;
    JButton load_file;
    JButton process;
    JPanel transition_table_panel;
    JPanel input_panel;
    JPanel output_panel;
    JPanel status_panel;

    // font/s
    Font font = new Font("Helvetica", Font.PLAIN, 15);
    
    public CMSC_PE1() {
        setBounds(300, 90, 800, 600);
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
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        c.add(load_file, gbc);

        process = new JButton("Process", null);
        process.setFont(font);
        process.addActionListener(this);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(process, gbc);

        transition_table_panel = new JPanel();
        transition_table_panel.setBackground(Color.RED);
        transition_table_panel.setPreferredSize(new Dimension(100, 50));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(transition_table_panel, gbc);
        
        input_panel = new JPanel();
        input_panel.setBackground(Color.GREEN);
        input_panel.setPreferredSize(new Dimension(100, 50));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(input_panel, gbc);

        output_panel = new JPanel();
        output_panel.setBackground(Color.BLUE);
        output_panel.setPreferredSize(new Dimension(100, 50));
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(output_panel, gbc);

        status_panel = new JPanel();
        status_panel.setBackground(Color.CYAN);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        c.add(status_panel, gbc);

        pack();
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) throws Exception{
        new CMSC_PE1();
    }

}