package com.generic.com;

public class MaximumValue {

   Integer number1=2;
   Integer number2=1;
   Integer number3=3;

    public int checkIntegerMax() {

        Integer maximumNumber;
        if(number1.compareTo(number2)>0 && number1.compareTo(number3)>0){
            maximumNumber=number1;
        }else if (number2.compareTo(number3)>0){
            maximumNumber=number2;
        }else {
            maximumNumber=number3;
        }
        return maximumNumber;
    }
}
