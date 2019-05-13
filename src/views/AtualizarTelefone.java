package views;

import controllers.ClienteController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ClienteModel;
import models.contexts.ClienteContext;

public class AtualizarTelefone extends javax.swing.JFrame {

    private final ClienteController _clienteController;

    public AtualizarTelefone(String antigo) {
        initComponents();
        _clienteController = new ClienteController(new ClienteContext());

        txtAntigo.setText(antigo);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAntigo = new javax.swing.JTextField();
        txtNovo = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualização de Telefone");

        jLabel1.setText("Antigo");

        jLabel2.setText("Novo");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNovo)))
                .addGap(30, 30, 30)
                .addComponent(btnAtualizar)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAtualizar)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        ClienteModel modelClienteAntigo;
        ClienteModel modelClienteNovo;
        
        try {
            modelClienteAntigo = _clienteController.obter(txtAntigo.getText());
            modelClienteNovo = _clienteController.obter(txtNovo.getText());

            if (modelClienteAntigo == null) {
                JOptionPane.showMessageDialog(null, "Número antigo inválido ou inexistente!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (modelClienteNovo != null) {
                JOptionPane.showMessageDialog(null, "Novo número já existe!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else {
                _clienteController.atualizarTelefone(txtAntigo.getText(), txtNovo.getText());
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(AtualizarTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAtualizarActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAntigo;
    private javax.swing.JTextField txtNovo;
    // End of variables declaration//GEN-END:variables
}
