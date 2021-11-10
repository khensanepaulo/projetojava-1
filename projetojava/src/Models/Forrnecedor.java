package Models;

import java.math.BigDecimal;
import java.io.Serializable;

public class Forrnecedor implements Serializable {
    private int idFornecedor;
    private String nmFornecedor;
    private int nrDocumento;
    private String dsEndereco;
    private String dsEmail;

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNmFornecedor() {
        return nmFornecedor;
    }

    public void setNmFornecedor(String nmFornecedor) {
        this.nmFornecedor = nmFornecedor;
    }

    public int getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(int nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public Forrnecedor(int idFornecedor, String nmFornecedor, int nrDocumento, String dsEndereco, String dsEmail) {
        this.idFornecedor = idFornecedor;
        this.nmFornecedor = nmFornecedor;
        this.nrDocumento = nrDocumento;
        this.dsEndereco = dsEndereco;
        this.dsEmail = dsEmail;
    }
}
