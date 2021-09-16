import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
/** */
class Empresa{
    private String nombre;
    private String objeto;
    private ArrayList<String> identificadores = new ArrayList<>();
    private ArrayList<Puesto> puestos = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private Random rand;

    public Empresa (String name, String prop){
        nombre = name;
        objeto = prop;
    }
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
    private void nuevoPuesto (String pues,String descrip, String tit, int edMin, int edMax, int añoEx, boolean vaca){
        Puesto puestoMoment = new Puesto(pues, descrip, tit, edMin, edMax, añoEx, vaca);
        puestos.add(puestoMoment);
    }
    public ArrayList<String> getIdentificadores(){
        return identificadores;
    }
    public ArrayList<Puesto> getPuestos(){
        return puestos;
    }
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    public String getNombre(){
        return nombre;
    }
    public String getObjeto(){
        return objeto;
    }
}