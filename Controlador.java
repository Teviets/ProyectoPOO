/**
 * Esta clase es el controlador de todo el programa, inicializa app y gui los relaciona tanto de ida y vuelta
 * 
 * @author Sebastian Estrada Tuch
 * @since 15/10/2021
 * @version 0.11
 */
class Controlador{
    private App jobGuider;// Esta variable nos permite generar la app
    private static GUI interfaz; // En esta variable se generara la interfaz grafica
    /**
     * Este es el metodo main el cual es el que ejecutara todo el programa
     * @param args
     */
    public static void main(String[] args) {
        interfaz = new GUI();
    }
    /**
     * Este es el metodo constructor e inicializa jobGuider
     */
    public Controlador(){
        jobGuider = new App();
        
    }
    /**
     * Este metodo es el verificador de si se coloco la misma contraseña y usuario que lo que existe en jobGuider 
     * @param us
     * @param contra
     * @param corrector
     * @return retorna un boolean
     */
    public boolean verificador (String us, String contra, boolean corrector){
        for (int i = 0; i<jobGuider.candidatos.size(); i++){
            if ((jobGuider.candidatos.get(i).getContra().equals(contra) == true) && (jobGuider.candidatos.get(i).getUsuario().equals(us) == true)){
                corrector = true;
            }
        }
        for (int i = 0; i<jobGuider.empleados.size(); i++){
            if ((jobGuider.empleados.get(i).getContra().equals(contra) == true) && (jobGuider.empleados.get(i).getUsuario().equals(us) == true)){
                corrector = true;
            }
        }
        for (int i = 0; i<jobGuider.empresas.size(); i++){
            if ((jobGuider.empresas.get(i).getUsuario().equals(us) == true) && (jobGuider.empresas.get(i).getContra().equals(contra) == true)){
                corrector = true;
            }
        }
        return corrector;
    }
    /**
     * Este es un verificador que busca obtener el indice para retornarlo
     * @param us
     * @param contra
     * @param indice
     * @return retorna un int
     */
    public int verificador1 (String us, String contra, int indice){
        for (int i = 0; i<jobGuider.candidatos.size(); i++){
            if ((jobGuider.candidatos.get(i).getContra().equals(contra) == true) && (jobGuider.candidatos.get(i).getUsuario().equals(us) == true)){
                indice = i;
                break;
            }
        }
        for (int i = 0; i<jobGuider.empleados.size(); i++){
            if ((jobGuider.empleados.get(i).getContra().equals(contra) == true) && (jobGuider.empleados.get(i).getUsuario().equals(us) == true)){
                indice = i;
                break;
            }
        }
        for (int i = 0; i<jobGuider.empresas.size(); i++){
            if ((jobGuider.empresas.get(i).getUsuario().equals(us) == true) && (jobGuider.empresas.get(i).getContra().equals(contra) == true)){
                indice = i;
                break;
            }
        }
        return indice;
    }
    /**
     * Este metodo es un getter de App
     * @return
     */
    public App getApp(){
        return jobGuider;
    }

    
    
}