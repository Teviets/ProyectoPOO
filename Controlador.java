/**
 * Esta clase es el controlador de todo el programa, inicializa app y gui los relaciona tanto de ida y vuelta
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/10/2021
 * @version 0.2
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
        for (int i = 0; i<jobGuider.getCandidatos().size(); i++){
            if ((jobGuider.getCandidatos().get(i).getContra().equals(contra) == true) && (jobGuider.getCandidatos().get(i).getUsuario().equals(us) == true)){
                corrector = true;
            }
        }
        for (int i = 0; i<jobGuider.getEmpresas().size(); i++){
            if ((jobGuider.getEmpresas().get(i).getUsuario().equals(us) == true) && (jobGuider.getEmpresas().get(i).getContra().equals(contra) == true)){
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
    public int identificador (String us, String contra){
        int indice = 0;
        for (int i = 0; i<jobGuider.getCandidatos().size(); i++){
            if ((jobGuider.getCandidatos().get(i).getContra().equals(contra) == true) && (jobGuider.getCandidatos().get(i).getUsuario().equals(us) == true)){
                indice = i;
                break;
            }
        }
        for (int i = 0; i<jobGuider.getEmpresas().size(); i++){
            if ((jobGuider.getEmpresas().get(i).getUsuario().equals(us) == true) && (jobGuider.getEmpresas().get(i).getContra().equals(contra) == true)){
                indice = i;
                break;
            }
        }
        return indice;
    }

    /**
     * Este verificador revisa de quien es el usuario y contraseña y si estos pertenecen a candidatos o si pertenecen a empresas
     * @return retorna un Boolean
     */
    public boolean verificador2(String us, String contra){
        boolean x = false;
        for (int i = 0; i<jobGuider.getCandidatos().size(); i++){
            if ((jobGuider.getCandidatos().get(i).getContra().equals(contra) == true) && (jobGuider.getCandidatos().get(i).getUsuario().equals(us) == true)){
                x = false;
            }
        }
        for (int i = 0; i<jobGuider.getEmpresas().size(); i++){
            if ((jobGuider.getEmpresas().get(i).getUsuario().equals(us) == true) && (jobGuider.getEmpresas().get(i).getContra().equals(contra) == true)){
                x = true;
            }
        }
        return x;
    }

    /**
     * 
     * Este metodo permite crear un nuevo Buscador
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
    public void nuevoBuscador(String us, String contra, String nom, String cel, String direc, int ed, String idioma0, String profe, String tit, String cor){
        jobGuider.nuevoBuscador(us, contra, nom, cel, direc, ed, idioma0, profe, tit, cor);
    }
    /**
     * Este metodo crea una nueva empresa
     * @param us
     * @param contr
     * @param name
     * @param objeto
     * @param corr
     * @param num
     */
    public void nuevaEmpresa(String us, String contr,String name,String objeto, String corr, String num){
        jobGuider.nuevaEmp(us, contr, name, objeto, corr, num);
    }
    /**
     * Este metodo reinicia la GUI
     */
    public void reinicioDeGui(){
        
        interfaz.reinicio();
    }
    /**
     * Este metodo es un getter de App
     * @return
     */
    public App getApp(){
        return jobGuider;
    }

    
    
}