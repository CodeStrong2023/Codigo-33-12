/*
Pedir el dia, mes y año de una fecha e indicar 
si la fecha es correcta. Suponiendo que todos los
meses son de 30 dias
>>>>>JOPtionPane
*/
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        if((dia !=0)&&(mes <= 30)) {
            if((mes !=0)&&(mes <= 12)){
                JOptionPane.showMessageDialog(null, "La fecha ingresada es:"+dia+"/"+mes+"/anio");
            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
            }
        }
        else{
           JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
        }
    }
}
