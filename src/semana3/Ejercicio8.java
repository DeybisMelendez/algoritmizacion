package semana3;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];

        int numero = 2;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numero;
                numero += 2;
            }
        }

        String salida = "Matriz de números pares:\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                salida += matriz[i][j] + ", ";
            }
            salida += "\n";
        }
        JOptionPane.showMessageDialog(null, salida);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila (0-" + (filas - 1) + "):"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna (0-" + (columnas - 1) + "):"));

        if (x >= 0 && x < filas && y >= 0 && y < columnas) {
            JOptionPane.showMessageDialog(null, "Valor en la posición [" + x + "][" + y + "] = " + matriz[x][y]);
        } else {
            JOptionPane.showMessageDialog(null, "Posición fuera de rango.");
        }
    }
}
