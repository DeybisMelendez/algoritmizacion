package semana3;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n = 5;
        int[] arreglo = new int[n];
        int mayor;

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el valor para arreglo[" + i + "]:");
            arreglo[i] = Integer.parseInt(input);
        }

        mayor = arreglo[0];

        for (int i = 1; i < n; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        JOptionPane.showMessageDialog(null, "El elemento mayor es: " + mayor);
    }
}