/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Exemplar;
import Classes.Livro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan Santos
 */
public class Smenu_Reservas_R extends javax.swing.JPanel {
Livro livro = new Livro();
Exemplar exemplar = new Exemplar();
   

    public Smenu_Reservas_R() {
        initComponents();
       
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
            jLabelFoto.setIcon(new ImageIcon(listLivros[8]));
            updateListExemplar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void updateListExemplar() {
        ArrayList<String> listExemplares_Temp = new ArrayList<String>();
        try {
            ArrayList<String> listExemplares = exemplar.getListExemplar();
            DefaultTableModel model = (DefaultTableModel) jTableExemplar.getModel();
            model.setNumRows(0);
            for (int i = 0; i < listExemplares.size(); i++) {
                if (listExemplares.get(i).contains(jTextCodigo.getText())) {
                    String[] listExemplar = listExemplares.get(i).split(";");
                    listExemplares_Temp.add(listExemplares.get(i));
                    model.addRow(listExemplar);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Atualizar Exemplares", JOptionPane.ERROR_MESSAGE);
        }
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Smenu_Livros = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExemplar = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLivros1 = new javax.swing.JTable();
        jLabelFoto = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jTextPaginas = new javax.swing.JTextField();
        jTextCodigo = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jTextEditora = new javax.swing.JTextField();
        jTextEdicao = new javax.swing.JTextField();
        jTextAno = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(605, 448));

        Smenu_Livros.setPreferredSize(new java.awt.Dimension(605, 448));
        Smenu_Livros.setLayout(new javax.swing.BoxLayout(Smenu_Livros, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(605, 448));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selecione um Exemplar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jTableExemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Editora", "Autor"
            }
        ));
        jTableExemplar.setEditingColumn(0);
        jTableExemplar.setEditingRow(0);
        jScrollPane1.setViewportView(jTableExemplar);
        if (jTableExemplar.getColumnModel().getColumnCount() > 0) {
            jTableExemplar.getColumnModel().getColumn(2).setResizable(false);
            jTableExemplar.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 120));

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
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 171, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 566, -1));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Selecione o Requerente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jTableLivros1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Editora", "Autor"
            }
        ));
        jTableLivros1.setEditingColumn(0);
        jTableLivros1.setEditingRow(0);
        jScrollPane2.setViewportView(jTableLivros1);
        if (jTableLivros1.getColumnModel().getColumnCount() > 0) {
            jTableLivros1.getColumnModel().getColumn(2).setResizable(false);
            jTableLivros1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 259, 580, 130));

        jLabelFoto.setText("jLabel7");
        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 70));

        jTextTitulo.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Titulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 220, -1));

        jTextPaginas.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 80, -1));

        jTextCodigo.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 80, -1));

        jTextAutor.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 140, -1));

        jTextEditora.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextEditora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Editora", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        jTextEdicao.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextEdicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEdicao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edição", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jPanel2.add(jTextEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, -1));

        jTextAno.setFont(new java.awt.Font("Noto Sans", 0, 10)); // NOI18N
        jTextAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 9))); // NOI18N
        jTextAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 80, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 190, -1));

        jButton1.setFont(new java.awt.Font("Noto Sans", 0, 11)); // NOI18N
        jButton1.setText("Pesquisar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 100, 25));

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

    private void jTextAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAnoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Smenu_Livros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableExemplar;
    private javax.swing.JTable jTableLivros1;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextEdicao;
    private javax.swing.JTextField jTextEditora;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextPaginas;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
