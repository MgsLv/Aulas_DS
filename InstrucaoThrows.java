import java.io.IOException;
import javax.swing.JOptionPane;
public class InstrucaoThrows {
    public static void main(String[] args) throws Exception {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if (idade < 18) {
                throw new Exception("Menor de idade, entrada não permitida!");
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo(a)!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }

}