package evidencia;

import javax.swing.*;
import java.io.*;
import java.net.PasswordAuthentication;
import java.util.HashMap;
import java.util.Scanner;
import evidencia.Medico.*;

public class Metodos {
    public static HashMap<String, Medico> medicos = new HashMap<String, Medico>();
    static HashMap<String, Paciente> pacientes = new HashMap<String, Paciente>();
    static HashMap<String, Cita> citas = new HashMap<String, Cita>();
    File doctores;

    static String user = "citasad";
    static String pass = "123456";
    String usuario, contraseña;
    Scanner entrada = new Scanner(System.in);

    public void AdministradorDeAcceso() {
        int intentos = 0;
        System.out.println("Ingrese el usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese la contraseña");
        contraseña = entrada.nextLine();

        if (user.equals(usuario) && pass.equals(contraseña)) {
            System.out.println("Datos correctos");
        }
        while(pass.equals(contraseña)== false && intentos < 4 ){
            System.out.println("Contraseña incorecta, intentelo de nuevo");
            System.out.println("Ingrese el usuario");
            usuario = entrada.nextLine();
            System.out.println("Ingrese la contraseña");
            contraseña = entrada.nextLine();
            intentos++;
            if (intentos == 4){
                System.out.println("Numero de intentos permitidos alcanzado, intentelo mas tarde");
                terminarPrograma();
            }

        }


    }
    private void EscribirArchivoDeTexto() throws IOException {
        FileWriter escribir = new FileWriter(doctores);
        escribir.write(medicos.entrySet().toString());
        System.out.println("Se almaceno el doctor");

    }

    public static void MostrarMenu() {
        System.out.println("selecciona una opcion");
        System.out.println("Dar de alta doctor");
        System.out.println("Dar de alta paciente");
        System.out.println("Crear una cita");
        System.out.println("Mostrar citas");

    }
    public static void terminarPrograma(){
        System.out.println("Sistema bloqueado");
        System.exit(0);
    }

    public void DarDeAltaDoctor() throws IOException {

        Medico medico = new Medico();
        System.out.println("Introduce el id del doctor");
        medico.setId(entrada.nextLine());
        System.out.println("Introduce el nombre del doctor");
        medico.setNombre(entrada.nextLine());
        System.out.println("Introduce la especialidad del doctor");
        medico.setEspecialidad(entrada.nextLine());
        medicos.put(medico.getId(), medico);
        System.out.println("Se añadio el doctor");
        System.out.println(medicos.entrySet());

    }




    public void DarDeAltaPaciente() {
        Paciente paciente = new Paciente();
        System.out.println("Introduce el id del paciente");
        paciente.setId(entrada.nextLine());
        System.out.println("Introduce el nombre del paciente");
        paciente.setNombre(entrada.nextLine());
        pacientes.put(paciente.getId(), paciente);
        System.out.println("Se añadio el paciente");
        System.out.println(pacientes.entrySet());

    }



    public void CrearCita() {
        Cita cita = new Cita();
        System.out.println("Introduce el id de la cita");
        cita.setId(entrada.nextLine());
        System.out.println("Introduce la fecha y hora de la cita");
        cita.setFechayHora(entrada.nextLine());
        System.out.println("Introduce el motivo de la cita");
        cita.setMotivo(entrada.nextLine());
        System.out.println("Introduce el medico tratante");
        cita.setMedico(medicos.get(entrada.nextLine()));
        System.out.println("Introduce el paciente");
        cita.setPaciente(pacientes.get(entrada.nextLine()));
        citas.put(cita.getId(), cita);
        System.out.println("Se creo la cita");
        System.out.println(citas.entrySet());

    }

}
