
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HOME extends javax.swing.JFrame {

   
    public HOME() {
        initComponents();
       this.setLocationRelativeTo(null);
       showtoday();
       showmonth();
    }
    
    //show total expenses today
    private void showtoday(){
          java.time.LocalDate now = java.time.LocalDate.now();
        
        try {
          
            ResultSet rs= Ddata.database.state.executeQuery("select * from expensetry where DATE='"+now+"'");
            
            int total=0;
            while(rs.next()){
                total+= rs.getInt("AMOUNT");
            }
            //giving comma in the showed amount
             NumberFormat numberFormat = NumberFormat.getNumberInstance();
            String formattedTotal = numberFormat.format(total);
            TODAYTOTAL.setText("₱"+formattedTotal);
        } catch (SQLException ex) {
            Logger.getLogger(HOME.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
     //show total expenses this month
    private void showmonth(){
           java.time.LocalDate currentDate = java.time.LocalDate.now();
           int currentMonth = currentDate.getMonthValue();
           String formattedMonth = String.format("%02d", currentMonth);

    try {
        ResultSet rs = Ddata.database.state.executeQuery("select * from expensetry where MONTH(DATE) = " + formattedMonth);
       int total =0;
            while(rs.next()){
                total+= rs.getInt("AMOUNT");
            }
              //giving comma in the showed amount
             NumberFormat numberFormat = NumberFormat.getNumberInstance();
            String formattedTotal = numberFormat.format(total);
            MONTHLYTOTAL.setText("₱"+formattedTotal);
        
       
    } catch (SQLException ex) {
        Logger.getLogger(HOME.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TODAYTOTAL = new javax.swing.JLabel();
        MONTHLYTOTAL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 129, 112));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/UCASHLOGO.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 91, 65));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Add Expenses OPEN.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(233, 90));
        jButton1.setMinimumSize(new java.awt.Dimension(233, 90));
        jButton1.setPreferredSize(new java.awt.Dimension(233, 90));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 233, 57));

        jButton2.setBackground(new java.awt.Color(0, 91, 65));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Expense History OPEN.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 233, 57));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/MAIN DARK BG TEXT.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 233, 57));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/MAIN DARK BG TEXT.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 233, 57));

        TODAYTOTAL.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        TODAYTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        TODAYTOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TODAYTOTAL.setText("0");
        jPanel1.add(TODAYTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 260, 170, 20));

        MONTHLYTOTAL.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        MONTHLYTOTAL.setForeground(new java.awt.Color(255, 255, 255));
        MONTHLYTOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MONTHLYTOTAL.setText("0");
        jPanel1.add(MONTHLYTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 260, 170, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/Monthly Expenses.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 229, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/Todays Expense.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 229, 90));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Exit OPEN.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 233, 57));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/MAIN DARK BG TEXT.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 233, 57));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 651, 767));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //exit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int r =JOptionPane.showConfirmDialog(null, "are you sure you wanna exit?","Deletion confirm",JOptionPane.YES_NO_OPTION);

        //exits the program if said yes
        if (r==JOptionPane.YES_OPTION){
            System.exit(0);}
    }//GEN-LAST:event_jButton3ActionPerformed

    //button go to history
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new HISTORY().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

     //button go to add expenses
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ADDMOENY().setVisible(true);

        this.setFocusable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

//BUTTONS IMAGE AND FUNCTION
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // ADD BUTTON NOT HOVERED
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add Expenses OPEN.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // ADD BUTTON HOVERED
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add Expenses HOVER.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // ADD BUTTON CLICKED
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/ALL CLICKED.png")));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // ADD BUTTON CLICKED
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add Expenses HOVER.png")));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // ADD BUTTON RELEASED
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add Expenses OPEN.png")));
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // EXPENSE HISTORY BUTTON NOT HOVERED
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Expense History OPEN.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // EXPENSE HISTORY BUTTON HOVERED
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Expense History HOVER.png")));

    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // EXPENSE HISTORY BUTTON CLICKED
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Expense History HOVER.png")));
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // EXPENSE HISTORY BUTTON CLICKED
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/ALL CLICKED.png")));
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        // EXPENSE HISTORY BUTTON RELEASED
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Expense History OPEN.png")));
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // EXIT BUTTON NOT HOVERED
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Exit OPEN.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // EXIT BUTTON HOVERED
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Exit HOVER.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // EXIT BUTTON CLICKED
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Exit CLICKED.png")));
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       // EXIT BUTTON CLICKED
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Exit HOVER.png")));
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // EXIT BUTTON RELEASED
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Exit OPEN.png")));
    }//GEN-LAST:event_jButton3MouseReleased
    
    
    
 
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MONTHLYTOTAL;
    private javax.swing.JLabel TODAYTOTAL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
