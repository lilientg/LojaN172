/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 181720019
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jdpPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuCidadeCadastrar = new javax.swing.JMenuItem();
        menuCidadeListar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuClienteCadastrar = new javax.swing.JMenuItem();
        menuClienteListar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuCategoriaCadastrar = new javax.swing.JMenuItem();
        menuCategoriaListar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuProdutosCadastrar = new javax.swing.JMenuItem();
        menuProdutosListar = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loja_n172");
        setPreferredSize(new java.awt.Dimension(950, 700));

        jdpPainel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jMenu2.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cidade");

        menuCidadeCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        menuCidadeCadastrar.setText("Cadastrar");
        menuCidadeCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadeCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(menuCidadeCadastrar);

        menuCidadeListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menuCidadeListar.setText("Listar");
        menuCidadeListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadeListarActionPerformed(evt);
            }
        });
        jMenu3.add(menuCidadeListar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cliente");

        menuClienteCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuClienteCadastrar.setText("Cadastrar");
        menuClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteCadastrarActionPerformed(evt);
            }
        });
        jMenu4.add(menuClienteCadastrar);

        menuClienteListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menuClienteListar.setText("Listar");
        menuClienteListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteListarActionPerformed(evt);
            }
        });
        jMenu4.add(menuClienteListar);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Categoria");

        menuCategoriaCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuCategoriaCadastrar.setText("Cadastrar");
        menuCategoriaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaCadastrarActionPerformed(evt);
            }
        });
        jMenu5.add(menuCategoriaCadastrar);

        menuCategoriaListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuCategoriaListar.setText("Listar");
        menuCategoriaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaListarActionPerformed(evt);
            }
        });
        jMenu5.add(menuCategoriaListar);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Produtos");

        menuProdutosCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuProdutosCadastrar.setText("Cadastrar");
        menuProdutosCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosCadastrarActionPerformed(evt);
            }
        });
        jMenu6.add(menuProdutosCadastrar);

        menuProdutosListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuProdutosListar.setText("Listar");
        menuProdutosListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosListarActionPerformed(evt);
            }
        });
        jMenu6.add(menuProdutosListar);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpPainel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCidadeCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadeCadastrarActionPerformed
        FrmCidade tela = new FrmCidade();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCidadeCadastrarActionPerformed

    private void menuClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteCadastrarActionPerformed
        FrmClientes tela = new FrmClientes();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuClienteCadastrarActionPerformed

    private void menuCidadeListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadeListarActionPerformed
         ListCidades tela = new ListCidades(jdpPainel);
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCidadeListarActionPerformed

    private void menuCategoriaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaCadastrarActionPerformed
        FrmCategoria tela = new FrmCategoria();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCategoriaCadastrarActionPerformed

    private void menuProdutosCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosCadastrarActionPerformed
        FrmProdutos tela = new FrmProdutos();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuProdutosCadastrarActionPerformed

    private void menuCategoriaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaListarActionPerformed
         ListCategoria tela = new ListCategoria( );
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCategoriaListarActionPerformed

    private void menuProdutosListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosListarActionPerformed
        ListProdutos tela = new ListProdutos(jdpPainel);
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuProdutosListarActionPerformed

    private void menuClienteListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteListarActionPerformed
         ListClientes tela = new ListClientes();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuClienteListarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPainel;
    private javax.swing.JMenuItem menuCategoriaCadastrar;
    private javax.swing.JMenuItem menuCategoriaListar;
    private javax.swing.JMenuItem menuCidadeCadastrar;
    private javax.swing.JMenuItem menuCidadeListar;
    private javax.swing.JMenuItem menuClienteCadastrar;
    private javax.swing.JMenuItem menuClienteListar;
    private javax.swing.JMenuItem menuProdutosCadastrar;
    private javax.swing.JMenuItem menuProdutosListar;
    // End of variables declaration//GEN-END:variables
}
