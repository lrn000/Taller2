package edu.escuelaing.arsw.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {


    private final String path = "src/main/resources/Column1.txt";
    private final String path2 = "src/main/resources/Column2.txt";


/*    public void deberiaCalcularMediaPath1(){
        File file = new File("src/main/resources/Column1.txt");
        LinkedList<Double> list = App.getDataFromFile(file);
        assertTrue(CentralizationDispersionMeasuresCalculator.calculateMean(list) == 550.60);

    }*/


    public void Calcularmedia(){
        LinkedList<Double> list=new LinkedList();
        list.add(15.0);
        list.add(69.0);
        list.add(6.5);
        list.add(22.4);
        list.add(28.4);
        list.add(65.9);
        list.add(19.4);
        list.add(198.7);
        list.add(38.8);
        list.add(138.2);
        Double mean=(CentralizationDispersionMeasuresCalculator.calculateMean(list));
        System.out.println(mean);
        assertTrue(mean==550.60);
    }



}
