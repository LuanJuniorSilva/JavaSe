/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Luan Junior
 */
public class ServicesFactory {
    private static final UsuarioServices us = new UsuarioServices();
    public static UsuarioServices getUsuarioServices(){
        return us;
    }//fecha método
    
    private static final EnderecoServices es = new EnderecoServices();
    public static EnderecoServices getEnderecoServices(){
        return es;
    }//fecha método
    
    private static final MensagemGrupoServices ms = new MensagemGrupoServices();
    public static MensagemGrupoServices getMensagemGrupoServices(){
        return ms;
    }//fecha método
}
