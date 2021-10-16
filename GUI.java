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
 * @since 15/10/2021
 * @version 0.21
 */
class GUI extends JFrame implements ActionListener{
    
    private int indic;// Sirve para guardar indices de arrayList
    private boolean corrector; // Sirve para identificar la autorizacion del controlador

    private Controlador controladorcito = new Controlador(); // Se instancia un nuevo controlador
    
    private JFrame perfil;
    private JFrame registroF;

    private JButton inicioSesion;// Es el boton de inicion de sesion
    private JButton registro; // Boton de registro
    private JButton busquedaTrabajo; // Boton de busqueda de trabajo
    private JButton paraRegistro;// Boton de registro Completo
    private JTextField usuario; // txt Box de usuario
    private JTextField usuario1; // txt box de usuario1
    private JPasswordField contra; // txt box de contrasena
    private JPasswordField contra1;// txt box de contrasena1
    private JTextField ulTitulo;// txt box para registro
    private JTextField edadcita;// txt box para registro
    private JTextField idiomita;// txt box para registro
    private JTextField sIdioma;// txt box para registro
    private JTextField correo;// txt box para registro
    private JTextField correo1;// txt box para registro
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
    public void alIniciarSesionEmp(){
        JFrame perfil = new JFrame();

        JPanel txtInfoGen = new JPanel();

        JLabel bienvenida = new JLabel("Bienvenido a Integral");
        bienvenida.setBounds(160,0,150,15);
        JLabel correo= new JLabel("Correo: Integral@gmail.com");
        correo.setBounds(0,15,190,15);
        JLabel telefono = new JLabel("# celular: 41669282");
        telefono.setBounds(0,30,160,15);

        
        txtInfoGen.setBounds(0,0,420,65);
        txtInfoGen.setBackground(new Color(0x9112));
        txtInfoGen.setLayout(null);
        txtInfoGen.add(bienvenida);
        txtInfoGen.add(correo);
        txtInfoGen.add(telefono);

        JPanel especificInfo = new JPanel();
        JLabel resumen = new JLabel("Usted Cuenta con 10 puestos disponibles");
        resumen.setBounds(0,1,380,20);
        resumen.setForeground(Color.white);
        JLabel resumen1 = new JLabel("Objeto de la empresa: Compra, Venta, distribucion y comercializacion");
        resumen1.setBounds(0,20,380,20);
        resumen1.setForeground(Color.white);
        JLabel resumen2 = new JLabel("de productos de limpieza, higiene y desinfeccion");
        resumen2.setBounds(0,40,380,20);
        resumen2.setForeground(Color.white);
        especificInfo.setBounds(0,66,420,100);
        especificInfo.setBackground(new Color(0x123456));
        especificInfo.setLayout(null);
        especificInfo.add(resumen);
        especificInfo.add(resumen1);
        especificInfo.add(resumen2);


        JPanel paraBusqueda = new JPanel();
        busquedaTrabajo = new JButton();
        busquedaTrabajo.setText("Buscar empleados");
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
     * Este metodo muestra el perfil de un buscador y le permite buscar un nuevo puesto
     */
    public void alIniciarSesion(){
        JFrame perfil = new JFrame();

        JPanel txtInfoGen = new JPanel();

        JLabel bienvenida = new JLabel("Bienvenido Juan Perez");
        bienvenida.setBounds(160,0,150,15);
        JLabel correo= new JLabel("Correo: JuanPere@gmail.com");
        correo.setBounds(0,15,190,15);
        JLabel telefono = new JLabel("# celular: 45678965");
        telefono.setBounds(0,30,160,15);

        
        txtInfoGen.setBounds(0,0,420,65);
        txtInfoGen.setBackground(new Color(0x9112));
        txtInfoGen.setLayout(null);
        txtInfoGen.add(bienvenida);
        txtInfoGen.add(correo);
        txtInfoGen.add(telefono);

        JPanel especificInfo = new JPanel();
        JLabel resumen = new JLabel("Usted busca un puesto en el que aplique ");
        resumen.setBounds(0,1,380,20);
        resumen.setForeground(Color.white);
        JLabel resumen1 = new JLabel("Y pueda hablas en los siguientes idiomas: - Ingles - Español");
        resumen1.setBounds(0,20,380,20);
        resumen1.setForeground(Color.white);
        JLabel resumen2 = new JLabel("Cuenta con cursos en robotica y mecatronica");
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
     * Este metodo despliega las opciones de registro para una empresa y para un buscador
     */
    public void registro(){
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
        JLabel correito = new JLabel("(*)Correo: ");
        correito.setBounds(0,80,209,25);
        correito.setHorizontalAlignment(JLabel.RIGHT);
        JLabel titutlo = new JLabel("Ultimo titulo: ");
        titutlo.setBounds(0,100,209,25);
        titutlo.setHorizontalAlignment(JLabel.RIGHT);
        JLabel edad = new JLabel("(*)Edad: ");
        edad.setBounds(0,120,209,25);
        edad.setHorizontalAlignment(JLabel.RIGHT);
        JLabel idioma = new JLabel("(*)Idioma materno: ");
        idioma.setBounds(0,140,209,25);
        idioma.setHorizontalAlignment(JLabel.RIGHT);
        JLabel seIdioma = new JLabel("Segundo Idioma: ");
        seIdioma.setBounds(0,160,209,25);
        seIdioma.setHorizontalAlignment(JLabel.RIGHT);

        JLabel empresa = new JLabel("Form para nueva Empresa");
        empresa.setBounds(0,180,209,35);
        empresa.setVerticalAlignment(JLabel.CENTER);
        empresa.setHorizontalAlignment(JLabel.CENTER);
        JLabel linea = new JLabel("----------------------------------------------------");
        linea.setBounds(0,200,209,25);
        JLabel usuari1 = new JLabel("(*)Usuario: ");
        usuari1.setBounds(0,220,209,25);
        usuari1.setHorizontalAlignment(JLabel.RIGHT);
        JLabel passwordE = new JLabel("(*)Password: ");
        passwordE.setBounds(0,240,209,25);
        passwordE.setHorizontalAlignment(JLabel.RIGHT);
        JLabel correitoE = new JLabel("(*)Correo: ");
        correitoE.setBounds(0,260,209,25);
        correitoE.setHorizontalAlignment(JLabel.RIGHT);
        JLabel objeto = new JLabel("objeto de la empresa: ");
        objeto.setBounds(0,280,209,25);
        objeto.setHorizontalAlignment(JLabel.RIGHT);

        textos.setBounds(0,0,210,310);
        textos.setLayout(null);
        textos.setBackground(Color.CYAN);
        textos.add(enBusca);
        textos.add(linea1);
        textos.add(usuari);
        textos.add(password);
        textos.add(titutlo);
        textos.add(edad);
        textos.add(idioma);
        textos.add(seIdioma);
        textos.add(correito);
        textos.add(empresa);
        textos.add(linea);
        textos.add(usuari1);
        textos.add(passwordE);
        textos.add(correitoE);
        textos.add(objeto);


        JPanel paTxtFiel = new JPanel();

        usuario = new JTextField();
        usuario.setBounds(0,42,180,20);
        contra = new JPasswordField();
        contra.setBounds(0,62,180,20);
        correo = new JTextField();
        correo.setBounds(0,82,180,20);
        ulTitulo = new JTextField();
        ulTitulo.setBounds(0,102,180,20);
        edadcita = new JTextField();
        edadcita.setBounds(0,122,180,20);
        idiomita = new JTextField();
        idiomita.setBounds(0,142,180,20);
        sIdioma = new JTextField();
        sIdioma.setBounds(0,162,180,20);

        usuario1 = new JTextField();
        usuario1.setBounds(0,220,180,20);
        contra1 = new JPasswordField();
        contra1.setBounds(0,240,180,20);
        correo1 = new JTextField();
        correo1.setBounds(0,260,180,20);
        objetito = new JTextField();
        objetito.setBounds(0,280,180,40);
        
        

        paTxtFiel.setBackground(new Color(0x123456));
        paTxtFiel.setBounds(211,0,208,310);
        paTxtFiel.setLayout(null);
        paTxtFiel.add(usuario);
        paTxtFiel.add(contra);
        paTxtFiel.add(correo);
        paTxtFiel.add(ulTitulo);
        paTxtFiel.add(edadcita);
        paTxtFiel.add(idiomita);
        paTxtFiel.add(sIdioma);
        paTxtFiel.add(usuario1);
        paTxtFiel.add(contra1);
        paTxtFiel.add(correo1);
        paTxtFiel.add(objetito);

        JPanel paraBoton = new JPanel();

        paraRegistro = new JButton();
        paraRegistro.setText("Registrate Ahora");
        paraRegistro.setHorizontalAlignment(JButton.CENTER);
        paraRegistro.setVerticalAlignment(JButton.CENTER);

        
        paraBoton.setBounds(0,311,420,200);
        paraBoton.setBackground(new Color(0x12345));
        paraBoton.add(paraRegistro);

        registro.setVisible(true);
        registro.setSize(420, 500);
        registro.setTitle("JobGuider");
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registro.getContentPane().setBackground(new Color(0x123456));
        registro.setResizable(false);
        registro.setSize(420,500);
        registro.setVisible(true);
        registro.setLayout(null);
        registro.add(textos);
        registro.add(paTxtFiel);
        registro.add(paraBoton);
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
            indic = controladorcito.verificador1(us, pass, indic);
            if (corrector == true ){
                this.dispose();
                alIniciarSesion();
            }
        }else if(e.getSource() == registro){
            this.dispose();
            registro();
        }else if(e.getSource() == busquedaTrabajo){
            System.out.println("Estas buscando trabajo");
        }
    }
}