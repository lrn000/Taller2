package edu.escuelaing.arsw.app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class App {

    /**
     * Method responsible for printing the mean and standard deviation
     *
     */

    public static void main( String[] args ) {

        File fileName = new File(args[0]);
        LinkedList<Double> list = getDataFromFile(fileName);
        System.out.println(CentralizationDispersionMeasuresCalculator.mean(list));
        System.out.println(CentralizationDispersionMeasuresCalculator.standardDeviation(list));
    }

    public static LinkedList<Double> getDataFromFile(File fileName){
        LinkedList<Double> data = new LinkedList<Double>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            Double number;
            while ((line = bf.readLine()) != null){
                number = Double.valueOf(line);
                data.add(number);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return data;
    }
}
