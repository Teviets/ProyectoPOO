import java.util.ArrayList;
import java.io.*;
/**
 * Esta clase pretende iniciar las primeras empresas y candidatos y retornar la informacion relevante
 * @author Gonzalo Santizo
 * @author Sebastian Estrada
 * @since 22/10/2021
 * @version 0.2
 */
class App implements Serializable{
    private ArrayList<Empresa> empresas = new ArrayList<Empresa>(); // Guarda las empresas registradas
    private ArrayList<Buscador> candidatos = new ArrayList<Buscador>(); // Guarda los buscadores que son candidatos a puestos
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();// Guarda a todos los uaurios que hay en la aplicacion

    /**
     * Este metodo constructor inicializa empresas y buscadores y los agrega a su arraylist correspondiente
     */
    public App(){
        empresas.add(new Empresa("Integral", "123456", "Integral", "Compra, Venta y distribucion de productos de limpieza","@gmail.com","15491987"));
        empresas.add(new Empresa("SETEC", "123456", "SETEC", "Todo lo relacionado al licito comercio de productos y servicios tecnologicos","@gmail.com","15491987"));
        empresas.add(new Empresa("ALSIMSA", "123456", "ALSIMSA", "Construccion y venta de todos lo relacionado","@gmail.com","15491987"));
        candidatos.add(new Buscador("JuanCarlo1","123456","Sebastian Estrada Tuch", "41669282", "4ta Calle6-80 zona 34 pensilvania", 18, "Espanol",  "Ingeniero en sistemas", "Ingeniero","teviet@gmail.com",false));
        candidatos.add(new Buscador("Gonzalo1","123456","Gonzalo Santizo", "45448282", "5ta Avenida 6-80 zona 14 Madrid", 21, "Espanol", "Ingeniero en sistemas", "Ingeniero","teviet@gmail.com",false ));
        candidatos.add(new Buscador("DavidBerkham","123456","David Beckham", "45627894", "8ta Calle 15-95 zona 1 Londres", 34, "Ingles", "Futbolista", "Bachillerato","teviet@gmail.com",false ));
        this.actualizarUsers();
        empresas.get(0).nuevoPuesto("Tecnico", "Paga Q100.00 al dia", "No es necesario", 20, 30, 4);
        
    }
    /**
     * Este metodo hace que todos los usuarios independientemente de si son o no empresas
     */
    private void actualizarUsers(){
        for (int i = 0; i<empresas.size(); i++){
            usuarios.add(empresas.get(i));
        }
        for (int i = 0; i<candidatos.size();i++){
            usuarios.add(candidatos.get(i));
        }
    }

    /**
     * Este metodo registra un nuevo usuario
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
        try {
            Buscador busc = new Buscador(us,contra,nom,cel,direc,ed,idioma0,profe,tit,cor,false);
            candidatos.add(busc);
            usuarios.add(busc);
            //System.out.println(candidatos.get(-1).getEdad());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
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
    public void nuevaEmp(String us, String contr,String name,String objeto, String corr, String num){
        try {
            Empresa emp = new Empresa(us,contr,name,objeto,corr,num);
            empresas.add(emp);
            usuarios.add(emp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * Este metodo es un getter de las empresas
     * @return retorna un arrraylist de empresas
     */
    public ArrayList<Empresa> getEmpresas(){
        return empresas;
    }
    /**
     * Este es un metodo getter de los candidatos
     * @return retorna un arraylist de buscadores
     */
    public ArrayList<Buscador> getCandidatos(){
        return candidatos;
    }
    /**
     * Este es un metodo getter de los candidatos
     * @return retorna un arraylist de usuarios
     */
    public ArrayList<Usuario> getUsers(){
        return usuarios;
    }
}