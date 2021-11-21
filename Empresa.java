import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
/**
 * En esta clase se pueden generar nuevos empleados, nuevos puestos y asignar un puesto 
 * a un empleado
 * 
 * @author 
 * @since 3/10/2021
 * @version 0.2
 */
class Empresa extends Usuario implements Serializable{
    private String nombre; // Guarda el nombre de la empresa
    private String objeto; // Guarda el objetivo que tiene la empresa
    private String numeroDeEmp; // Guarda el numero celular de la empresa
    private ArrayList<Puesto> puestos = new ArrayList<Puesto>(); // Guarda todos los puestos generados

    /**
     * En este metodo es el metodo constructor, que setea el objeto y el nombre de la empresa que ambas son Strings
     * @param us
     * @param contra
     * @param name
     * @param prop
     * @param cor
     * @param num
     */
    public Empresa (String us, String contra, String name, String prop, String cor, String num){
        super(cor, us, contra);
        nombre = name;
        objeto = prop;
        numeroDeEmp = num;
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
    public void nuevoPuesto (String pues,String descrip, String tit, int edMin, int edMax, int anoEx){
        Puesto momento = new Puesto(pues, descrip, tit, edMin, edMax, anoEx);
        puestos.add(momento);
    }
    /**
     * Este metodo agrega un nuevo candidato a un puesto especifico
     * @param i
     * @param busca
     */
    public void candidato(int i, Buscador busca){
        puestos.get(i).agregarCandidato(busca);
    }
    /**
     * Este metodo establece quien ocupa un puesto
     * @param i
     * @param j
     */
    public void empleado(int i, int j){
        puestos.get(i).seleccionGanador(j);
    }
    /**
     * Este es un metodo getter de los puestos que tiene una empresa
     * @return retorna un arraylist de puestos
     */
    public ArrayList<Puesto> getPuestos(){
        return puestos;
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
    /**
     * Este es un metodo getter del numero de Empresa
     * @return retorna un String 
     */
    public String getNumeroDeEmp(){
        return numeroDeEmp;
    }
    
}