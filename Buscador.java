import java.io.Serializable;
import java.util.ArrayList;
//import java.io.Serializable;

/**
 * Esta Clase pretende retornar la informacion importante que un usuario buscador o empleado puede tener
 * 
 * @author 
 * @since 3/10/2021
 * @version 0.2
 */

class Buscador extends Usuario implements Serializable{
    // Informacion Importante
    private String nombreCompleto; // Guarda el nombre completo
    private String celular; // Guarda el numero de telefono que tiene el buscador
    private int edad; // Guarda la edad del buscador
    private String direccion; // Guarda la direccion de donde vive el buscador
    private ArrayList<String> idiomas; // Guarda la coleccion de idiomas que puede hablar el buscador
    private ArrayList<String> titulos; // Guarda la coleccion de titulos que tiene el usuario
    private String gradoEscolarMax; // Guarda el grado maximo al que llego el buscador
    private String profesion; // Guarda la profesion del buscador

    private boolean contratado; // Esta variable guarda si el buscador esta contratado o no

    // Informacion Extra
    private ArrayList<String> otrosConocimientos; // Guarda otros conocimientos relevantes que tiene el usuario
    private boolean vacacionista; // Verificacion de si el buscador quiere ser vacacionistas o no
    private int anosExp; // Guarda los años de experiencia previa que tiene el usuario


    
    /**
     * Este es el metodo constructor en el que se ingresan los parametros que cada buscador debe tener
     * @param us
     * @param contra
     * @param nom
     * @param cel
     * @param direc
     * @param ed
     * @param idioma0
     * @param profe
     * @param tit
     * @param cor
     */
    public Buscador(String us, String contra, String nom, String cel,String direc, int ed, String idioma0, String profe, String tit, String cor,boolean contrat){
        super(cor, us, contra);
        idiomas = new ArrayList<String>();
        titulos = new ArrayList<String>();
        nombreCompleto = nom;
        celular = cel;
        direccion = direc;
        edad = ed;
        idiomas.add(idioma0);
        profesion = profe;
        gradoEscolarMax = tit;
        titulos.add(tit);
        contratado = contrat;
    }
    /**
     * Metodo overrideado de toString
     */
    public String toString(){
        return nombreCompleto+" "+edad+" "+titulos.get(0);
    }
    /**
     * En este metodo se setean los posibles idiomas que puede tener el buscador
     * @param idioma
     */
    public void setIdiomas(String idioma){
        idiomas.add(idioma);
    }
    /**
     * En este metodo se setean los titulos que el bucador puede tener
     * @param tit
     */
    public void setTitulos (String tit){
        titulos.add(tit);
    }
    /**
     * En este metodo se establece que un buscador esta contratado
     */
    public void setContratado(){
        contratado = true;
    }
    /**
     * En este metodo se setean los conocimientos extras que el buscador puede tener                    extra
     * @param conoce
     */
    public void setConocimientos (String conoce){
        otrosConocimientos.add(conoce);
    }

    /**
     * Este es un metodo getter del celular
     * @return retorna el numero de celular del buscador en forma de String
     */
    public String getCelular (){
        return celular;
    }
    /**
     * Este metodo es un getter de la edad del buscador
     * @return retorna la edad que el buscador tiene en forma de String
     */
    public int getEdad (){
        return edad;
    }
    /**
     * Este es un getter de la direccion del buscador
     * @return retorna la direccion del buscador en forma de String
     */
    public String getDireccion (){
        return direccion;
    }
    /**
     * Este es un getter del grado maximo que el usuario alcanzo
     * @return retorna el grado maximo del buscador en forma de String
     */
    public String getGradoMax (){
        return gradoEscolarMax;
    }
    /**
     * Este metodo es un getter de si es vacacionista o no el buscador                       extra
     * @return retorna un booleano de si es o no vacacionista
     */
    public boolean getVacacion (){
        return vacacionista;
    }
    /**
     * Es metodo getter de la profesion que tiene el buscador
     * @return retorna la profesion que el buscador tiene en forma de String
     */
    public String getProfesion(){
        return profesion;
    }
    /**
     * Es un metodo getter del nombre completo del buscador
     * @return retorna el nombre completo que tiene el buscador en forma de String
     */
    public String getNombre (){
        return nombreCompleto;
    }
    /**
     * Es un metodo getter de los idiomas que el buscador conoce
     * @return retorna el array Lyst que contiene a todos los idiomas en forma de String
     */
    public ArrayList<String> getIdiomas (){
        return idiomas;
    }
    /**
     * Es un metodo getter de los titulos que el buscador puede tener el buscador
     * @return retorna el array lyst con los posibles titulos en forma de String
     */
    public ArrayList<String> getTitulos(){
        return titulos;
    }
    /**
     * Es un metodo getter de los años de experiencia previa del buscador                                 extra
     * @return retorna un int
     */
    public int getAnosExp(){
        return anosExp;
    }
    /**
     * Este metodo es un getter de si esta o no contratado el usuario
     * @return retorna un boolean
     */
    public boolean getContratado(){
        return contratado;
    }

}