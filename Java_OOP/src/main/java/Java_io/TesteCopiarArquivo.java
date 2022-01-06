package Java_io;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        //teste de escrita em arquivo
        //se o arquivo passado no parametro do objeto não existir ele sera criado junto do objeto
        OutputStream fos=new FileOutputStream("teste2.txt");
        //OutputStream cos= System.out; usando esse objeto é possivel printar diretamente  o conteudo do documento
        //no console
        Writer osw= new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);

        InputStream fis= new FileInputStream("teste.txt");
        //InputStream tis= System.in; é possivel usar diretamente o teclado para escrever em um arquivo usando esse objeto
        Reader isr= new InputStreamReader(fis);
        BufferedReader br= new BufferedReader(isr);

        String linha=br.readLine();
        while (linha!=null){
            bw.write(linha);
            //bw.flush(); em tempo de compilação devolve oque for escrito
            bw.newLine();
            linha=br.readLine();
        }

        br.close();
        bw.close();
    }
}
