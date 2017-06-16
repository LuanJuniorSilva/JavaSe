/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.MensagemGrupoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import models.MensagemGrupoVO;
import models.UsuarioVO;

/**
 *
 * @author Luan Junior
 */
public class MensagemGrupoServices {
    public void salvarMensagem(MensagemGrupoVO m) throws SQLException{
        MensagemGrupoDAO mDAO = new DAOFactory().getMensagemGrupoDAO();
        mDAO.salvarMensagem(m);
    }
    public ArrayList<UsuarioVO> mostrarMensagem() throws SQLException{
        MensagemGrupoDAO mDAO = new DAOFactory().getMensagemGrupoDAO();
        return mDAO.mostrarMensagens();
    }
    public ArrayList<UsuarioVO> filtrarMensagem(String query) throws SQLException{
        MensagemGrupoDAO mDAO = new DAOFactory().getMensagemGrupoDAO();
        return mDAO.filtrarMensagens(query);
    }
    public void excluirMsg(long id) throws SQLException{
        MensagemGrupoDAO mDAO = new DAOFactory().getMensagemGrupoDAO();
        mDAO.excluirMsg(id);
    }
}
