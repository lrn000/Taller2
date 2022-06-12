package edu.escuelaing.arsw.app;



public class CentralizationDispersionMeasuresCalculator {


    /**Calculate the mean of a list of values
     * @return mean
     * @param list list of valours
     */
    public static Double mean(LinkedList<Double> list){
        Double summation=0.0 ;
        for(Double d: list){
            summation=summation+d;

        }
        summation=summation/list.size();
        summation=Math.round(summation*100.0)/100.0;
        return summation;
    }

    /** Calculates the standard deviation of a list of values
     * @return standardDeviation
     * @param list list of valours
     */
    public static Double standardDeviation(LinkedList<Double> list){
        Double summation = 0.0;
        for (Double d : list){
            summation += Math.pow(d - mean(list),2);
        }
        Double temp = summation/(list.size()-1);
        return Math.round(Math.sqrt(temp) *100.0)/100.0;
    }
}
