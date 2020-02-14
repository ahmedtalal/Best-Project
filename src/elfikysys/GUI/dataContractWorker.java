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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javcoder
 */
public class dataContractWorker extends javax.swing.JFrame {

    private String name;
    private String phone;
    private String dateContract;
    private String requir;
    private int code;
    private int elmadfoaa;
    private int tips;
    private int totalprice;
    //code, name, address, phone, requirements, 
    //notes , totalprice , emdfoaa , tips , payday , paymonth , recieveday , recievemonth , dateContract

    public dataContractWorker(int cod, String nam, String phon, String requirmets, int total, int emdf, int tipss, String contr) {
        this.code = cod;
        this.name = nam;
        this.phone = phon;
        this.requir = requirmets;
        this.totalprice = total;
        this.elmadfoaa = emdf;
        this.tips = tipss;
        this.dateContract = contr;
        initComponents();
        this.setLocationRelativeTo(null);
        jTable1.setRowHeight(30);
        putData(code, name, phone, requir, totalprice, elmadfoaa, tips, dateContract);
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

        jLabel1 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NameClientField = new javax.swing.JTextField();
        codeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipsField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        elmadfoaaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        phoneField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateContractField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("صفحه عرض تفاصيل العقد");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("عرض تفاصيل العقد ");

        addBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addBtn.setText("اضافه");
        addBtn.setEnabled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditBtn.setText("تعديل");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deleteBtn.setText("حذف");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("اسم العميل :");

        NameClientField.setEditable(false);
        NameClientField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        NameClientField.setForeground(new java.awt.Color(0, 0, 204));
        NameClientField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        NameClientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        codeField.setEditable(false);
        codeField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        codeField.setForeground(new java.awt.Color(0, 0, 204));
        codeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("الكود :");

        totalPriceField.setEditable(false);
        totalPriceField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        totalPriceField.setForeground(new java.awt.Color(0, 0, 204));
        totalPriceField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPriceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });
        totalPriceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalPriceFieldKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("الاجمالي :");

        tipsField.setEditable(false);
        tipsField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tipsField.setForeground(new java.awt.Color(0, 0, 204));
        tipsField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tipsField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tipsField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipsFieldKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("الباقي:");

        elmadfoaaField.setEditable(false);
        elmadfoaaField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        elmadfoaaField.setForeground(new java.awt.Color(0, 0, 204));
        elmadfoaaField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        elmadfoaaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        elmadfoaaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elmadfoaaFieldActionPerformed(evt);
            }
        });
        elmadfoaaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elmadfoaaFieldKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("المدفوع:");

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/go_next_blue_60x40.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        phoneField.setEditable(false);
        phoneField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        phoneField.setForeground(new java.awt.Color(0, 0, 204));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        phoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("رقم التليفون:");

        dateContractField.setEditable(false);
        dateContractField.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dateContractField.setForeground(new java.awt.Color(51, 0, 204));
        dateContractField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateContractField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateContractFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("تاريخ العقد");

        showBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        showBtn.setText("عرض الفواتير");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        deleteBtn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deleteBtn1.setText("طباعة الفاتورة");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateContractField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(785, 785, 785)
                        .addComponent(NameClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(elmadfoaaField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(codeField)
                            .addComponent(tipsField))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(624, 624, 624)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(backBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(NameClientField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tipsField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elmadfoaaField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateContractField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        WOrkersList list = new WOrkersList();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        NameClientField.setEditable(true);
        phoneField.setEditable(true);
        totalPriceField.setEditable(true);
        tipsField.setEditable(true);
        elmadfoaaField.setEditable(true);
        phoneField.setEditable(true);
        addBtn.setEnabled(true);
    }//GEN-LAST:event_EditBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String itemName = NameClientField.getText();
        int itemCode = Integer.parseInt(codeField.getText());
        String phone = phoneField.getText();
        String datecontract = dateContractField.getText();
        String require = "";
        if (jTable1.isEditing()) {
            jTable1.getCellEditor().stopCellEditing();
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (i == 0) {
                require = (model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            } else {
                require = require + ("," + model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            }
        }
        int totalPric = Integer.parseInt(totalPriceField.getText());
        int tip = Integer.parseInt(tipsField.getText());
        int elmadfoa = Integer.parseInt(elmadfoaaField.getText());

        if (itemName.equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;

        }

        if (totalPriceField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (tipsField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (elmadfoaaField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }
        updateData(itemCode, itemName, phone, require, totalPric, elmadfoa, tip, datecontract);
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String itemName = NameClientField.getText();
        int itemCode = Integer.parseInt(codeField.getText());
        String phone = phoneField.getText();
        String datecontract = dateContractField.getText();
        String require = "";
        if (jTable1.isEditing()) {
            jTable1.getCellEditor().stopCellEditing();
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (i == 0) {
                require = (model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            } else {
                require = require + ("," + model.getValueAt(i, 0) + "," + model.getValueAt(i, 1) + "," + model.getValueAt(i, 2) + "," + model.getValueAt(i, 3) + "," + model.getValueAt(i, 4));
            }
        }
        int totalPric = Integer.parseInt(totalPriceField.getText());
        int tip = Integer.parseInt(tipsField.getText());
        int elmadfoa = Integer.parseInt(elmadfoaaField.getText());

        if (itemName.equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;

        }
        if (require.equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }
        if (totalPriceField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (tipsField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }

        if (elmadfoaaField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "الرجاء من فضلك لا تترك اي خانه فارغه ");
            return;
        }
        deleteRecord(itemCode);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void dateContractFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateContractFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateContractFieldActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        WorkersFwaters show = new WorkersFwaters(name);
        show.setVisible(true);

    }//GEN-LAST:event_showBtnActionPerformed

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    private void totalPriceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalPriceFieldKeyTyped
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldKeyTyped

    private void elmadfoaaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elmadfoaaFieldKeyTyped
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_elmadfoaaFieldKeyTyped

    private void tipsFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipsFieldKeyTyped
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tipsFieldKeyTyped

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        // TODO add your handling code here:
        showamel mm = new showamel(code);
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void elmadfoaaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elmadfoaaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elmadfoaaFieldActionPerformed

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

    private void putData(int code, String name, String phone, String requir, int totalprice, int elmadfoaa, int tips, String dateContract) {
        NameClientField.setText(name);
        codeField.setText(String.valueOf(code));
        phoneField.setText(phone);
        totalPriceField.setText(String.valueOf(totalprice));
        tipsField.setText(String.valueOf(tips));
        elmadfoaaField.setText(String.valueOf(elmadfoaa));
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String toc[] = requir.split(",");
        for (int i = 0; i < toc.length; i+=5) {
              model.addRow(new Object[]{toc[i],toc[i+1],toc[i+2],toc[i+3],toc[i+4]});
        }
        dateContractField.setText(dateContract);
    }

    private void updateData(int itemCode, String itemName, String phone, String require, int totalPric, int elmadfoa, int tip, String datecontract) {
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        String updateQuery = "UPDATE worKercontract SET Name=?,Phone=?,Requirements=?,totalPrice=?,payment=?,remaining=?,dateContract=? WHERE Code = '" + itemCode + "' ";

        try {
            conn = DatabaseConnection.getconnection();
            ps = conn.prepareStatement(updateQuery);
            ps.setString(1, itemName);
            ps.setString(2, phone);
            ps.setString(3, require);
            ps.setInt(4, totalPric);
            ps.setInt(5, elmadfoa);
            ps.setInt(6, tip);
            ps.setString(7, datecontract);
            result = ps.executeUpdate();
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "تم عمليه تعديل العقد ");
            } else {
                JOptionPane.showMessageDialog(null, "هناك خطا في عمليه التعديل ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataContractWorker.class.getName()).log(Level.SEVERE, null, ex);
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
    }

    private void deleteRecord(int itemCode) {
        Connection conn = null;
        PreparedStatement ps = null;
        int result = 0;
        String deleteQuery = "DELETE FROM worKercontract WHERE  Code = '" + itemCode + "' ";

        try {
            conn = DatabaseConnection.getconnection();
            ps = conn.prepareStatement(deleteQuery);
            result = ps.executeUpdate();
            if (result != 0) {
                JOptionPane.showMessageDialog(null, "تم عمليه حذف العقد ");
            } else {
                JOptionPane.showMessageDialog(null, "هناك خطا في عمليه التعديل ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataContractWorker.class.getName()).log(Level.SEVERE, null, ex);
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

        WOrkersList list = new WOrkersList();
        list.setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(dataContractWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataContractWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataContractWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataContractWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataContractWorker(1, "dfdf", "fffdfd", "sfdd", 11, 11, 33, "ddfd").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField NameClientField;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeField;
    private javax.swing.JTextField dateContractField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JTextField elmadfoaaField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton showBtn;
    private javax.swing.JTextField tipsField;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables

}
