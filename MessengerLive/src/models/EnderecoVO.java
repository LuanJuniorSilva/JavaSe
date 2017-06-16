/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luan Junior
 */
public class EnderecoVO {
    private long idEndereco;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private UsuarioVO usuario;

    public EnderecoVO() {
    }

    public EnderecoVO(long idEndereco, String pais, String estado, String cidade, String bairro, String rua, String cep, UsuarioVO usuario) {
        this.idEndereco = idEndereco;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.usuario = usuario;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UsuarioVO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioVO usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return  "\nId: "+this.getIdEndereco()
                +"\nPaís: "+this.getPais()
                +"\nEstado: "+this.getEstado()
                +"\nCidade: "+this.getCidade()
                +"\nBairro: "+this.getBairro()
                +"\nRua: "+this.getRua()
                +"\nCep: "+this.getCep()
                +"\nUsuário: "+this.getUsuario();
    }
    

   
    
    
    
}
