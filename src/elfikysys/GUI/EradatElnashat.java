/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elfikysys.GUI;

import Models.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author javcoder
 */
public class EradatElnashat extends javax.swing.JFrame {

    /**
     * Creates new form EradatElnashat
     */
    public EradatElnashat() {
        initComponents();
        this.setLocationRelativeTo(null);
        retriveDataFomable();
        calcTotalPrice();
    }

    private String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        // System.out.println(dtf.format(now));
        return dtf.format(now);
    }

    private int getYear() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        // System.out.println(year);
        return year;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        importTable = new javax.swing.JTable();
        nameTextfield = new javax.swing.JTextField();
        clientName = new javax.swing.JLabel();
        clientName1 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        price = new javax.swing.JTextField();
        clientName2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 12, 218), 2, true), "صفحه الواردات ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 19), new java.awt.Color(15, 16, 193))); // NOI18N

        importTable.setBackground(new java.awt.Color(255, 255, 153));
        importTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        importTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "السنه", "التاريخ", "المبلغ", "اسم ", "رقم الكود"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(importTable);

        nameTextfield.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        nameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTextfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientName.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName.setText("اسم النشاط:");
        clientName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientName1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName1.setText("اجمالي ايرادات النشاط:");
        clientName1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 2, true));

        backBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        backBtn.setText("العوده الي القائمه الرئيسيه");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("اضافه نشاط:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        price.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        clientName2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName2.setText("المبلغ المحدد :");
        clientName2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        searchTextField.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        searchTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("يمكنك البحث بالسنه او بالاسم فقط:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(clientName2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(clientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clientName2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(total)
                            .addComponent(clientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainPage f = new MainPage();
        f.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (nameTextfield.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "يجب عليك اضافه نشاط");
            return;
        }
        if (price.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "يجب عليك تحديد سعر للنشاط");
            return;
        }
        String date = getDate();
        String year = String.valueOf(getYear());
        insertIntoGeneralErad(nameTextfield.getText(), price.getText(), date, year);
          retriveDataFomable();
        calcTotalPrice();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        //        if (searchTextField.getText().equals("")) {
        //            //model.setRowCount(0);
        //            //model.setColumnCount(0);
        //            retrieveDataFromWaredDB();
        //        }
        String m = searchTextField.getText().toLowerCase();
        filter(m);
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    void filter(String se) {
        TableModel model = importTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) model);
        importTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(se, 4,1));
        calcTotalPrice();
    }

    private void insertIntoGeneralErad(String text, String text0, String date, String year) {
        Connection conn = null;
        PreparedStatement ps = null;
        int count = 0;
        String query = "INSERT INTO generalimport(Name,price,Date,Year) VALUES (?,?,?,?)";

        try {
            conn = DatabaseConnection.getconnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, text);
            ps.setString(2, text0);
            ps.setString(3, date);
            ps.setString(4, year);
            count = ps.executeUpdate();
            if (count != 0) {
                JOptionPane.showMessageDialog(null, "تم الاضافه بنجاح");
            } else {
                JOptionPane.showMessageDialog(null, "هناك خطاء ف عمليه الاضافه");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EradatElnashat.class.getName()).log(Level.SEVERE, null, ex);
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
        reSetFields();

    }

    private void reSetFields() {
        nameTextfield.setText("");
        price.setText("");
    }

    private void retriveDataFomable() {
        DefaultTableModel t = (DefaultTableModel) importTable.getModel();
        for (int i = importTable.getRowCount() - 1; i >= 0; i--) {
            t.removeRow(i);
        }
        importTable.setRowHeight(30);
        Vector<String> columnsName = new Vector<>();
        Vector<Object> datalist = new Vector<>();
        columnsName.add("رقم الكود");
        columnsName.add("اسم النشاط ");
        columnsName.add("السعر");
        columnsName.add("تاريخ النشاط");
        columnsName.add("السنه");

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT * FROM generalimport";
        ResultSetMetaData rsm = null;

        try {
            conn = DatabaseConnection.getconnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            if (rs.next() == false) {
                return;
            } else {
                rsm = rs.getMetaData();
                int cot = rsm.getColumnCount();
                do {
                    Vector<Object> list = new Vector<>(cot);
                    for (int i = 1; i <= cot; i++) {
                        list.add(rs.getObject(i));
                    }
                    datalist.add(list);
                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ImportClient.class.getName()).log(Level.SEVERE, null, ex);
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
        DefaultTableModel model = new DefaultTableModel(datalist, columnsName);
        importTable.setModel(model);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        importTable.setDefaultRenderer(String.class, centerRenderer);
        for (int i = 0; i < importTable.getColumnCount(); i++) {
            importTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void calcTotalPrice() {
        int calcTolal = 0;
        DefaultTableModel model = (DefaultTableModel) importTable.getModel();
        for (int i = 0; i < importTable.getRowCount(); i++) {
            calcTolal += Integer.parseInt(importTable.getValueAt(i, 2).toString());
        }
        total.setText(String.valueOf(calcTolal));
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
            java.util.logging.Logger.getLogger(EradatElnashat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EradatElnashat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EradatElnashat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EradatElnashat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EradatElnashat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel clientName;
    private javax.swing.JLabel clientName1;
    private javax.swing.JLabel clientName2;
    private javax.swing.JTable importTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JTextField price;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}
