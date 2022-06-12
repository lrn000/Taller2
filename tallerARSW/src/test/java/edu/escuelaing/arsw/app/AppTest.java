package edu.escuelaing.arsw.app;

import org.junit.Test;
import junit.framework.TestCase;


import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {


   final String path = "src/main/resources/Column1.txt";
    final String path2 = "src/main/resources/Column2.txt";



    @Test
    public void testMeanColum1(){
        File file = new File("src/main/resources/Column1.txt");
        LinkedList<Double> list = App.getDataFromFile(file);
        assertTrue(CentralizationDispersionMeasuresCalculator.mean(list) == 550.60);
    }

    @Test
    public void testMeanColum2(){
        File file = new File("src/main/resources/Column2.txt");
        LinkedList<Double> list = App.getDataFromFile(file);
        assertTrue(CentralizationDispersionMeasuresCalculator.mean(list) == 60.32);
    }

    @Test
    public void testStandardDeviationColum1(){
        File file = new File("src/main/resources/Column1.txt");
        LinkedList<Double> list = App.getDataFromFile(file);
        assertTrue(CentralizationDispersionMeasuresCalculator.standardDeviation(list) == 572.03);
    }

    @Test
    public void testStandardDeviationColum2(){
        File file = new File("src/main/resources/Column2.txt");
        LinkedList<Double> list = App.getDataFromFile(file);
        assertTrue(CentralizationDispersionMeasuresCalculator.standardDeviation(list) == 62.26);
    }





}
