package evidencia;

public class Medico {
    private String id;
    private String nombre;
    private String especialidad;

    public Medico(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
        public String toString(){return "ID: " + id + "\nNombre: " + nombre
                +  "\nEspecialidad: " + especialidad;
        }


    public Medico() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}


