package semana3;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] columnas = { "Número", "Cuadrado" };
        String[][] datos = new String[100][2];

        for (int i = 0; i < 100; i++) {
            datos[i][0] = String.valueOf(i + 1);
            datos[i][1] = String.valueOf((i + 1) * (i + 1));
        }

        JTable tabla = new JTable(datos, columnas);
        JScrollPane scrollPane = new JScrollPane(tabla);

        JOptionPane.showMessageDialog(null, scrollPane);
    }
}
