package com.directi.training.codesmells.duplicatecode;
//java好難喔 抱歉我找不到
//我推薦一個 java大師給你 祐德廖
public class Statistics
{   //atcually i can't find the problem & java is not my major
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        double sum1 = 0;
        double average1;

        for (double element : array1) {
            sum1 += element;
        }
        average1 = sum1 / array1.length;

        double sum2 = 0;
        double average2;

        for (double element : array2) {
            sum2 += element;
        }
        average2 = sum2 / array2.length;

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double sum1 = 0;
        double average1;
        for (double element : elements) {
            sum1 += element;
        }
        average1 = sum1 / elements.length;
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}
