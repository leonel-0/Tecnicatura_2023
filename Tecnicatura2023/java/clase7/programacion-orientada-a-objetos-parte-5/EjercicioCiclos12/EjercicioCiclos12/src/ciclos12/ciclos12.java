package ciclos12;

import javax.swing.JOptionPane;

public class ciclos12 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.printin("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        //System.out.printin("El factorial del numero ingresado es: "+factorial);
        JOptionPane.showConfirmDialog(null, "El factorial del numero ingresado es: " + factorial);
    }
}
