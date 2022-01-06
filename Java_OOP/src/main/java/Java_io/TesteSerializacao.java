package Java_io;

import java.io.*;

public class TesteSerializacao{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Cliente cliente = new Cliente();
//        cliente.setNome("Diogo");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("123.456.789.10");
//
//        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        String name= "Diogo Vinícius";
//        oos.writeObject(cliente);



        /* O objectOutputStream vai converter esse objeto do tipo String para uma série de Bytes e salva-los
        em um arquivo binário para ser usado posteriormente.
        */


        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente=(Cliente) ois.readObject();
        System.out.println(cliente.getCpf());


        /*
          Converte o objeto passado no parametro para um objeto do tipo mais genérico possivel e é possivel castar
          ele de acordo com a necessidade.
        */


    }
}
