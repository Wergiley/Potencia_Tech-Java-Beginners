
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;   
import javax.swing.JOptionPane;

public class ExceptionCustomizada {
    // Imprima um arquivo no console:
    public static void main(String[] args) {
        // 
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        
    try {
        BufferedReader br = lerArquivo(nomeDoArquivo);
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    } 
    
    catch (ErroException e) {
        JOptionPane.showMessageDialog(null, "O arquivo não foram encontrado no diretório ");
        e.getMessage();
    } 
    
    catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, por favor, fale com o suporte "+ ex.getMessage());
        ex.printStackTrace();
    }
    
}

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ErroException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ErroException(file.getName(), file.getPath());
        }
    }
    
}

class ErroException extends Exception {
    private String nomeArquivo;
    private String diretorioArquivo;

    public ErroException(String nomeArquivo, String diretorioArquivo) {
        super("O arquivo"+nomeArquivo+" não foram encontrado no diretório "+diretorioArquivo);
        this.nomeArquivo = nomeArquivo;
        this.diretorioArquivo = diretorioArquivo;
    }

    @Override
    public String toString() {
        return "ErroException{"+
            "nomeArquivo='" + nomeArquivo+ '\''+
            ", diretorioArquivo="+ diretorioArquivo + '\'' +
            '}';
    }

}
