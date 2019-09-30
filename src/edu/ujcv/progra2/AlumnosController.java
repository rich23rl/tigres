package edu.ujcv.progra2;

public class AlumnosController {
    private AlumnosView view;
    private AlumnosModel model;


    public AlumnosController(){
        view = new AlumnosView();
        model= new AlumnosModel();
    }

    void presentarListaAlumnos(){
        view.verLista(model.getAlumnos());
    }

    void presentMenuObtenerResultado(){
        view.presentarMenuAlumnos();
        // obtener opcion
        int opcion = 1;
        switch (opcion){
            case 1:{
                view.pedirNombre();
                String nombre = obtenerNombre();
                String animalFavorito =obtenerAnimalFavorito();
                model.createAlumno(nombre,animalFavorito);
            }
                break;
            case 2:{

            }
                break;
                default:
                {

                }
        }

    }

    private String obtenerAnimalFavorito() {
        return "Perrito!! o Gatito!!";
    }

    private String obtenerNombre() {
        return "jaime";
    }


}
