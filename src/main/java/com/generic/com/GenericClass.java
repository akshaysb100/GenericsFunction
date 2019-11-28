package com.generic.com;

public class GenericClass<X,Y,Z> {

    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public GenericClass(X[] myXArray,Y[] myYArray,Z[] myZArray){
        this.myXArray =myXArray;
        this.myYArray =myYArray;
        this.myZArray =myZArray;
    }

    public GenericClass() {

    }

    public void toPrint(){
        genericPrint(myXArray);
        genericPrint(myYArray);
        genericPrint(myZArray);
    }
    public static<T> void genericPrint(T[] value){

        for (T array : value){
            System.out.println(array);
        }
    }

}
