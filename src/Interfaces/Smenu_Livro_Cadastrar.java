/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Livro;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan Santos
 */
public class Smenu_Livro_Cadastrar extends javax.swing.JPanel {

    Livro livro = new Livro();
    DefaultTableModel model;
    private int rowSelect;
    BufferedImage imagem;
    File arquivo;
    private static Smenu_Livro_Cadastrar cadastro_Livro;

    public Smenu_Livro_Cadastrar() {
        initComponents();
        updateListLivro();
        jScrollPane1.getViewport().setOpaque(false);

    }

    public static Smenu_Livro_Cadastrar get() {
        if (cadastro_Livro == null) {
            cadastro_Livro = new Smenu_Livro_Cadastrar();
        }
        return cadastro_Livro;
    }

    public void viewLivro(int dados) {
        try {
            this.rowSelect = dados;
            ArrayList<String> listLivro = livro.getListLivros();
            String[] listLivros = listLivro.get(rowSelect).split(";");
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

    public void updateListLivro() {
        try {
            ArrayList<String> listLivros = livro.getListLivros();
            model = (DefaultTableModel) jTableLivros.getModel();
            model.setNumRows(0);
            for (int i = 0; i < listLivros.size(); i++) {
                String[] listLivro = listLivros.get(i).split(";");
                model.addRow(new Object[]{(listLivro[0]), listLivro[1], listLivro[2], listLivro[3], listLivro[7]});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Atualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*public void setAllColor(JPanel dados) {
        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        if (dados != null) {
            dados.setBackground(new java.awt.Color(102, 102, 102));
        }
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastro_Livros = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Conteiner_Livro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextPaginas = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jTextEdicao = new javax.swing.JTextField();
        jTextAno = new javax.swing.JTextField();
        jTextTitulo = new javax.swing.JTextField();
        jTextAutor = new javax.swing.JTextField();
        jTextCodigo = new javax.swing.JTextField();
        jTextEditora = new javax.swing.JTextField();
        jTextQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(605, 448));

        cadastro_Livros.setPreferredSize(new java.awt.Dimension(605, 430));
        cadastro_Livros.setLayout(new javax.swing.BoxLayout(cadastro_Livros, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(605, 448));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(null);

        jPanel10.setBackground(java.awt.SystemColor.controlShadow);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Livro");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(1, 1, 1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Exemplar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Conteiner_Livro.setLayout(new javax.swing.BoxLayout(Conteiner_Livro, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(null);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, -1));

        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livro.jpg"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFotoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 140));

        jTextEdicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEdicao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edição", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 84, -1));

        jTextAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 84, -1));

        jTextTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Titulo do Livro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 350, -1));

        jTextAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 230, -1));

        jTextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Codigo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 102, -1));

        jTextEditora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Editora", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 223, -1));

        jTextQuantidade.setEditable(false);
        jTextQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextQuantidade.setText("0");
        jTextQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Qtd Exemplares", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jTextQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 130, -1));

        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Editora", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableLivros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 570, 150));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Visualizar");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alterar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastrar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Excluir");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Limpar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        Conteiner_Livro.add(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Conteiner_Livro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Conteiner_Livro, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );

        cadastro_Livros.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro_Livros, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro_Livros, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFotoMouseClicked
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);
        Image image = null;

        if (res == JFileChooser.APPROVE_OPTION) {
            arquivo = fc.getSelectedFile();

            try {
                //livro.setImagemLivro(arquivo.getAbsolutePath(), "2018");
                image = ImageIO.read(fc.getSelectedFile());
                jLabelFoto.setIcon(new ImageIcon(image.getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT)));

            } catch (Exception ex) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_jLabelFotoMouseClicked

    private void jTextAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAnoActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        viewLivro(jTableLivros.getSelectedRow());
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        //setAllColor(jPanel7);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        //setAllColor(null);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (jTableLivros.getSelectedRow() > -1) {
            try {
                livro.setCodigo(jTextCodigo.getText());
                livro.setTitulo(jTextTitulo.getText());
                livro.setEditora(jTextEditora.getText());
                livro.setAutor(jTextAutor.getText());
                livro.setEdicao(jTextEdicao.getText());
                livro.setAno(jTextAno.getText());
                livro.setPaginas(jTextPaginas.getText());
                livro.setQuantidade(jTextQuantidade.getText());
                livro.setCaminhoImagem(arquivo.getAbsolutePath());
                livro.executarAcao(Livro.Action.EDITAR, jTableLivros.getSelectedRow());
                updateListLivro();
            } catch (Exception ex) {
                Logger.getLogger(Smenu_Livros.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Livro foi Selecionado!", "Visualizar Livros", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // setAllColor(jPanel8);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        //setAllColor(null);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            livro.setCodigo(jTextCodigo.getText());
            livro.setTitulo(jTextTitulo.getText());
            livro.setEditora(jTextEditora.getText());
            livro.setAutor(jTextAutor.getText());
            livro.setEdicao(jTextEdicao.getText());
            livro.setAno(jTextAno.getText());
            livro.setPaginas(jTextPaginas.getText());
            livro.setQuantidade(jTextQuantidade.getText());
            livro.setCaminhoImagem(arquivo.getAbsolutePath());
            livro.executarAcao(Livro.Action.ADCIONAR, 0);
            clean();
            updateListLivro();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Adcionar Livro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // setAllColor(jPanel9);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // setAllColor(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            // rowSelect = jTableLivros.getSelectedRow();
            livro.executarAcao(Livro.Action.EXCLUIR, jTableLivros.getSelectedRow());
            updateListLivro();
            clean();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Excluir Livro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        //setAllColor(jPanel11);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        //setAllColor(null);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        clean();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        //setAllColor(jPanel12);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        //setAllColor(null);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            new Config_Jpanel(Conteiner_Livro, new Smenu_Exemplar());
            jPanel10.setBackground(new java.awt.Color(0, 0, 0));
            jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        } catch (IOException ex) {
            Logger.getLogger(Smenu_Livro_Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Config_Jpanel(cadastro_Livros, new Smenu_Livro_Cadastrar());
        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

    }//GEN-LAST:event_jLabel1MouseClicked
    public void clean() {
        jTextTitulo.setText("");
        jTextCodigo.setText("");
        jTextEditora.setText("");
        jTextAutor.setText("");
        jTextEdicao.setText("");
        jTextAno.setText("");
        jTextPaginas.setText("");
        jTextQuantidade.setText("");
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livro.jpg")));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Conteiner_Livro;
    private javax.swing.JPanel cadastro_Livros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextEdicao;
    private javax.swing.JTextField jTextEditora;
    private javax.swing.JTextField jTextPaginas;
    private javax.swing.JTextField jTextQuantidade;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
