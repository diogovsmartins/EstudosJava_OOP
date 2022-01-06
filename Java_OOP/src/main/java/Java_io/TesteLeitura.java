package Java_io;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //fluxo de entrada com arquivo
        FileInputStream fis= new FileInputStream("teste.txt");
        Reader isr= new InputStreamReader(fis, "UTF-8");
        BufferedReader br= new BufferedReader(isr);

        String linha= br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha=br.readLine();
        }
        br.close();
    }
}
