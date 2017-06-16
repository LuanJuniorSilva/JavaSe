package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.MensagemGrupoVO;
import models.UsuarioVO;
import persistence.ConnectDB;

/**
 *
 * @author Luan Junior
 */
public class MensagemGrupoDAO {
    public void salvarMensagem(MensagemGrupoVO mVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "INSERT INTO mensagem_grupo(id_de,mensagem,data_msg) VALUES (?,?,NOW());";
           pstmt = conn.prepareStatement(sql);
           pstmt.setLong(1, mVO.getIdDe());
           pstmt.setString(2, mVO.getMensagem());
           pstmt.execute();
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
     public ArrayList<UsuarioVO> mostrarMensagens() throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT m.id_msg_grupo,u.nome,m.mensagem,m.data_msg FROM mensagem_grupo m INNER JOIN usuario u ON m.id_de = u.id_usuario;";
           pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           ArrayList<UsuarioVO> msg = new ArrayList<>();
           
            while (rs.next()) {
                UsuarioVO uVO = new UsuarioVO();
                MensagemGrupoVO mVO = new MensagemGrupoVO();

                uVO.setNomeCompleto(rs.getString("nome"));
                
                mVO.setIdMensagem(rs.getLong("id_msg_grupo"));
                mVO.setMensagem(rs.getString("mensagem"));
                mVO.setData(rs.getString("data_msg"));
                
                uVO.setMensagem(mVO);
                                
                msg.add(uVO);
           }//Fecha while
            return msg;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao listar Usuarios! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
     
     public ArrayList<UsuarioVO> filtrarMensagens(String query) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT m.id_msg_grupo,u.nome,m.mensagem,m.data_msg FROM mensagem_grupo m INNER JOIN usuario u ON m.id_de = u.id_usuario "+query;
           pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           ArrayList<UsuarioVO> msg = new ArrayList<>();
           
            
            while (rs.next()) {
                UsuarioVO uVO = new UsuarioVO();
                MensagemGrupoVO mVO = new MensagemGrupoVO();
              
                uVO.setNomeCompleto(rs.getString("nome"));
                
                mVO.setIdMensagem(rs.getLong("id_msg_grupo"));
                mVO.setMensagem(rs.getString("mensagem"));
                mVO.setData(rs.getString("data_msg"));
                
                uVO.setMensagem(mVO);
                                
                msg.add(uVO);
           }//Fecha while
            return msg;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao listar Usuarios! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
     
     public void excluirMsg(long id) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
         try {
            String sql = "DELETE FROM mensagem_grupo WHERE id_msg_grupo = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);
            pstmt.execute();
        }catch (Exception e) {
            throw new SQLException("Erro ao Excluir Mensagem! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha metodo 
}
