package Java_io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraComScanner {

    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("contas.csv"));

        String line;
        while (sc.hasNextLine()){
            line=sc.nextLine();
            //System.out.println(line);

            //jeito mais convencional e facil
            Scanner lineScanner= new Scanner(line);
            lineScanner.useLocale(Locale.US);
            /*usa os padroes do local selecionado, por ex:
            //no brasil se utiliza "," para separar os inteiros dos centavos e no US se usa ".", então se utiliza
            o Locale para forçar a utilização destes padrões. se for usar um String format da pra forçar lá tb
             */
            lineScanner.useDelimiter(",");

            String tipoConta=lineScanner.next();
            int agencia= lineScanner.nextInt();
            int numeroConta= lineScanner.nextInt();
            String titular=lineScanner.next();
            Double saldo=lineScanner.nextDouble();

            System.out.format(new Locale("pt","BR"), "%s- %04d-%06d %s: %05.2f %n" ,tipoConta,agencia,numeroConta,titular,saldo);

            lineScanner.close();
            /*Jeito não tão facil mas possivel de ser usado:
            * String [] values= line.slit(",");
            * System.out.println(values[posição]);
            * Utiliza uma expressão reglar para separar cada linha em uma posiçao do vetor*/
        }

    }
}
