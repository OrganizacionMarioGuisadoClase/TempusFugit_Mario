package es.albarregas.modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ciudades")
public class Ciudad implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idCiudad")
    private int idCiudad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private char estado;

    @Column(name = "latitud")
    private double latitud;

    @Column(name = "longitud")
    private double longitud;

    @OneToMany
    @JoinTable(name = "usuarios", joinColumns = {
        @JoinColumn(name = "idCiudad")})
    private List<Usuario> usuarios;

    public Ciudad() {
    }

    public Ciudad(String nombre, char estado, double latitud, double longitud,
            List<Usuario> usuarios) {
        this.nombre = nombre;
        this.estado = estado;
        this.latitud = latitud;
        this.longitud = longitud;
        this.usuarios = usuarios;
    }

    /**
     * @return the idCiudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
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
     * @return the latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
