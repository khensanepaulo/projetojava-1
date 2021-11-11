package Models;

import java.math.BigDecimal;
import java.io.Serializable;

public class tbComCompra implements Serializable{
    private int idUsuario;
    private int idFornecedor;
    private int idForrmapagameento;
    private int vlDesconto;
    private String dsObservacao;
    private String dtCompra;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getIdForrmapagameento() {
        return idForrmapagameento;
    }

    public void setIdForrmapagameento(int idForrmapagameento) {
        this.idForrmapagameento = idForrmapagameento;
    }

    public int getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(int vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(String dtCompra) {
        this.dtCompra = dtCompra;
    }

    public tbComCompra(int idUsuario, int idFornecedor, int idForrmapagameento, int vlDesconto, String dsObservacao, String dtCompra) {
        this.idUsuario = idUsuario;
        this.idFornecedor = idFornecedor;
        this.idForrmapagameento = idForrmapagameento;
        this.vlDesconto = vlDesconto;
        this.dsObservacao = dsObservacao;
        this.dtCompra = dtCompra;
    }

    @Override
    public java.lang.String toString() {
        return "tbComCompra{" +
                "idUsuario=" + idUsuario +
                ", idFornecedor=" + idFornecedor +
                ", idForrmapagameento=" + idForrmapagameento +
                ", vlDesconto=" + vlDesconto +
                ", dsObservacao='" + dsObservacao + '\'' +
                ", dtCompra='" + dtCompra + '\'' +
                '}';
    }
}
