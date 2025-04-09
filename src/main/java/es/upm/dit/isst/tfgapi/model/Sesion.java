package es.upm.dit.isst.tfgapi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lugar;
    private String fecha; // Podrías usar `LocalDate` si lo prefieres

    @OneToMany(mappedBy = "sesion")
    private List<TFG> tfgs;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<TFG> getTfgs() {
        return tfgs;
    }

    public void setTfgs(List<TFG> tfgs) {
        this.tfgs = tfgs;
    }
}
