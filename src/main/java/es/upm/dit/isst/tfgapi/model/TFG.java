package es.upm.dit.isst.tfgapi.model;

import jakarta.persistence.*;

@Entity
public class TFG {

    @Id
    private String alumno; // e-mail del alumno, clave primaria

    private String tutor;   // e-mail del profesor
    private String titulo;
    private String resumen;

    @Enumerated(EnumType.STRING)
    private Estado status;

    @Lob
    private byte[] memoria;

    private Double calificacion;
    private Boolean matriculaHonor;

    @ManyToOne
    private Sesion sesion;

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
