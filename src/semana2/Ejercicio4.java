package semana2;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n = 5; // Tamaño de los arreglos
        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[n];
        int[] arreglo3 = new int[n];
        String resultado = "Resultados de la suma de los arreglos:\n";

        for (int i = 0; i < n; i++) {
            arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para arreglo1[" + i + "]:"));
            arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para arreglo2[" + i + "]:"));
        }

        for (int i = 0; i < n; i++) {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
        }

        for (int i = 0; i < n; i++) {
            resultado += "Elemento " + i + ": " + arreglo3[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}