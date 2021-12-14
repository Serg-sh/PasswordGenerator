package src.ua.serg.passgen;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.KeyEvent;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Window {

    private JFrame frame;
    JTextField textFieldPass;
    JSpinner spinner = new JSpinner();
    JCheckBox chckbxNumber = new JCheckBox("");
    JCheckBox checkBoxEnLett = new JCheckBox("");
    JCheckBox checkBoxEnCapLett = new JCheckBox("");
    JCheckBox checkBoxRuLett = new JCheckBox("");
    JCheckBox checkBoxRuCapLett = new JCheckBox("");
    JCheckBox checkBoxSymbol = new JCheckBox("");
    JCheckBox checkBoxAbcd12 = new JCheckBox("");
    JComboBox<String> comboBox = new JComboBox<String>();

    /**
     * Action Listener
     */

    ActionButtGen actButtGen = new ActionButtGen(this);
    ActionCopyBtn actCopyBtn = new ActionCopyBtn(this);
    ActionChckBox actChckBox = new ActionChckBox(this);
    ActionChckBoxForm actChckBoxForm = new ActionChckBoxForm(this);
    private final JLabel authorLabel = new JLabel("Developed by Sergey Shpak");


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Window window = new Window();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    /**
     * Create the application.
     */
    public Window() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        JPanel panel = new JPanel();
        textFieldPass = new JTextField();

        JButton btnGeneration = new JButton("Генерировать");
        btnGeneration.setFont(new Font("Century Gothic", Font.BOLD, 12));
        btnGeneration.addActionListener(actButtGen);

        JButton btnCopy = new JButton("");
        btnCopy.setIcon(new ImageIcon(Objects.requireNonNull(Window.class.getResource(
                "/src/ua/serg/passgen/page_copy.png")
        )));
        btnCopy.setHorizontalTextPosition(SwingConstants.CENTER);
        btnCopy.setPreferredSize(new Dimension(89, 20));
        btnCopy.setBounds(314, 20, 44, 44);
        btnCopy.addActionListener(actCopyBtn);
        panel.add(btnCopy);
        panel.setLayout(null);

        frame = new JFrame();
        frame.setTitle("Генератор паролей вер. 1.3");
        frame.setResizable(false);
        frame.setContentPane(panel);

        textFieldPass.setFocusable(false);
        textFieldPass.setFont(new Font("Century Gothic", Font.BOLD, 16));
        textFieldPass.setBounds(10, 20, 300, 44);
        textFieldPass.setColumns(10);
        panel.add(textFieldPass);

        btnGeneration.setFont(new Font("Century Gothic", Font.BOLD, 18));
        btnGeneration.setActionCommand("");
        btnGeneration.setBounds(10, 70, 344, 35);
        panel.add(btnGeneration);

        JLabel label = new JLabel("Настройки");
        label.setOpaque(true);
        label.setBounds(20, 106, 100, 20);
        label.setForeground(Color.GRAY);
        label.setDisplayedMnemonic(KeyEvent.VK_ACCEPT);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.LEADING);
        panel.add(label);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 116, 344, 249);
        panel.add(panel_1);
        panel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        panel_1.setToolTipText("");
        panel_1.setName("");
        panel_1.setBorder(new LineBorder(new Color(128, 128, 128)));
        panel_1.setForeground(Color.BLACK);
        panel_1.setLayout(null);

        spinner.setModel(new SpinnerNumberModel(8, 6, 20, 1));
        spinner.setFont(new Font("Century Gothic", Font.BOLD, 12));
        spinner.setRequestFocusEnabled(false);
        spinner.setFocusable(false);
        spinner.setFocusTraversalKeysEnabled(false);
        spinner.setBounds(124, 12, 43, 20);
        panel_1.add(spinner);

        JLabel LabelPassLong = new JLabel("Длина пароля");
        LabelPassLong.setFont(new Font("Century Gothic", Font.BOLD, 12));
        LabelPassLong.setBounds(25, 11, 101, 20);
        panel_1.add(LabelPassLong);

        JLabel labelINum09 = new JLabel("Использовать цифры (0 - 9)");
        labelINum09.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelINum09.setBounds(55, 43, 280, 20);
        panel_1.add(labelINum09);

        JLabel labelEnLett = new JLabel("Использовать латинские строчные (a - z)");
        labelEnLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelEnLett.setBounds(55, 68, 280, 20);
        panel_1.add(labelEnLett);

        JLabel labelEnCapLett = new JLabel("Использовать латинские заглавные (A - Z)");
        labelEnCapLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelEnCapLett.setBounds(55, 93, 280, 20);
        panel_1.add(labelEnCapLett);

        JLabel labelRuLett = new JLabel("Использовать кирилицу прописные (а - я)");
        labelRuLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelRuLett.setBounds(55, 118, 280, 20);
        panel_1.add(labelRuLett);

        JLabel labelRuCapLett = new JLabel("Использовать кирилицу заглавные (А - Я)");
        labelRuCapLett.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelRuCapLett.setBounds(55, 143, 280, 20);
        panel_1.add(labelRuCapLett);

        JLabel labelSymbol = new JLabel("Использовать символы и знаки");
        labelSymbol.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelSymbol.setBounds(55, 168, 280, 20);
        panel_1.add(labelSymbol);

        JLabel labelOnlySymbol = new JLabel("Использовать шаблон:");
        labelOnlySymbol.setFont(new Font("Century Gothic", Font.BOLD, 12));
        labelOnlySymbol.setBounds(55, 193, 279, 20);
        panel_1.add(labelOnlySymbol);

        chckbxNumber.setBounds(25, 40, 25, 25);
        chckbxNumber.addActionListener(actChckBox);
        panel_1.add(chckbxNumber);

        checkBoxEnLett.setBounds(25, 65, 25, 25);
        checkBoxEnLett.addActionListener(actChckBox);
        panel_1.add(checkBoxEnLett);

        checkBoxEnCapLett.setBounds(25, 90, 25, 25);
        checkBoxEnCapLett.addActionListener(actChckBox);
        panel_1.add(checkBoxEnCapLett);

        checkBoxRuLett.setBounds(25, 115, 25, 25);
        checkBoxRuLett.addActionListener(actChckBox);
        panel_1.add(checkBoxRuLett);

        checkBoxRuCapLett.setBounds(25, 140, 25, 25);
        checkBoxRuCapLett.addActionListener(actChckBox);
        panel_1.add(checkBoxRuCapLett);

        checkBoxSymbol.setActionCommand("");
        checkBoxSymbol.setBounds(25, 165, 25, 25);
        checkBoxSymbol.addActionListener(actChckBox);
        panel_1.add(checkBoxSymbol);

        checkBoxAbcd12.setSelected(true);
        checkBoxAbcd12.setActionCommand("");
        checkBoxAbcd12.setBounds(25, 190, 25, 25);
        checkBoxAbcd12.addActionListener(actChckBoxForm);
        panel_1.add(checkBoxAbcd12);

        comboBox.setFocusable(false);
        comboBox.setFont(new Font("Century Gothic", Font.BOLD, 14));
        comboBox.setModel(new DefaultComboBoxModel<String>(new String[]{"Abcd12......", "123ABc......"}));
        comboBox.setBounds(25, 215, 290, 25);
        panel_1.add(comboBox);

        authorLabel.setForeground(Color.GRAY);
        authorLabel.setFont(new Font("Century Gothic", Font.PLAIN, 8));
        authorLabel.setBounds(250, 367, 110, 9);
        panel.add(authorLabel);

        JPanel panelSetings = new JPanel();
        panelSetings.setFont(new Font("Tahoma", Font.BOLD, 14));
        panelSetings.setBorder(null);
        panelSetings.setAutoscrolls(true);
        panelSetings.setAlignmentY(Component.TOP_ALIGNMENT);
        panelSetings.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelSetings.setLayout(null);
        frame.setBounds(100, 100, 370, 405);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
