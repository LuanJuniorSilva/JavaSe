/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import models.EnderecoVO;
import models.UsuarioVO;

/**
 *
 * @author Luan Junior
 */
public class UsuarioServices {
    public void cadastrarUsuario(UsuarioVO u) throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.cadastrarUsuario(u);
    }
    public boolean logarSistema(UsuarioVO u)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.logarSistema(u);
    }
    public UsuarioVO buscarUsuarioPorEmail(String email)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.buscarUsuarioPorEmail(email);
    }
    public void alterarPerfil(UsuarioVO u)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.alterarPerfil(u);
    }
    public void alterarSenha(UsuarioVO u)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.alterarSenha(u);
    }
    public boolean verificaEmail(String email)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.verificaEmail(email);
    }
    public boolean verificaTelefone(String telefone)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.verificaTelefone(telefone);
    }
    public void adicionarFoto(UsuarioVO u)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.adicionarFoto(u);
    }
    public ArrayList<UsuarioVO> buscarUsuarios(String email)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.buscarUsuarios(email);
    }
    public void alterarStatus(UsuarioVO u)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.alterarStatus(u);
    }
    public void excluirConta(long id)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        uDAO.excluirConta(id);
    }
    public ArrayList<EnderecoVO> mostrarUsuarios()throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.mostrarUsuarios();
    }
    public ArrayList<EnderecoVO> filtrarUsuarios(String query)throws SQLException{
        UsuarioDAO uDAO = new DAOFactory().getUsuarioDAO();
        return uDAO.filtrarUsuarios(query);
    }
    
}
