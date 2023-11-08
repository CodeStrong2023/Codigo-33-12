/*
Ejerccio 12: Pedir un numero y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(SystemIn);
        long factorial = 1;
        //System.out.printIn("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i=1; i<=numero; i++){
            factorial *= i;
        }
        //System.out.printIn("\nEl factorial del numero es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del numero es: "+factorial);
    }
}
