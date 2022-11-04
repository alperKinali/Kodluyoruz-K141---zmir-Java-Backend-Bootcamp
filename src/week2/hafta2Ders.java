package week2;

import week1.hafta1Ders.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class hafta2Ders {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        int myInt[]={1 , 4 , 5 , 6 };
        for (int i=0;i<myInt.length;i++ ){
            System.out.println(myInt[i]);

        }
        for (int value: myInt) {

        }

         */
        /*
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);

        System.out.println("a : "+ a + "b : "+ b);

        a="xyz";

        System.out.println(a == b);
        System.out.println("a : "+ a + "b : "+ b);

         */
        String a="abc";
        String b ="xyz";

        // concat
        String x = a+ b ;

        //concat 2
        x =a.concat(b);

        // daha performanslı işlermler için
        // strirnf buffer ve builder kullanılır.

        /*
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(b);
        stringBuilder.toString();
        // burada tek bir değer üretilir
        // memory ve cpu kullanımı daha efektif.
        // örnein 100 lük loop olustur ve stringleri birşlelitr
        // aynı işlemi bufferda

        /
         */

        /*
        LocalDate yesterday = LocalDate.parse("2020-11-22");
        System.out.println("yesterday " + yesterday);


         */

        /*
        LocalDate yesterday2 =  new SimpleDateFormat(("yyyy-dd--mm")));
        System.out.println("yesterday " + yesterday);
         */

        /*
        ArrayOperations operations = new ArrayOperations();
        int[] numbers = new int[7];
        try {
            System.out.println("try block is started");
            operations.putValue(numbers, 10, 27);
            System.out.println("try block is ended");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception catched " + ex.toString());
        }

        System.out.println("Program ends gracefully");

         */
        /*
        int[] numbers = new int[] {1, 34, 56, 23, 78, 123, 49};
        int[] dividers = new int[] {5, 0, 12, 0, 34};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + dividers[i] + "=" + numbers[i]/dividers[i]);

            } catch (RuntimeException ex) {
                System.out.println("Another exception catched : " + ex);
                throw  new UderNotFoundException("",ex);
            }
        }

        System.out.println("Program ended successfully");


         */

        /*

        FileInputStream input = null;
        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            input = new FileInputStream(classLoader.getResource("file.txt").getFile());

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("Exception occurred while closing file");
                }
            }
        }
        ArrayOperations op = new ArrayOperations();

        //op.putValue(new int[]{1,2},0,12);

         */


    }
}
