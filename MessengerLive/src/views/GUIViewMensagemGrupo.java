/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.UsuarioVO;
import services.MensagemGrupoServices;
import services.ServicesFactory;


/**
 *
 * @author Luan Junior
 */
public class GUIViewMensagemGrupo extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID","Usuário", "Conversa", "Data"});
    
    
    /** Creates new form GUIViewMensagemGrupo */
    public GUIViewMensagemGrupo() {
        initComponents();
        
        preencherTabela();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableMensagensGP = new javax.swing.JTable();
        jtFiltro = new javax.swing.JTextField();
        jlPesq = new javax.swing.JLabel();
        jcomboFiltro = new javax.swing.JComboBox<>();
        jbAtualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tabela de Mensagens do Grupo");

        jtableMensagensGP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Usuário", "Conversa", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableMensagensGP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableMensagensGP);

        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });

        jlPesq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlPesq.setText("Pesquisar Por:");

        jcomboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Mensagem" }));

        jbAtualizar.setText("Atualizar");
        jbAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jbAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAtualizarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jButton1.setText("Excluir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jlPesq)
                .addGap(33, 33, 33)
                .addComponent(jcomboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesq))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparTabela() {
        dtm.setNumRows(0);
    }
    
     private void preencherTabela() {
        try {
            
            MensagemGrupoServices ms = ServicesFactory.getMensagemGrupoServices();
            
            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<UsuarioVO> m = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            m = ms.mostrarMensagem();

            /* Limpando qualquer dado existente 
             na tabela */
            limparTabela();

            /* For que preenche o modelo de tabela (dtm) buscando 
               dados do ArrayList chamado p. */
            for (int i = 0; i < m.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(m.get(i).getMensagem().getIdMensagem()),
                    String.valueOf(m.get(i).getNomeCompleto()),
                    String.valueOf(m.get(i).getMensagem().getMensagem()),
                    String.valueOf(m.get(i).getMensagem().getData())
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtableMensagensGP.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }//fecha metodo
     
     private void buscarFiltro() {
        try {
            /* Se o text field não estiver vazio ele busca! */
            if (!jtFiltro.getText().isEmpty()) {
                MensagemGrupoServices ms = ServicesFactory.getMensagemGrupoServices();
               
                /* Buscando o valor da JComboBox. O método getSelectedItem
                    devolve um Object selecionado na JCombo */
                String pesquisa = (String) jcomboFiltro.getSelectedItem();

                String query;
       
                if(pesquisa.equals("ID")){
                    query = "AND m.id_msg_grupo = "+jtFiltro.getText();
                }else if(pesquisa.equals("Nome")){
                    query = "AND u.nome LIKE '%" + jtFiltro.getText() + "%' ";
                }else{
                    query = "AND m.mensagem LIKE '%" + jtFiltro.getText() + "%' ";
                }
                
                ArrayList<UsuarioVO> m = new ArrayList<>();               
                /* Buscando um ArrayList conforme o filtro que o usuário
                    solicitou. */
                m = ms.filtrarMensagem(query);
                
                //Limpando a tabela
                limparTabela();
   
              for (int i = 0; i < m.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(m.get(i).getMensagem().getIdMensagem()),
                    String.valueOf(m.get(i).getNomeCompleto()),
                    String.valueOf(m.get(i).getMensagem().getMensagem()),
                    String.valueOf(m.get(i).getMensagem().getData())
                });
            }//fecha for
                jtableMensagensGP.setModel(dtm);
            }else{
                preencherTabela();
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao buscar! " + e.getMessage());
        }//fecha catch
    }//fecha método
     
    private void deletar() {
        try {
            /* Buscando a linha que o usuário clicou */
            //int linha = jtableMensagensGP.getSelectedRow();
            int linha[] = jtableMensagensGP.getSelectedRows();
            /* Testando se o usuário selecionou alguma linha. */
            if (linha[0] != -1) {
                //Chamando os serviços para utilizar o método deletar
                MensagemGrupoServices ms = ServicesFactory.getMensagemGrupoServices();
                /* Convertendo a String idProduto para int e passando para o 
                 método deletar. */
                for(int i=0;i<linha.length;i++){
                    String idMensagem = (String) jtableMensagensGP.getValueAt(linha[i], 0);
                    ms.excluirMsg(Long.parseLong(idMensagem));
                }
                

                preencherTabela();

                //Mensagem de sucesso!
                JOptionPane.showMessageDialog(this,
                        "Usuário excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Você não selecionou nenhuma linha!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao deletar! " + e.getMessage());
        }
    }//fecha metodo
    
    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        buscarFiltro();
    }//GEN-LAST:event_jtFiltroKeyReleased

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAtualizarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            limparTabela();
        }
    }//GEN-LAST:event_jbAtualizarKeyPressed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           limparTabela();
        }
    }//GEN-LAST:event_jbLimparKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deletar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            deletar();
        }
    }//GEN-LAST:event_jButton1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcomboFiltro;
    private javax.swing.JLabel jlPesq;
    private javax.swing.JTextField jtFiltro;
    private javax.swing.JTable jtableMensagensGP;
    // End of variables declaration//GEN-END:variables

}
