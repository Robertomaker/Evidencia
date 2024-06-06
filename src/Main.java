import evidencia.Metodos;


import java.io.*;


import static evidencia.Metodos.medicos;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) throws IOException {



        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int entrada = 0;
        Metodos metodos = new Metodos();
        System.out.println("Bienvenido al administrador de citas");
        metodos.AdministradorDeAcceso();
        System.out.println("Selecciona una opcion a ejecutar");
        System.out.println("Dar de alta doctor");
        System.out.println("Dar de alta paciente");
        System.out.println("Crear una cita");
        System.out.println("Mostrar citas");


        entrada = parseInt(read.readLine());
        while(entrada < 6) {

            switch (entrada) {
                case 1:
                    metodos.DarDeAltaDoctor();
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
        System.out.println("selecciona una opcion");
        System.out.println("Dar de alta doctor");
        System.out.println("Dar de alta paciente");
        System.out.println("Crear una cita");
        System.out.println("Mostrar citas");

    }
}