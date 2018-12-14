/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CategoriaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Cidade;


public class FrmCategoria extends javax.swing.JInternalFrame {
    
    private Categoria categoria;
    private ListCategoria telaListCategorias;

    /**
     * Creates new form FrmCategoria
     */
    public FrmCategoria() {
        initComponents();
        lblCodigoValor.setVisible(false);
        lblCodigo.setVisible(false);
    }
    
    
    public FrmCategoria(int codigo, ListCategoria telaListCategorias) {
        this.telaListCategorias = telaListCategorias;
        initComponents();
        categoria = CategoriaDAO.getCategoriaByCodigo(codigo);
        carregarFormulario();
        lblCodigoValor.setVisible(true);
        lblCodigo.setVisible(true);
    }
    
    private void carregarFormulario(){
        lblCodigoValor.setText(String.valueOf(categoria.getCodigo()));
        txtNome.setText(categoria.getNome());
        
        List<Categoria> categoria =  CategoriaDAO.getCategorias();
        for (int i = 0; i < categoria.size(); i++) {
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmCategorias = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblCodigoValor = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Categorias");

        FrmCategorias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FrmCategorias.setText("Cadastrar Categorias");

        lblNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNome.setText("Nome: ");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setText("Código:");

        lblCodigoValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigoValor.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(FrmCategorias))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCodigo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(lblCodigoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(FrmCategorias)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCodigoValor))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    String nome = txtNome.getText();     
        if(nome.isEmpty() ){
            JOptionPane.showMessageDialog(null, 
                    "Nome é obrigatório!" );
        }else{
            boolean nova = false;
            if(categoria == null){
                nova = true;
                categoria = new Categoria();
            }
            categoria.setNome( nome );
            categoria.setCodigo(0);
            if(nova){
                CategoriaDAO.inserir(categoria);
            }else{
                CategoriaDAO.editar(categoria);
                telaListCategorias.carregarTabela();
                this.dispose();
            }
        
        
            categoria.setNome(nome);
            categoria.setCodigo(0);
            
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrmCategorias;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoValor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

