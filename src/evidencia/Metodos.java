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

    static String user = "usuario";
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
        if (pass.equals(contraseña) == false && intentos < 5) {
            System.out.println("usuario o contraseña incorrectas, porfavor intentelo de nuevo");
            System.out.println("Ingrese el usuario");
            usuario = entrada.nextLine();
            System.out.println("Ingrese la contraseña");
            contraseña = entrada.nextLine();
            intentos++;
            if (intentos == 5) {
                System.out.println("Se alcanzo el maximo de intentos, intentelo de nuevo mas tarde");
            }
        }


    }

    public static void MostrarMenu() {
        System.out.println("selecciona una opcion");
        System.out.println("Dar de alta doctor");
        System.out.println("Dar de alta paciente");
        System.out.println("Crear una cita");
        System.out.println("Mostrar citas");

    }

    public void DarDeAltaDoctor() throws IOException {

        Medico medico = new Medico();
        System.out.println("Introduce el id del doctor");
        medico.setId(entrada.nextLine());
        System.out.println("Introduce el nombre del doctor");
        medico.setNombre(entrada.nextLine());
        System.out.println("Introduce la especialidad del doctor");
        medico.setEspecialidad(entrada.nextLine());
        System.out.println("Introduce la key del doctor");
        String key= entrada.nextLine();
        medicos.put(key, medico);
        System.out.println("Se añadio el doctor");
        System.out.println(medicos.entrySet());




    }

    public void DarDeAltaPaciente() {
        Paciente paciente = new Paciente();
        System.out.println("Introduce el id del paciente");
        paciente.setId(entrada.nextLine());
        System.out.println("Introduce el nombre del paciente");
        paciente.setNombre(entrada.nextLine());
        System.out.println("Introduce la key del paciente");
        String key= entrada.nextLine();
        pacientes.put(key, paciente);
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
        Medico medico = medicos.get(entrada.nextLine());
        cita.setId(String.valueOf(medico));
        System.out.println("Introduce el paciente");
        Paciente paciente = pacientes.get(entrada.nextLine());
        cita.setId(String.valueOf(paciente));
        citas.put("paciente: ", cita);
        System.out.println("Se creo la cita");
        System.out.println(citas.entrySet());

    }
}
