package es.albarregas.modelos;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "promocion")
public class Promocion implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idPromocion")
    private int idPromocion;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "saldo")
    private int saldo;

    public Promocion() {
    }

    public Promocion(String codigo, int saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    /**
     * @return the idPromocion
     */
    public int getIdPromocion() {
        return idPromocion;
    }

    /**
     * @param idPromocion the idPromocion to set
     */
    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
