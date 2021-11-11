package Models;

import java.math.BigDecimal;
import java.io.Serializable;

public class Item implements Serializable {
    private int idItem;
    private String nmItem;
    private Integer idCategoria;
    private BigDecimal vlUnitario;
    private String dsItem;
    private BigDecimal nrQtdeDisponivel;
    private Generica categoria;

    public Item MontarItem(int idItem, String nmItem, Integer idCategoria, BigDecimal vlUnitario, String dsItem, BigDecimal nrQtdeDisponivel, Generica categoria) {
        this.idItem = idItem;
        this.nmItem = nmItem;
        this.idCategoria = idCategoria;
        this.vlUnitario = vlUnitario;
        this.dsItem = dsItem;
        this.nrQtdeDisponivel = nrQtdeDisponivel;
        this.categoria = categoria;

        return this;
    }

    public boolean isValid (String nmItem, Integer idCategoria, BigDecimal vlUnitario, String dsItem, BigDecimal nrQtdeDisponivel) {
        if (!nmItem.isEmpty() && !nmItem.isBlank() && idCategoria != null && vlUnitario != null && !dsItem.isEmpty() && !dsItem.isBlank() && nrQtdeDisponivel != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getIdItem() {
        return idItem;
    }

    public String getNmItem() {
        return nmItem;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public BigDecimal getVlUnitario() {
        return vlUnitario;
    }

    public String getDsItem() {
        return dsItem;
    }

    public BigDecimal getNrQtdeDisponivel() {
        return nrQtdeDisponivel;
    }

    public Generica getCategoria() {
        return categoria;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public void setNmItem(String nmItem) {
        this.nmItem = nmItem;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setVlUnitario(BigDecimal vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public void setDsItem(String dsItem) {
        this.dsItem = dsItem;
    }

    public void setNrQtdeDisponivel(BigDecimal nrQtdeDisponivel) {
        this.nrQtdeDisponivel = nrQtdeDisponivel;
    }

    public void setCategoria(Generica categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "Item [id_item=" + idItem + ", nome_item=" + nmItem + ", valor_item=" + vlUnitario + ", descricao_item=" + dsItem + "," +
                " nome_categoria=" + categoria.nmRegistro + "]";
    }
}
