/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gigih Prasetyady
 */
public class kalkulatorSederhana_1 extends javax.swing.JFrame {
     String angka;
     Double jumlah, bil1, bil2;
     int pilih;
     
    /**
     * Creates new form kalkulatorSederhana
     */
    public kalkulatorSederhana_1 () {
        initComponents();
        angka = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hasil = new javax.swing.JTextField();
        HAPUS = new javax.swing.JButton();
        ANGKA7 = new javax.swing.JButton();
        ANGKA4 = new javax.swing.JButton();
        ANGKA1 = new javax.swing.JButton();
        BAGI = new javax.swing.JButton();
        ANGKA8 = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        HASIL = new javax.swing.JButton();
        ANGKA5 = new javax.swing.JButton();
        ANGKA9 = new javax.swing.JButton();
        KALI = new javax.swing.JButton();
        TAMBAH = new javax.swing.JButton();
        ANGKA6 = new javax.swing.JButton();
        KURANG = new javax.swing.JButton();
        ANGKA2 = new javax.swing.JButton();
        ANGKA3 = new javax.swing.JButton();
        ANGKA0 = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        HAPUS.setText("C");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        ANGKA7.setText("7");
        ANGKA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA7ActionPerformed(evt);
            }
        });

        ANGKA4.setText("4");
        ANGKA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA4ActionPerformed(evt);
            }
        });

        ANGKA1.setText("1");
        ANGKA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA1ActionPerformed(evt);
            }
        });

        BAGI.setText("/");
        BAGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAGIActionPerformed(evt);
            }
        });

        ANGKA8.setText("8");
        ANGKA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA8ActionPerformed(evt);
            }
        });

        titik.setText(".");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        HASIL.setText("=");
        HASIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HASILActionPerformed(evt);
            }
        });

        ANGKA5.setText("5");
        ANGKA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA5ActionPerformed(evt);
            }
        });

        ANGKA9.setText("9");
        ANGKA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA9ActionPerformed(evt);
            }
        });

        KALI.setText("X");
        KALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KALIActionPerformed(evt);
            }
        });

        TAMBAH.setText("+");
        TAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAMBAHActionPerformed(evt);
            }
        });

        ANGKA6.setText("6");
        ANGKA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA6ActionPerformed(evt);
            }
        });

        KURANG.setText("-");
        KURANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KURANGActionPerformed(evt);
            }
        });

        ANGKA2.setText("2");
        ANGKA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA2ActionPerformed(evt);
            }
        });

        ANGKA3.setText("3");
        ANGKA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA3ActionPerformed(evt);
            }
        });

        ANGKA0.setText("0");
        ANGKA0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANGKA0ActionPerformed(evt);
            }
        });

        kembali.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kembali.setText("FINISH");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ANGKA7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ANGKA8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ANGKA9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(KALI, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ANGKA4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ANGKA5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ANGKA6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(KURANG, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(HAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BAGI, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ANGKA0, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HASIL, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ANGKA1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANGKA2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANGKA3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TAMBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hasil))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAGI, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANGKA7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KALI, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANGKA4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KURANG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANGKA1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAMBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANGKA3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANGKA0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HASIL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void ANGKA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA7ActionPerformed
        angka += "7";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA7ActionPerformed

    private void ANGKA0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA0ActionPerformed
       angka += "0";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA0ActionPerformed

    private void ANGKA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA1ActionPerformed
          angka += "1";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA1ActionPerformed

    private void ANGKA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA2ActionPerformed
        angka += "2";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA2ActionPerformed

    private void ANGKA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA3ActionPerformed
          angka += "3";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA3ActionPerformed

    private void ANGKA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA4ActionPerformed
          angka += "4";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA4ActionPerformed

    private void ANGKA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA5ActionPerformed
          angka += "5";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA5ActionPerformed

    private void ANGKA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA6ActionPerformed
          angka += "6";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA6ActionPerformed

    private void ANGKA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA8ActionPerformed
        angka += "8";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA8ActionPerformed

    private void ANGKA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANGKA9ActionPerformed
          angka += "9";
       hasil.setText(angka);
    }//GEN-LAST:event_ANGKA9ActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        angka += ".";
       hasil.setText(angka);
    }//GEN-LAST:event_titikActionPerformed

    private void HASILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HASILActionPerformed
          switch (pilih){
              case 1:
                  bil2 = Double.parseDouble(angka);
                  jumlah = bil1+bil2;
                  angka = Double.toString(jumlah);
                  hasil.setText(angka);
                  break;
               case 2:
                  bil2 = Double.parseDouble(angka);
                  jumlah = bil1-bil2;
                  angka = Double.toString(jumlah);
                  hasil.setText(angka);
                  break;
                  case 3:
                  bil2 = Double.parseDouble(angka);
                  jumlah = bil1*bil2;
                  angka = Double.toString(jumlah);
                  hasil.setText(angka);
                  break;
                   case 4:
                  bil2 = Double.parseDouble(angka);
                  jumlah = bil1/bil2;
                  angka = Double.toString(jumlah);
                  hasil.setText(angka);
                  break;
                   default:
                  break;
          }
    }//GEN-LAST:event_HASILActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        hasil.setText(angka);
        
        bil1 = 0.0;
        bil2 = 0.0;
        jumlah = 0.0;
        angka = "";
    }//GEN-LAST:event_HAPUSActionPerformed

    private void TAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAMBAHActionPerformed
      try{  bil1 = Double.parseDouble(angka);
        hasil.setText("+");
        angka = "";
        pilih =1;}
      catch (Exception e)
      {System.out.println("Masukan angka dulu !");}
    }//GEN-LAST:event_TAMBAHActionPerformed

    private void KURANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KURANGActionPerformed
        try { bil1 = Double.parseDouble(angka);
        hasil.setText("-");
        angka = "";
        pilih =2;}
        catch (Exception e){
            System.out.println("Masukan angka dulu!");
        }
    }//GEN-LAST:event_KURANGActionPerformed

    private void KALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KALIActionPerformed
         try { bil1 = Double.parseDouble(angka);
        hasil.setText("*");
        angka = "";
        pilih =3;}
        catch (Exception e){
            System.out.println("Masukan angka dulu!");
        }
    }//GEN-LAST:event_KALIActionPerformed

    private void BAGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAGIActionPerformed
        try { bil1 = Double.parseDouble(angka);
        hasil.setText("/");
        angka = "";
        pilih =4;}
        catch (Exception e){
            System.out.println("Masukan angka dulu!");
        }
    }//GEN-LAST:event_BAGIActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        hal3 hal3 = new hal3();
         setLocationRelativeTo(null);
        hal3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANGKA0;
    private javax.swing.JButton ANGKA1;
    private javax.swing.JButton ANGKA2;
    private javax.swing.JButton ANGKA3;
    private javax.swing.JButton ANGKA4;
    private javax.swing.JButton ANGKA5;
    private javax.swing.JButton ANGKA6;
    private javax.swing.JButton ANGKA7;
    private javax.swing.JButton ANGKA8;
    private javax.swing.JButton ANGKA9;
    private javax.swing.JButton BAGI;
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton HASIL;
    private javax.swing.JButton KALI;
    private javax.swing.JButton KURANG;
    private javax.swing.JButton TAMBAH;
    private javax.swing.JTextField hasil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kembali;
    private javax.swing.JButton titik;
    // End of variables declaration//GEN-END:variables
}
