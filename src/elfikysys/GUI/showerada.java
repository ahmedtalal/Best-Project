package elfikysys.GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author android
 */
public class showerada extends javax.swing.JFrame {

    /**
     * Creates new form show
     */
    public showerada(int code,String name,String phone,int madfo,int paky,int total,String date) {
        initComponents();
        this.setVisible(true);
        codeTextfield1.setText(String.valueOf(code));
        nameTextfield.setText(name);
        clientPhone.setText(phone);
        clientPay.setText(String.valueOf(madfo));
        clientChange.setText(String.valueOf(paky));
        clientTotaleprice.setText(String.valueOf(total));
        dateContract.setText(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tari51 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edara = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        tari52 = new javax.swing.JLabel();
        tari55 = new javax.swing.JLabel();
        newContractBtn1 = new javax.swing.JButton();
        newContractBtn2 = new javax.swing.JButton();
        nameTextfield = new javax.swing.JTextField();
        clientName = new javax.swing.JLabel();
        clientName1 = new javax.swing.JLabel();
        dateContract = new javax.swing.JTextField();
        clientPhone = new javax.swing.JTextField();
        clientName9 = new javax.swing.JLabel();
        codeTextfield1 = new javax.swing.JTextField();
        clientName2 = new javax.swing.JLabel();
        clientName5 = new javax.swing.JLabel();
        clientTotaleprice = new javax.swing.JTextField();
        clientPay = new javax.swing.JTextField();
        clientName6 = new javax.swing.JLabel();
        clientName7 = new javax.swing.JLabel();
        clientChange = new javax.swing.JTextField();
        clientName10 = new javax.swing.JLabel();
        dateContract1 = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("طباعة الفاتورة");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jLabel24.setText("--------------------------------------------------------------------------------------------------------------------------------");

        tari51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tari51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tari51.setText("الــــــفــــــقـــــي لـــلاثـــــاث الــــراقـــــي");
        tari51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("------------------------------------------------------------------------------------------------------------------------------------");

        edara.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        edara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edara.setText("فـــاتـــورة اســـتـــلام نـــقــــديـــة");
        edara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel31.setText("01142941600 / 01111077944 : dr.sales برنامج");

        tari52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tari52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tari52.setText("المعرض : طريق الشوكة - العمرية - مركز دمنهور");

        tari55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tari55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tari55.setText("ت/01006707533");

        newContractBtn1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        newContractBtn1.setText("طباعة نص ");
        newContractBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContractBtn1ActionPerformed(evt);
            }
        });

        newContractBtn2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        newContractBtn2.setText("طباعة كاملة");
        newContractBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContractBtn2ActionPerformed(evt);
            }
        });

        nameTextfield.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        nameTextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTextfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientName.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName.setText("اسم العميل :");
        clientName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientName1.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName1.setText("رقم التليفون:");
        clientName1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        dateContract.setEditable(false);
        dateContract.setBackground(new java.awt.Color(255, 255, 255));
        dateContract.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dateContract.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateContract.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientPhone.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        clientPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));
        clientPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clientPhoneKeyTyped(evt);
            }
        });

        clientName9.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName9.setText("تاريخ الايراد : ");
        clientName9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        codeTextfield1.setEditable(false);
        codeTextfield1.setBackground(new java.awt.Color(255, 255, 255));
        codeTextfield1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        codeTextfield1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeTextfield1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientName2.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName2.setText("رقم الكود:");
        clientName2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientName5.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName5.setText("الاجمالي :");
        clientName5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientTotaleprice.setEditable(false);
        clientTotaleprice.setBackground(new java.awt.Color(255, 255, 255));
        clientTotaleprice.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        clientTotaleprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientTotaleprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientPay.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        clientPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientPay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));
        clientPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPayActionPerformed(evt);
            }
        });
        clientPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clientPayKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clientPayKeyTyped(evt);
            }
        });

        clientName6.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName6.setText("المبلغ المدفوع : ");
        clientName6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientName7.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName7.setText("الباقي :");
        clientName7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        clientChange.setEditable(false);
        clientChange.setBackground(new java.awt.Color(255, 255, 255));
        clientChange.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        clientChange.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clientChange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        clientName10.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        clientName10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientName10.setText("تحرير بواسطة : ");
        clientName10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        dateContract1.setEditable(false);
        dateContract1.setBackground(new java.awt.Color(255, 255, 255));
        dateContract1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dateContract1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateContract1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(65, 66, 83), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateContract1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clientName10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(clientChange)
                                    .addGap(18, 18, 18)
                                    .addComponent(clientName7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(clientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(clientPay)
                                    .addGap(18, 18, 18)
                                    .addComponent(clientName6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(clientTotaleprice)
                                        .addComponent(dateContract, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clientName9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientName5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(newContractBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newContractBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(codeTextfield1)
                                        .addComponent(nameTextfield))
                                    .addGap(18, 18, 18)
                                    .addComponent(clientName2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(tari51, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(tari52, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(tari55, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(edara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(edara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(tari51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tari52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tari55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientName2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTextfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientPay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientName6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientName7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientChange, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientTotaleprice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientName5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientName9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateContract, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientName10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateContract1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newContractBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newContractBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped

    }//GEN-LAST:event_jPanel1KeyTyped

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyReleased

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void newContractBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContractBtn1ActionPerformed
        newContractBtn1.setVisible(false);
        newContractBtn2.setVisible(false);
        PrinterJob jp = PrinterJob.getPrinterJob();
        jp.setJobName("فاتورة");

        jp.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int num) {
                if (num > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) g;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                pf.setOrientation(PageFormat.PORTRAIT);
                g2.scale((pf.getImageableWidth() / jPanel1.getWidth()), (pf.getImageableHeight() / jPanel1.getHeight() / 2));
                jPanel1.paintAll(g2);

                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = jp.printDialog();
        if (ok) {

            try {

                jp.print();
                JOptionPane.showMessageDialog(null, "تم الطباعة.....!", "data", JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException ex) {
                Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
            }
        }         // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_newContractBtn1ActionPerformed

    private void newContractBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContractBtn2ActionPerformed
        newContractBtn1.setVisible(false);
        newContractBtn2.setVisible(false);
        PrinterJob jp = PrinterJob.getPrinterJob();
        jp.setJobName("فاتورة");
        jp.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int num) {
                if (num > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) g;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(pf.getImageableWidth() / jPanel1.getWidth(), pf.getImageableHeight() / jPanel1.getHeight());
                jPanel1.paintAll(g2);
                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = jp.printDialog();
        if (ok) {

            try {
                jp.print();
                JOptionPane.showMessageDialog(null, "تم الطباعة.....!", "data", JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException ex) {
                Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newContractBtn2ActionPerformed

    private void clientPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientPhoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_clientPhoneKeyTyped

    private void clientPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientPayKeyReleased

    }//GEN-LAST:event_clientPayKeyReleased

    private void clientPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientPayKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < 48 || c > 57) {
            evt.consume();
        }
    }//GEN-LAST:event_clientPayKeyTyped

    private void clientPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientPayActionPerformed

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
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showamel(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientChange;
    private javax.swing.JLabel clientName;
    private javax.swing.JLabel clientName1;
    private javax.swing.JLabel clientName10;
    private javax.swing.JLabel clientName2;
    private javax.swing.JLabel clientName5;
    private javax.swing.JLabel clientName6;
    private javax.swing.JLabel clientName7;
    private javax.swing.JLabel clientName9;
    private javax.swing.JTextField clientPay;
    private javax.swing.JTextField clientPhone;
    private javax.swing.JTextField clientTotaleprice;
    private javax.swing.JTextField codeTextfield1;
    private javax.swing.JTextField dateContract;
    private javax.swing.JTextField dateContract1;
    private javax.swing.JLabel edara;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JButton newContractBtn1;
    private javax.swing.JButton newContractBtn2;
    private javax.swing.JLabel tari51;
    private javax.swing.JLabel tari52;
    private javax.swing.JLabel tari55;
    // End of variables declaration//GEN-END:variables
}
