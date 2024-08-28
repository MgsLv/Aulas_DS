import javax.swing.JOptionPane;
import java.util.concurrent.ExecutionException;

public class GetMessageEPrintstackTrace {
    public static void main(String args[]) {
        // Caixa de execução

        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        /* Variável x recebe valores do tipo String transportados para int pelo metodo parseInt
         Exibe na tela mensagem de dialogo com o usuário
         */


        try {
            int y = x / 0;
            // Variável y, do tipo int, recebe o valor de x dividido por 0

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();

            // Caso ocorra algum erro, exibe na tela a mensagem de erro getMessage
        }
    }
}
