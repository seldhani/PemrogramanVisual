/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TugasPemvis;

/**
 *
 * @author Dr. Kudrat Sunandar
 */
public class ModulSepuluh extends javax.swing.JFrame {

    /**
     * Creates new form ModulSepuluh
     */
    public ModulSepuluh() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eDataSatu = new javax.swing.JTextField();
        eDataDua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eHasil = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menProses = new javax.swing.JMenu();
        meItBersih = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menHit = new javax.swing.JMenu();
        meItLuas = new javax.swing.JMenuItem();
        meItKeliling = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Panjang/Alas/Jari");

        jLabel2.setText("Lebar/Tinggi/Sisi");

        jLabel3.setText("Hasil");

        eDataSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDataSatuActionPerformed(evt);
            }
        });

        eDataDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDataDuaActionPerformed(evt);
            }
        });

        eHasil.setColumns(20);
        eHasil.setRows(5);
        jScrollPane1.setViewportView(eHasil);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        menProses.setText("Proses");

        meItBersih.setText("Bersih");
        meItBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItBersihActionPerformed(evt);
            }
        });
        menProses.add(meItBersih);
        menProses.add(jSeparator1);

        menHit.setText("Hitung");

        meItLuas.setText("Luas");
        meItLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItLuasActionPerformed(evt);
            }
        });
        menHit.add(meItLuas);

        meItKeliling.setText("Keliling");
        meItKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meItKelilingActionPerformed(evt);
            }
        });
        menHit.add(meItKeliling);

        menProses.add(menHit);
        menProses.add(jSeparator2);

        jMenuBar1.add(menProses);

        jMenu3.setText("Bantuan");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eDataDua, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(eDataSatu))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eDataSatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eDataDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eDataSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDataSatuActionPerformed
         
    }//GEN-LAST:event_eDataSatuActionPerformed

    private void eDataDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDataDuaActionPerformed
       
    }//GEN-LAST:event_eDataDuaActionPerformed

    private void meItBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItBersihActionPerformed
        
    }//GEN-LAST:event_meItBersihActionPerformed

    private void meItKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItKelilingActionPerformed
    double panjang = Double.parseDouble(eDataSatu.getText());
    double lebar = Double.parseDouble(eDataDua.getText());
    double sisiA = Double.parseDouble(eDataDua.getText());
    double sisiB = Double.parseDouble(eDataDua.getText());
    double sisiC = Double.parseDouble(eDataDua.getText());
    double jariJari = Double.parseDouble(eDataSatu.getText());
    
    // Menghitung keliling Persegi Panjang
    double kelilingPersegiPanjang = 2 * (panjang + lebar);
    
    // Menghitung keliling Segitiga
    double kelilingSegitiga = sisiA + sisiB + sisiC;
    
    // Menghitung keliling Lingkaran
    double kelilingLingkaran = 2 * Math.PI * jariJari;
    
    // Menampilkan hasil perhitungan pada label atau text area
    eHasil.setText("Keliling Persegi Panjang: " + kelilingPersegiPanjang + "\n"
                             + "Keliling Segitiga: " + kelilingSegitiga + "\n"
                             + "Keliling Lingkaran: " + kelilingLingkaran);
    }//GEN-LAST:event_meItKelilingActionPerformed

    private void meItLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meItLuasActionPerformed
    double panjang = Double.parseDouble(eDataSatu.getText());
    double lebar = Double.parseDouble(eDataDua.getText());
    double alas = Double.parseDouble(eDataSatu.getText());
    double tinggi = Double.parseDouble(eDataDua.getText());
    double jariJari = Double.parseDouble(eDataSatu.getText());
    
    // Menghitung luas Persegi Panjang
    double luasPersegiPanjang = panjang * lebar;
    
    // Menghitung luas Segitiga
    double luasSegitiga = 0.5 * alas * tinggi;
    
    // Menghitung luas Lingkaran
    double luasLingkaran = Math.PI * jariJari * jariJari;
    
    // Menampilkan hasil perhitungan pada label atau text area
    eHasil.setText("Luas Persegi Panjang: " + luasPersegiPanjang + "\n"
                         + "Luas Segitiga: " + luasSegitiga + "\n"
                         + "Luas Lingkaran: " + luasLingkaran);
    }//GEN-LAST:event_meItLuasActionPerformed

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
            java.util.logging.Logger.getLogger(ModulSepuluh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModulSepuluh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModulSepuluh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModulSepuluh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModulSepuluh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eDataDua;
    private javax.swing.JTextField eDataSatu;
    private javax.swing.JTextArea eHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem meItBersih;
    private javax.swing.JMenuItem meItKeliling;
    private javax.swing.JMenuItem meItLuas;
    private javax.swing.JMenu menHit;
    private javax.swing.JMenu menProses;
    // End of variables declaration//GEN-END:variables
}
