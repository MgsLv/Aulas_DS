import java.sql.*;
import javax.swing.*;
public class ConsultaFilmes {
    public static void main(String[] args){
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://localhost:3306/banco";
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, "root", "123456");
            String sql = "SELECT codigo, título FROM filmes WHERE codigo > ? ORDER BY codigo";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "03120");
            statement.setString(2, "03140");
            ResultSet resultSet = statement.executeQuery();
            System.out.println("CÓDIGO  TÍTULO");
            while (result.next()) {
                String codigo = result.getString("codigo");
                String titulo = result.getString("titulo");
                System.out.println(codigo + "    " + titulo);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"
                    + erro.toString());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados.\n"
                    + erro.toString());
        }
    }
}
