/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elfikysys.GUI;

import Models.DatabaseConnection;
import java.awt.ComponentOrientation;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javcoder
 */
public class WorkerContract extends javax.swing.JFrame {

    /**
     * Creates new form WorkerContract
     */
    public WorkerContract() {
        String data;
        initComponents();
        this.setLocationRelativeTo(null);
        autoIncrementCode();
        getDateFromSys();
        retrieveWorkersName();
        nameWorker.setText("");
        jTable1.setRowHeight(30);
         DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        remainingPrice2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameWorker = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        codeWorker = new javax.swing.JTextField();
        PhoneWorker = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        payMoney = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        remainingPrice1 = new javax.swing.JTextField();
        dateContract = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backBtn2 = new javax.swing.JButton();
        wokersList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("الباقي:");

        remainingPrice2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        remainingPrice2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("صفحه اضافه عقد عامل");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true), "صفخه اضافه عقد للعامل", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("اسم العامل:");

        nameWorker.setEditable(false);
        nameWorker.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        nameWorker.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("رقم الكود:");

        codeWorker.setEditable(false);
        codeWorker.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        codeWorker.setForeground(new java.awt.Color(0, 0, 153));
        codeWorker.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeWorker.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        PhoneWorker.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        PhoneWorker.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PhoneWorker.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneWorkerKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الفون:");

        totalPrice.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        totalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalPriceKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("الاجمالي:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("المدفوع :");

        payMoney.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        payMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        payMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payMoneyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payMoneyKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("الباقي/عليك:");

        remainingPrice1.setEditable(false);
        remainingPrice1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        remainingPrice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateContract.setEditable(false);
        dateContract.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dateContract.setForeground(new java.awt.Color(0, 51, 153));
        dateContract.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("تاريخ العقد:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton1.setText("اضافه العقد ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/go_next_blue_60x40.png"))); // NOI18N
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        wokersList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        wokersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wokersListActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ملاحظات", "السعر", "الكمية", "الصنف", "م"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("اضافة");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("حذف");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(845, 845, 845)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(payMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codeWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wokersList, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(nameWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateContract, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(remainingPrice1)))
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(backBtn2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(588, 588, 588)
                        .addComponent(remainingPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wokersList, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codeWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateContract, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(PhoneWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(payMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String date2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        // TODO add your handling code here:
        WokersMainPage list = new WokersMainPage();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (nameWorker.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال جميع المدخالات");
            return;
        }
        if (PhoneWorker.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال جميع المدخالات");
            return;
        }
        if (!checkPhoneNumber(PhoneWorker)) {
            JOptionPane.showMessageDialog(null, "هذا الرقم غير موجود بالخدمه يجب عليك ادخال رقم صحيح");
            return;
        }
        if (totalPrice.getText().equals("") || Integer.parseInt(totalPrice.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال جميع المدخالات");
            return;
        }
        if (remainingPrice1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال جميع المدخالات");
            return;
        }
        if (payMoney.getText().equals("") || Integer.parseInt(payMoney.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال جميع المدخالات");
            return;
        }
        String name = nameWorker.getText();
        int code = Integer.parseInt(codeWorker.getText());
        String phone = PhoneWorker.getText();
        String requir = "";
        if (jTable1.isEditing()) {
            jTable1.getCellEditor().stopCellEditing();
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (i == 0) {
                requir =  (model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            } else {
                requir = requir + ("," + model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            }
        }
        int total = Integer.parseInt(totalPrice.getText());
        int remain = Integer.parseInt(remainingPrice1.getText());
        int pay = Integer.parseInt(payMoney.getText());
        String date = dateContract.getText();
        insertIntoWorkerTable(code, name, phone, requir, total, pay, remain, date);
        showamel mm = new showamel(code);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void payMoneyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payMoneyKeyReleased
        // TODO add your handling code here:
        if (totalPrice.getText().equals("")) {
            return;
        } else {
            if (payMoney.getText().equals("")) {
                remainingPrice1.setText(totalPrice.getText());
                return;
            }
            int convert = Integer.parseInt(totalPrice.getText());
            int convert1 = Integer.parseInt(payMoney.getText());
            int result = convert - convert1;
            remainingPrice1.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_payMoneyKeyReleased

    private void wokersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wokersListActionPerformed
        // TODO add your handling code here:
        nameWorker.setText(wokersList.getSelectedItem().toString());
    }//GEN-LAST:event_wokersListActionPerformed

    private void PhoneWorkerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneWorkerKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_PhoneWorkerKeyTyped

    private void totalPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalPriceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_totalPriceKeyTyped

    private void payMoneyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payMoneyKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_payMoneyKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"", "", "", "", ""});

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int x=-1;
        x=jTable1.getSelectedRow();
        if(x!=-1)
        {
            model.removeRow(x);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void autoIncrementCode() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT Code FROM  workercontract  ORDER by Code DESC LIMIT 1";

        try {
            conn = DatabaseConnection.getconnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            if (rs.next() == false) {
                codeWorker.setText("1000");
            } else {
                int count = rs.getInt("Code");
                int result = count + 1;
                codeWorker.setText(String.valueOf(result));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerContract.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
        }
    }

    private void getDateFromSys() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        dateContract.setText(String.valueOf(sdf.format(d)));
    }

    private void insertIntoWorkerTable(int code, String name, String phone, String requir, int total, int pay, int remain, String date) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        String query = "INSERT INTO workercontract(Code,Name,Phone,Requirements,totalPrice,payment,remaining,dateContract) VALUES (?,?,?,?,?,?,?,?)";

        try {
            conn = DatabaseConnection.getconnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, code);
            ps.setString(2, name);
            ps.setString(3, phone);
            ps.setString(4, requir);
            ps.setInt(5, total);
            ps.setInt(6, pay);
            ps.setInt(7, remain);
            ps.setString(8, date);
            count = ps.executeUpdate();
            if (count != 0) {
                JOptionPane.showMessageDialog(null, "تم الاضافه بنجاح");
            } else {
                JOptionPane.showMessageDialog(null, "هناك خطاءفي عمليه الاضافه");
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerContract.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
            }
        }
        resetAllFields();
        WokersMainPage worker = new WokersMainPage();
        worker.setVisible(true);
        this.dispose();
    }

    private boolean checkPhoneNumber(JTextField phone) {
        int num = 0;
        String Etisalat = "011";
        String vodafone = "010";
        String Orange = "012";
        String We = "015";
        String result = phone.getText();
        for (int i = 0; i < result.length(); i++) {
            num++;
        }
        if ((num > 11 || num < 11) || !(result.subSequence(0, 3).equals(Etisalat) || result.subSequence(0, 3).equals(vodafone)
                || result.subSequence(0, 3).equals(Orange) || result.subSequence(0, 3).equals(We))) {
            return false;
        }

        return true;
    }

    private void resetAllFields() {
        nameWorker.setText("");
        PhoneWorker.setText("");
        totalPrice.setText("");
        payMoney.setText("");
        remainingPrice1.setText("");
    }

    private void retrieveWorkersName() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT * FROM workers";

        try {
            conn = DatabaseConnection.getconnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            if (rs.next() == false) {
                return;
            } else {
                do {
                    wokersList.addItem(rs.getString("Name"));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkerContract.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkerContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerContract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PhoneWorker;
    private javax.swing.JButton backBtn2;
    private javax.swing.JTextField codeWorker;
    private javax.swing.JTextField dateContract;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameWorker;
    private javax.swing.JTextField payMoney;
    private javax.swing.JTextField remainingPrice1;
    private javax.swing.JTextField remainingPrice2;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JComboBox<String> wokersList;
    // End of variables declaration//GEN-END:variables

}
