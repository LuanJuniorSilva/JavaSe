/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.EnderecoDAO;
;
import java.sql.SQLException;
import models.EnderecoVO;


/**
 *
 * @author Luan Junior
 */
public class EnderecoServices {
     public void cadastrarEndereco(EnderecoVO e) throws SQLException{
        EnderecoDAO eDAO = new DAOFactory().getEnderecoDAO();
        eDAO.cadastrarEndereco(e);
    }
     public EnderecoVO buscarEnderecoPorEmail(String email) throws SQLException{
        EnderecoDAO eDAO = new DAOFactory().getEnderecoDAO();
        return eDAO.buscarEnderecoPorEmail(email);
    }
     public void alterarEndereco(EnderecoVO endereco) throws SQLException{
        EnderecoDAO eDAO = new DAOFactory().getEnderecoDAO();
        eDAO.editarEndereco(endereco);
    }
    
}
