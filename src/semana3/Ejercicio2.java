package semana3;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = { 34, 67, 23, 89, 12, 90, 45, 78, 56, 99 };
        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
    }
}
