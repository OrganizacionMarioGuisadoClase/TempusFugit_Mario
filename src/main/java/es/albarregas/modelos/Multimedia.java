package es.albarregas.modelos;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "multimedia")
public class Multimedia implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idMultimedia")
    private int idMultimedia;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private char tipo;

    @ManyToOne
    @JoinTable(name = "ofertas", joinColumns = {
        @JoinColumn(name = "idOferta")})
    @Column(name = "idOferta")
    private Oferta oferta;

    public Multimedia() {
    }

    public Multimedia(String nombre, char tipo, Oferta oferta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.oferta = oferta;
    }

    /**
     * @return the idMultimedia
     */
    public int getIdMultimedia() {
        return idMultimedia;
    }

    /**
     * @param idMultimedia the idMultimedia to set
     */
    public void setIdMultimedia(int idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the oferta
     */
    public Oferta getOferta() {
        return oferta;
    }

    /**
     * @param oferta the oferta to set
     */
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

}
