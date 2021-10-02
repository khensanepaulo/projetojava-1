package Models;

import java.io.Serializable;

public class Generica implements Serializable {
    public int idRegistro;
    public String tpRegistro;
    public String nmRegistro;
    public String dtRegistro;
    public Boolean flExcluido;
    public String dtExclusao;

    public Generica MontaGenerica (int idRegistro, String tpRegistro, String nmRegistro, String dtRegistro, Boolean flExcluido, String dtExclusao) {
        this.idRegistro = idRegistro;
        this.tpRegistro = tpRegistro;
        this.nmRegistro = nmRegistro;
        this.dtRegistro = dtRegistro;
        this.flExcluido = flExcluido;
        this.dtExclusao = dtExclusao;
        return this;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public String getTpRegistro() {
        return tpRegistro;
    }

    public String getNmRegistro() {
        return nmRegistro;
    }

    public String getDtRegistro() {
        return dtRegistro;
    }

    public Boolean getFlExcluido() {
        return flExcluido;
    }

    public String getDtExclusao() {
        return dtExclusao;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public void setTpRegistro(String tpRegistro) {
        this.tpRegistro = tpRegistro;
    }

    public void setNmRegistro(String nmRegistro) {
        this.nmRegistro = nmRegistro;
    }

    public void setDtRegistro(String dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public void setFlExcluido(Boolean flExcluido) {
        this.flExcluido = flExcluido;
    }

    public void setDtExclusao(String dtExclusao) {
        this.dtExclusao = dtExclusao;
    }
}
