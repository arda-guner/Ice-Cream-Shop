package All_GUIs_Are_One;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Vincents_Ijssalon extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;

    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Vincents_Ijssalon frame = new Vincents_Ijssalon();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Vincents_Ijssalon() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 583, 417);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label7 = new JLabel("Vincent's Ijssalon");
        label7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label7.setBounds(182, 10, 169, 36);
        contentPane.add(label7);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBounds(10, 65, 239, 167);
        contentPane.add(panel);
        panel.setLayout(null);

        radioButton1 = new JRadioButton("Vanille       €1,3");
        radioButton1.setBackground(SystemColor.activeCaption);
        radioButton1.setBounds(18, 37, 147, 21);
        radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panel.add(radioButton1);

        radioButton2 = new JRadioButton("Aardbei      €1,7");
        radioButton2.setBackground(SystemColor.activeCaption);
        radioButton2.setBounds(18, 78, 147, 21);
        radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panel.add(radioButton2);

        radioButton3 = new JRadioButton("Chocolade  €2");
        radioButton3.setBackground(SystemColor.activeCaption);
        radioButton3.setBounds(18, 122, 147, 21);
        radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        panel.add(radioButton3);

        textField4 = new JTextField();
        textField4.setBounds(170, 37, 46, 19);
        panel.add(textField4);
        textField4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField4.setColumns(10);

        textField5 = new JTextField();
        textField5.setBounds(170, 80, 46, 19);
        textField5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField5.setColumns(10);
        panel.add(textField5);

        textField6 = new JTextField();
        textField6.setBounds(170, 124, 46, 19);
        textField6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField6.setColumns(10);
        panel.add(textField6);

        JLabel label4 = new JLabel("Ijssen");
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label4.setBounds(57, 10, 57, 21);
        panel.add(label4);

        JLabel label5 = new JLabel("Stuck");
        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label5.setBounds(170, 10, 57, 21);
        panel.add(label5);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.activeCaption);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_1.setBounds(308, 65, 204, 167);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        checkBox1 = new JCheckBox("Hagelslag  €.25");
        checkBox1.setBackground(SystemColor.activeCaption);
        checkBox1.setBounds(19, 40, 147, 21);
        panel_1.add(checkBox1);
        checkBox1.setFont(new Font("Tahoma", Font.PLAIN, 17));

        checkBox2 = new JCheckBox("Pinda's      €.50");
        checkBox2.setBackground(SystemColor.activeCaption);
        checkBox2.setBounds(19, 79, 147, 21);
        panel_1.add(checkBox2);
        checkBox2.setFont(new Font("Tahoma", Font.PLAIN, 17));

        checkBox3 = new JCheckBox("Fudge        €.75");
        checkBox3.setBackground(SystemColor.activeCaption);
        checkBox3.setBounds(19, 120, 147, 21);
        panel_1.add(checkBox3);
        checkBox3.setFont(new Font("Tahoma", Font.PLAIN, 17));

        JLabel label6 = new JLabel("Aanvullend");
        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label6.setBounds(58, 10, 80, 21);
        panel_1.add(label6);

        textField1 = new JTextField();
        textField1.setBackground(new Color(0, 0, 0));
        textField1.setEditable(false);
        textField1.setEnabled(false);
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField1.setBounds(495, 257, 65, 19);
        contentPane.add(textField1);
        textField1.setColumns(10);

        JLabel label1 = new JLabel("Subtotaal Prijs:");
        label1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label1.setBounds(369, 252, 116, 29);
        contentPane.add(label1);

        JLabel label2 = new JLabel("Belasting:");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label2.setBounds(411, 286, 74, 29);
        contentPane.add(label2);

        textField2 = new JTextField();
        textField2.setBackground(new Color(0, 0, 0));
        textField2.setEnabled(false);
        textField2.setEditable(false);
        textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField2.setColumns(10);
        textField2.setBounds(495, 291, 65, 19);
        contentPane.add(textField2);

        JLabel label3 = new JLabel("Totaal Prijs:");
        label3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label3.setBounds(397, 322, 96, 29);
        contentPane.add(label3);

        textField3 = new JTextField();
        textField3.setBackground(new Color(0, 0, 0));
        textField3.setEditable(false);
        textField3.setEnabled(false);
        textField3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField3.setColumns(10);
        textField3.setBounds(495, 327, 65, 19);
        contentPane.add(textField3);

        JButton button1 = new JButton("Bereken");
        button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button1.setBounds(10, 272, 96, 21);
        contentPane.add(button1);

        JButton button2 = new JButton("Reset");
        button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button2.setBounds(127, 274, 96, 21);
        contentPane.add(button2);

        JButton button3 = new JButton("Uitgaan");
        button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button3.setBounds(240, 274, 96, 21);
        contentPane.add(button3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totaal;  // the total price that we will pay
                double subTotaal = 0; // the price without tax

                final double taxRate = 0.3; // our tax rate
                double tax;  // the price of our items x 0.3

                double vanilleTotaal = 0;
                double aardbeiTotaal = 0;
                double chocoladeTotaal = 0;

                if (radioButton1.isSelected()) {
                    int nummerVanille = Integer.parseInt(textField4.getText());
                    vanilleTotaal = 1.3 * nummerVanille;
                }

                if (radioButton2.isSelected()) {
                    int nummerAardbei = Integer.parseInt(textField5.getText());
                    aardbeiTotaal = 1.7 * nummerAardbei;
                }

                if (radioButton3.isSelected()) {
                    int nummerChocolade = Integer.parseInt(textField6.getText());
                    chocoladeTotaal = 2 * nummerChocolade;
                }

                subTotaal = vanilleTotaal + aardbeiTotaal + chocoladeTotaal;

                if (checkBox1.isSelected()) {
                    subTotaal += 0.25;
                }

                if (checkBox2.isSelected()) {
                    subTotaal += 0.5;
                }

                if (checkBox3.isSelected()) {
                    subTotaal += 0.75;
                }

                textField1.setText(String.format("€%.2f", subTotaal));

                tax = subTotaal * taxRate;
                textField2.setText(String.format("€%.2f", tax));

                totaal = tax + subTotaal;
                textField3.setText(String.format("€%.2f", totaal));
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    textField4.setEnabled(true);
                } else {
                    textField4.setEnabled(false);
                    textField4.setText("");
                }
                checkEnableCheckBoxes();
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    textField5.setEnabled(true);
                } else {
                    textField5.setEnabled(false);
                    textField5.setText("");
                }
                checkEnableCheckBoxes();
            }
        });

        radioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton3.isSelected()) {
                    textField6.setEnabled(true);
                } else {
                    textField6.setEnabled(false);
                    textField6.setText("");
                }
                checkEnableCheckBoxes();
            }
        });

        textField4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkEnableCheckBoxes();
            }
        });

        textField5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkEnableCheckBoxes();
            }
        });

        textField6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkEnableCheckBoxes();
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                resetForm();
            }
        });
    }

    private void checkEnableCheckBoxes() {
        boolean enable = (radioButton1.isSelected() && !textField4.getText().isEmpty()) ||
                         (radioButton2.isSelected() && !textField5.getText().isEmpty()) ||
                         (radioButton3.isSelected() && !textField6.getText().isEmpty());
        checkBox1.setEnabled(enable);
        checkBox2.setEnabled(enable);
        checkBox3.setEnabled(enable);
    }

    private void resetForm() {
        radioButton1.setSelected(false);
        radioButton2.setSelected(false);
        radioButton3.setSelected(false);

        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);

        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");

        textField4.setEnabled(false);
        textField5.setEnabled(false);
        textField6.setEnabled(false);

        checkBox1.setEnabled(false);
        checkBox2.setEnabled(false);
        checkBox3.setEnabled(false);
    }
}
