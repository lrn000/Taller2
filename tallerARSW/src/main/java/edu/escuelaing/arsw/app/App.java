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

        File file = new File(args[0]);
        //File file = new File("src/main/resources/Column2.txt");
        LinkedList<Double> list = getDataFromFile(file);
        System.out.println(list.size());
        /*System.out.println(CentralizationDispersionMeasuresCalculator.calculateMean(list));
        System.out.println(CentralizationDispersionMeasuresCalculator.standardDeviation(list));*/
    }

    public static LinkedList<Double> getDataFromFile(File file){
        LinkedList<Double> data = new LinkedList<Double>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            Double number;
            while ((line = bufferedReader.readLine()) != null){
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
