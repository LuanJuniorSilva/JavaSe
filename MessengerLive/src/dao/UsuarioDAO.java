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
import java.util.ArrayList;
import models.EnderecoVO;
import models.UsuarioVO;
import persistence.ConnectDB;

/**
 *
 * @author Luan Junior
 */
public class UsuarioDAO {
    public void cadastrarUsuario(UsuarioVO uVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "INSERT INTO usuario (nome,email,senha,telefone,data_nasc,sexo,estado_civil,data_cadastro,status) VALUES (?,?,?,?,?,?,?,NOW(),?);";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, uVO.getNomeCompleto());
           pstmt.setString(2, uVO.getEmail());
           pstmt.setString(3, uVO.getSenha());
           pstmt.setString(4, uVO.getTelefone());
           pstmt.setString(5, uVO.getDataNasc());
           pstmt.setString(6, uVO.getSexo());
           pstmt.setString(7, uVO.getEstadoCivil());
           pstmt.setString(8, uVO.getStatus());
           pstmt.execute();
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
        
    }//fecha método
    
    public boolean logarSistema(UsuarioVO uVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT COUNT(*) FROM usuario WHERE email = ? AND senha = ?";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, uVO.getEmail());
           pstmt.setString(2, uVO.getSenha());
           ResultSet rs = pstmt.executeQuery();
           int retorno = -2;
            while(rs.next()){
                retorno = rs.getInt(1);
            }
            if(retorno == 1){
                stat.close();
                return true;
            }else{
                return false;
            }
          
        } catch (Exception e) {
            throw new SQLException("Erro ao logar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
    public boolean verificaEmail(String email) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT COUNT(*) FROM usuario WHERE email = ?";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, email);
           ResultSet rs = pstmt.executeQuery();
           int retorno = -2;
            while(rs.next()){
                retorno = rs.getInt(1);
            }
            if(retorno == 1){
                stat.close();
                return true;
            }else{
                return false;
            }
          
        } catch (Exception e) {
            throw new SQLException("Erro ao verificar email! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
      public boolean verificaTelefone(String telefone) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT COUNT(*) FROM usuario WHERE telefone = ?";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, telefone);
           ResultSet rs = pstmt.executeQuery();
           int retorno = -2;
            while(rs.next()){
                retorno = rs.getInt(1);
            }
            if(retorno == 1){
                stat.close();
                return true;
            }else{
                return false;
            }
          
        } catch (Exception e) {
            throw new SQLException("Erro ao verificar telefone! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
     public UsuarioVO buscarUsuarioPorEmail(String email) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT * FROM usuario WHERE email = ?";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, email);
           ResultSet rs = pstmt.executeQuery();
           UsuarioVO uVO = new UsuarioVO();
            while (rs.next()) {
      
                uVO.setIdUsuario(rs.getLong("id_usuario"));
                uVO.setNomeCompleto(rs.getString("nome"));
                uVO.setFoto(rs.getBytes("foto"));
                uVO.setEmail(rs.getString("email"));
                uVO.setSenha(rs.getString("senha"));
                uVO.setTelefone(rs.getString("telefone"));
                uVO.setDataNasc(rs.getString("data_nasc"));
                uVO.setSexo(rs.getString("sexo"));
                uVO.setEstadoCivil(rs.getString("estado_civil"));
                uVO.setDataCad(rs.getString("data_cadastro"));
           }//Fecha while
            return uVO;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar Usuario! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
     
     public ArrayList<UsuarioVO> buscarUsuarios(String email) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT * FROM usuario WHERE email <> ? AND status = 'Online' AND email <> 'admin@gmail.com'";
           pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, email);
           ResultSet rs = pstmt.executeQuery();
           ArrayList<UsuarioVO> usuarios = new ArrayList<>();
           
            while (rs.next()) {
                UsuarioVO uVO = new UsuarioVO();
                
                uVO.setIdUsuario(rs.getLong("id_usuario"));
                uVO.setNomeCompleto(rs.getString("nome"));
                uVO.setFoto(rs.getBytes("foto"));
                uVO.setEmail(rs.getString("email"));
                uVO.setSenha(rs.getString("senha"));
                uVO.setTelefone(rs.getString("telefone"));
                uVO.setDataNasc(rs.getString("data_nasc"));
                uVO.setSexo(rs.getString("sexo"));
                uVO.setEstadoCivil(rs.getString("estado_civil"));
                
                usuarios.add(uVO);
           }//Fecha while
            return usuarios;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao buscar Usuarios! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
     
       public ArrayList<EnderecoVO> mostrarUsuarios() throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT u.id_usuario,u.nome,u.email,u.data_cadastro,u.telefone,e.estado,e.cidade,e.bairro FROM usuario u INNER JOIN endereco e ON u.id_usuario = e.usuario WHERE u.email <> 'admin@gmail.com';";
           pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           ArrayList<EnderecoVO> generico = new ArrayList<>();
           
            while (rs.next()) {
                UsuarioVO uVO = new UsuarioVO();
                EnderecoVO eVO = new EnderecoVO();
                
                uVO.setIdUsuario(rs.getLong("id_usuario"));
                uVO.setNomeCompleto(rs.getString("nome"));
                uVO.setEmail(rs.getString("email"));
                uVO.setDataCad(rs.getString("data_cadastro"));
                uVO.setTelefone(rs.getString("telefone"));
                eVO.setUsuario(uVO);
                eVO.setEstado(rs.getString("estado"));
                eVO.setCidade(rs.getString("cidade"));
                eVO.setBairro(rs.getString("bairro"));
                
                
                generico.add(eVO);
           }//Fecha while
            return generico;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao listar Usuarios! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
       
     public ArrayList<EnderecoVO> filtrarUsuarios(String query) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
           String sql = "SELECT u.id_usuario,u.nome,u.email,u.data_cadastro,u.telefone,e.estado,e.cidade,e.bairro FROM usuario u INNER JOIN endereco e ON u.id_usuario = e.usuario WHERE u.email <> 'admin@gmail.com' "+query;
           pstmt = conn.prepareStatement(sql);
           ResultSet rs = pstmt.executeQuery();
           ArrayList<EnderecoVO> generico = new ArrayList<>();
           
            while (rs.next()) {
                UsuarioVO uVO = new UsuarioVO();
                EnderecoVO eVO = new EnderecoVO();
                
                uVO.setIdUsuario(rs.getLong("id_usuario"));
                uVO.setNomeCompleto(rs.getString("nome"));
                uVO.setEmail(rs.getString("email"));
                uVO.setDataCad(rs.getString("data_cadastro"));
                uVO.setTelefone(rs.getString("telefone"));
                eVO.setUsuario(uVO);
                eVO.setEstado(rs.getString("estado"));
                eVO.setCidade(rs.getString("cidade"));
                eVO.setBairro(rs.getString("bairro"));
                
                
                generico.add(eVO);
           }//Fecha while
            return generico;
          
        } catch (Exception e) {
            throw new SQLException("Erro ao listar Usuarios! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
    public void alterarPerfil(UsuarioVO uVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE usuario SET nome = ?,email = ?, telefone = ?, estado_civil = ? WHERE id_usuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, uVO.getNomeCompleto());
            pstmt.setString(2, uVO.getEmail());
            pstmt.setString(3, uVO.getTelefone());
            pstmt.setString(4, uVO.getEstadoCivil());
            pstmt.setLong(5, uVO.getIdUsuario());
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new SQLException("Erro ao Editar Perfil do Usuário! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
    public void alterarSenha(UsuarioVO uVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE usuario SET senha = ? WHERE id_usuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, uVO.getSenha());
            pstmt.setLong(2, uVO.getIdUsuario());
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new SQLException("Erro ao Alterar Senha do Usuário! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
     public void alterarStatus(UsuarioVO uVO) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE usuario SET status = ? WHERE email = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, uVO.getStatus());
            pstmt.setString(2, uVO.getEmail());
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new SQLException("Erro ao Deslogar Usuário! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha método
    
    public void adicionarFoto(UsuarioVO u) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
            String sql = "UPDATE usuario SET foto = ? WHERE id_usuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setBytes(1, u.getFoto());
            pstmt.setLong(2, u.getIdUsuario());
            pstmt.executeUpdate();
        }catch (Exception e) {
            throw new SQLException("Erro ao Adicionar Foto do Usuário! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha metodo para adc foto
    
     public void excluirConta(long id) throws SQLException{
        Connection conn = ConnectDB.getConexao();
        Statement stat = conn.createStatement();
        PreparedStatement pstmt = null;
        try {
            String sql1 = "DELETE FROM endereco WHERE usuario = ?";
            String sql2 = "DELETE FROM usuario WHERE id_usuario = ?";
            pstmt = conn.prepareStatement(sql1);
            pstmt.setLong(1, id);
            pstmt.execute();
            pstmt = conn.prepareStatement(sql2);
            pstmt.setLong(1, id);
            pstmt.execute();
        }catch (Exception e) {
            throw new SQLException("Erro ao Excluir Usuário! "+e.getMessage());
        }finally{
            conn.close();
            stat.close();
        }
    }//fecha metodo
    
    
}
