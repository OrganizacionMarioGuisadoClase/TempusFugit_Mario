package es.albarregas.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ofertas")
public class Oferta implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idOferta")
    private int idOferta;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fechaInicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fechaFin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "estado")
    private char estado;

    @ManyToOne
    @JoinTable(name = "subcategorias", joinColumns = {
        @JoinColumn(name = "idSubcategoria")})
    @Column(name = "idSubcategoria")
    private Subcategoria subcategoria;

    @ManyToOne
    @JoinTable(name = "usuarios", joinColumns = {
        @JoinColumn(name = "idUsuario")})
    @Column(name = "usuarios")
    private Usuario usuario;

    @OneToMany
    @JoinTable(name = "multimedia", joinColumns = {
        @JoinColumn(name = "idOferta")})
    private List<Multimedia> multimedias;

    @OneToMany
    @JoinTable(name = "servicios", joinColumns = {
        @JoinColumn(name = "idOferta")})
    private List<Servicio> servicios;

    @OneToMany
    @JoinTable(name = "horarios", joinColumns = {
        @JoinColumn(name = "idOferta")})
    private List<Horario> horarios;

    @OneToMany
    @JoinTable(name = "mensajes", joinColumns = {
        @JoinColumn(name = "idOferta")})
    private List<Mensaje> mensajes;

    public Oferta() {
    }

    public Oferta(String nombre, String descripcion, Date fechaInicio, Date fechaFin,
            char estado, Subcategoria subcategoria, Usuario usuario, List<Multimedia> multimedias,
            List<Servicio> servicios, List<Horario> horarios, List<Mensaje> mensajes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.subcategoria = subcategoria;
        this.usuario = usuario;
        this.multimedias = multimedias;
        this.servicios = servicios;
        this.horarios = horarios;
        this.mensajes = mensajes;
    }

    /**
     * @return the idOferta
     */
    public int getIdOferta() {
        return idOferta;
    }

    /**
     * @param idOferta the idOferta to set
     */
    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
     * @return the subcategoria
     */
    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    /**
     * @param subcategoria the subcategoria to set
     */
    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
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
     * @return the multimedias
     */
    public List<Multimedia> getMultimedias() {
        return multimedias;
    }

    /**
     * @param multimedias the multimedias to set
     */
    public void setMultimedias(List<Multimedia> multimedias) {
        this.multimedias = multimedias;
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
     * @return the horarios
     */
    public List<Horario> getHorarios() {
        return horarios;
    }

    /**
     * @param horarios the horarios to set
     */
    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    /**
     * @return the mensajes
     */
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    /**
     * @param mensajes the mensajes to set
     */
    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

}
