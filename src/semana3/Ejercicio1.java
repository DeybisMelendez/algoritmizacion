package semana3;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] notas = new int[5];
        int suma = 0;
        double promedio;

        for (int i = 0; i < notas.length; i++) {
            String nota = JOptionPane.showInputDialog("Ingrese la nota del alumno " + (i + 1) + ":");
            notas[i] = Integer.parseInt(nota);
            suma += notas[i];
        }

        promedio = (double) suma / notas.length;
        JOptionPane.showMessageDialog(null, "La nota media del curso es: " + promedio);
    }
}
