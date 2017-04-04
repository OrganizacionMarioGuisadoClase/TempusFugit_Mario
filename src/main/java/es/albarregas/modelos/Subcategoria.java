package es.albarregas.modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "subcategorias")
public class Subcategoria implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idSubcategoria")
    private int idSubcategoria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "imagen")
    private String imagen;

    @ManyToOne
    @JoinTable(name = "categorias", joinColumns = {
        @JoinColumn(name = "idCategoria")})
    @Column(name = "idCategoria")
    private Categoria categoria;

    @OneToMany
    @JoinTable(name = "ofertas", joinColumns = {
        @JoinColumn(name = "idSubcategoria")})
    private List<Oferta> ofertas;

    public Subcategoria() {
    }

    public Subcategoria(String nombre, String imagen, Categoria categoria, List<Oferta> ofertas) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.ofertas = ofertas;
    }

    /**
     * @return the idSubcategoria
     */
    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    /**
     * @param idSubcategoria the idSubcategoria to set
     */
    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
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
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the ofertas
     */
    public List<Oferta> getOfertas() {
        return ofertas;
    }

    /**
     * @param ofertas the ofertas to set
     */
    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }

}
