import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Esta clase utiliza JFrame para generar una interfaz grafica e implementa ActionListener para el uso de botones y permitir al usuario
 * navegar por el programa. Pertenece a la vista del movelo MVC
 * 
 * @author Sebastian Estrada Tuch
 * @since 22/10/2021
 * @version 0.25
 */
class GUI extends JFrame implements ActionListener{
    
    private int indic;// Sirve para guardar indices de arrayList
    private boolean corrector; // Sirve para identificar la autorizacion del controlador

    private Controlador controladorcito = new Controlador(); // Se instancia un nuevo controlador
    
    private JFrame perfil;
    private JFrame preRegis;
    private JFrame registroF;
    private JFrame aplicaATr;

    private JButton inicioSesion;// Es el boton de inicion de sesion
    private JButton registro; // Boton de registro
    private JButton busquedaTrabajo; // Boton de busqueda de trabajo
    private JButton preRegistroEmp;
    private JButton preRegistroBusc;
    private JButton paraRegistro;// Boton de registro Completo
    private JButton paraRegistro1;
    private JButton nuevoPuesto;
    private JButton estadoPuesto;

    // JTextFields buscador
    private JTextField usuario; // txt Box de usuario
    private JPasswordField contra; // txt box de contrasena
    private JTextField correo;// txt box para registro
    private JTextField ulTitulo;// txt box para registro
    private JTextField edadcita;// txt box para registro
    private JTextField idiomita;// txt box para registro
    private JTextField nombreB; // Guarda el nombre del buscador
    private JTextField celB; // Guarda el celular del buscador
    private JTextField direcB; // Guarda la direccion del buscado
    private JTextField profB; // Guarda la profesion del buscador
    private JTextField sIdioma;// txt box para registro
    
    //JTextFields de Empresa
    private JTextField usuario1; // txt box de usuario1
    private JPasswordField contra1;// txt box de contrasena1
    private JTextField correo1;// txt box para registro
    private JTextField nombreE;
    private JTextField celularcito;
    private JTextField objetito;// txt box para registro
    
    
    
    
    
    
    /**
     * Esta clase muestra la ventana principal del programa
     */
    public  GUI(){

        JPanel soloLabels = losLabelPrincipal();
        JPanel botones = paraBotonesPrincipal();
        JPanel txtFields = paraLosTxtField();
        establecerTXTb(txtFields);
  
        this.setTitle("JobGuider");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setResizable(false);
        this.setSize(420,500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(soloLabels);
        this.add(botones);
        this.add(txtFields);

    }
    public void reinicio(){
        JPanel soloLabels = losLabelPrincipal();
        JPanel botones = paraBotonesPrincipal();
        JPanel txtFields = paraLosTxtField();
        establecerTXTb(txtFields);
  
        this.setTitle("JobGuider");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123456));
        this.setResizable(false);
        this.setSize(420,500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(soloLabels);
        this.add(botones);
        this.add(txtFields);
    }
    /**
     * Esta clase hace el panel para los labels de inicio de sesion (Usuario y password)
     * @return retorna un JPanel
     */
    private JPanel losLabelPrincipal(){
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel usuario = new JLabel();
        usuario.setText("User: ");
        usuario.setForeground(Color.white);
        usuario.setVerticalAlignment(JLabel.CENTER);
        usuario.setHorizontalAlignment(JLabel.CENTER);
        usuario.setBackground(Color.black);
        usuario.setOpaque(true);
        usuario.setBorder(border);
        usuario.setBounds(70,0,80,25);

        JLabel contra = new JLabel();
        contra.setText("Password: ");
        contra.setForeground(Color.white);
        contra.setVerticalAlignment(JLabel.CENTER);
        contra.setHorizontalAlignment(JLabel.CENTER);
        contra.setBackground(Color.black);
        contra.setOpaque(true);
        contra.setBorder(border);
        contra.setBounds(70,25,80,25);

        JPanel onlyTxt = new JPanel();
        onlyTxt.setBackground(new Color(0x123456));
        onlyTxt.setBounds(0,150,150,150);
        onlyTxt.setLayout(null);
        onlyTxt.add(usuario);
        onlyTxt.add(contra);

        return onlyTxt;
    }
    /**
     * Este metodo sirve para colocar los primeros 2 botones de la pagina de inicio (Iniciar sesion y registro)
     * @return retorna un JPanel
     */
    private JPanel paraBotonesPrincipal(){
        inicioSesion = new JButton();
        inicioSesion.setBounds(30,0,120,25);
        inicioSesion.addActionListener(this); 
        inicioSesion.setText("Iniciar Sesion");
        

        registro = new JButton();
        registro.setBounds(30,26,120,25);
        registro.addActionListener(this);
        registro.setText("Registro");

        
        JPanel paraBotones = new JPanel();
        paraBotones.setBackground(new Color(0x123456));
        paraBotones.setBounds(151,300,150,450);
        paraBotones.setLayout(null);
        paraBotones.add(inicioSesion);
        paraBotones.add(registro);

        return paraBotones;
    }
    /**
     * Este metodo sirve para la creacion de un JPanel en el que se colocaran los txt box en la pagina de inicio
     * @return retorna un JPanel
     */
    private JPanel paraLosTxtField(){
        JPanel paratxtBox = new JPanel();
        paratxtBox.setBackground(new Color(0x123456));
        paratxtBox.setBounds(150,150,150,75);
        paratxtBox.setLayout(null);
        return paratxtBox;
    }
    /**
     * Este metodo coloca en un panel que tiene como parametro los txt Box necesarios para el inicio de sesion
     * @param panel
     */
    private void establecerTXTb(JPanel panel){
        usuario = new JTextField();
        usuario.setBounds(30,0,120,25);

        contra = new JPasswordField();
        contra.setBounds(30,26,120,25);

        panel.add(usuario);
        panel.add(contra);

    }
    /**
     * Este metodo muestra el perfil de una empresa, permitira buscar candidatos para puestos y generar puestos
     */
    public void IniciarSesionEmp(int i,Controlador cont){
        perfil = new JFrame();

        JPanel txtInfoGen = new JPanel();

        JLabel bienvenida = new JLabel("Bienvenido "+ cont.getApp().getEmpresas().get(i).getNombre());
        bienvenida.setBounds(160,0,150,15);
        JLabel correo= new JLabel("Correo: Integral@gmail.com");
        correo.setBounds(0,15,190,15);
        JLabel telefono = new JLabel("# celular: "+"41669282");
        telefono.setBounds(0,30,160,15);

        
        txtInfoGen.setBounds(0,0,420,65);
        txtInfoGen.setBackground(new Color(0x9112));
        txtInfoGen.setLayout(null);
        txtInfoGen.add(bienvenida);
        txtInfoGen.add(correo);
        txtInfoGen.add(telefono);

        JPanel especificInfo = new JPanel();
        JLabel resumen = new JLabel("Usted Cuenta con "+ cont.getApp().getEmpresas().get(i).getPuestos().size() + " puestos disponibles");
        resumen.setBounds(0,1,380,20);
        resumen.setForeground(Color.white);
        JLabel resumen1 = new JLabel("Objeto de la empresa: ");
        resumen1.setBounds(0,20,380,20);
        resumen1.setForeground(Color.white);
        JLabel resumen2 = new JLabel("         "+cont.getApp().getEmpresas().get(i).getObjeto());
        resumen2.setBounds(0,40,380,20);
        resumen2.setForeground(Color.white);
        especificInfo.setBounds(0,66,420,100);
        especificInfo.setBackground(new Color(0x123456));
        especificInfo.setLayout(null);
        especificInfo.add(resumen);
        especificInfo.add(resumen1);
        especificInfo.add(resumen2);


        JPanel paraBusqueda = new JPanel();
        estadoPuesto = new JButton();
        estadoPuesto.setText("Ver el estado de tus puestos");
        estadoPuesto.addActionListener(this);
        estadoPuesto.setBounds(115,0,200,30);
        /*nuevoPuesto = new JButton();
        nuevoPuesto.addActionListener(this);
        nuevoPuesto*/
        paraBusqueda.add(estadoPuesto);
        paraBusqueda.setBackground(new Color(0x123456));
        paraBusqueda.setLayout(null);
        paraBusqueda.setBounds(0,166,420,100);
        

        perfil.setTitle("JobGuider");
        perfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        perfil.getContentPane().setBackground(new Color(0x123456));
        perfil.setResizable(false);
        perfil.setSize(420,250);
        perfil.setVisible(true);
        perfil.setLayout(null);
        perfil.add(txtInfoGen);
        perfil.add(especificInfo);
        perfil.add(paraBusqueda);

    }
    /**
     * Este metodo muestra el perfil de un buscador y le permite buscar un nuevo puesto
     */
    public void alIniciarSesion(int i, Controlador cont){
        perfil = new JFrame();

        JPanel txtInfoGen = new JPanel();

        JLabel bienvenida = new JLabel("Bienvenido " + cont.getApp().getCandidatos().get(i).getNombre());
        bienvenida.setBounds(160,0,150,15);
        JLabel correo= new JLabel("Correo: " + cont.getApp().getCandidatos().get(i).getCorreo());
        correo.setBounds(0,15,190,15);
        JLabel telefono = new JLabel("# celular: " + cont.getApp().getCandidatos().get(i).getCelular());
        telefono.setBounds(0,30,160,15);

        txtInfoGen.setBounds(0,0,420,65);
        txtInfoGen.setBackground(new Color(0x9112));
        txtInfoGen.setLayout(null);
        txtInfoGen.add(bienvenida);
        txtInfoGen.add(correo);
        txtInfoGen.add(telefono);

        JPanel especificInfo = new JPanel();
        JLabel resumen = new JLabel("Usted busca un puesto en el que aplique " + cont.getApp().getCandidatos().get(i).getProfesion());
        resumen.setBounds(0,1,380,20);
        resumen.setForeground(Color.white);
        JLabel resumen1 = new JLabel("Y pueda hablas en los siguientes idiomas: " + cont.getApp().getCandidatos().get(i).getIdiomas().get(0));
        resumen1.setBounds(0,20,380,20);
        resumen1.setForeground(Color.white);
        JLabel resumen2 = new JLabel(" ");
        resumen2.setBounds(0,40,380,20);
        resumen2.setForeground(Color.white);
        JLabel vacacionista = new JLabel("Usted no desea ser vacacionista");
        vacacionista.setBounds(0,60,380,20);
        vacacionista.setForeground(Color.white);
        JLabel exp = new JLabel("Cuenta con 10 años de experiencia");
        exp.setBounds(0, 80, 380, 20);
        exp.setForeground(Color.white);
        especificInfo.setBounds(0,66,420,100);
        especificInfo.setBackground(new Color(0x123456));
        especificInfo.setLayout(null);
        especificInfo.add(resumen);
        especificInfo.add(resumen1);
        especificInfo.add(resumen2);
        especificInfo.add(vacacionista);
        especificInfo.add(exp);

        JPanel paraBusqueda = new JPanel();
        busquedaTrabajo = new JButton();
        busquedaTrabajo.setText("Busca un trabajo");
        busquedaTrabajo.addActionListener(this);
        busquedaTrabajo.setVerticalAlignment(JButton.CENTER);
        busquedaTrabajo.setHorizontalAlignment(JButton.CENTER);
        paraBusqueda.add(busquedaTrabajo);
        paraBusqueda.setBackground(new Color(0x123456));
        paraBusqueda.setBounds(0,166,420,100);
        
        perfil.setTitle("JobGuider");
        perfil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        perfil.getContentPane().setBackground(new Color(0x123456));
        perfil.setResizable(false);
        perfil.setSize(420,250);
        perfil.setVisible(true);
        perfil.setLayout(null);
        perfil.add(txtInfoGen);
        perfil.add(especificInfo);
        perfil.add(paraBusqueda);

    }


    /**
     * Este metodo despliega una pestaña del programa en el que el usuario escogera si quiere registrarse como empresa
     * o como buscador
     */
    public void preRegistro(){
        preRegis = new JFrame();

        JPanel botonesCentroR = new JPanel();

        preRegistroEmp = new JButton();
        preRegistroEmp.setBounds(0,0,200,30);
        preRegistroEmp.setText("Registro como empresa");
        preRegistroEmp.addActionListener(this);

        preRegistroBusc = new JButton();
        preRegistroBusc.setBounds(0,31,200,30);
        preRegistroBusc.setText("Restro como candidato");
        preRegistroBusc.addActionListener(this);

        botonesCentroR.setLayout(null);
        botonesCentroR.setBackground(new Color(0x123456));
        botonesCentroR.setBounds(120,175,200,90);
        botonesCentroR.add(preRegistroEmp);
        botonesCentroR.add(preRegistroBusc);

        preRegis.setVisible(true);
        preRegis.setSize(420, 500);
        preRegis.setTitle("JobGuider");
        preRegis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        preRegis.getContentPane().setBackground(new Color(0x123456));
        preRegis.setResizable(false);
        preRegis.setLayout(null);
        preRegis.add(botonesCentroR);
    }
    /**
     * Este metodo despliega las opciones de registro para una empresa
     */
    public void nuevaEmpresa(){
        preRegis.dispose();
        registroF = new JFrame();
        
        JPanel textos = new JPanel();


        JLabel empresa = new JLabel("Form para nueva Empresa");
        empresa.setBounds(0,0,209,27);
        empresa.setVerticalAlignment(JLabel.CENTER);
        empresa.setHorizontalAlignment(JLabel.CENTER);
        JLabel linea = new JLabel("----------------------------------------------------");
        linea.setBounds(0,25,209,25);
        JLabel usuari1 = new JLabel("(*)Usuario: ");
        usuari1.setBounds(0,40,209,25);
        usuari1.setHorizontalAlignment(JLabel.RIGHT);
        JLabel passwordE = new JLabel("(*)Password: ");
        passwordE.setBounds(0,60,209,25);
        passwordE.setHorizontalAlignment(JLabel.RIGHT);
        JLabel correitoE = new JLabel("(*)Correo: ");
        correitoE.setBounds(0,80,209,25);
        correitoE.setHorizontalAlignment(JLabel.RIGHT);
        JLabel objeto = new JLabel("objeto de la empresa: ");
        objeto.setBounds(0,100,209,25);
        objeto.setHorizontalAlignment(JLabel.RIGHT);

        textos.setBounds(0,0,210,310);
        textos.setLayout(null);
        textos.setBackground(Color.CYAN);
        textos.add(empresa);
        textos.add(linea);
        textos.add(usuari1);
        textos.add(passwordE);
        textos.add(correitoE);
        textos.add(objeto);


        JPanel paTxtFiel = new JPanel();
        usuario1 = new JTextField();
        usuario1.setBounds(0,40,180,20);
        contra1 = new JPasswordField();
        contra1.setBounds(0,60,180,20);
        correo1 = new JTextField();
        correo1.setBounds(0,80,180,20);
        objetito = new JTextField();
        objetito.setBounds(0,100,180,40);
        
        

        paTxtFiel.setBackground(new Color(0x123456));
        paTxtFiel.setBounds(211,0,208,310);
        paTxtFiel.setLayout(null);
        paTxtFiel.add(usuario1);
        paTxtFiel.add(contra1);
        paTxtFiel.add(correo1);
        paTxtFiel.add(objetito);

        JPanel paraBoton = new JPanel();

        paraRegistro = new JButton();
        paraRegistro.setText("Registrate Ahora");
        paraRegistro.addActionListener(this);
        paraRegistro.setHorizontalAlignment(JButton.CENTER);
        paraRegistro.setVerticalAlignment(JButton.CENTER);

        
        paraBoton.setBounds(0,311,420,200);
        paraBoton.setBackground(new Color(0x12345));
        paraBoton.add(paraRegistro);

        registroF.setVisible(true);
        registroF.setSize(420, 500);
        registroF.setTitle("JobGuider");
        registroF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroF.getContentPane().setBackground(new Color(0x123456));
        registroF.setResizable(false);
        registroF.setSize(420,500);
        registroF.setVisible(true);
        registroF.setLayout(null);
        registroF.add(textos);
        registroF.add(paTxtFiel);
        registroF.add(paraBoton);

    }
    /**
     * Este metodo despliega las opciones de registro para un buscador
     */
    public void nuevoBuscador(){
        preRegis.dispose();
        registroF = new JFrame();
        
        JPanel textos = new JPanel();

        JLabel enBusca = new JLabel("Form en Busca de trabajo");
        enBusca.setBounds(0,0,209,25);
        enBusca.setHorizontalAlignment(JLabel.CENTER);
        JLabel linea1 = new JLabel("----------------------------------------------------");
        linea1.setBounds(0,20,209,25);
        JLabel usuari = new JLabel("(*)Usuario: ");
        usuari.setBounds(0,40,209,25);
        usuari.setHorizontalAlignment(JLabel.RIGHT);
        JLabel password = new JLabel("(*)Password: ");
        password.setBounds(0,60,209,25);
        password.setHorizontalAlignment(JLabel.RIGHT);
        JLabel noB = new JLabel("(*)Nombre: ");
        noB.setBounds(0,80,209,25);
        noB.setHorizontalAlignment(JLabel.RIGHT);
        JLabel celuB = new JLabel("(*)Celular: ");
        celuB.setBounds(0,100,209,25);
        celuB.setHorizontalAlignment(JLabel.RIGHT);
        JLabel dirB = new JLabel("(*)Direccion: ");
        dirB.setBounds(0,120,209,25);
        dirB.setHorizontalAlignment(JLabel.RIGHT);
        JLabel edad = new JLabel("(*)Edad: ");
        edad.setBounds(0,140,209,25);
        edad.setHorizontalAlignment(JLabel.RIGHT);
        JLabel idioma = new JLabel("(*)Idioma materno: ");
        idioma.setBounds(0,160,209,25);
        idioma.setHorizontalAlignment(JLabel.RIGHT);
        JLabel profe = new JLabel("(*)Profesion: ");
        profe.setBounds(0,180,209,25);
        profe.setHorizontalAlignment(JLabel.RIGHT);
        JLabel ultimoTit = new JLabel("(*)Ultimo Titulo: ");
        ultimoTit.setBounds(0,200,209,25);
        ultimoTit.setHorizontalAlignment(JLabel.RIGHT);
        JLabel cor = new JLabel("(*)Correo Electronico: "); 
        cor.setBounds(0,220,209,25);
        cor.setHorizontalAlignment(JLabel.RIGHT);

        textos.setBounds(0,0,210,310);
        textos.setLayout(null);
        textos.setBackground(Color.CYAN);
        textos.add(enBusca);
        textos.add(linea1);
        textos.add(usuari);
        textos.add(password);
        textos.add(noB);
        textos.add(celuB);
        textos.add(edad);
        textos.add(idioma);
        textos.add(profe);
        textos.add(ultimoTit);
        textos.add(cor);
        textos.add(dirB);

        JPanel paTxtFiel = new JPanel();

        usuario = new JTextField();
        usuario.setBounds(0,42,180,20);
        contra = new JPasswordField();
        contra.setBounds(0,62,180,20);
        nombreB = new JTextField();
        nombreB.setBounds(0,82,180,20);
        celB = new JTextField();
        celB.setBounds(0,102,180,20);
        direcB = new JTextField();
        direcB.setBounds(0,122,180,20);
        edadcita = new JTextField();
        edadcita.setBounds(0,142,180,20);
        idiomita = new JTextField();
        idiomita.setBounds(0,162,180,20);
        profB = new JTextField();
        profB.setBounds(0,182,180,20);
        ulTitulo = new JTextField();
        ulTitulo.setBounds(0,202,180,20);
        correo = new JTextField();
        correo.setBounds(0,222,180,20);

        paTxtFiel.setBackground(new Color(0x123456));
        paTxtFiel.setBounds(211,0,208,310);
        paTxtFiel.setLayout(null);
        paTxtFiel.add(usuario);
        paTxtFiel.add(contra);
        paTxtFiel.add(nombreB);
        paTxtFiel.add(ulTitulo);
        paTxtFiel.add(edadcita);
        paTxtFiel.add(idiomita);
        paTxtFiel.add(correo);
        paTxtFiel.add(profB);
        paTxtFiel.add(celB);
        paTxtFiel.add(direcB);
        
        //paTxtFiel.add(sIdioma);

        JPanel paraBoton = new JPanel();

        paraRegistro1 = new JButton();
        paraRegistro1.setText("Registrate Ahora");
        paraRegistro1.addActionListener(this);
        paraRegistro1.setHorizontalAlignment(JButton.CENTER);
        paraRegistro1.setVerticalAlignment(JButton.CENTER);

        
        paraBoton.setBounds(0,311,420,200);
        paraBoton.setBackground(new Color(0x12345));
        paraBoton.add(paraRegistro1);

        registroF.setVisible(true);
        registroF.setSize(420, 500);
        registroF.setTitle("JobGuider");
        registroF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroF.getContentPane().setBackground(new Color(0x123456));
        registroF.setResizable(false);
        registroF.setSize(420,500);
        registroF.setVisible(true);
        registroF.setLayout(null);
        registroF.add(textos);
        registroF.add(paTxtFiel);
        registroF.add(paraBoton);
    }
    /**
     * Este metodo permite generar un nuevo buscador
     */
    public void reNuevoBus(){
        String us = usuario.getText();
        String pass = new String(contra.getPassword());
        String nom = nombreB.getText();
        String cel = celB.getText();
        String direc = direcB.getText();
        int ed = Integer.parseInt(edadcita.getText());
        String id = idiomita.getText();
        String profesion = profB.getText();
        String tit = ulTitulo.getText();
        String correito = correo.getText();

        //System.out.println("Si se guardo");
        
        controladorcito.nuevoBuscador(us, pass, nom, cel, direc, ed, id, profesion, tit, correito);
    }
    /**
     * Este metodo muestra las posibles opciones de empleo que puede aplicar el buscador
     * IMPORTANTE: De momento las opciones son fijas y no se pueden acceder
     */
    public void aplicaraTrabajo(){
        perfil.dispose();
        aplicaATr = new JFrame();

        JPanel txt = new JPanel();

        JLabel trabajo1 = new JLabel("Integral puesto de oficinista");
        trabajo1.setBounds(0,0,180,25);
        trabajo1.setForeground(Color.white);
        JLabel trabajo2 = new JLabel("SETEC puesto de tecnico");
        trabajo2.setBounds(0,35,180,25);
        trabajo2.setForeground(Color.white);
        JLabel trabajo3 = new JLabel("HP puesto de vendedor");
        trabajo3.setBounds(0,65,180,25);
        trabajo3.setForeground(Color.white);

        txt.setLayout(null);
        txt.setBackground(new Color(0x123456));
        txt.setBounds(0,0,165,100);
        txt.add(trabajo1);
        txt.add(trabajo2);
        txt.add(trabajo3);

        JPanel botones = new JPanel();

        JButton momentum1 = new JButton();
        momentum1.setText("Mas informacion");
        momentum1.setBounds(0,0,140,20);
        JButton momentum2 = new JButton();
        momentum2.setText("Mas informacion");
        momentum2.setBounds(0,35,140,20);
        JButton momentum3 = new JButton();
        momentum3.setText("Mas informacion");
        momentum3.setBounds(0,65,140,20);

        botones.setLayout(null);
        botones.setBackground(new Color(0x123456));
        botones.setBounds(180,0,200,100);
        botones.add(momentum1);
        botones.add(momentum2);
        botones.add(momentum3);

        aplicaATr.setVisible(true);
        aplicaATr.setSize(420, 500);
        aplicaATr.setTitle("JobGuider");
        aplicaATr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicaATr.getContentPane().setBackground(new Color(0x123456));
        aplicaATr.setResizable(false);
        aplicaATr.setLayout(null);
        aplicaATr.add(botones);
        aplicaATr.add(txt);
    }
    
    /**
     * Este metodo es el que permite que los botones puedan generar acciones
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == inicioSesion){
            String pass = new String(contra.getPassword());
            String us = usuario.getText();
            corrector = controladorcito.verificador(us, pass, corrector);
            indic = controladorcito.identificador(us, pass);
            if (corrector == true ){
                boolean x = controladorcito.verificador2(us, pass);
                if (x == false){
                    this.dispose();
                    alIniciarSesion(indic,controladorcito);
                }else if(x = true){
                    this.dispose();
                    IniciarSesionEmp(indic,controladorcito);
                }
                
            }
        }else if(e.getSource() == registro){
            this.dispose();
            preRegistro();
        }else if(e.getSource() == preRegistroEmp){
            nuevaEmpresa();

        }else if(e.getSource() == preRegistroBusc){
            nuevoBuscador();
        }else if(e.getSource() == paraRegistro){
            registroF.dispose();
            controladorcito.reinicioDeGui();
        }else if(e.getSource() == paraRegistro1){
            reNuevoBus();
            registroF.dispose();
            controladorcito.reinicioDeGui();
        }else if(e.getSource() == busquedaTrabajo){
            aplicaraTrabajo();
        }
    }
}