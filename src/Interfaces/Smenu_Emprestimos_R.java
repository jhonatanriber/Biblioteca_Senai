
package Interfaces;

import Classes.Livro;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhonatan Santos
 */
public class Smenu_Emprestimos_R extends javax.swing.JPanel {
    Livro livro = new Livro();

   

    public Smenu_Emprestimos_R() {
        initComponents();
       
    }
    
    public void atualizarListadePessoas(){
        
    }
    
    public void atualizarInformaçõesDoLivroSelecionado(int select){
       try {
            ArrayList<String> listLivro = livro.getListLivros();
            String[] listLivros = listLivro.get(select).split(";");
            jTextTitulo.setText(listLivros[1]);
            jTextCodigo.setText(listLivros[0]);
            jTextEditora.setText(listLivros[2]);
            jTextAutor.setText(listLivros[3]);
            jTextEdicao.setText(listLivros[4]);
            jTextAno.setText(listLivros[5]);
            jTextPaginas.setText(listLivros[6]);
            jTextQuantidade.setText(listLivros[7]);
            jLabelFoto.setIcon(new ImageIcon(listLivros[8]));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Smenu_Livros = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextCodigo = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jTextEditora = new javax.swing.JTextField();
        jTextEdicao = new javax.swing.JTextField();
        jTextAno = new javax.swing.JTextField();
        jTextPaginas = new javax.swing.JTextField();
        jTextQuantidade = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(605, 448));

        Smenu_Livros.setPreferredSize(new java.awt.Dimension(605, 448));
        Smenu_Livros.setLayout(new javax.swing.BoxLayout(Smenu_Livros, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(605, 448));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fazer Emprestimo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancelar");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 170, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 460, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selecione o Requerente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "CPF", "Categoria"
            }
        ));
        jTablePessoas.setEditingColumn(0);
        jTablePessoas.setEditingRow(0);
        jScrollPane2.setViewportView(jTablePessoas);
        if (jTablePessoas.getColumnModel().getColumnCount() > 0) {
            jTablePessoas.getColumnModel().getColumn(2).setResizable(false);
            jTablePessoas.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 180));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 169, 210, 30));

        jButton2.setText("Pesquisa");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 90, -1));

        jTextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 102, 40));

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livro.jpg"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 140));

        jTextEditora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Editora", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 223, -1));

        jTextEdicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEdicao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edição", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 84, -1));

        jTextAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 84, -1));

        jTextPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, -1));

        jTextQuantidade.setEditable(false);
        jTextQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextQuantidade.setText("0");
        jTextQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Qtd Exemplares", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 130, -1));

        jTextAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 230, -1));

        jTextTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Titulo do Livro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel2.add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 350, -1));

        Smenu_Livros.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Smenu_Livros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Smenu_Livros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Jp");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jTextAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAnoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Smenu_Livros;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextEdicao;
    private javax.swing.JTextField jTextEditora;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextPaginas;
    private javax.swing.JTextField jTextQuantidade;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
