package Java_io;

import java.io.*;

public class TesteFileWriter {
    public static void main(String[] args) throws IOException {
        //teste de escrita em arquivo
       /*
        OutputStream fos=new FileOutputStream("teste.txt");
        Writer osw= new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        */

        //FileWriter fw= new FileWriter("testeFileWriter.txt");
        BufferedWriter bw= new BufferedWriter(new FileWriter("testeFileWriter.txt"));
        //atrela a criação de um FileWriter junto do bufferedWriter e já o passa no parametro, principio de composição

        bw.write("teste 123456");
        bw.newLine();
        bw.newLine();
        bw.write("teste 123");
        bw.close();
    }
}
