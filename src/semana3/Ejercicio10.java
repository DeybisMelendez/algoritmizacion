package semana3;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String input = JOptionPane.showInputDialog(
                        "Ingrese el número para la posición [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        String salida = "Matriz original:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                salida += matriz[i][j] + ", ";
            }
            salida += "\n";
        }

        int[][] traspuesta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        salida += "\nMatriz traspuesta:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                salida += traspuesta[i][j] + ", ";
            }
            salida += "\n";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}
