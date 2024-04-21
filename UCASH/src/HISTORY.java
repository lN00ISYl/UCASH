
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.NumberFormat;
import javax.swing.table.DefaultTableModel;

public class HISTORY extends javax.swing.JFrame {

    public HISTORY() {
        initComponents();
        this.setLocationRelativeTo(null);
        allhistory();

    }

    private void allhistory() {
        try {
            DefaultTableModel datatable = (DefaultTableModel) historytable.getModel();

            // gets all the records in the database
            ResultSet rs = Ddata.database.state.executeQuery("SELECT * FROM expensetry ORDER BY DATE ASC");

            // total of all the expensese
            int total = 0;

            while (rs.next()) {
                total += rs.getInt("AMOUNT");
                Object[] o = { rs.getDate("DATE"), rs.getString("EXPENSES"), rs.getInt("AMOUNT") };
                datatable.addRow(o);
            }

            // Format the total amount with commas
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            String formattedTotal = numberFormat.format(total);

            // Display the total amount
            totalamount.setText(formattedTotal);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    // show the history
    private void showhistory() {
        try {
            // put the data gotten in the table
            javax.swing.table.DefaultTableModel datable = (javax.swing.table.DefaultTableModel) historytable.getModel();

            // removes the rows that are not in the date choosen
            int rowcols = datable.getRowCount();
            while (rowcols-- != 0) {
                datable.removeRow(0);
            }

            java.sql.Date from = new java.sql.Date(datefrom.getDate().getTime());
            java.sql.Date to = new java.sql.Date(dateto.getDate().getTime());
            ResultSet res = Ddata.database.state.executeQuery(
                    "select * from expensetry where DATE>='" + from + "' and DATE<='" + to + "' order by DATE asc");

            // total of all the expensense in the date choosen date
            int total = 0;
            while (res.next()) {
                total += res.getInt("AMOUNT");
                Object o[] = { res.getDate("DATE"), res.getString("EXPENSES"), res.getInt("AMOUNT") };
                datable.addRow(o);
            }
            // Format the total amount with commas
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            String formattedTotal = numberFormat.format(total);

            // Display the total amount
            totalamount.setText(formattedTotal);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Please fill out all the dates",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        dateto = new com.toedter.calendar.JDateChooser();
        datefrom = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalamount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 15, 15));
        jPanel2.setPreferredSize(new java.awt.Dimension(651, 767));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Back OPEN.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton1MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseReleased(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/BACK DARK.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        dateto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dateto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datetoPropertyChange(evt);
            }
        });
        jPanel2.add(dateto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 172, 41));

        datefrom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        datefrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datefromPropertyChange(evt);
            }
        });
        jPanel2.add(datefrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 172, 41));

        jPanel3.setBackground(new java.awt.Color(253, 253, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historytable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "DATE", "EXPENSES", "AMOUNT"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        historytable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(historytable);
        if (historytable.getColumnModel().getColumnCount() > 0) {
            historytable.getColumnModel().getColumn(0).setResizable(false);
            historytable.getColumnModel().getColumn(1).setResizable(false);
            historytable.getColumnModel().getColumn(2).setResizable(false);
        }

        tablecenter centertable = new tablecenter();
        historytable.getColumnModel().getColumn(0).setCellRenderer(centertable);
        historytable.getColumnModel().getColumn(1).setCellRenderer(centertable);
        historytable.getColumnModel().getColumn(2).setCellRenderer(centertable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 364));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 530, 430));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 129, 112));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/TO.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 129, 112));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/FROM.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        totalamount.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        totalamount.setForeground(new java.awt.Color(0, 171, 33));
        totalamount.setText("0");
        jPanel2.add(totalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 710, 227, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 129, 112));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/Expense History.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 129, 112));
        jLabel7.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/Small Ucash Logo.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Search OPEN.png"))); // NOI18N
        jToggleButton2.setBorder(null);
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton2MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseReleased(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 130, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/SEARCH DARK.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, 130, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 129, 112));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/TOTAL.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 171, 33));
        jLabel10.setText("₱");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BUTTONS
    private void jToggleButton1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton1MouseExited
        // BACK BUTTON NOT HOVERED
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Back OPEN.png")));
    }// GEN-LAST:event_jToggleButton1MouseExited

    private void jToggleButton1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton1MouseEntered
        // BACK BUTTON HOVERED
        jToggleButton1
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Back HOVER.png")));
    }// GEN-LAST:event_jToggleButton1MouseEntered

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton1MouseClicked
        // BACK BUTTON CLICKED
        jToggleButton1
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Back HOVER.png")));
    }// GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton1MousePressed
        // BACK BUTTON CLICKED
        jToggleButton1
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Back CLICKED.png")));
    }// GEN-LAST:event_jToggleButton1MousePressed

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton1MouseReleased
        // BACK BUTTON RELEASED
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Back OPEN.png")));
    }// GEN-LAST:event_jToggleButton1MouseReleased

    private void jToggleButton2MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton2MouseExited
        // SEARCH BUTTON NOT HOVERED
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Search OPEN.png")));
    }// GEN-LAST:event_jToggleButton2MouseExited

    private void jToggleButton2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton2MouseEntered
        // SEARCH BUTTON HOVERED
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Search HOVER.png")));
    }// GEN-LAST:event_jToggleButton2MouseEntered

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton2MouseClicked
        // SEARCH BUTTON CLICKED
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Search HOVER.png")));
    }// GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton2MousePressed
        // SEARCH BUTTON CLICKED
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Search CLICKED.png")));
    }// GEN-LAST:event_jToggleButton2MousePressed

    private void jToggleButton2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton2MouseReleased
        // SEARCH BUTTON RELEASED
        jToggleButton2
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Search OPEN.png")));
    }// GEN-LAST:event_jToggleButton2MouseReleased

    // back button

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
        new HOME().setVisible(true);

    }// GEN-LAST:event_jToggleButton1ActionPerformed

    // button to search
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton2ActionPerformed
        showhistory();
        datefrom.setDate(null);
        dateto.setDate(null);

    }// GEN-LAST:event_jToggleButton2ActionPerformed

    // funtion for date so that it would not choose date less than the date from the
    // to date
    private void datefromPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_datefromPropertyChange

        // make sure that it will not allow to choose the days that are not done yet
        java.util.Date now = java.util.Date
                .from(java.time.LocalDate.now().atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        datefrom.setSelectableDateRange(null, now);

        // make sure that the date will not be less than the date input from the to date
        dateto.setSelectableDateRange(datefrom.getDate(), new java.util.Date());

    }// GEN-LAST:event_datefromPropertyChange

    private void datetoPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_datetoPropertyChange

    }// GEN-LAST:event_datetoPropertyChange

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HISTORY().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datefrom;
    private com.toedter.calendar.JDateChooser dateto;
    private javax.swing.JTable historytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel totalamount;
    // End of variables declaration//GEN-END:variables
}
