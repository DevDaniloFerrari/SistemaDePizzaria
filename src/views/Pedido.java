package views;

import controllers.ClienteController;
import controllers.PedidoController;
import controllers.ProdutoController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ClienteModel;
import models.ProdutoModel;
import models.contexts.ClienteContext;
import models.contexts.PedidoContext;
import models.contexts.ProdutoContext;

public class Pedido extends javax.swing.JFrame {

    private final PedidoController _pedidoController;
    private final ClienteController _clienteController;
    private final ProdutoController _produtoController;
    private final Cliente _clienteFrame;

    public Pedido() throws SQLException {

        _pedidoController = new PedidoController(new ClienteContext(), new PedidoContext());
        _clienteController = new ClienteController(new ClienteContext());
        _produtoController = new ProdutoController(new ProdutoContext());

        _clienteFrame = new Cliente();

        initComponents();
        this.setLocationRelativeTo(null);

        radioBtnCodigo.setSelected(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsDeBusca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        spnCodigo = new javax.swing.JSpinner();
        radioBtnCodigo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        radioBtnDescricao = new javax.swing.JRadioButton();
        txtBusca = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutosSolicitados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido");

        jLabel1.setText("Telefone:");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        spnCodigo.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        buttonsDeBusca.add(radioBtnCodigo);
        radioBtnCodigo.setText("Código");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonsDeBusca.add(radioBtnDescricao);
        radioBtnDescricao.setText("Descrição");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar)
                            .addComponent(jButton1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioBtnDescricao)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioBtnCodigo)
                                .addGap(203, 203, 203)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnCodigo)
                            .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnDescricao)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizar))
                        .addGap(9, 9, 9)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        tblProdutosSolicitados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço"
            }
        ));
        jScrollPane2.setViewportView(tblProdutosSolicitados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerificar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        ClienteModel clienteModel = null;
        try {
            clienteModel = _clienteController.obter(txtTelefone.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        _clienteFrame.setVisible(true);

        if (clienteModel != null) {
            _clienteFrame.preencherCliente(clienteModel);
        }

    }//GEN-LAST:event_btnVerificarActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (radioBtnCodigo.isSelected()) {
            try {
                ProdutoModel model = _produtoController.obter((int) spnCodigo.getValue());

                if (model != null) {
                    this.carregarProdutoNaTabela(tblProdutos,model);
                } else {
                    this.limparTabela(tblProdutos);
                    this.refreshTable(tblProdutos);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ArrayList<ProdutoModel> produtos = _produtoController.obter(txtBusca.getText());

                if (produtos.isEmpty()) {
                    this.carregarProdutosNaTabela(tblProdutos,produtos);
                } else {
                    this.limparTabela(tblProdutos);
                    this.refreshTable(tblProdutos);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            this.carregarProdutosNaTabela(tblProdutos, _produtoController.obter());
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        int linha = tblProdutos.getSelectedRow();
        
        ProdutoModel model = new  ProdutoModel(
                                                (int) tblProdutos.getValueAt(linha, 0),
                                                (String) tblProdutos.getValueAt(linha, 1),
                                                (Float) tblProdutos.getValueAt(linha, 2)
                                              );
        
        try {
            this.carregarProdutoNaTabela(tblProdutosSolicitados, model);
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    public void carregarProdutosNaTabela(JTable tabela , ArrayList<ProdutoModel> produtos) throws SQLException {

        int contador = 0;

        DefaultTableModel modeloDaTabela = (DefaultTableModel) tabela.getModel();

        for (ProdutoModel produto : produtos) {

            modeloDaTabela.addRow(new String[modeloDaTabela.getColumnCount()]);

            tabela.setValueAt(produto.getIdProduto(), contador, 0);
            tabela.setValueAt(produto.getDescricao(), contador, 1);
            tabela.setValueAt(produto.getPreco(), contador, 2);

            contador++;
        }

        this.refreshTable(tabela);
    }

    public void carregarProdutosNaTabela(ArrayList<ProdutoModel> produtos) throws SQLException {

        int contador = 0;

        DefaultTableModel modeloDaTabela = (DefaultTableModel) tblProdutos.getModel();

        for (ProdutoModel produto : produtos) {

            modeloDaTabela.addRow(new String[modeloDaTabela.getColumnCount()]);

            tblProdutos.setValueAt(produto.getIdProduto(), contador, 0);
            tblProdutos.setValueAt(produto.getDescricao(), contador, 1);
            tblProdutos.setValueAt(produto.getPreco(), contador, 2);

            contador++;
        }

        this.refreshTable(tblProdutos);
    }
    
    public void carregarProdutoNaTabela(JTable tabela , ProdutoModel produto) throws SQLException {

        DefaultTableModel modeloDaTabela = (DefaultTableModel) tabela.getModel();

        modeloDaTabela.addRow(new String[modeloDaTabela.getColumnCount()]);

        tabela.setValueAt(produto.getIdProduto(), (tabela.getRowCount()-1), 0);
        tabela.setValueAt(produto.getDescricao(), (tabela.getRowCount()-1), 1);
        tabela.setValueAt(produto.getPreco(), (tabela.getRowCount()-1), 2);

        this.refreshTable(tabela);
    }

    
    
    private void limparTabela(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
    }

    public void refreshTable(JTable tabela) {
        tabela.setModel(tabela.getModel());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.ButtonGroup buttonsDeBusca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBtnCodigo;
    private javax.swing.JRadioButton radioBtnDescricao;
    private javax.swing.JSpinner spnCodigo;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTable tblProdutosSolicitados;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
