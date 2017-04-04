package es.albarregas.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "horarios")
public class Horario implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idHorario")
    private int idHorario;

    @Column(name = "horaInicio")
    private int horaInicio;

    @Column(name = "horaFin")
    private int horaFin;

    @Column(name = "estado")
    private char estado;

    @Column(name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    @OneToMany
    @JoinTable(name = "servicios", joinColumns = {
        @JoinColumn(name = "idHorario")})
    private List<Servicio> servicios;

    @ManyToOne
    @JoinTable(name = "ofertas", joinColumns = {
        @JoinColumn(name = "idOferta")})
    @Column(name = "idOferta")
    private Oferta oferta;

    public Horario() {
    }

    public Horario(int horaInicio, int horaFin, char estado, Date fecha,
            List<Servicio> servicios, Oferta oferta) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
        this.fecha = fecha;
        this.servicios = servicios;
        this.oferta = oferta;
    }

    /**
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public int getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
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
     * @return the servicios
     */
    public List<Servicio> getServicios() {
        return servicios;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
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
