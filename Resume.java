import java.awt.*;
import javax.swing.*;

class Resume extends JFrame{
    Resume(){

        setLayout(new BorderLayout());       
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        JLabel heading = new JLabel("RESUME BUILDER");
        heading.setFont(new Font("BOOKMAN OLD STYLE",Font.BOLD, 30));
        jp1.add(heading);

        jp2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel l1 = new JLabel("Name:");
        gbc.gridx=0;
        gbc.gridy=0;
        jp2.add(l1,gbc);

        JTextField d1 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=10;
        jp2.add(d1,gbc);

        JLabel l2 = new JLabel("Date of birth:");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=1;
        jp2.add(l2,gbc);
        
        JTextField d2 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=1;
        gbc.gridwidth=10;
        jp2.add(d2,gbc);

        JLabel l3 = new JLabel("Email Address:");
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=1;
        jp2.add(l3,gbc);

        JTextField d3 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=3;
        gbc.gridwidth=2;
        jp2.add(d3,gbc);

        JLabel l4 = new JLabel("Gender:");
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth=1;
        jp2.add(l4,gbc);

        JRadioButton op1 = new JRadioButton("Male");
        gbc.gridx=1;
        gbc.gridy=4;
        gbc.gridwidth=1;
        jp2.add(op1,gbc);

        JRadioButton op2 = new JRadioButton("Female");
        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=1;
        jp2.add(op2,gbc);

        ButtonGroup bg = new ButtonGroup();
        bg.add(op1);
        bg.add(op2);

        JLabel l6 = new JLabel("Address:");
        gbc.gridx=0;
        gbc.gridy=5;
        gbc.gridwidth=1;
        jp2.add(l6,gbc);

        JTextArea d6 = new JTextArea(8,15);
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.gridwidth=2;
        jp2.add(d6,gbc);


        JLabel l7 = new JLabel("Phone No.:            ");
        gbc.gridx=0;
        gbc.gridy=6;
        jp2.add(l7,gbc);

        JTextField d7 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=6;
        gbc.gridwidth=2;
        jp2.add(d7,gbc);


        JLabel l8 = new JLabel("Education:                  ");
        gbc.gridx=0;
        gbc.gridy=7;
        jp2.add(l8,gbc);

        JTextField d8 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=7;
        gbc.gridwidth=100;
        jp2.add(d8,gbc);

        JLabel l9 = new JLabel("Linkedin url:");
        gbc.gridx=0;
        gbc.gridy=8;
        gbc.gridwidth=1;
        jp2.add(l9,gbc);
        
        JTextField d9 = new JTextField(15);
        gbc.gridx=1;
        gbc.gridy=8;
        gbc.gridwidth=10;
        jp2.add(d9,gbc);

        JLabel l10 = new JLabel("GitHub url:");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth= 1;
        jp2.add(l10,gbc);

        JTextField d10 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 10;
        jp2.add(d10,gbc);
        

        JButton b1 = new JButton("SAVE");
        JButton b2 = new JButton("CANCEL");
        JButton b3 = new JButton("RESET");
       

        jp1.setLayout(new FlowLayout());
        jp3.setLayout(new FlowLayout());

       
        jp3.add(b1);
        jp3.add(b2);
        jp3.add(b3);
        

        add(jp1,BorderLayout.NORTH);
        add(jp2,BorderLayout.CENTER);
        add(jp3,BorderLayout.SOUTH);

        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String args[])
    {
        new Resume();
    }
}