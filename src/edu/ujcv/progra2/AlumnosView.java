package edu.ujcv.progra2;

import java.util.ArrayList;

public class AlumnosView {

    void presentarMenuAlumnos(){
        System.out.println(" Menu Alumnos!");
        System.out.println("1.agregar");
        System.out.println("2.salir");
    }

    void pedirNombre(){
        System.out.println("ingrese el Nombre");
    }

    void pedirAnimalFavorito(){
        System.out.println("ingrese animal favorito");
    }

    void verLista(ArrayList<Alumnos> alumnos){
        System.out.println("\t\tAlumnos:");
        System.out.println("#,\tnombre, \tanimalFavorito");
        int i = 1;
        for (Alumnos alumno : alumnos){
            System.out.println(""+(i++)+"\t"+alumno);
        }
    }
}
