/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Livro;
import ClassesDAO.Imagem_Config;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Jhonatan Santos
 */
public class Smenu_Livros extends javax.swing.JPanel {

    Livro livro = new Livro();
    DefaultTableModel model;

    public Smenu_Livros() {
        initComponents();
        updateListLivro();
        setTable();
       
        
        
       
    }
    public void setTable(){
        jScrollPane1.getViewport().setOpaque(false);
        JTableHeader thread = jTableLivros.getTableHeader();
        thread.setForeground(Color.BLACK);
        thread.setFont(new Font("Tahome",Font.BOLD,12));
        ((DefaultTableCellRenderer)thread.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
    }

    public void updateListLivro() {
        try {
            ArrayList<String> listLivros = livro.getListLivros();
            model = (DefaultTableModel) jTableLivros.getModel();
            jTableLivros.setDefaultRenderer(Object.class, new Imagem_Config());
            jTableLivros.setRowHeight(50);
            model.setNumRows(0);
            for (int i = 0; i < listLivros.size(); i++) {
                String[] listLivro = listLivros.get(i).split(";");
                model.addRow(new Object[]{new JLabel(new ImageIcon(listLivro[8])),listLivro[0],
                    listLivro[1],listLivro[2],listLivro[3],listLivro[7]});
                //model.addRow(listLivro);
            }
            
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "Erro ao Atualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setAllColor(JPanel dados) {
        jPanelAdcionar.setBackground(new java.awt.Color(0, 0, 0));
        jPanelEditar.setBackground(new java.awt.Color(0, 0, 0));
        jPanelExcluir.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jPanelEmprestimo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelReservar.setBackground(new java.awt.Color(0, 0, 0));
        jPanelVisualizar.setBackground(new java.awt.Color(0, 0, 0));
        if(dados!=null){
        dados.setBackground(new java.awt.Color(102, 102, 102));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Smenu_Livros = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelEmprestimo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelVisualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelReservar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanelAdcionar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelExcluir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelEditar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelPesquisar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(605, 430));

        Smenu_Livros.setPreferredSize(new java.awt.Dimension(605, 448));
        Smenu_Livros.setLayout(new javax.swing.BoxLayout(Smenu_Livros, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(605, 448));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Livros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jTableLivros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Foto", "Codigo", "Titulo", "Autor", "Editora", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLivros.setEditingColumn(0);
        jTableLivros.setEditingRow(0);
        jTableLivros.setGridColor(new java.awt.Color(255, 255, 255));
        jTableLivros.setSelectionBackground(new java.awt.Color(51, 255, 255));
        jTableLivros.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableLivros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableLivros);
        if (jTableLivros.getColumnModel().getColumnCount() > 0) {
            jTableLivros.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableLivros.getColumnModel().getColumn(1).setPreferredWidth(7);
            jTableLivros.getColumnModel().getColumn(5).setPreferredWidth(2);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 580, 330));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanelEmprestimo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelEmprestimo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fazer Emprestimo");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanelEmprestimo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jPanelVisualizar.setBackground(new java.awt.Color(0, 0, 0));
        jPanelVisualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Visualizar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanelVisualizar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 171, 30));

        jPanelReservar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelReservarLayout = new javax.swing.GroupLayout(jPanelReservar);
        jPanelReservar.setLayout(jPanelReservarLayout);
        jPanelReservarLayout.setHorizontalGroup(
            jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelReservarLayout.setVerticalGroup(
            jPanelReservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanelReservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanelVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelReservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 566, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanelAdcionar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Adcionar");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdcionarLayout = new javax.swing.GroupLayout(jPanelAdcionar);
        jPanelAdcionar.setLayout(jPanelAdcionarLayout);
        jPanelAdcionarLayout.setHorizontalGroup(
            jPanelAdcionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelAdcionarLayout.setVerticalGroup(
            jPanelAdcionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelExcluir.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Excluir");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExcluirLayout = new javax.swing.GroupLayout(jPanelExcluir);
        jPanelExcluir.setLayout(jPanelExcluirLayout);
        jPanelExcluirLayout.setHorizontalGroup(
            jPanelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelExcluirLayout.setVerticalGroup(
            jPanelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelEditar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditarLayout = new javax.swing.GroupLayout(jPanelEditar);
        jPanelEditar.setLayout(jPanelEditarLayout);
        jPanelEditarLayout.setHorizontalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelEditarLayout.setVerticalGroup(
            jPanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelPesquisar.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pesquisar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanelAdcionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAdcionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, -1, -1));

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Config_Jpanel(Smenu_Livros, new Smenu_Livro_Cadastrar());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (jTableLivros.getSelectedRow() > -1) {
            try {
                livro.executarAcao(Livro.Action.EXCLUIR, jTableLivros.getSelectedRow());
                updateListLivro();
            } catch (Exception ex) {
                Logger.getLogger(Smenu_Livros.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (jTableLivros.getSelectedRow() > -1) {
            Smenu_Livro_Cadastrar cadastro_livro = new Smenu_Livro_Cadastrar();
            new Config_Jpanel(Smenu_Livros, cadastro_livro);
            cadastro_livro.viewLivro(jTableLivros.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (jTableLivros.getSelectedRow() > -1) {
            Smenu_Livro_Cadastrar cadastro_livro = new Smenu_Livro_Cadastrar();
            new Config_Jpanel(Smenu_Livros, cadastro_livro);
            cadastro_livro.viewLivro(jTableLivros.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        setAllColor(jPanelAdcionar);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        setAllColor(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        setAllColor(jPanelEditar);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        setAllColor(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        setAllColor(jPanelExcluir);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
         setAllColor(null);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        setAllColor(jPanelPesquisar);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        setAllColor(null);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        setAllColor(jPanelEmprestimo);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       setAllColor(null);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        setAllColor(jPanelReservar);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
         setAllColor(null);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       setAllColor(jPanelVisualizar);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
          setAllColor(null);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          if (jTableLivros.getSelectedRow() > -1) {
            Smenu_Emprestimos_R emprestimos = new Smenu_Emprestimos_R();
            new Config_Jpanel(Smenu_Livros, emprestimos);
            emprestimos.atualizarInformaçõesDoLivroSelecionado(jTableLivros.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (jTableLivros.getSelectedRow() > -1) {
            Smenu_Reservas_R reservas = new Smenu_Reservas_R();
            new Config_Jpanel(Smenu_Livros, reservas);
            reservas.atualizarInformaçõesDoLivroSelecionado(jTableLivros.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    public void getLivros() throws Exception {
        model = (DefaultTableModel) jTableLivros.getModel();
        model.setNumRows(0);
        //for (int i = 0; i < Banco.get().lerLivro().size(); i++) {
        //  String[] listLivro = Banco.get().lerLivro().get(i).split(";");
        // model.addRow(listLivro);
        //  }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Smenu_Livros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelAdcionar;
    private javax.swing.JPanel jPanelEditar;
    private javax.swing.JPanel jPanelEmprestimo;
    private javax.swing.JPanel jPanelExcluir;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JPanel jPanelReservar;
    private javax.swing.JPanel jPanelVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
