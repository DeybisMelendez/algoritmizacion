package semana3;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane
                        .showInputDialog("Ingrese el número para la posición [" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
            }
        }

        String resultado = "Valores en las posiciones con X:\n";

        int[][] posiciones = {
                { 0, 4 }, { 1, 3 }, { 2, 2 }, { 3, 1 }, { 4, 0 }
        };

        for (int[] pos : posiciones) {
            int fila = pos[0];
            int col = pos[1];
            resultado += "Posición [" + fila + "][" + col + "] = " + matriz[fila][col] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
