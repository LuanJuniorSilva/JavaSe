/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.sun.glass.events.KeyEvent;
import core.Security;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.UsuarioVO;
import services.ServicesFactory;
import services.UsuarioServices;

/**
 *
 * @author Luan Junior
 */
public class GUIExcluirConta extends javax.swing.JInternalFrame {
    private UsuarioVO user;
    /**
     * Creates new form GUIExcluirConta
     */
    public GUIExcluirConta(UsuarioVO u) {
        initComponents();
        this.user = u;
        if(user.getSexo().equalsIgnoreCase("Masculino")){
            jlSexo.setText("Senhor");
        }else{
            jlSexo.setText("Senhor");
        }
        jlNome.setText(user.getNomeCompleto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSexo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlTexto1 = new javax.swing.JLabel();
        jlTexto2 = new javax.swing.JLabel();
        jlTexto3 = new javax.swing.JLabel();
        jpSenha = new javax.swing.JPasswordField();
        jbExcluirConta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Configuração da Conta - Excluir Conta Permanente");

        jlSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSexo.setText("Seu");

        jlNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlNome.setText("Luan Júnior");

        jlTexto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTexto1.setText("Quando sua conta é excluida nós excluimos permanentemente seus dados do sistema");

        jlTexto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlTexto2.setText("Se você quiser voltar futuramente esse chat estará disponivel pra você ");

        jlTexto3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTexto3.setForeground(new java.awt.Color(255, 0, 0));
        jlTexto3.setText("Digite sua Senha para que possamos excluir Sua Conta");

        jpSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpSenhaKeyPressed(evt);
            }
        });

        jbExcluirConta.setBackground(new java.awt.Color(255, 0, 0));
        jbExcluirConta.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluirConta.setText("Excluir Conta");
        jbExcluirConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirContaActionPerformed(evt);
            }
        });
        jbExcluirConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbExcluirContaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jlTexto2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jlTexto1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jlTexto3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jbExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jlSexo)
                        .addGap(18, 18, 18)
                        .addComponent(jlNome)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jlSexo))
                .addGap(18, 18, 18)
                .addComponent(jlTexto1)
                .addGap(18, 18, 18)
                .addComponent(jlTexto2)
                .addGap(18, 18, 18)
                .addComponent(jlTexto3)
                .addGap(18, 18, 18)
                .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirConta() throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException{
        String senhaDigitada = Security.cryptografar(String.valueOf(jpSenha.getPassword()));
        if(user.getSenha().equalsIgnoreCase(senhaDigitada)){
            UsuarioServices us = ServicesFactory.getUsuarioServices();
            us.excluirConta(user.getIdUsuario());
            GUILogin janelaLogin = new GUILogin();
            janelaLogin.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Senhas Incorreta, Por Favor Digite a Senha Correta!");
        }
    }
    
    private void jbExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirContaActionPerformed
        try {
            try {
                excluirConta();
            } catch (SQLException ex) {
            }
        } catch (NoSuchAlgorithmException ex) {
        } catch (UnsupportedEncodingException ex) {
        }
    }//GEN-LAST:event_jbExcluirContaActionPerformed

    private void jbExcluirContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbExcluirContaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                try {
                    excluirConta();
                } catch (SQLException ex) {
                }
            } catch (NoSuchAlgorithmException ex) {
            } catch (UnsupportedEncodingException ex) {
            }
        }
    }//GEN-LAST:event_jbExcluirContaKeyPressed

    private void jpSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                try {
                    excluirConta();
                } catch (SQLException ex) {
                }
            } catch (NoSuchAlgorithmException ex) {
            } catch (UnsupportedEncodingException ex) {
            }
        }
    }//GEN-LAST:event_jpSenhaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbExcluirConta;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTexto1;
    private javax.swing.JLabel jlTexto2;
    private javax.swing.JLabel jlTexto3;
    private javax.swing.JPasswordField jpSenha;
    // End of variables declaration//GEN-END:variables
}
