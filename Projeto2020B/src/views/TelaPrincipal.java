package views;

import controllers.RelatorioController;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import tools.CaixaDeDialogo;
import models.Usuario;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jonas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public static Usuario usuarioLogado;
    
    public TelaPrincipal() {
        initComponents();
        //this.setExtendedState(TelaPrincipal.MAXIMIZED_BOTH);
        
        try{
            lblNomeUsuario.setText("Bem-Vindo " + usuarioLogado.getNome());
        }catch(Exception ex){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnBairros = new javax.swing.JMenuItem();
        mnCandidatos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnRelatorioCandidatos = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeUsuario.setText("Bem-vindo FULANO");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_galaxia.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenu1.setText("Cadastros");

        mnBairros.setText("Bairros");
        mnBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBairrosActionPerformed(evt);
            }
        });
        jMenu1.add(mnBairros);

        mnCandidatos.setText("Candidatos");
        mnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCandidatosActionPerformed(evt);
            }
        });
        jMenu1.add(mnCandidatos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mnRelatorioCandidatos.setText("Relatório de Candidatos");
        mnRelatorioCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioCandidatosActionPerformed(evt);
            }
        });
        jMenu2.add(mnRelatorioCandidatos);

        jMenuBar1.add(jMenu2);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeUsuario))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBairrosActionPerformed
        //CadBairros tela_bairros = new CadBairros();
        //tela_bairros.setVisible(true);
    }//GEN-LAST:event_mnBairrosActionPerformed

    private void mnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCandidatosActionPerformed
        CadCandidatos tela = new CadCandidatos();
        tela.setVisible(true);
    }//GEN-LAST:event_mnCandidatosActionPerformed


    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnRelatorioCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioCandidatosActionPerformed
        RelatorioCandidatos tela = new RelatorioCandidatos();
        tela.setVisible(true);
    }//GEN-LAST:event_mnRelatorioCandidatosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JMenuItem mnBairros;
    private javax.swing.JMenuItem mnCandidatos;
    private javax.swing.JMenuItem mnRelatorioCandidatos;
    private javax.swing.JMenu mnSair;
    // End of variables declaration//GEN-END:variables
}
