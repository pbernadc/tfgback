package es.upm.dit.isst.tfgapi.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Sesion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date fecha;
    private String lugar;

    // Constructores
    public Sesion() {}

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }
}
