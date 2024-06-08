import evidencia.Medico;
import evidencia.Metodos;


import java.io.*;


import static evidencia.Metodos.medicos;
import static evidencia.Metodos.terminarPrograma;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) throws IOException {




        File doctores;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int entrada = 0;
        Metodos metodos = new Metodos();
        System.out.println("Bienvenido al administrador de citas");
        metodos.AdministradorDeAcceso();
        System.out.println("Selecciona una opcion a ejecutar");
        System.out.println("Presiona 1 para: Dar de alta doctor");
        System.out.println("Presiona 2 para :Dar de alta paciente");
        System.out.println("Presiona 3 para :Crear una cita");
        System.out.println("Presiona 4 para: Mostrar citas");
        System.out.println("Presiona 5 para: Guardar los datos a archivo");


        entrada = parseInt(read.readLine());
        while(entrada < 6) {

            switch (entrada) {
                case 1:
                    metodos.DarDeAltaDoctor();
                    metodos.
                    MostrarMenu();
                    entrada = parseInt(read.readLine());
                    break;
                case 2:
                    metodos.DarDeAltaPaciente();
                    MostrarMenu();
                    entrada = parseInt(read.readLine());
                    break;
                case 3:
                    metodos.CrearCita();
                MostrarMenu();
                entrada = parseInt(read.readLine());
                break;

            }

        }


    }

    public static void MostrarMenu(){
        System.out.println("Selecciona una opcion a ejecutar");
        System.out.println("Presiona 1 para: Dar de alta doctor");
        System.out.println("Presiona 2 para :Dar de alta paciente");
        System.out.println("Presiona 3 para :Crear una cita");
        System.out.println("Presiona 4 para: Mostrar citas");
        System.out.println("Presiona 5 para: Guardar los datos a archivo");
    }

}