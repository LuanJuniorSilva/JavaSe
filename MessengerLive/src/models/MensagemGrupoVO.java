package models;

/**
 *
 * @author Luan Junior
 */
public class MensagemGrupoVO {
    private long idMensagem;
    private long idDe;
    private String mensagem;
    private String data;

    public MensagemGrupoVO() {
    }

    public MensagemGrupoVO(long idMensagem, long idDe, String mensagem, String data) {
        this.idMensagem = idMensagem;
        this.idDe = idDe;
        this.mensagem = mensagem;
        this.data = data;
    }

    public long getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(long idMensagem) {
        this.idMensagem = idMensagem;
    }

    public long getIdDe() {
        return idDe;
    }

    public void setIdDe(long idDe) {
        this.idDe = idDe;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MensagemGrupo{" + "idMensagem=" + idMensagem + ", idDe=" + idDe + ", mensagem=" + mensagem + ", data=" + data + '}';
    }
    
    
    
}
