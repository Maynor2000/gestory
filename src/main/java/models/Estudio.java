package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import models.Asistente;
import models.Doctor;
import models.Paciente;

public class Estudio implements Serializable{
    //campos de clase
    private LocalTime fecha;
    private LocalDate hora;
    private Asistente empleadoAgendo;
    private String metodoPago;
    private boolean urgencia;
    private String diagnostico;
    private Paciente paciente;
    private String paquete;
    private String tipoEstudio;
    private Doctor doctorAtendio;
    private Doctor doctorRecomendoEstudio;
    private double importeConsulta;
    private double importeEstudios;
    private double importeTotal;
    
    //constructor por defecto
    public Estudio(){
        
    }
    //constructor parametrizado
    public Estudio(LocalTime fecha, LocalDate hora, Asistente empleadoAgendo, String metodoPago, boolean urgencia
            , String diagnostico, Paciente paciente, String paquete, String tipoEstudio, Doctor doctorAtendio
            , Doctor doctorRecomendoEstudio, double importeConsulta, double importeEstudios, double importeTotal) {
        this.fecha = fecha;
        this.hora = hora;
        this.empleadoAgendo = empleadoAgendo;
        this.metodoPago = metodoPago;
        this.urgencia = urgencia;
        this.diagnostico = diagnostico;
        this.paciente = paciente;
        this.paquete = paquete;
        this.tipoEstudio = tipoEstudio;
        this.doctorAtendio = doctorAtendio;
        this.doctorRecomendoEstudio = doctorRecomendoEstudio;
        this.importeConsulta = importeConsulta;
        this.importeEstudios = importeEstudios;
        this.importeTotal = importeTotal;
    }
    //getter

    public LocalTime getFecha() {
        return fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public Asistente getEmpleadoAgendo() {
        return empleadoAgendo;
    }

    public String getMetodopago() {
        return metodoPago;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getPaquete() {
        return paquete;
    }

    public String getTipoestudio() {
        return tipoEstudio;
    }

    public Doctor getDoctoratendio() {
        return doctorAtendio;
    }

    public Doctor getDoctorrecomendoestudio() {
        return doctorRecomendoEstudio;
    }

    public double getImporteconsulta() {
        return importeConsulta;
    }

    public double getImporteestudios() {
        return importeEstudios;
    }

    public double getImporteTotal() {
        return importeTotal;
    }
    
    //setter
    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public void setEmpleadoAgendo(Asistente empleadoAgendo) {
        this.empleadoAgendo = empleadoAgendo;
    }

    public void setMetodopago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public void setTipoEstudio(String tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

    public void setDoctorAtendio(Doctor doctorAtendio) {
        this.doctorAtendio = doctorAtendio;
    }

    public void setDoctorRecomendoEstudio(Doctor doctorRecomendoEstudio) {
        this.doctorRecomendoEstudio = doctorRecomendoEstudio;
    }

    public void setImporteConsulta(double importeConsulta) {
        this.importeConsulta = importeConsulta;
    }

    public void setImporteEstudios(double importeEstudios) {
        this.importeEstudios = importeEstudios;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Estudio{" + "fecha=" + fecha + ", hora=" + hora + ", empleadoAgendo=" + empleadoAgendo + ", metodopago=" + metodoPago + ", urgencia=" + urgencia + ", diagnostico=" + diagnostico + ", paciente=" + paciente + ", paquete=" + paquete + ", tipoestudio=" + tipoEstudio + ", doctoratendio=" + doctorAtendio + ", doctorrecomendoestudio=" + doctorRecomendoEstudio + ", importeconsulta=" + importeConsulta + ", importeestudios=" + importeEstudios + ", importeTotal=" + importeTotal + '}';
    }
    
}
