package Models;

import java.math.BigDecimal;
import java.io.Serializable;

public class Fretes implements Serializable{
    int idBairro;
    String nmBarirro;
    BigDecimal vlFrete;
    Boolean flEntrega;

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getNmBarirro() {
        return nmBarirro;
    }

    public void setNmBarirro(String nmBarirro) {
        this.nmBarirro = nmBarirro;
    }

    public BigDecimal getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(BigDecimal vlFrete) {
        this.vlFrete = vlFrete;
    }

    public Boolean getFlEntrega() {
        return flEntrega;
    }

    public void setFlEntrega(Boolean flEntrega) {
        this.flEntrega = flEntrega;
    }

    public Fretes(int idBairro, String nmBarirro, BigDecimal vlFrete, Boolean flEntrega) {
        this.idBairro = idBairro;
        this.nmBarirro = nmBarirro;
        this.vlFrete = vlFrete;
        this.flEntrega = flEntrega;
    }

    @Override
    public java.lang.String toString() {
        return "Fretes{" +
                "idBairro=" + idBairro +
                ", nmBarirro='" + nmBarirro + '\'' +
                ", vlFrete=" + vlFrete +
                ", flEntrega=" + flEntrega +
                '}';
    }
}
