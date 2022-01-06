package Java_io;

import java.io.*;

public class TesteEscrita{
    public static void main(String[] args) throws IOException {
        //teste de escrita em arquivo
        OutputStream fos=new FileOutputStream("teste.txt");
        Writer osw= new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);

        bw.write("Teste de escrita 1");
        bw.newLine();
        bw.newLine();
        bw.write("Teste de escrita 2");
        bw.close();
    }
}
