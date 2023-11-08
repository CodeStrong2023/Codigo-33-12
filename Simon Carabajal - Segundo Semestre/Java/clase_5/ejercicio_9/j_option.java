package clase_5.ejercicio_9;

import javax.swing.JOptionPane;

public class j_option {
    public static void main(String[] args) {
        // Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es
        // correcta. Suponiendo que todos los meses son de 30 días.
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes: "));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año: "));

        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((año != 0) && (año <= 2023)) {
                    JOptionPane.showMessageDialog(null,"La fecha ingresada "+dia+"/"+mes+"/"+año+" existe");
                } else {
                    JOptionPane.showMessageDialog(null,"El año ingresado no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null,"El mes ingresado no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null,"El dia ingresado no existe");
        }
    }
}