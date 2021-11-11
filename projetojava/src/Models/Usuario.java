package Models;

import java.io.Serializable;

public class Usuario implements Serializable{
    private int idUsuario;
    private String usuario;
    private String senha;
    private String acesso;

    public Usuario MontaUsuario(int idUsuario, String usuario, String senha, String acesso) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.senha = senha;
        this.acesso = acesso;
        return this;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
}
