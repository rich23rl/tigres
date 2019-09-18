package edu.ujcv.progra2;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[5];
        initArray(array,5);

        Integer[] array2 = new Integer[8];
        initArray(array2,8);

        Object[] respuesta = concatArray(array,array2);
        printArray(respuesta);

       // Object[] respuesta2 = intercalar(array,array2);

       // printArray(respuesta2);



        //concatArray(array,array2);
        // 5,5,5,5,5,8,8,8,8,8,8,8,8

        //concatArray(array2,array);
        // 8,8,8,8,8,8,8,8,5,5,5,5,5

        //intercalarArray

        //separarArreglo
        //[4,4,4,5,5,6,7,8] [4,4,2,9,6]
        //5,5,7,8

        // busqueda
        // [3,5,2,8,9] 2
        //    2
        // [3,5,2,8,9] 10
        //  -1

        //ordenar
        // [3,5,2,8,9]
        // [2,3,5,8,9]

        //printArray

        Float[] arreglo = new Float[5];
        //initArray(arreglo,5.5);


    }

    public static <T>void initArray(T[]array, T elemento){
        for (int i = 0; i < array.length; i++) {
            array[i] = elemento;
        }
    }

    public static <T>T[] concatArray(T[] array, T[] array2){
        T[] retval = (T[])new Object[array.length + array2.length];

        int midpoint = 0;

        //System.arraycopy(array,0,retval,0,array.length);
        //System.arraycopy(array2,0,retval,array.length,array2.length);
        for (int i = 0; i < array.length; i++) {
            retval[i] = array[i];
            midpoint++;
        }

        for (int i = 0; i <array2.length ; i++) {

            retval[midpoint+i] = array2[i];

        }

        return retval;

    }


    public static <T>void printArray(T[] a){

        for (int i = 0; i < a.length; i++) {
            if(i == a.length -1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+", ");
        }
        System.out.println();
    }



}

