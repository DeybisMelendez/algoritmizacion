package semana3;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        int sumaTotal = 0;
        int cantidadElementos = filas * columnas;
        int cantidadPositivos = 0;
        int sumaPares = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String input = JOptionPane.showInputDialog("Ingrese el valor para matriz[" + i + "][" + j + "]:");
                matriz[i][j] = Integer.parseInt(input);
                sumaTotal += matriz[i][j];
                if (matriz[i][j] > 0) {
                    cantidadPositivos++;
                }
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                }
            }
        }

        String matrizStr = "Datos cargados en la matriz:\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizStr += matriz[i][j] + ", ";
            }
            matrizStr += "\n";
        }

        double promedioGeneral = (double) sumaTotal / cantidadElementos;

        double porcentajePositivos = ((double) cantidadPositivos / cantidadElementos) * 100;

        String resultado = matrizStr + "\n" +
                "Promedio general: " + promedioGeneral + "\n" +
                "Porcentaje de positivos: " + porcentajePositivos + "%\n" +
                "Sumatoria de los números pares: " + sumaPares;

        JOptionPane.showMessageDialog(null, resultado);
    }
}