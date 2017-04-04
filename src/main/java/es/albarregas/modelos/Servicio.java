package es.albarregas.modelos;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "servicios")
public class Servicio implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idServicio")
    private int idServicio;

    @Column(name = "estado")
    private char estado;

    @Column(name = "puntuacion")
    private int puntuacion;

    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinTable(name = "ofertas", joinColumns = {
        @JoinColumn(name = "idOferta")})
    @Column(name = "idOferta")
    private Oferta oferta;

    @ManyToOne
    @JoinTable(name = "usuarios", joinColumns = {
        @JoinColumn(name = "idUsuarios")})
    @Column(name = "idCliente")
    private Usuario usuario;

    @ManyToOne
    @JoinTable(name = "horarios", joinColumns = {
        @JoinColumn(name = "idHorario")})
    @Column(name = "idHorario")
    private Horario horario;

    public Servicio() {
    }

    public Servicio(char estado, int puntuacion, String comentario, Oferta oferta,
            Usuario usuario, Horario horario) {
        this.estado = estado;
        this.comentario = comentario;
        this.oferta = oferta;
        this.usuario = usuario;
        this.horario = horario;
    }

    /**
     * @return the idServicio
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * @param idServicio the idServicio to set
     */
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * @return the estado
     */
    public char getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(char estado) {
        this.estado = estado;
    }

    /**
     * @return the puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
