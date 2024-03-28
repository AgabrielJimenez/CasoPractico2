/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author SIMAN
 */
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Ingresar estudiantes
       StringBuilder sb = new StringBuilder("Estudiantes registrados:\n");

        while (true) {
            Estudiante estudiante = ingresarEstudiante();
            sb.append(estudiante.toString()).append("\n");

            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro estudiante?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static Estudiante ingresarEstudiante() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        LocalDate fechaInscripcion = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de inscripción del estudiante (YYYY-MM-DD):"));
        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del curso:"));
        return new Estudiante(nombre, apellido, edad, fechaInscripcion, curso, costo);
    }
}
    
    

