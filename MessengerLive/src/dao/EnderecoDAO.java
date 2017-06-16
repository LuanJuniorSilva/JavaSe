/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.EnderecoVO;
import models.UsuarioVO;
import persistence.ConnectDB;

/**
 *
 * @author Luan Junior
 */
public class EnderecoDAO {
    public void cadastrarEndereco(EnderecoVO eVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "INSERT INTO endereco (pais,estado,cidade,bairro,rua,cep,usuario) VALUES (?,?,?,?,?,?,?);";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, eVO.getPais());
           pstmt.setString(2, eVO.getEstado());
           pstmt.setString(3, eVO.getCidade());
           pstmt.setString(4, eVO.getBairro());
           pstmt.setString(5, eVO.getRua());
           pstmt.setString(6, eVO.getCep());
           pstmt.setLong(7, eVO.getUsuario().getIdUsuario());
           pstmt.execute();
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
        
    }//fecha método
    
     public EnderecoVO buscarEnderecoPorEmail(String email) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT * FROM usuario u INNER JOIN endereco e ON u.id_usuario = e.usuario WHERE email = ?";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, email);
           ResultSet rs = pstmt.executeQuery();
           //ArrayList<UsuarioVO> usuario = new ArrayList<>();
           UsuarioVO uVO = new UsuarioVO();
           EnderecoVO eVO = new EnderecoVO();
            while (rs.next()) {
      
                uVO.setIdUsuario(rs.getLong("id_usuario"));
                uVO.setNomeCompleto(rs.getString("nome"));
                uVO.setEmail(rs.getString("email"));
                uVO.setSenha(rs.getString("senha"));
                uVO.setTelefone(rs.getString("telefone"));
                uVO.setDataNasc(rs.getString("data_nasc"));
                uVO.setSexo(rs.getString("sexo"));
                uVO.setEstadoCivil(rs.getString("estado_civil"));
                
                eVO.setIdEndereco(rs.getLong("id_endereco"));
                eVO.setPais(rs.getString("pais"));
                eVO.setEstado(rs.getString("estado"));
                eVO.setCidade(rs.getString("cidade"));
                eVO.setBairro(rs.getString("bairro"));
                eVO.setRua(rs.getString("rua"));
                eVO.setCep(rs.getString("cep"));
                
           }//Fecha while
            eVO.setUsuario(uVO);
            return eVO;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
     
     public void editarEndereco(EnderecoVO eVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "UPDATE endereco SET pais = ?,estado = ?,cidade = ?,bairro = ?,rua = ?,cep = ? WHERE id_endereco = ?;";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, eVO.getPais());
           pstmt.setString(2, eVO.getEstado());
           pstmt.setString(3, eVO.getCidade());
           pstmt.setString(4, eVO.getBairro());
           pstmt.setString(5, eVO.getRua());
           pstmt.setString(6, eVO.getCep());
           pstmt.setLong(7, eVO.getIdEndereco());
           pstmt.executeUpdate();
        } catch (Exception e) {
            throw new SQLException("Erro ao editar Endereço! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
        
    }//fecha método
    
}
