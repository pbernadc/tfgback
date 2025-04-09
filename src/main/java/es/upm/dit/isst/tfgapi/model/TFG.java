package es.upm.dit.isst.tfgapi.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class TFG implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String resumen;
    private double calificacion;
    private boolean mencionHonorifica;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    // Constructores
    public TFG() {
        
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    public boolean isMencionHonorifica() { return mencionHonorifica; }
    public void setMencionHonorifica(boolean mencionHonorifica) { this.mencionHonorifica = mencionHonorifica; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }
}
