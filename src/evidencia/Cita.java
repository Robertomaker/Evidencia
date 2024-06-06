package evidencia;

public class Cita {
    private String id;
    private String fechayHora;
    private String motivo;
    private Medico medico;
    private Paciente paciente;

    public Cita() {
        this.id = id;
        this.fechayHora = fechayHora;
        this.motivo = motivo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String toString() {
        return "ID cita: " + id + "\nFecha y hora: " + fechayHora + "\nMotivo de la cita: " + motivo + "\nMedico: " + medico + "\npaciente: " + paciente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(String fechayHora) {
        this.fechayHora = fechayHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
