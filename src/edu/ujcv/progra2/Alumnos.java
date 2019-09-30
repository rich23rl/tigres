package edu.ujcv.progra2;

//pojo
public class Alumnos {
    private String name;
    private String favoritAnimal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoritAnimal() {
        return favoritAnimal;
    }

    public void setFavoritAnimal(String favoritAnimal) {
        this.favoritAnimal = favoritAnimal;
    }

    public Alumnos(String name, String favoritAnimal){
        this.name = name;
        this.favoritAnimal = favoritAnimal;
    }

    public Alumnos()
    {

    }

    public String toString(){
        return name+",\t"+favoritAnimal;
    }
}
