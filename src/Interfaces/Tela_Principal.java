/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JPanel;

/**
 *
 * @author Jhonatan Santos
 */
public class Tela_Principal extends javax.swing.JFrame {

    boolean livros = true, emprestimos = true, reservas = true, devolvidos = true, contas = true;

    public Tela_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void setColorStatus() {
        livros = true;
        emprestimos = true;
        reservas = true;
        devolvidos = true;
        contas = true;
        setAllColor();
    }

    public void setAllColor() {
        jPanelLivros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReservas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDevolvidos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContas.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void resetColor(JPanel dados) {
        dados.setBackground(new java.awt.Color(255, 255, 255));

    }

    public void setColor(JPanel dados) {
        dados.setBackground(new java.awt.Color(51, 255, 255));
    }

    public void setColor2(JPanel dados) {
        dados.setBackground(new java.awt.Color(204, 204, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelLivros = new javax.swing.JPanel();
        jLabelLivro = new javax.swing.JLabel();
        jPanelEmprestimos = new javax.swing.JPanel();
        jLabelEmprestimo = new javax.swing.JLabel();
        jPanelReservas = new javax.swing.JPanel();
        jLabelReserva = new javax.swing.JLabel();
        jPanelDevolvidos = new javax.swing.JPanel();
        jLabelDevolvidos = new javax.swing.JLabel();
        jPanelContas = new javax.swing.JPanel();
        jLabelContas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Senai");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLivros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLivros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLivro.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLivro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Livros.png"))); // NOI18N
        jLabelLivro.setText("Livros");
        jLabelLivro.setToolTipText("Livros");
        jLabelLivro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelLivro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelLivro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLivroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLivroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLivroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelLivrosLayout = new javax.swing.GroupLayout(jPanelLivros);
        jPanelLivros.setLayout(jPanelLivrosLayout);
        jPanelLivrosLayout.setHorizontalGroup(
            jPanelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelLivrosLayout.setVerticalGroup(
            jPanelLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLivrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmprestimos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseExited(evt);
            }
        });

        jLabelEmprestimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmprestimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Emprestimos.png"))); // NOI18N
        jLabelEmprestimo.setText("Emprestimos");
        jLabelEmprestimo.setToolTipText("Emprestimos");
        jLabelEmprestimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelEmprestimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmprestimoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEmprestimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEmprestimoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelEmprestimosLayout = new javax.swing.GroupLayout(jPanelEmprestimos);
        jPanelEmprestimos.setLayout(jPanelEmprestimosLayout);
        jPanelEmprestimosLayout.setHorizontalGroup(
            jPanelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelEmprestimosLayout.setVerticalGroup(
            jPanelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        jPanelReservas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReservas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseExited(evt);
            }
        });

        jLabelReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Reservas.png"))); // NOI18N
        jLabelReserva.setText("Reservas");
        jLabelReserva.setToolTipText("Reservas");
        jLabelReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReservaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelReservasLayout = new javax.swing.GroupLayout(jPanelReservas);
        jPanelReservas.setLayout(jPanelReservasLayout);
        jPanelReservasLayout.setHorizontalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addComponent(jLabelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelReservasLayout.setVerticalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addComponent(jLabelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelDevolvidos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDevolvidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDevolvidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseExited(evt);
            }
        });

        jLabelDevolvidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDevolvidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDevolvidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Devolucao.png"))); // NOI18N
        jLabelDevolvidos.setText("Devolvidos");
        jLabelDevolvidos.setToolTipText("Devolvidos");
        jLabelDevolvidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelDevolvidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelDevolvidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDevolvidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDevolvidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDevolvidosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelDevolvidosLayout = new javax.swing.GroupLayout(jPanelDevolvidos);
        jPanelDevolvidos.setLayout(jPanelDevolvidosLayout);
        jPanelDevolvidosLayout.setHorizontalGroup(
            jPanelDevolvidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDevolvidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDevolvidosLayout.setVerticalGroup(
            jPanelDevolvidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDevolvidos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelContas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelLivrosMouseExited(evt);
            }
        });

        jLabelContas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelContas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Perfil.png"))); // NOI18N
        jLabelContas.setText("Contas");
        jLabelContas.setToolTipText("Contas");
        jLabelContas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelContas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelContasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelContasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelContasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelContasLayout = new javax.swing.GroupLayout(jPanelContas);
        jPanelContas.setLayout(jPanelContasLayout);
        jPanelContasLayout.setHorizontalGroup(
            jPanelContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelContas, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanelContasLayout.setVerticalGroup(
            jPanelContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelContas, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelDevolvidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelEmprestimos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelLivros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelDevolvidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanelContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Joao Carlos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 95, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setToolTipText("");
        jPanelPrincipal.setLayout(new javax.swing.BoxLayout(jPanelPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 8, 610, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("Livros");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Emprestimos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Devolvidos");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Contas");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Sobre");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContasMouseClicked
        new Config_Jpanel(jPanelPrincipal, new Smenu_Contas());
        setColorStatus();
        setColor(jPanelContas);
        contas = false;
    }//GEN-LAST:event_jLabelContasMouseClicked

    private void jLabelDevolvidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDevolvidosMouseClicked
        new Config_Jpanel(jPanelPrincipal, new Smenu_Devolvidos());
        setColorStatus();
        setColor(jPanelDevolvidos);
        devolvidos = false;
    }//GEN-LAST:event_jLabelDevolvidosMouseClicked

    private void jLabelReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservaMouseClicked
        new Config_Jpanel(jPanelPrincipal, new Smenu_Reservas());
        setColorStatus();
        setColor(jPanelReservas);
        reservas = false;
    }//GEN-LAST:event_jLabelReservaMouseClicked

    private void jLabelEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmprestimoMouseClicked
        new Config_Jpanel(jPanelPrincipal, new Smenu_Emprestimos());
        setColorStatus();
        setColor(jPanelEmprestimos);
        emprestimos = false;
    }//GEN-LAST:event_jLabelEmprestimoMouseClicked

    private void jLabelLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLivroMouseClicked
        new Config_Jpanel(jPanelPrincipal, new Smenu_Livros());
        setColorStatus();
        setColor(jPanelLivros);
        livros = false;
    }//GEN-LAST:event_jLabelLivroMouseClicked

    private void jPanelLivrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLivrosMouseEntered

    }//GEN-LAST:event_jPanelLivrosMouseEntered

    private void jPanelLivrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLivrosMouseExited

    }//GEN-LAST:event_jPanelLivrosMouseExited

    private void jLabelLivroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLivroMouseEntered
        if (livros) {
            setColor2(jPanelLivros);
        }
    }//GEN-LAST:event_jLabelLivroMouseEntered

    private void jLabelLivroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLivroMouseExited
        if (livros) {
            resetColor(jPanelLivros);
        }
    }//GEN-LAST:event_jLabelLivroMouseExited

    private void jLabelEmprestimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmprestimoMouseEntered
        if (emprestimos) {
            setColor2(jPanelEmprestimos);
        }
    }//GEN-LAST:event_jLabelEmprestimoMouseEntered

    private void jLabelEmprestimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmprestimoMouseExited
        if (emprestimos) {
            resetColor(jPanelEmprestimos);
        }
    }//GEN-LAST:event_jLabelEmprestimoMouseExited

    private void jLabelReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservaMouseEntered
        if (reservas) {
            setColor2(jPanelReservas);
        }
    }//GEN-LAST:event_jLabelReservaMouseEntered

    private void jLabelReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservaMouseExited
        if (reservas) {
            resetColor(jPanelReservas);
        }
    }//GEN-LAST:event_jLabelReservaMouseExited

    private void jLabelDevolvidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDevolvidosMouseEntered
        if (devolvidos) {
            setColor2(jPanelDevolvidos);
        }
    }//GEN-LAST:event_jLabelDevolvidosMouseEntered

    private void jLabelDevolvidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDevolvidosMouseExited
        if (devolvidos) {
            resetColor(jPanelDevolvidos);
        }
    }//GEN-LAST:event_jLabelDevolvidosMouseExited

    private void jLabelContasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContasMouseEntered
        if (contas) {
            setColor2(jPanelContas);
        }
    }//GEN-LAST:event_jLabelContasMouseEntered

    private void jLabelContasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContasMouseExited
        if (contas) {
            resetColor(jPanelContas);
        }
    }//GEN-LAST:event_jLabelContasMouseExited

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelContas;
    private javax.swing.JLabel jLabelDevolvidos;
    private javax.swing.JLabel jLabelEmprestimo;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JLabel jLabelReserva;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelContas;
    private javax.swing.JPanel jPanelDevolvidos;
    private javax.swing.JPanel jPanelEmprestimos;
    private javax.swing.JPanel jPanelLivros;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelReservas;
    // End of variables declaration//GEN-END:variables
}
