import java.util.ArrayList;
import java.io.Serializable;
/**
 * En este metodo se relaciona con la clase buscador y los agrega a candidatos, tambien facilita la informacion de puesto para
 * la vista.
 * 
 * @author
 * @since 3/10/2021
 * @version 0.2
 */
class Puesto implements Serializable{
    private String nombrePuesto; // Es un String que contine el nombre del puesto
    private String descripcionDePuesto; // Es un String que contiene la descripcion del puesto
    private String necesidadDeTit; // Es un String que contiene si se requiere un titulo y que titulo
    private int edadMin; // Es es un int que contiene la edad minima como requisito para el puesto
    private int edadMax; // Es un int que contiene la edad maxima requerida para el puesto
    private int anosExp; // Es un int
    private boolean vacacionista; // Guarda si el puesto es o no de vacacionista
    private ArrayList<Buscador> candidatos = new ArrayList<Buscador>(); // Guarda los candidatos para el puesto
    private Buscador ganador; // Guarda el buscador que se vuelve empleado

    /**
     * Este metodo es el metodo constructor para un puesto requerido, en el cual como parametros tenemos todas las 
     * propiedades basicas para generar este puesto.
     * @param pues
     * @param descrip
     * @param tit
     * @param edMin
     * @param edMax
     * @param anosEx
     * @param vaca
     */
    public Puesto (String pues, String descrip, String tit, int edMin, int edMax, int anosEx){
        nombrePuesto = pues;
        descripcionDePuesto = descrip;
        necesidadDeTit = tit;
        edadMin = edMin;
        edadMax = edMax;
        anosExp = anosEx;
    }
    public String toString(){
        return nombrePuesto + " " + descripcionDePuesto + "<p>"+ edadMin+ "-"+edadMax+" anios "+ "tiempo de experiencia: "+anosExp;
    }
    /**
     * En este metodo asignamos un buscador que esta como parametro a los posibles candidatos
     * @param bus
     */
    public void agregarCandidato(Buscador bus){
        candidatos.add(bus);
    }
    /**
     * Este metodo nos permite separar al buscador que ocupa un puesto
     * @param i
     */
    public void seleccionGanador(int i){
        ganador = candidatos.get(i);
    }

    /**
     * Este metodo es un getter del nombre del puesto
     * @return retorna un String
     */
    public String getPuesto (){
        return nombrePuesto;
    }
    /**
     * Este metodo es un getter de la descripcion del puesto
     * @return retorna un String
     */
    public String getDescripcion (){
        return descripcionDePuesto;
    }
    /**
     * Este metodo es un getter del titulo recomendado
     * @return retorna un String
     */
    public String getTit (){
        return necesidadDeTit;
    }
    /**
     * Es un metodo getter de la edad minima requerida para el puesto
     * @return retorna un int
     */
    public int getEdadMin (){
        return edadMin;
    }
    /**
     * Es un metodo getter de la edad Maxima requerida para el puesto
     * @return retorn un int
     */
    public int getEdadMax (){
        return edadMax;
    }
    /**
     * Es un metodo getter de los años de experiencia recomendados
     * @return retorna un int
     */
    public int getExp (){
        return anosExp;
    }
    /**
     * Es un metodo getter de si el puesto esta disponible para vacacionistas o no 
     * @return
     */
    public boolean getVacacionoista (){
        return vacacionista;
    }
    /**
     * Es un metodo getter de los candidatos que tiene el puesto
     * @return retorna un array list de buscador
     */
    public ArrayList<Buscador> getCandidatos (){
        return candidatos;
    }
    /**
     * Este metodo es un getter de ganador
     * @return retorna un Buscador
     */
    public Buscador getGanador(){
        return ganador;
    }

}