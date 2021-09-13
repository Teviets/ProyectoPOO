import java.util.ArrayList;

class Buscador{
    private String profesion; // Guarda la profesion del buscador
    private String celular; // Guarda el numero de telefono que tiene el buscador
    private String nombreCompleto; // Guarda el nombre completo
    private String edad; // Guarda la edad del buscador
    private String direccion; // Guarda la direccion de donde vive el buscador
    private ArrayList<String> idiomas; // Guarda la coleccion de idiomas que puede hablar el buscador
    private ArrayList<String> titulos; // Guarda la coleccion de titulos que tiene el usuario
    private String gradoEscolarMax; // Guarda el grado maximo al que llego el buscador
    private ArrayList<String> otrosConocimientos; // Guarda otros conocimientos relevantes que tiene el usuario
    private boolean vacacionista; // Verificacion de si el buscador quiere ser vacacionistas o no

    public Buscador(String prof, String cel, String nom, String Ed, String direc, String grad, boolean vac){
        profesion = prof;
        celular = cel;
        primerNombre = nom;
        edad = Ed;
        direccion = direc;
        gradoEscolarMax = grad;
        vacacionista = vac;
    }
    public void setIdiomas(String idioma){
        idiomas.add(idioma);
    }
    public void setTitulos (String tit){
        titulos.add(tit);
    }
    public void setConocimientos (String conoce){
        otrosConocimientos.add(conoce);
    }

    public String getProfesion(){
        return profesion;
    }
    public String getNombre (){
        return nombreCompleto;
    }
    public ArrayList<String> getIdiomas (){
        return idiomas;
    }
    public ArrayList<String> getTitulos(){
        return titulos;
    }

}