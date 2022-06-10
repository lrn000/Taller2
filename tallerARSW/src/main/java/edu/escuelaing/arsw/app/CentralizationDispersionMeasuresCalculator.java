package edu.escuelaing.arsw.app;



public class CentralizationDispersionMeasuresCalculator {


    /**Calculate the mean of a list of values
     * @return mean
     * @param list list of valours
     */
    public static Double calculateMean(LinkedList<Double> list){
        Double summation=0.0 ;
        for(Double d: list){
            summation=summation+d;

        }
        summation=summation/list.size();
        return summation;
    }

    /** Calculates the standard deviation of a list of values
     * @return tandardDeviation
     * @param list list of valours
     */
    public static Double standardDeviation(LinkedList<Double> list){
        Double summation = 0.0;
        for (Double d : list){
            summation += Math.pow(d - calculateMean(list),2);
        }
        Double temp = summation/(list.size()-1);
        return Math.sqrt(temp);
    }
}
