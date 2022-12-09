package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.Copies;

public class Program {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);

        copy(myDoubles, myObjs);

        printList(myObjs);


        /*

        // CONTROVARIÂNCIA

        List<Object> myObjects = new ArrayList<Object>();
        myObjects.add("Maria");
        myObjects.add("Alex");

        List<? super Number> myNumbers = myObjects; // < Qualquer tipo ou Qualquer super tipo de number

        myNumbers.add(10);
        myNumbers.add(3.14);

        Number x = myNumbers(0); // erro get
        */

        /*
        // COVARIANCIA: 

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        list.add(20); // erro put
        */

    }
//                                   SUB tipos                      SUPER tipo
    public static void copy(List<? extends Number> origin, List<? super Number> destino) {
        for (Number number : origin) {
            destino.add(number);
        }
    } 

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
    }

}