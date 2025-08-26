package semana3;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String input = JOptionPane.showInputDialog(
                        "Ingrese el número para la posición [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        String salida = "Matriz multiplicada por 5:\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] *= 5;
                salida += matriz[i][j] + ", ";

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            salida += "\n";
        }

        salida += "\nMayor valor: " + mayor;
        salida += "\nMenor valor: " + menor;

        JOptionPane.showMessageDialog(null, salida);
    }
}
