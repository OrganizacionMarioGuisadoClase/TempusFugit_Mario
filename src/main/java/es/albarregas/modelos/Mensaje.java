package es.albarregas.modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "mensajes")
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idMensaje")
    private int idMensaje;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "asunto")
    private String asunto;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    @Column(name = "leido")
    private char leido;

    @ManyToOne
    @JoinTable(name = "usuarios", joinColumns = {
        @JoinColumn(name = "idUsuarios")})
    @Column(name = "IdEmisor")
    private Usuario emisor;

    @ManyToOne
    @JoinTable(name = "ofertas", joinColumns = {
        @JoinColumn(name = "idOfertas")})
    @Column(name = "idOferta")
    private Oferta oferta;

    public Mensaje() {
    }

    public Mensaje(String tipo, String asunto, String contenido, Date fecha,
            char leido, Usuario emisor, Oferta oferta) {
        this.tipo = tipo;
        this.asunto = asunto;
        this.contenido = contenido;
        this.fecha = fecha;
        this.leido = leido;
        this.emisor = emisor;
        this.oferta = oferta;
    }

    /**
     * @return the idMensaje
     */
    public int getIdMensaje() {
        return idMensaje;
    }

    /**
     * @param idMensaje the idMensaje to set
     */
    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the leido
     */
    public char getLeido() {
        return leido;
    }

    /**
     * @param leido the leido to set
     */
    public void setLeido(char leido) {
        this.leido = leido;
    }

    /**
     * @return the emisor
     */
    public Usuario getEmisor() {
        return emisor;
    }

    /**
     * @param emisor the emisor to set
     */
    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
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
