
/*
`
 */
package ScientificCalculator;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Johnny Dodge
 */
public class NewJDialog extends javax.swing.JDialog 
{
    /*
    Creates new form NewJDialog
     */
    public NewJDialog(java.awt.Frame parent, boolean modal)
    {
        //super(parent, modal);
        initComponents();
        
    }
    String p = "%";
    double num,answer;
    int calculation;
    boolean science = false;
    public void ScientificCalculator(){
        initComponents();
        jTextFieldAnswer.setEnabled(false);
    }
    
  
    public static void main(String args[]) {
       
        File uc = new File("unitcircle.html");
       // BufferedWriter bw = new BufferedWriter(new FileWriter(uc));
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
               
            }
        });
    }
 
    public void calculatorOperations() 
    {
        switch(calculation) {
            case 1://Addition
                answer = num + Double.parseDouble(jTextFieldAnswer.getText());
                jTextFieldAnswer.setText(Double.toString(answer));
                break;
            case 2://Subtraction
                answer = num - Double.parseDouble(jTextFieldAnswer.getText());
                jTextFieldAnswer.setText(Double.toString(answer));
                break;
            case 3://Multiplication
                answer = num * Double.parseDouble(jTextFieldAnswer.getText());
                jTextFieldAnswer.setText(Double.toString(answer));
                break;
            case 4://Division
                answer = num / Double.parseDouble(jTextFieldAnswer.getText());
                jTextFieldAnswer.setText(Double.toString(answer));
                break;
            case 5://percent
               // 8% of 100 = 0.08 × 100 = 8
                answer = num / Double.parseDouble(jTextFieldAnswer.getText());
                answer *= 100;
                jTextFieldAnswer.setText(Double.toString(answer));
                break;
      
                
        }
    }
   
    public void disable() {
        jRadioButtonOff.setEnabled(false);
        jRadioButtonOn.setEnabled(true);
        jTextFieldAnswer.setEnabled(false);
        jButtonZero.setEnabled(false);
        jButtonOne.setEnabled(false);
        jButtonTwo.setEnabled(false);
        jButtonThree.setEnabled(false);
        jButtonFour.setEnabled(false);
        jButtonFive.setEnabled(false);
        jButtonSix.setEnabled(false);
        jButtonSeven.setEnabled(false);
        jButtonEight.setEnabled(false);
        jButtonNine.setEnabled(false);
        jButtonPeriod.setEnabled(false);
        jButtonPlusMinus.setEnabled(false);
        jButtonClear.setEnabled(false);
        jButtonSquareRoot.setEnabled(false);
        jButtonUndo.setEnabled(false);
        jButtonPercent.setEnabled(false);
        jButtonPlus.setEnabled(false);
        jButtonMinus.setEnabled(false);
        jButtonMultiply.setEnabled(false);
        jButtonDivide.setEnabled(false);
        jButtonEqual.setEnabled(false);
        jButtonCos.setEnabled(false);
        jButtonCosH.setEnabled(false);
        jButtonTan.setEnabled(false);
        jButtonTanH.setEnabled(false);
        jButtonSin.setEnabled(false);
        jButtonSinH.setEnabled(false);
        jButtonLog.setEnabled(false);
        jButtonRund.setEnabled(false);
        jButtonX2.setEnabled(false);
        jButtonX3.setEnabled(false);
        jButtonMod.setEnabled(false);
        jButtonCbr.setEnabled(false);
        jButtonBin.setEnabled(false);
        jButtonInx.setEnabled(false);
        jButtonMatrix.setEnabled(false);
        jButtonHex.setEnabled(false);
        jButtonPie.setEnabled(false);
        jButtonSquareRoot.setEnabled(false);
        jButtonFx.setEnabled(false);
        jButtonXY.setEnabled(false);
        jButtonMilestoKilo.setEnabled(false);
        jButtonOctal.setEnabled(false);

        
    }
    public void enable() {
        jRadioButtonOn.setEnabled(false);
        jRadioButtonOff.setEnabled(true);
        jTextFieldAnswer.setEnabled(true);
        jButtonZero.setEnabled(true);
        jButtonOne.setEnabled(true);
        jButtonTwo.setEnabled(true);
        jButtonThree.setEnabled(true);
        jButtonFour.setEnabled(true);
        jButtonFive.setEnabled(true);
        jButtonSix.setEnabled(true);
        jButtonSeven.setEnabled(true);
        jButtonEight.setEnabled(true);
        jButtonNine.setEnabled(true);
        jButtonPeriod.setEnabled(true);
        jButtonPlusMinus.setEnabled(true);
        jButtonClear.setEnabled(true);
        jButtonSquareRoot.setEnabled(true);
        jButtonUndo.setEnabled(true);
        jButtonPercent.setEnabled(true);
        jButtonPlus.setEnabled(true);
        jButtonMinus.setEnabled(true);
        jButtonMultiply.setEnabled(true);
        jButtonDivide.setEnabled(true);
        jButtonEqual.setEnabled(true);
        jButtonCos.setEnabled(true);
        jButtonCosH.setEnabled(true);
        jButtonTan.setEnabled(true);
        jButtonTanH.setEnabled(true);
        jButtonSin.setEnabled(true);
        jButtonSinH.setEnabled(true);
        jButtonLog.setEnabled(true);
        jButtonRund.setEnabled(true);
        jButtonX2.setEnabled(true);
        jButtonX3.setEnabled(true);
        jButtonMod.setEnabled(true);
        jButtonCbr.setEnabled(true);
        jButtonBin.setEnabled(true);
        jButtonInx.setEnabled(true);
        jButtonMatrix.setEnabled(true);
        jButtonHex.setEnabled(true);
        jButtonPie.setEnabled(true);
        jButtonSquareRoot.setEnabled(true);
        jButtonFx.setEnabled(true);
        jButtonXY.setEnabled(true);
        jButtonMilestoKilo.setEnabled(true);
        jButtonOctal.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jButtonPercent = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSquareRoot = new javax.swing.JButton();
        jButtonUndo = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonPeriod = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonPlusMinus = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jTextFieldAnswer = new javax.swing.JTextField();
        jRadioButtonOn = new javax.swing.JRadioButton();
        jRadioButtonOff = new javax.swing.JRadioButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonPie = new javax.swing.JButton();
        jButtonCos = new javax.swing.JButton();
        jButtonXY = new javax.swing.JButton();
        jButtonTan = new javax.swing.JButton();
        jButtonX2 = new javax.swing.JButton();
        jButtonCbr = new javax.swing.JButton();
        jButtonInx = new javax.swing.JButton();
        jButtonMatrix = new javax.swing.JButton();
        jButtonSin = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonCosH = new javax.swing.JButton();
        jButtonLog = new javax.swing.JButton();
        jButtonTanH = new javax.swing.JButton();
        jButtonBin = new javax.swing.JButton();
        jButtonRund = new javax.swing.JButton();
        jButtonHex = new javax.swing.JButton();
        jButtonOctal = new javax.swing.JButton();
        jButtonMilestoKilo = new javax.swing.JButton();
        jButtonFx = new javax.swing.JButton();
        jButtonSinH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        canvasPie = new java.awt.Canvas();
        jLabelOperation = new javax.swing.JLabel();
        jButtonX3 = new javax.swing.JButton();
        jComboBoxUC = new javax.swing.JComboBox<>();
        jTextFieldUnitConvertAnswer = new javax.swing.JTextField();
        jButtonConvert = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelUC1 = new javax.swing.JLabel();
        jLabelUC2 = new javax.swing.JLabel();
        jTextFieldUC2 = new javax.swing.JTextField();
        jLabelConversions = new javax.swing.JLabel();
        jLabelUnitConversion1 = new javax.swing.JLabel();
        jLabelUnitConversion2 = new javax.swing.JLabel();
        jLabelDSTConversions = new javax.swing.JLabel();
        jLabelConversions2 = new javax.swing.JLabel();
        jTextFieldUC1 = new javax.swing.JTextField();
        jPanelCartesian = new javax.swing.JPanel();
        jLabelCartesian = new javax.swing.JLabel();
        jStaticGraphIt = new javax.swing.JLabel();
        jButtonUnitCircle = new javax.swing.JButton();
        jButtonSineWav = new javax.swing.JButton();
        labelCanvas = new java.awt.Label();
        jButtonCosWave = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemStandard = new javax.swing.JMenuItem();
        jMenuItemScientific = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setForeground(java.awt.Color.white);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPercent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPercent.setText("%");
        jButtonPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 30));

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonClear.setText("C");
        jButtonClear.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonClear.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 45, 30));

        jButtonSquareRoot.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSquareRoot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSquareRoot.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\squarerooticon.jpg")); // NOI18N
        jButtonSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSquareRootActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSquareRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 40, 40));

        jButtonUndo.setBackground(new java.awt.Color(255, 51, 51));
        jButtonUndo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonUndo.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\backbuttonicon.jpg")); // NOI18N
        jButtonUndo.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonUndo.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonUndo.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUndoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 40));

        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSeven.setText("7");
        jButtonSeven.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonSeven.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonSeven.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 45, 30));

        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonEight.setText("8");
        jButtonEight.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonEight.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonEight.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 45, 30));

        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonNine.setText("9");
        jButtonNine.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonNine.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonNine.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 45, 30));

        jButtonDivide.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 30));

        jButtonFour.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonFour.setText("4");
        jButtonFour.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonFour.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonFour.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jButtonFive.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonFive.setText("5");
        jButtonFive.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonFive.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonFive.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSix.setText("6");
        jButtonSix.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonSix.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonSix.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 45, 30));

        jButtonMultiply.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonMultiply.setText("x");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, 30));

        jButtonThree.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonThree.setText("3");
        jButtonThree.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonThree.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonThree.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonMinus.setText("-");
        jButtonMinus.setMaximumSize(new java.awt.Dimension(39, 23));
        jButtonMinus.setMinimumSize(new java.awt.Dimension(39, 23));
        jButtonMinus.setPreferredSize(new java.awt.Dimension(39, 23));
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 30));

        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonOne.setText("1");
        jButtonOne.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonOne.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonOne.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        jButtonZero.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonZero.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonZero.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jButtonPeriod.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonPeriod.setText(".");
        jButtonPeriod.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonPeriod.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonPeriod.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPeriodActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 30));

        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonPlus.setText("+");
        jButtonPlus.setMaximumSize(new java.awt.Dimension(39, 23));
        jButtonPlus.setMinimumSize(new java.awt.Dimension(39, 23));
        jButtonPlus.setPreferredSize(new java.awt.Dimension(39, 23));
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 50, 30));

        jButtonPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jButtonPlusMinus.setText("+-");
        jButtonPlusMinus.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonPlusMinus.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonPlusMinus.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlusMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        jButtonEqual.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEqual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEqual.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\equalbarpurple.jpg")); // NOI18N
        jButtonEqual.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonEqual.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonEqual.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonEqual.setPreferredSize(new java.awt.Dimension(210, 33));
        jButtonEqual.setRequestFocusEnabled(false);
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 30));

        jTextFieldAnswer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldAnswer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnswerActionPerformed(evt);
            }
        });
        jTextFieldAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnswerKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 28));

        buttonGroup1.add(jRadioButtonOn);
        jRadioButtonOn.setSelected(true);
        jRadioButtonOn.setText("on");
        jRadioButtonOn.setToolTipText("Enables features");
        jRadioButtonOn.setEnabled(false);
        jRadioButtonOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOnActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonGroup1.add(jRadioButtonOff);
        jRadioButtonOff.setText("off");
        jRadioButtonOff.setToolTipText("Disables features");
        jRadioButtonOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOffActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTwo.setText("2");
        jButtonTwo.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonTwo.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonTwo.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jButtonPie.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPie.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonPie.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\pie.jpg")); // NOI18N
        jButtonPie.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonPie.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonPie.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 40, 40));

        jButtonCos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCos.setText("Cos");
        jButtonCos.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonCos.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonCos.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 54, -1));

        jButtonXY.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonXY.setText("x'y");
        jButtonXY.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonXY.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonXY.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonXY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXYActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 50, -1));

        jButtonTan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTan.setText("Tan");
        jButtonTan.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonTan.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonTan.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 59, -1));

        jButtonX2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonX2.setText("x'2");
        jButtonX2.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonX2.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonX2.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonX2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 50, -1));

        jButtonCbr.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCbr.setText("Cbr");
        jButtonCbr.setToolTipText("");
        jButtonCbr.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonCbr.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonCbr.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonCbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCbrActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));

        jButtonInx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonInx.setText("Inx");
        jButtonInx.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonInx.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonInx.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonInx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInxActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInx, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 50, -1));

        jButtonMatrix.setBackground(new java.awt.Color(2, 176, 104));
        jButtonMatrix.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\matrixtextsmall2.jpg")); // NOI18N
        jButtonMatrix.setText("Matrix");
        jButtonMatrix.setActionCommand("");
        jButtonMatrix.setAlignmentY(0.0F);
        jButtonMatrix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonMatrix.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonMatrix.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonMatrix.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatrixActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 110, 80));

        jButtonSin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSin.setText("Sin");
        jButtonSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 51, -1));

        jButtonMod.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonMod.setText("Mod");
        jButtonMod.setActionCommand("");
        jButtonMod.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonMod.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonMod.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 60, -1));

        jButtonCosH.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButtonCosH.setText("CosH");
        jButtonCosH.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonCosH.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonCosH.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonCosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCosH, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, -1));

        jButtonLog.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonLog.setText("Log");
        jButtonLog.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonLog.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonLog.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 60, -1));

        jButtonTanH.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonTanH.setText("TanH");
        jButtonTanH.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonTanH.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonTanH.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonTanH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTanHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTanH, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 59, -1));

        jButtonBin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonBin.setText("Bin");
        jButtonBin.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonBin.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonBin.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 50, -1));

        jButtonRund.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonRund.setText("Rund");
        jButtonRund.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonRund.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonRund.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonRund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRundActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRund, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 59, -1));

        jButtonHex.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonHex.setText("Hex");
        jButtonHex.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonHex.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonHex.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHexActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHex, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, -1));

        jButtonOctal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonOctal.setText("Octal");
        jButtonOctal.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonOctal.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonOctal.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOctalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOctal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 59, -1));

        jButtonMilestoKilo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonMilestoKilo.setText("Miles to Kilo");
        jButtonMilestoKilo.setActionCommand("");
        jButtonMilestoKilo.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonMilestoKilo.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonMilestoKilo.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonMilestoKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMilestoKiloActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMilestoKilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 130, -1));

        jButtonFx.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonFx.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\fxicon.jpg")); // NOI18N
        jButtonFx.setBorder(null);
        jButtonFx.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonFx.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonFx.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonFx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFxActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFx, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 40, 40));

        jButtonSinH.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSinH.setText("Sinh");
        jButtonSinH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSinHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSinH, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Unit Conversion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        canvasPie.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(canvasPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 70));

        jLabelOperation.setBackground(new java.awt.Color(255, 204, 0));
        jLabelOperation.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabelOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 20));

        jButtonX3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonX3.setText("x'3");
        jButtonX3.setMaximumSize(new java.awt.Dimension(45, 23));
        jButtonX3.setMinimumSize(new java.awt.Dimension(45, 23));
        jButtonX3.setPreferredSize(new java.awt.Dimension(45, 23));
        jButtonX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonX3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 50, -1));

        jComboBoxUC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solve for", "Distance", "Speed", "Time", "Celsius", "Fahrenheit" }));
        jComboBoxUC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUCItemStateChanged(evt);
            }
        });
        jComboBoxUC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxUCFocusGained(evt);
            }
        });
        jComboBoxUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxUCMouseReleased(evt);
            }
        });
        jComboBoxUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUCActionPerformed(evt);
            }
        });
        jComboBoxUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxUCKeyPressed(evt);
            }
        });
        getContentPane().add(jComboBoxUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 210, -1));

        jTextFieldUnitConvertAnswer.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jTextFieldUnitConvertAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUnitConvertAnswer.setText("Answer");
        getContentPane().add(jTextFieldUnitConvertAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 210, -1));

        jButtonConvert.setText("Convert");
        jButtonConvert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButtonConvertItemStateChanged(evt);
            }
        });
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });
        jButtonConvert.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButtonConvertPropertyChange(evt);
            }
        });
        jButtonConvert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConvertKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButtonConvertKeyReleased(evt);
            }
        });
        getContentPane().add(jButtonConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabelUC1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelUC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUC1.setText("mph/");
        getContentPane().add(jLabelUC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 80, -1));

        jLabelUC2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelUC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUC2.setText("mph");
        getContentPane().add(jLabelUC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 70, -1));

        jTextFieldUC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUC2ActionPerformed(evt);
            }
        });
        jTextFieldUC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUC2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldUC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 70, -1));

        jLabelConversions.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelConversions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConversions.setText("T(°C) = (T(°F) - 32) × 5/9");
        getContentPane().add(jLabelConversions, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, 20));

        jLabelUnitConversion1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelUnitConversion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUnitConversion1.setText("Distance =");
        getContentPane().add(jLabelUnitConversion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 70, -1));

        jLabelUnitConversion2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelUnitConversion2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUnitConversion2.setText("Speed =");
        getContentPane().add(jLabelUnitConversion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, -1));

        jLabelDSTConversions.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelDSTConversions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDSTConversions.setText("d=s*t, s=d/t, t=d/s");
        getContentPane().add(jLabelDSTConversions, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 150, 20));

        jLabelConversions2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelConversions2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConversions2.setText("T(°F) = T(°C) × 9/5 + 32 ");
        getContentPane().add(jLabelConversions2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 20));

        jTextFieldUC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUC1ActionPerformed(evt);
            }
        });
        jTextFieldUC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldUC1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUC1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldUC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 70, -1));

        jPanelCartesian.setBackground(new java.awt.Color(153, 0, 255));
        jPanelCartesian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelCartesian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCartesian.setIcon(new javax.swing.ImageIcon("D:\\Captain\\New Computer\\Educational Studies\\2020\\Web Programming and Programming\\Java\\calculator\\images\\cartesianplane.jpg")); // NOI18N
        jLabelCartesian.setAlignmentY(0.0F);
        jLabelCartesian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelCartesian.setMaximumSize(new java.awt.Dimension(196, 148));
        jLabelCartesian.setMinimumSize(new java.awt.Dimension(196, 148));
        jLabelCartesian.setPreferredSize(new java.awt.Dimension(196, 148));

        jStaticGraphIt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jStaticGraphIt.setForeground(java.awt.Color.darkGray);
        jStaticGraphIt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jStaticGraphIt.setText("Graph It!");

        javax.swing.GroupLayout jPanelCartesianLayout = new javax.swing.GroupLayout(jPanelCartesian);
        jPanelCartesian.setLayout(jPanelCartesianLayout);
        jPanelCartesianLayout.setHorizontalGroup(
            jPanelCartesianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCartesian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jStaticGraphIt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelCartesianLayout.setVerticalGroup(
            jPanelCartesianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCartesianLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabelCartesian, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jStaticGraphIt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelCartesian, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 200, 300));

        jButtonUnitCircle.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUnitCircle.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonUnitCircle.setForeground(new java.awt.Color(153, 51, 255));
        jButtonUnitCircle.setText("Unit Circle");
        jButtonUnitCircle.setToolTipText("");
        jButtonUnitCircle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUnitCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnitCircleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUnitCircle, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 370, 90, -1));

        jButtonSineWav.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSineWav.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSineWav.setForeground(new java.awt.Color(153, 51, 255));
        jButtonSineWav.setText("Sine Wave");
        jButtonSineWav.setToolTipText("");
        jButtonSineWav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSineWav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSineWavActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSineWav, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 90, -1));

        labelCanvas.setAlignment(java.awt.Label.CENTER);
        labelCanvas.setBackground(new java.awt.Color(255, 204, 0));
        labelCanvas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCanvas.setName(""); // NOI18N
        getContentPane().add(labelCanvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, 20));

        jButtonCosWave.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCosWave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCosWave.setForeground(new java.awt.Color(153, 51, 255));
        jButtonCosWave.setText("Cos Wave");
        jButtonCosWave.setToolTipText("");
        jButtonCosWave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCosWave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCosWaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCosWave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemStandard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemStandard.setText("Standard");
        jMenuItemStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStandardActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemStandard);

        jMenuItemScientific.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemScientific.setText("Scientific");
        jMenuItemScientific.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMenuItemScientificFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMenuItemScientificFocusLost(evt);
            }
        });
        jMenuItemScientific.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemScientificMouseClicked(evt);
            }
        });
        jMenuItemScientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemScientificActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemScientific);

        jMenuItem1.setText("Exit");
        jMenuItem1.setActionCommand("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentActionPerformed
          num = Double.parseDouble(jTextFieldAnswer.getText());
         calculation = 5;//Division
         jTextFieldAnswer.setText("");
         jLabelOperation.setText(num + "% of");
       
    }//GEN-LAST:event_jButtonPercentActionPerformed
                                          
                                                 
    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
    jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "0");
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOneActionPerformed
        jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "1");
    }//GEN-LAST:event_jButtonOneActionPerformed
     
    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThreeActionPerformed
         jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "3");
    }//GEN-LAST:event_jButtonThreeActionPerformed

    private void jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFourActionPerformed
          jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "4");
    }//GEN-LAST:event_jButtonFourActionPerformed

    private void jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiveActionPerformed
        jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "5");
    }//GEN-LAST:event_jButtonFiveActionPerformed

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSixActionPerformed
         jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "6");
    }//GEN-LAST:event_jButtonSixActionPerformed

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSevenActionPerformed
        jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "7");
    }//GEN-LAST:event_jButtonSevenActionPerformed

    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEightActionPerformed
          jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "8");
    }//GEN-LAST:event_jButtonEightActionPerformed

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNineActionPerformed
         jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "9");
    }//GEN-LAST:event_jButtonNineActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldAnswer.setText("");
        jLabelOperation.setText("");
     
            
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSquareRootActionPerformed
    //jTextFieldAnswer.setText("");
    jLabelOperation.setText("");
    double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
    ops = Math.sqrt(ops);
    jTextFieldAnswer.setText(String.valueOf(ops));

    
    /*
      int length = jTextFieldAnswer.getText().length();
        int number = jTextFieldAnswer.getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(jTextFieldAnswer.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextFieldAnswer.setText(store);
   
    */
    
    }//GEN-LAST:event_jButtonSquareRootActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
         //jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "+");
         num = Double.parseDouble(jTextFieldAnswer.getText());
         calculation = 1;//Addition
         jTextFieldAnswer.setText("");
         jLabelOperation.setText(num + "+");
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
         //jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "-");
         num = Double.parseDouble(jTextFieldAnswer.getText());
         calculation = 2;//Subtraction
         jTextFieldAnswer.setText("");
         jLabelOperation.setText(num + "-");
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
         //jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "*");
         num = Double.parseDouble(jTextFieldAnswer.getText());
         calculation = 3;//Multiplication
         jTextFieldAnswer.setText("");
         jLabelOperation.setText(num + "*");
         if(science) {
            //jTextFieldAnswer.setSize(470, 28);
        } else {
           // jTextFieldAnswer.setSize(190, 28);
}
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
         //jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "/");
         num = Double.parseDouble(jTextFieldAnswer.getText());
         calculation = 4;//Division
         jTextFieldAnswer.setText("");
         jLabelOperation.setText(num + "/");
    
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUndoActionPerformed
        int length = jTextFieldAnswer.getText().length();
        int number = jTextFieldAnswer.getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(jTextFieldAnswer.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextFieldAnswer.setText(store);
            //if(calculation>0 && jTextFieldAnswer!=""){
                //jLabelOperation.setText(store);
            //} 
        }
    }//GEN-LAST:event_jButtonUndoActionPerformed

    private void jRadioButtonOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOffActionPerformed
        disable();
    }//GEN-LAST:event_jRadioButtonOffActionPerformed

    private void jRadioButtonOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOnActionPerformed
        enable();
    }//GEN-LAST:event_jRadioButtonOnActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        calculatorOperations();
        jLabelOperation.setText("");
        //String answer;
        //secondnum = Double.parseDouble(jTextFieldAnswer.getText());
        //if (operations == "+") {
        //result = firstnum + secondnum;
        //answer = String.format(%.2f,result)
        //jTextFieldAnswer.setText(answer)
        //within the individual button handlers
        //firstnum = Double.parseDouble(jTextFieldAnswer.getText());
       // jTextFieldDisplay.setText(null);
       //operations = ("-");
        
    }//GEN-LAST:event_jButtonEqualActionPerformed

    private void jButtonPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusMinusActionPerformed
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = ops *(-1);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonPlusMinusActionPerformed

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoActionPerformed
       jTextFieldAnswer.setText(jTextFieldAnswer.getText() + "2");
    }//GEN-LAST:event_jButtonTwoActionPerformed

    private void jButtonPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPeriodActionPerformed
        if(!jTextFieldAnswer.getText().contains(".")) {
        jTextFieldAnswer.setText(jTextFieldAnswer.getText() + ".");
        }
    }//GEN-LAST:event_jButtonPeriodActionPerformed

    private void jMenuItemStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStandardActionPerformed
        science = false;
        this.setResizable(false);
        this.setSize(235, 530);
        jTextFieldAnswer.setSize(190, 28);
        jRadioButtonOff.setLocation(160, 10);
         
    }//GEN-LAST:event_jMenuItemStandardActionPerformed

    private void jMenuItemScientificActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemScientificActionPerformed
        science = true;
        //this.setResizable(true);
        this.setSize(720, 530);
        jTextFieldAnswer.setSize(470, 28);
        jRadioButtonOff.setLocation(440, 10);
    }//GEN-LAST:event_jMenuItemScientificActionPerformed

    private void jButtonPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieActionPerformed
        jLabelOperation.setText("");
        //double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        //canvasPie.setText("tester");
        labelCanvas.setText("tester");
        //ops = Math.PI(ops);
        double ops;
        ops = (3.1415926535897932384626433832795);
        jTextFieldAnswer.setText(String.valueOf(ops));
        
        // pie chart code
  
        
        
    }//GEN-LAST:event_jButtonPieActionPerformed

    private void jButtonCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.cos(Math.toRadians(ops));
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonCosActionPerformed

    private void jButtonXYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXYActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.pow(ops,ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonXYActionPerformed

    private void jButtonTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.tan(Math.toRadians(ops));
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonTanActionPerformed

    private void jButtonX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonX2ActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = (ops * ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonX2ActionPerformed

    private void jButtonCbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCbrActionPerformed
         jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.cbrt(ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonCbrActionPerformed

    private void jButtonInxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInxActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.log10(ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonInxActionPerformed

    private void jButtonMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatrixActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = (ops * ops * ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonMatrixActionPerformed

    private void jButtonSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.sin(ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonSinActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
      
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonCosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosHActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.cosh(Math.toRadians(ops));
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonCosHActionPerformed

    private void jButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.log(ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonLogActionPerformed

    private void jButtonTanHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTanHActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.tanh(Math.toRadians(ops));
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonTanHActionPerformed

    private void jButtonBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinActionPerformed
        int b = Integer.parseInt(jTextFieldAnswer.getText());
        jTextFieldAnswer.setText(Integer.toString(b,2));
    }//GEN-LAST:event_jButtonBinActionPerformed

    private void jButtonRundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRundActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.round(ops);
        jTextFieldAnswer.setText(String.valueOf(ops));

    }//GEN-LAST:event_jButtonRundActionPerformed

    private void jButtonHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHexActionPerformed
         int b = Integer.parseInt(jTextFieldAnswer.getText());
        jTextFieldAnswer.setText(Integer.toString(b,16));
    }//GEN-LAST:event_jButtonHexActionPerformed

    private void jButtonOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOctalActionPerformed
         int b = Integer.parseInt(jTextFieldAnswer.getText());
        jTextFieldAnswer.setText(Integer.toString(b,8));
    }//GEN-LAST:event_jButtonOctalActionPerformed

    private void jButtonMilestoKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMilestoKiloActionPerformed
        // add your handling code here:
    }//GEN-LAST:event_jButtonMilestoKiloActionPerformed

    private void jButtonFxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFxActionPerformed
      
       new FunctionLibrary().setVisible(true);
       new FunctionLibrary().isFocused();
       new FunctionLibrary().setAlwaysOnTop(true);
      
        
    }//GEN-LAST:event_jButtonFxActionPerformed

    private void jButtonSinHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSinHActionPerformed
        jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = Math.sinh(Math.toRadians(ops));
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonSinHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(science) {
            jTextFieldAnswer.setSize(470, 28);
        } else {
            jTextFieldAnswer.setSize(190, 28);
}

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(false);
        this.setSize(235, 530);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItemScientificFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuItemScientificFocusGained
          
    }//GEN-LAST:event_jMenuItemScientificFocusGained

    private void jMenuItemScientificFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMenuItemScientificFocusLost
        this.setSize(720, 530);
        jTextFieldAnswer.setSize(470, 28);
        jRadioButtonOff.setLocation(440, 10);
    }//GEN-LAST:event_jMenuItemScientificFocusLost

    private void jMenuItemScientificMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemScientificMouseClicked
         //this.setResizable(true);
          //this.setSize(720, 530);
          //jTextFieldAnswer.setSize(470, 28);
         // jRadioButtonOff.setLocation(440, 10);
    }//GEN-LAST:event_jMenuItemScientificMouseClicked

    private void jTextFieldAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnswerKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)
            || (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();;
        }
    
    }//GEN-LAST:event_jTextFieldAnswerKeyTyped

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowLostFocus

    private void jTextFieldAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnswerActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jButtonX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonX3ActionPerformed
         jLabelOperation.setText("");
        double ops = Double.parseDouble(String.valueOf(jTextFieldAnswer.getText()));
        ops = (ops * ops * ops);
        jTextFieldAnswer.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButtonX3ActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldUnitConvertAnswer.setText("");
        jTextFieldUC1.setText("");
        jTextFieldUC2.setText("");
        //jLabelDistance.setText("");
        //jLabelSpeed.setText("");
       // jLabelTime.setText("");
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
     // if((jTextFieldUC1.getText().equals("")) || (jTextFieldUC2.getText().equals("")))
        if((jTextFieldUC1.getText().equals(""))) 
     {
           JOptionPane.showMessageDialog(null, "You must enter a value to compute", "DST System", JOptionPane.INFORMATION_MESSAGE); 
        }
       
        else if(jComboBoxUC.getSelectedItem().equals("Distance"))
        {
            //solve for distance, distance = speed x time
           jLabelUnitConversion1.setText("Speed = ");
           jLabelUnitConversion2.setText("Time = ");
           jLabelUC1.setText("mph x");
           jLabelUC2.setText("hours");
          
            double speed = Double.parseDouble(jTextFieldUC2.getText());
            double time = Double.parseDouble(jTextFieldUC1.getText());
            double distance;
         
           distance = speed * time;
           String value = String.format("%.2f", distance);
           jTextFieldUnitConvertAnswer.setText(value + " miles");
        }
        else if(jComboBoxUC.getSelectedItem().equals("Speed"))
            //solve for speed, speed = distance / time
        {
           jLabelUnitConversion1.setText("Distance = ");
           jLabelUnitConversion2.setText("Time = ");
           jLabelUC1.setText("miles /");
           jLabelUC2.setText("time");
           
            double distance = Double.parseDouble(jTextFieldUC1.getText());
            double time= Double.parseDouble(jTextFieldUC2.getText());
            double speed;
           
           speed = distance/time;
           String value = String.format("%.2f", speed);
           //jLabelConversions.setText("s = d/t");
           jTextFieldUnitConvertAnswer.setText(value + " mph");
        }
         else if(jComboBoxUC.getSelectedItem().equals("Time"))
        {
            //solve for time, time= distance/speed
           jLabelUnitConversion1.setText("Distance = ");
           jLabelUnitConversion2.setText("Speed = ");
           jLabelUC1.setText("miles/");
           jLabelUC2.setText("mph");
           
            double distance = Double.parseDouble(jTextFieldUC1.getText());
            double speed = Double.parseDouble(jTextFieldUC2.getText());
            double time;
            
           time = distance/speed;
           String value = String.format("%.2f", time);
           //jLabelConversions.setText("t = d/s");
           jTextFieldUnitConvertAnswer.setText(value + " hours" );
        }
          else if(jComboBoxUC.getSelectedItem().equals("Celsius"))
        {
            //solve for celsius
            double fahr = Double.parseDouble(jTextFieldUC1.getText());
            double celsius = (fahr - 32) * 5/9;
            
         //  celsius = fahr x 9/5 + 32;
         //T(°C) = (T(°F) - 32) / 1.8 or T(°C) = (T(°F) - 32) / (9/5)
         //T(°C) = (T(°F) - 32) × 5/9
           jTextFieldUnitConvertAnswer.setText(celsius + " Celsius" );
        }
       else if(jComboBoxUC.getSelectedItem().equals("Fahrenheit"))
        {
            //solve for Fahrenheit
            //T(°F) = T(°C) × 1.8 + 32 or T(°F) = T(°C) × 9/5 + 32 
            double celsius= Double.parseDouble(jTextFieldUC1.getText());
            double fahr = (celsius * 1.8) + 32;
           // jTextFieldFtoC.setText(fahr + " Fahrenheit");
           jTextFieldUnitConvertAnswer.setText(fahr + " Fahrenheit" );
        }
    }//GEN-LAST:event_jButtonConvertActionPerformed

    private void jTextFieldUC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUC2ActionPerformed

    private void jTextFieldUC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUC2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUC2KeyTyped

    private void jComboBoxUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUCActionPerformed
        
    }//GEN-LAST:event_jComboBoxUCActionPerformed

    private void jComboBoxUCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxUCKeyPressed
       
    }//GEN-LAST:event_jComboBoxUCKeyPressed

    private void jComboBoxUCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxUCFocusGained
        
    }//GEN-LAST:event_jComboBoxUCFocusGained

    private void jComboBoxUCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUCItemStateChanged
        if(jComboBoxUC.getSelectedItem().equals("Distance"))
        {
             //solve for distance, distance=time x speed;
           jTextFieldUC2.setEnabled(true);
           jLabelUnitConversion1.setText("Speed = ");
           jLabelUnitConversion2.setText("Time = ");
          jLabelUC1.setText("mph / ");
           jLabelUC2.setText("hours");
          jTextFieldUC1.setEnabled(true);
          jTextFieldUC2.setEnabled(true);
        }
        else if(jComboBoxUC.getSelectedItem().equals("Speed"))
        {
             //solve for speed, speed= distance/time
           jTextFieldUC2.setEnabled(true);
           jLabelUnitConversion1.setText("Distance = ");
           jLabelUnitConversion2.setText("Time = ");
           jLabelUC1.setText("miles /");
           jLabelUC2.setText("hours");
        }
        else if(jComboBoxUC.getSelectedItem().equals("Time"))
        {
             //solve for time, time= distance/speed
           jTextFieldUC2.setEnabled(true);
           jLabelUnitConversion1.setText("Distance = ");
           jLabelUnitConversion2.setText("Speed = ");
           jLabelUC1.setText("miles /");
           jLabelUC2.setText("mph");
        }
         else if(jComboBoxUC.getSelectedItem().equals("Celsius"))
        {
             //solve for Celsius
            /*
            T(°C) = (T(°F) - 32) × 5/9
            T(°C) = (T(°F) - 32) / (9/5)
            T(°C) = (T(°F) - 32) / 1.8
            */
            jTextFieldUC2.setEnabled(false);
            jLabelUnitConversion1.setText("Fahrenheit");
            jLabelUnitConversion2.setText("");
            jLabelUC1.setText("To Celsius");
            jLabelUC2.setText("");
        }
         else if(jComboBoxUC.getSelectedItem().equals("Fahrenheit"))
        {
             //solve for Fahrenheit
            /*
            T(°F) = T(°C) × 9/5 + 32
            T(°F) = T(°C) × 1.8 + 32 
            */
            jTextFieldUC2.setEnabled(false);
            jLabelUnitConversion1.setText("Celsius");
            jLabelUnitConversion2.setText("");
            jLabelUC1.setText("To Fahrenheit");
            jLabelUC2.setText("");
           
        }
    }//GEN-LAST:event_jComboBoxUCItemStateChanged

    private void jTextFieldUC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUC1ActionPerformed

    private void jTextFieldUC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUC1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUC1KeyReleased

    private void jTextFieldUC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUC1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUC1KeyTyped

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
          //this.setResizable(true);
          this.setSize(720, 530);
          jTextFieldAnswer.setSize(470, 28);
          jRadioButtonOff.setLocation(440, 10);
    }//GEN-LAST:event_formMouseClicked

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void jButtonUnitCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnitCircleActionPerformed
     
       // String fileName="https://www.product66.com/websandbox/geogebra/unitcircletrigfunctions.html";
        String uc ="unitcircletrigfunctions.html";
 
        try {
        Runtime r = Runtime.getRuntime();
        r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https://www.product66.com/websandbox/geogebra/" + uc);
     
        } catch (Exception e) {
        e.printStackTrace();
    }
    

    /*
       new SineWaveGraphing().setVisible(true);
       new SineWaveGraphing().isFocused();
       new SineWaveGraphing().setAlwaysOnTop(true);
     */
    
  
    }//GEN-LAST:event_jButtonUnitCircleActionPerformed

    private void jButtonConvertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButtonConvertItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConvertItemStateChanged

    private void jButtonConvertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConvertKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConvertKeyPressed

    private void jButtonConvertKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConvertKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConvertKeyReleased

    private void jButtonConvertPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButtonConvertPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConvertPropertyChange

    private void jComboBoxUCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxUCMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUCMouseReleased

    private void jButtonSineWavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSineWavActionPerformed
        new SineWaveGraphing().setVisible(true);
        new SineWaveGraphing().isFocused();
        new SineWaveGraphing().setAlwaysOnTop(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSineWavActionPerformed

    private void jButtonCosWaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCosWaveActionPerformed
        new CosineWaveGraphing().setVisible(true);
        new CosineWaveGraphing().isFocused();
        new CosineWaveGraphing().setAlwaysOnTop(true); 
    }//GEN-LAST:event_jButtonCosWaveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

 

        
   
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvasPie;
    private javax.swing.JButton jButtonBin;
    private javax.swing.JButton jButtonCbr;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JButton jButtonCos;
    private javax.swing.JButton jButtonCosH;
    private javax.swing.JButton jButtonCosWave;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonFx;
    private javax.swing.JButton jButtonHex;
    private javax.swing.JButton jButtonInx;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonMatrix;
    private javax.swing.JButton jButtonMilestoKilo;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOctal;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonPeriod;
    private javax.swing.JButton jButtonPie;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPlusMinus;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonRund;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSin;
    private javax.swing.JButton jButtonSinH;
    private javax.swing.JButton jButtonSineWav;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonSquareRoot;
    private javax.swing.JButton jButtonTan;
    private javax.swing.JButton jButtonTanH;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonUndo;
    private javax.swing.JButton jButtonUnitCircle;
    private javax.swing.JButton jButtonX2;
    private javax.swing.JButton jButtonX3;
    private javax.swing.JButton jButtonXY;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JComboBox<String> jComboBoxUC;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCartesian;
    private javax.swing.JLabel jLabelConversions;
    private javax.swing.JLabel jLabelConversions2;
    private javax.swing.JLabel jLabelDSTConversions;
    private javax.swing.JLabel jLabelOperation;
    public javax.swing.JLabel jLabelUC1;
    public javax.swing.JLabel jLabelUC2;
    private javax.swing.JLabel jLabelUnitConversion1;
    private javax.swing.JLabel jLabelUnitConversion2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemScientific;
    private javax.swing.JMenuItem jMenuItemStandard;
    public javax.swing.JPanel jPanelCartesian;
    private javax.swing.JRadioButton jRadioButtonOff;
    private javax.swing.JRadioButton jRadioButtonOn;
    private javax.swing.JLabel jStaticGraphIt;
    private javax.swing.JTextField jTextFieldAnswer;
    private javax.swing.JTextField jTextFieldUC1;
    private javax.swing.JTextField jTextFieldUC2;
    private javax.swing.JTextField jTextFieldUnitConvertAnswer;
    private java.awt.Label labelCanvas;
    // End of variables declaration//GEN-END:variables

}
