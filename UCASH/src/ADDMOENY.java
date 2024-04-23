
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.NumberFormat;

public class ADDMOENY extends javax.swing.JFrame {

    public ADDMOENY() {
        initComponents();
        this.setLocationRelativeTo(null);
        Displayinputed();
    }

    // put the database to the table
    private void Displayinputed() {
        // gets the date now
        java.time.LocalDate now = java.time.LocalDate.now();
        // get the dates from before the day today
        // java.time.LocalDate limit = now.minusDays(2);

        try {
            javax.swing.table.DefaultTableModel datatable = (javax.swing.table.DefaultTableModel) table.getModel();
            int rowcolumn = datatable.getRowCount();
            // show that the table will start at 0
            while (rowcolumn-- != 0) {
                datatable.removeRow(0);
            }
            // so that it only shows the expesnses for today
            ResultSet rs = Ddata.database.state.executeQuery("select * from expensetry where DATE ='" + now + "'");
            // gets the total
            int total = 0;
            while (rs.next()) {
                total += rs.getInt("AMOUNT");
                Object o[] = { rs.getDate("DATE"), rs.getString("EXPENSES"), rs.getInt("AMOUNT") };
                // add the data in the table
                datatable.addRow(o);
            }
            // makes the number have commas
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            String formattedTotal = numberFormat.format(total);
            // display the total amount added
            totalamount.setText(formattedTotal);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        totalamount = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ex = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(651, 767));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 253, 230));

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
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

        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        tablecenter centerRenderer = new tablecenter();
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

        table.getColumnModel().getColumn(2).setCellRenderer(new COMMAS());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 129, 112));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/TOTAL.png"))); // NOI18N

        totalamount.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        totalamount.setForeground(new java.awt.Color(0, 171, 33));
        totalamount.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 171, 33));
        jLabel10.setText("₱");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(totalamount)))
                                .addContainerGap()));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 530, 430));

        jToggleButton1.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 129, 112));
        jLabel7.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/Small Ucash Logo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 129, 112));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/EXPENSES.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 129, 112));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/TEXT/AMOUNT.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        ex.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        ex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exKeyPressed(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                exKeyTyped(evt);
            }

        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 171, 37));

        a.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aKeyPressed(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 166, 37));

        jToggleButton5.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Add OPEN.png"))); // NOI18N
        jToggleButton5.setBorder(null);
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton5MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseReleased(evt);
            }
        });
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 137, 40));

        jToggleButton4.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Clear OPEN.png"))); // NOI18N
        jToggleButton4.setBorder(null);
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton4MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseReleased(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, 137, 40));

        jToggleButton3.setBackground(new java.awt.Color(0, 91, 65));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Remove OPEN.png"))); // NOI18N
        jToggleButton3.setBorder(null);
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButton3MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseReleased(evt);
            }
        });
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 137, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Add DARK.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, 137, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Add DARK.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 137, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/Add DARK.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 137, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/BUTTONS/BACK DARK.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 651, 767));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UCASH IMAGES/LOGO AND BG/BACKGROUND.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, -1));

        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 651, -1));

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

    private void jToggleButton5MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton5MouseExited
        // ADD BUTTON NOT HOVERED
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add OPEN.png")));
    }// GEN-LAST:event_jToggleButton5MouseExited

    private void jToggleButton5MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton5MouseEntered
        // ADD BUTTON HOVERED
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add HOVER.png")));
    }// GEN-LAST:event_jToggleButton5MouseEntered

    private void jToggleButton5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton5MouseClicked
        // ADD BUTTON CLICKED
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add HOVER.png")));
    }// GEN-LAST:event_jToggleButton5MouseClicked

    private void jToggleButton5MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton5MousePressed
        // ADD BUTTON CLICKED
        jToggleButton5
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add CLICKED.png")));
    }// GEN-LAST:event_jToggleButton5MousePressed

    private void jToggleButton5MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton5MouseReleased
        // ADD BUTTON NOT HOVERED
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add OPEN.png")));
    }// GEN-LAST:event_jToggleButton5MouseReleased

    private void jToggleButton4MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton4MouseExited
        // CLEAR BUTTON NOT HOVERED
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Clear OPEN.png")));
    }// GEN-LAST:event_jToggleButton4MouseExited

    private void jToggleButton4MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton4MouseEntered
        // CLEAR BUTTON HOVERED
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Clear HOVER.png")));
    }// GEN-LAST:event_jToggleButton4MouseEntered

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton4MouseClicked
        // CLEAR BUTTON CLICKED
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Clear HOVER.png")));
    }// GEN-LAST:event_jToggleButton4MouseClicked

    private void jToggleButton4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton4MousePressed
        // CLEAR BUTTON CLICKED
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add CLICKED.png")));
    }// GEN-LAST:event_jToggleButton4MousePressed

    private void jToggleButton4MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton4MouseReleased
        // CLEAR BUTTON RELEASED
        jToggleButton4
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Clear OPEN.png")));
    }// GEN-LAST:event_jToggleButton4MouseReleased

    private void jToggleButton3MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton3MouseExited
        // REMOVE BUTTON NOT HOVERED
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Remove OPEN.png")));
    }// GEN-LAST:event_jToggleButton3MouseExited

    private void jToggleButton3MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton3MouseEntered
        // REMOVE BUTTON HOVERED
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Remove HOVER.png")));
    }// GEN-LAST:event_jToggleButton3MouseEntered

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton3MouseClicked
        // REMOVE BUTTON CLICKED
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Remove HOVER.png")));
    }// GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton3MousePressed
        // REMOVE BUTTON CLICKED
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Add CLICKED.png")));
    }// GEN-LAST:event_jToggleButton3MousePressed

    private void jToggleButton3MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jToggleButton3MouseReleased
        // REMOVE BUTTON RELEASED
        jToggleButton3
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("UCASH IMAGES/BUTTONS/Remove OPEN.png")));
    }// GEN-LAST:event_jToggleButton3MouseReleased
     // back button

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
        new HOME().setVisible(true);
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_aActionPerformed

    }// GEN-LAST:event_aActionPerformed

    // clear button
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton4ActionPerformed
        // cleaar the text box of the amount and expenses
        a.setText(null);
        ex.setText(null);
    }// GEN-LAST:event_jToggleButton4ActionPerformed

    // add button
    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton5ActionPerformed
        try {
            // gets the expenses date and amount and put it into the database
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String Datenow = now.format(formatter);
            String expenses = ex.getText();
            String amount = a.getText();

            // add the inputed into the database
            if (!amount.equals("") && !expenses.equals("")) {
                int money = Integer.parseInt(amount);
                Ddata.database.state.executeUpdate("insert into expensetry(DATE,EXPENSES,AMOUNT) value('" + Datenow
                        + "','" + expenses + "','" + money + "')");
                JOptionPane.showMessageDialog(null, "Expense added successfully");

                Displayinputed();
            } else {
                // shows an error if nothing is inputed or not all the text fields are filled
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        a.setText(null);
        ex.setText(null);
    }// GEN-LAST:event_jToggleButton5ActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_exActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_exActionPerformed

    // remove button
    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton3ActionPerformed
        // Get the selected row index
        int selectedRow = table.getSelectedRow();

        // check if anything is selected or not
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to remove.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            // gets the data from the selected
            String date = table.getValueAt(selectedRow, 0).toString();
            String expenses = table.getValueAt(selectedRow, 1).toString();
            int amount = Integer.parseInt(table.getValueAt(selectedRow, 2).toString());

            try {
                String deleteQuery = "delete  from expensetry where DATE = '" + date + "' AND EXPENSES = '" + expenses
                        + "' AND AMOUNT = " + amount + " LIMIT 1";

                // Execute the delete
                int rowsAffected = Ddata.database.state.executeUpdate(deleteQuery);

                // check if something is choosen to delete
                if (rowsAffected > 0) {

                    // removes the selected from the table
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
                    model.removeRow(selectedRow);

                    // update and change the total amount when something is remove from the table
                    int totalAmount = Integer.parseInt(totalamount.getText().replace(",", "")) - amount;
                    totalamount.setText(String.format("%,d", totalAmount));
                    JOptionPane.showMessageDialog(this, "Expense removed successfully.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }// GEN-LAST:event_jToggleButton3ActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_aKeyTyped
        // so that the amount would only accept integers
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }// GEN-LAST:event_aKeyTyped

    private void exKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_exKeyTyped

    }// GEN-LAST:event_exKeyTyped

    private void exKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_exKeyPressed

    }// GEN-LAST:event_exKeyPressed

    private void aKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_aKeyPressed
        // make it so it wouldnt type more than 7 numbers
        String amount_inputed = a.getText();
        int length = amount_inputed.length();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {

            if (evt.getKeyChar() == '0' && amount_inputed.isEmpty()) {
            // Disallow entering '0' if the text field is empty
            a.setEditable(false);
        } else if (length <= 6) {
            a.setEditable(true);
        } else {
            a.setEditable(false);
        }
    } else {
        // allow the keys backspace and delete to edit it
        if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE
                || evt.getID() == MouseEvent.MOUSE_CLICKED) {
            // allow it to be editable
            a.setEditable(true);
        } else {
            a.setEditable(false);
        }
        }

    }// GEN-LAST:event_aKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ADDMOENY().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTable table;
    private javax.swing.JLabel totalamount;
    // End of variables declaration//GEN-END:variables
}
