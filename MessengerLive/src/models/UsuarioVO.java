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
public class UsuarioVO {
    private long idUsuario;
    private String nomeCompleto;
    private String email;
    private String senha;
    private String dataNasc;
    private String telefone;
    private String estadoCivil;
    private String sexo;
    private byte[] foto;
    private String status;
    private String dataCad;
    private MensagemGrupoVO mensagem;

    public UsuarioVO() {
    }

    public UsuarioVO(long idUsuario, String nomeCompleto, String email, String senha, String dataNasc, String telefone, String estadoCivil, String sexo, byte[] foto, String status,String dataCad, MensagemGrupoVO mensagem) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.foto = foto;
        this.status = status;
        this.dataCad = dataCad;
        this.mensagem = mensagem;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    public String getDataCad(){
        return this.dataCad;
    }
    
    public void setDataCad(String dataCad){
        this.dataCad = dataCad;
    }

    public MensagemGrupoVO getMensagem() {
        return mensagem;
    }

    public void setMensagem(MensagemGrupoVO mensagem) {
        this.mensagem = mensagem;
    }
    
    public int calcularIdade(){
        String dataCad[] = this.getDataCad().split("-");
        String ano[] = this.getDataNasc().split("-");
        int idade = Integer.parseInt(dataCad[0]) - Integer.parseInt(ano[0]);
        return idade;
    }

    @Override
    public String toString() {
        /*return  "\nIdUduario: "+this.getIdUsuario()
                +"\nNome: "+this.getNomeCompleto()
                +"\nEmail: "+this.getEmail()
                +"\nSenha: "+this.getSenha()
                +"\nData de Nascimento: "+this.getDataNasc()
                +"\nTelefone: "+this.getTelefone()
                +"\nEstado Civil: "+this.getEstadoCivil()
                +"\nSexo: "+this.getSexo();*/
        return this.getNomeCompleto()+"-"+this.getEmail();
    }
    
    
}
