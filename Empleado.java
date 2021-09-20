class Empleado{
    private String puesto; // Guarda el nombre del puesto que tiene el empleado
    private String identificador; // Guarda el numero identificador del empleado
    private String nombrePer; // Guarda el nombre del empleado

    /**
     * Este es el metodo constructor de un empleado, se guarda todos los datos necesarios de cada empleado para 
     * esta plataforma
     * @param ganador
     * @param pues
     */
    public Empleado(Buscador ganador, Puesto pues){
        puesto = pues.getPuesto();
        nombrePer = ganador.getNombre();
    }
    /**
     * Este metodo es un setter mediante un parametro que la empresa asigna al empleado
     * @param iden
     */
    public void generadorDeIdentificador (String iden){

        identificador = iden;
        
    }
    /**
     * Este metodo es un getter del nombre del puesto del empleado
     * @return retorna un String
     */
    public String getPuesto (){
        return puesto;
    }
    /**
     * Es un metodo getter del identificador del empleado
     * @return retorna un String
     */
    public String getIdentificador(){
        return identificador;
    }
    /**
     * Es un metodo getter del nombre del empleado
     * @return retorna el nombre del empleado
     */
    public String getNombrePer(){
        return nombrePer;
    }

}