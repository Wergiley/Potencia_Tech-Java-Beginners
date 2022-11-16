import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {
    // Imprima um arquivo no console:
    public static void main(String[] args) {
        // 
        String nomeDoArquivo = "arquivo.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir "+ e.getCause());           
        } finally {
            System.out.println("Chegou no Fanally!");
        }

        System.out.println("Apesar da exception ou não, programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
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
}
