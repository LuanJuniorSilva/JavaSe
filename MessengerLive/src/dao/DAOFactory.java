/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Luan Junior
 */
public class DAOFactory {
    private static final UsuarioDAO  uDAO= new UsuarioDAO();
    
    public static UsuarioDAO getUsuarioDAO(){
        return uDAO;
    }
    private static final EnderecoDAO  eDAO= new EnderecoDAO();
    
    public static EnderecoDAO getEnderecoDAO(){
        return eDAO;
    }
    private static final MensagemGrupoDAO  mDAO= new MensagemGrupoDAO();
    
    public static MensagemGrupoDAO getMensagemGrupoDAO(){
        return mDAO;
    }
}
