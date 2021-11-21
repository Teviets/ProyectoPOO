import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
/**
 * En esta clase se pueden generar nuevos empleados, nuevos puestos y asignar un puesto 
 * a un empleado
 * 
 * @author Sebastian Estrada Tuch
 * @since 18/09/2021
 * @version 0.1
 */
class Empresa{
    private String nombre; // Guarda el nombre de la empresa
    private String objeto; // Guarda el objetivo que tiene la empresa
    private ArrayList<String> identificadores = new ArrayList<>(); // Este array List guarda todos los identificadores de los empleados
    private ArrayList<Puesto> puestos = new ArrayList<>(); // Guarda todos los puestos generados
    private ArrayList<Empleado> empleados = new ArrayList<>(); // Guarda a todos los empleados que tiene la empresa
    private Random rand; // Es una variable que guarda un random

    /**
     * En este metodo es el metodo constructor, que setea el objeto y el nombre de la empresa que ambas son Strings
     * @param name
     * @param prop
     */
    public Empresa (String name, String prop){
        nombre = name;
        objeto = prop;
    }
    /**
     * Este metodo genera un nuevo empleado con un puesto y se le asigna un identificador
     * @param i
     * @param j
     */
    private void nuevoEmpleadoEnPlat (int i,int j){
        Puesto momentum = puestos.get(j);
        Empleado momentumE = new Empleado(momentum.getCandidatos().get(i), momentum.getPuesto() );
        empleados.add(momentumE);


        
        if (identificadores.size() != 0){
            boolean x = true; // boolean para el ciclo while
            while (x == true){
                // genera los tres posibles numeros para el identificador
                String identificador1 = Integer.toString(rand.nextInt(9));
                String identificador2 = Integer.toString(rand.nextInt(9));
                String identificador3 = Integer.toString(rand.nextInt(9));
                // Se le asigna los 3 identificadores al identificador final
                String identificadorFinal = identificador1 + identificador2 + identificador3;
                /* Si identificadores contiene el identificador final se genera otro identificador final si no se le asigna el identificador
                   al array list de identificadores y se le asigna al nuevo empleado su nuevo idientificador
                */
                if (identificadores.contains(identificadorFinal) == true){
                    x = true;
                }else if (identificadores.contains(identificadorFinal) == false){
                    identificadores.add(identificadorFinal);
                    empleados.get(-1).generadorDeIdentificador(identificadorFinal);
                    x = false;
                }
            }
        }

    }
    /**
     * En este metodo se creo un nuevo puesto
     * @param pues
     * @param descrip
     * @param tit
     * @param edMin
     * @param edMax
     * @param añoEx
     * @param vaca
     */
    public void nuevoPuesto (String pues,String descrip, String tit, int edMin, int edMax, int añoEx, boolean vaca){
        Puesto puestoMoment = new Puesto(pues, descrip, tit, edMin, edMax, añoEx, vaca);
        puestos.add(puestoMoment);
    }
    /**
     * Este es un metodo getter de los identificadores
     * @return retorna un arraylist de strings
     */
    public ArrayList<String> getIdentificadores(){
        return identificadores;
    }
    /**
     * Este es un metodo getter de los puestos que tiene una empresa
     * @return retorna un arraylist de puestos
     */
    public ArrayList<Puesto> getPuestos(){
        return puestos;
    }
    /**
     * Este es un metodo getter de los empleados
     * @return retorna un arraylist de empleados
     */
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    /**
     * Es un metodo getter del nombre de la empresa
     * @return retorna un String
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Este es un metodo getter del objeto de la empresa
     * @return retorna un String
     */
    public String getObjeto(){
        return objeto;
    }
}