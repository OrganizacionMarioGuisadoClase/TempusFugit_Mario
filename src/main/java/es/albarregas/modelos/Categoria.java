package es.albarregas.modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idCategoria")
    private int idCategoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @OneToMany
    @JoinTable(name = "subcategorias", joinColumns = {
        @JoinColumn(name = "idCategoria")})
    private List<Subcategoria> subcategorias;

    public Categoria() {
    }

    public Categoria(String nombre, String imagen, List<Subcategoria> subcategorias) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.subcategorias = subcategorias;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the subcategorias
     */
    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    /**
     * @param subcategorias the subcategorias to set
     */
    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

}
