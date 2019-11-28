package com.generic.com;

public class PrintArray<X,Y,Z> {

    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public PrintArray(X[] myArray,Y[] myYArray,Z[] myZArray ){
        this.myXArray=myArray;
        this.myYArray=myYArray;
        this.myZArray=myZArray;
    }

    public static void main(String[] args) {

        Integer[] integerArray={1,2,3,4};
        Double[] doublesArray={1.1,2.1,4.5};
        Character[] characterArray={'a','p','s'};

        GenericClass.genericPrint(integerArray);
        GenericClass.genericPrint(doublesArray);
        GenericClass.genericPrint(characterArray);

//        new PrintArray<Integer>(integerArray).toPrint();
//        new PrintArray<Double>(doublesArray).toPrint();
//        new PrintArray<Character>(characterArray).toPrint();
        GenericClass<Integer,Double,Character> integerArrays = new GenericClass<Integer,Double, Character>(integerArray,doublesArray,characterArray);
        integerArrays.toPrint();

        //new PrintArray<Integer,Double,Character>(integerArray,doublesArray,characterArray).toPrint();
    }

    private  void toPrint(){
        genericPrint(myXArray);
        genericPrint(myYArray);
        genericPrint(myZArray);
    }
    private static<T> void genericPrint(T[] stringArray) {

        for (T array : stringArray){
            System.out.println(array);
        }
    }
}
