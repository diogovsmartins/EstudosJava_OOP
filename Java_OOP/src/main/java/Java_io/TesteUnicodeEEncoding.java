package Java_io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args)throws UnsupportedEncodingException {
        String s="C";
        System.out.println(s.codePointAt(0));
        Charset charset=Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes=s.getBytes("UTF-8");
        System.out.println(bytes.length+", Charset UTF-8");

        String byteString= new String(bytes,"UTF-8" );
        System.out.println(byteString);

        bytes=s.getBytes("windows-1252");
        System.out.println(bytes.length+", windows-1252");

        byteString= new String(bytes,"windows-1252" );
        System.out.println(byteString);

        bytes=s.getBytes("UTF-16");
        System.out.println(bytes.length+", UTF-16");

        byteString= new String(bytes,"UTF-16" );
        System.out.println(byteString);

        bytes=s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length+", ASCII");

        byteString= new String(bytes,"ASCII" );
        System.out.println(byteString);



    }
}
