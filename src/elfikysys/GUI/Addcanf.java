/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elfikysys.GUI;

import Models.DatabaseConnection;
import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javcoder
 */
public class Addcanf extends javax.swing.JFrame {
    private int id , pric , quantit , totalPrice = 0 ;
    private String name , type  = null ;
    private int count  = 0  ;
    
    public Addcanf() {
            initComponents();
           this.setLocationRelativeTo(null);
           setAutoIncrementID() ;
           retrieveAllItemsType() ;
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameCanf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        totalPrice1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        addproduct = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        addTypeBtn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("صفحه اضافه صنف");
        setResizable(false);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane2.setName("المنتجات"); // NOI18N
        jTabbedPane2.setOpaque(true);
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1000, 415));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2), "اضافه صنف جديد", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        code.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        code.setForeground(new java.awt.Color(0, 0, 204));
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("كود الصنف :");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        nameCanf.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        nameCanf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("الاسم :");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("سعر الصنف :");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        price.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("الكميه :");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        quantity.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        totalPrice1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        totalPrice1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPrice1.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("اجمالي السعر :");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        TypeComboBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("النوع :");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 2, true));

        addproduct.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        addproduct.setText("اضافه صنف ");
        addproduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 1, true));
        addproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addproductMouseClicked(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton5.setText("الرجوع الي القائمه الرئيسيه");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 11, 11), 1, true));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalPrice1)
                                    .addComponent(quantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameCanf, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(price)
                                .addComponent(TypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGap(16, 16, 16))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(60, 60, 60)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameCanf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(49, 49, 49)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(totalPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(108, 108, 108)
                            .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(37, 37, 37)))
        );

        jTabbedPane2.addTab("اضافه صنف", jPanel4);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2), "نوع جديد", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("اسم النوع:");

        addTypeBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        addTypeBtn.setText("اضافه نوع جديد");
        addTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTypeBtnActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(468, 468, 468)
                    .addComponent(addTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(451, 451, 451))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(289, 289, 289)
                    .addComponent(addTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("اضافة نوع جديد", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("اضافه نوع جديد");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addproductMouseClicked
        // TODO add your handling code here:
        Connection conn = null ;
        PreparedStatement pr = null ;

        name = nameCanf.getText() ;
        type = String.valueOf(TypeComboBox.getSelectedItem().toString()) ;
        id = Integer.parseInt(code.getText()) ;

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال اسم المنتج ");
            return;
        }
        if (price.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال سعر المنتج ");
            return;
        }

        if (quantity.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك يجب عليك ادخال كميه المنتج ");
            return;
        }
        pric = Integer.parseInt(price.getText());
        quantit = Integer.parseInt(quantity.getText());

        totalPrice = pric * quantit ;
        totalPrice1.setText(String.valueOf(totalPrice));
        try {
            conn = DatabaseConnection.getconnection() ;
            String insertQuery = "INSERT INTO items ( Code , Name , Type , Price , Quantity ,  TotalPrice ) VALUES (?,?,?,?,?,?)" ;
            pr = conn.prepareStatement(insertQuery) ;
            pr.setInt(1, id);
            pr.setString(2, name);
            pr.setString(3, type);
            pr.setInt(4, pric);
            pr.setInt(5, quantit);
            pr.setInt(6, totalPrice);
            count = pr.executeUpdate() ;
            if (count != 0 ) {
                JOptionPane.showMessageDialog(null, "تم اضافه الصنف   ");
            }else {
                JOptionPane.showMessageDialog(null, "هناك مشكله ف عمليه الاضافه");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Addcanf.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if (conn != null) {
                    conn.close();
                }

                if (pr != null) {
                    pr.close();
                }
            } catch (Exception e) {
            }
        }

        filterTextFields();
    }//GEN-LAST:event_addproductMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        this.dispose();
        MainPage main =  new MainPage() ;
        main.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTypeBtnActionPerformed
        // TODO add your handling code here:
        if (jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "من فضلك قم بادخال قيمه");
        }else {
            insertTypeInDB(jTextField4.getText());
        }
    }//GEN-LAST:event_addTypeBtnActionPerformed

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    
    private void setAutoIncrementID() {
        Connection con = null ;
        Statement st = null ;
        ResultSet rs = null ;
        int countID = 0 ;
        
        try {
            con = DatabaseConnection.getconnection() ;
            st = con.createStatement() ;
            String selectQuery = "SELECT Code FROM  items  ORDER by Code DESC LIMIT 1 " ;
            rs = st.executeQuery(selectQuery) ;
            if (rs.next() == false) {
                code.setText("100");
            }else{
//                while(rs.next()) {
//                    if (rs.last()) {
                        countID =  rs.getInt("Code") ;
                        int increase = countID + 1 ;
                        code.setText(String.valueOf(increase));
                  //  }
                   
                //}
            }
        } catch (SQLException ex) {
            Logger.getLogger(Addcanf.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if (con != null) {
                    con.close();
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
    
    private void retrieveAllItemsType() {
        Connection conn = null ;
        Statement st = null ;
        ResultSet rs = null ;
        String query = "SELECT * FROM itemstypes " ;
        
        
        try {
            conn = DatabaseConnection.getconnection() ;
            st = conn.createStatement() ;
            rs = st.executeQuery(query) ;
            while (rs.next()) {
                String result = rs.getString("Name") ;
                TypeComboBox.addItem(result);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Addcanf.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
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
    
    private void insertTypeInDB(String itemType) {
        Connection conn = null ;
        PreparedStatement ps = null ;
        String query = "INSERT INTO itemstypes(Name) VALUES (?)" ;
        int count = 0 ;
        
        try {
            conn = DatabaseConnection.getconnection() ;
            ps = conn.prepareStatement(query) ;
            ps.setString(1, itemType);
            count = ps.executeUpdate() ;
            
            if (count != 0) {
                JOptionPane.showMessageDialog(null, "تم اضافه النوع");
            }else {
                JOptionPane.showMessageDialog(null, "هناك خطاء ف عمليه الاضافه");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Addcanf.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
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
        
        retrieveAllItemsType();
    }
    
    private void filterTextFields(){
        nameCanf.setText(" ");
        price.setText(" ");
        quantity.setText("");
        totalPrice1.setText(" ");
        MainPage main =  new MainPage();
        main.setVisible(true);
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
            java.util.logging.Logger.getLogger(Addcanf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcanf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcanf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcanf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addcanf().setVisible(true);
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TypeComboBox;
    private javax.swing.JButton addTypeBtn;
    private javax.swing.JButton addproduct;
    private javax.swing.JLabel code;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nameCanf;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField totalPrice1;
    // End of variables declaration//GEN-END:variables

    


    
}
