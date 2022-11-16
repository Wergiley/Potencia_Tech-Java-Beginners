import javax.swing.JOptionPane;

public class ExemploException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
        
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null, "Entrada Invalida, informe um numero inteiro! "+ e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "Não é possível dividir um numero por 0: "+ e.getMessage());
            } finally {
                System.out.println("Chegou no Finally!");
            }
        
        } while(continueLooping);

        System.out.println("Continua... ");
    }

    public static int dividir(int a, int b) {
        return a / b;    
    }
}
