package Java_io;

import java.io.*;

public class TestePrintStream_PrintWriter {
    public static void main(String[] args) throws IOException {
        //teste de escrita em arquivo
       /*
        OutputStream fos=new FileOutputStream("teste.txt");
        Writer osw= new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        */

        //FileWriter fw= new FileWriter("testeFileWriter.txt");
        // BufferedWriter bw= new BufferedWriter(new FileWriter("testeFileWriter.txt"));
        //atrela a criação de um FileWriter junto do bufferedWriter e já o passa no parametro, principio de composição

        //PrintStream ps= new PrintStream("testePrintStream.txt");
        PrintWriter ps=new PrintWriter("testePrintStream.txt", "UTF-8");
        /*as classes PrintStream e PrintWriter são análogas, mas existem as 2 porque a
         PrintStream é mais antigo já que existe desde a versão 1.0 de java, quando
         ainda não existiam os Writers e Readers, então quando eles foram
         introduzidos na versão 1.1 eles decidiram criar a classe PrintWriter também.*/


        ps.println("Testando escrita em arquivo com printStream e PrintWriter daeodlaepdlpkodko");
        ps.println();
        ps.println("Teste 2 com printStream e printWriter zindiaedkoaedkaoeko");
        ps.close();

    }
}
