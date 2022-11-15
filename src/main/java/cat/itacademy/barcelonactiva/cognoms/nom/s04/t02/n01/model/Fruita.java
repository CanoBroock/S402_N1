package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model;

import javax.persistence.*;

@Entity
@Table(name = "Frutitas")
public class Fruita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Nombre_fruta")
    private String nombre;

    @Column(name = "Cantidad_kilos")
    private int quantitatQuilos;

    public Fruita() {
    }

    public Fruita(int id, String nombre, int quantitatQuilos) {
        this.id = id;
        this.nombre = nombre;
        this.quantitatQuilos = quantitatQuilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public String toString() {
        return "Fruita [id=" + id + ", nombre=" + nombre + ", quantitatQuilos=" + quantitatQuilos + "]";
    }

}

