package es.upm.dit.isst.tfgapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

@Entity
public class TFG implements Serializable {

    @Id
    @Email
    private String alumno;

    @Email
    @NotEmpty
    private String tutor;

    @NotEmpty
    private String titulo;

    private String resumen;
    private Estado status;

    @JsonIgnore
    @Lob
    private byte[] memoria;

    @PositiveOrZero
    @DecimalMax("10.0")
    private Double calificacion;

    private Boolean matriculaHonor;

    @ManyToOne
    private Sesion sesion;
 

    // getters, setters, constructor vacío, constructor completo...



    public TFG() {}

    // Getters y setters

    public String getAlumno() { return alumno; }
    public void setAlumno(String alumno) { this.alumno = alumno; }

    public String getTutor() { return tutor; }
    public void setTutor(String tutor) { this.tutor = tutor; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }

    public Estado getStatus() { return status; }
    public void setStatus(Estado status) { this.status = status; }

    public byte[] getMemoria() { return memoria; }
    public void setMemoria(byte[] memoria) { this.memoria = memoria; }

    public Double getCalificacion() { return calificacion; }
    public void setCalificacion(Double calificacion) { this.calificacion = calificacion; }

    public Boolean getMatriculaHonor() { return matriculaHonor; }
    public void setMatriculaHonor(Boolean matriculaHonor) { this.matriculaHonor = matriculaHonor; }

    public Sesion getSesion() { return sesion; }
    public void setSesion(Sesion sesion) { this.sesion = sesion; }
}
