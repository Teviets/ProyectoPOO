/**
 * Esta clase es el controlador de todo el programa, inicializa app y gui los relaciona tanto de ida y vuelta
 * 
 * @author Sebastian Estrada Tuch
 * @since 3/10/2021
 * @version 0.1
 */
class Controlador{
    private static App jobGuider;
    private static GUI interfaz;
    public static void main(String[] args) {
        interfaz = new GUI();
    }
    public Controlador(){
        jobGuider = new App();
        
    }
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
    
    public App getApp(){
        return jobGuider;
    }

    
    
}