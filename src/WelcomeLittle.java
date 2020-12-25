
import java.awt.Image;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan Luis Jimenez
 */
public class WelcomeLittle extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeLittle
     */
    JLabel Imagenes = new JLabel();
    String cadena[] = new String[27];

    public WelcomeLittle() throws UnknownHostException {
        initComponents();
        setSize(335, 450);
        this.setLocationRelativeTo(null);
        Imagenes.setBounds(250, 105, 440, 255);
        this.add(Imagenes);
        
        setTitle("Bienvenid@ " + nombre());
        String contra = JOptionPane.showInputDialog(null, "Escriba la contraseña", "Bienvenid@ " + nombre(), 2);

        aplicar_gif();
        Saludo.setText(obtener_momento());
        llenar_arreglo();
        mostrar_texto(contra);

        cambiar_fsor("/imagenes2/" + obt_numfoto() + ".jpg");

    }

    public String nombre() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return localHost.getHostName().toString();
    }

    public int obtener_numero() {
        Random rnd = null;

        rnd = new Random();
        int nrand = rnd.nextInt(19) + 1;

        return nrand;
    }

    public int generar_num() {
        Random rnd = new Random();
        String men;
        Scanner lo = new Scanner(System.in);

        return (int) (rnd.nextDouble() * 9 + 0);
    }

    public int generar_num2() {
        Random rnd = new Random();
        String men;
        Scanner lo = new Scanner(System.in);

        return (int) (rnd.nextDouble() * 27 + 0);
    }

    public int obt_numfoto() {
        Random rnd = null;

        rnd = new Random();
        int nrand = rnd.nextInt(11) + 1;

        return nrand;
    }

    public void cambiar_fondo(String rut) {
        String path2 = rut;

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        repaint();
        Fondo.setVisible(true);

        repaint();
    }

    public void cambiar_fsor(String rut) {
        String path2 = rut;

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT));
        Foto.setIcon(icono);
        repaint();

    }

    public void llenar_arreglo() {
        cadena[0] = "JavaScript es el lenguaje que más paga hoy en día, lo recomiendo";
        cadena[1] = "Java es un lenguaje muy potente, pero es horrible hacerlo (Mirá el código de esto nomás)";
        cadena[2] = "Podés programar un programa vendible en dos horas usando PYTHON";
        cadena[3] = "Si querés hacer web: React, Vue, Angular. Estudialo.";
        cadena[4] = "Habrá un momento en el que dejes de programar, creeme.";
        cadena[5] = "Si podés resolver un problema usando la programación: Estás lista para trabajar de freelance.";
        cadena[6] = "Por más que trabajes en una empresa, NUNCA dejes de hacer trabajos independientes";
        cadena[7] = "El trabajo remoto es muy incómodo";
        cadena[8] = "Si tenés algo de plata: Ahorra para tu computadora, será tu bebé";
        cadena[9] = "Jugá LOL";
        cadena[10] = "El trabajo en equipo es muy importante, formá un buen equipo de amigos.";
        cadena[11] = "'Estar en las nubes' es algo bueno para el trabajo.";
        cadena[12] = "Todo lo que aprenderás: El 5% vendrá de la facultad.";
        cadena[13] = "En esta carrera nunca deja de existir algo nuevo, no intentes aprenderlo todo.";
        cadena[14] = "Pensá como programadora no solamente para programar. Creeme que así te irá mucho mejor en todo.";
        cadena[15] = "Es mejor darle a las variables un nombre larguito y entendible que poner algo corto y luego perderte al ver el código (Sacando las variables de control)";
        cadena[16] = "UTILIZA GITHUB, BITBUCKET, GITLAB, REPOSITORIOS, SUBIRÉ ESTA PORQUERÍA A GITHUB Y TE TENDRÁS QUE HACER UNA CUENTA.";
        cadena[17] = "Adivina cuantas strings utilicé en esto e iré a Paraná a invitarte a cenar.";
        cadena[18] = "Nuestra carrera no es 'El futuro' necesariamente, todo esto es HOY.";
        cadena[19] = "Agarrarte el hobby de programar todos los días, al menos 30 minutos.";
        cadena[20] = "La mejor forma de amar esto es pensar en algo que quieras hacer, programarlo, y tenerlo en frente tuyo funcionando";
        cadena[21] = "¿Te he dicho que detesto Java?";
        cadena[22] = "No me gustan las bases de datos, si a vos tampoco; entendé la diferencia entre BBDD relacional y no relacional. Y te será todo más fácil";
        cadena[23] = "Mi lenguaje fav es Python, pero el 70% de mis trabajos fueron con JavaScript.";
        cadena[24] = "El lenguaje que más detesto es este lenguaje de mierda llamado Java... Y MIRÁ EN QUÉ TE PROGRAMÉ ESTA PORQUERÍA";
        cadena[25] = "Menos mal que llenaste el doc, no sabía que imagenes buscar.";
        cadena[26] = "Es una carrera hermosa, y podrás vivir de esto felizmente toda tu vida.";
        
    }

    public void mostrar_texto(String cont) {
        
        if (cont.equals("chk*")) {
            M_texto.setText(cadena[generar_num2()]);
            
        } else {
            M_texto.setText(cadena[generar_num()]);
            
        }
    }

    public void aplicar_gif() {
        String path2 = "/imagenes/" + obtener_numero() + ".gif";

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(bar.getWidth(), bar.getHeight(), Image.SCALE_DEFAULT));
        bar.setIcon(icono);
        repaint();
        Imagenes.setVisible(true);

        repaint();

    }

    public String obtener_momento() {
        String mensaje = "";
        Calendar calendario = new GregorianCalendar();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);

        if ((hora >= 24) && (hora < 6)) {
            mensaje = "Dormite, estúpida";
            cambiar_fondo("/imagenes/fondo5.jpg");
        }
        if ((hora >= 6) && (hora < 12)) {
            mensaje = "Despertate, estúpida";
            cambiar_fondo("/imagenes/fondo3.jpg");
        }
        if ((hora >= 12) && (hora < 19)) {
            mensaje = "Hacete un mate, estúpida";
            cambiar_fondo("/imagenes/fondo1.jpg");
        }
        if ((hora >= 19) && (hora < 24)) {
            mensaje = "Andá a dormir, estúpida";
            cambiar_fondo("/imagenes/fondo1.jpg");
        }
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Foto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        M_texto = new javax.swing.JTextArea();
        bar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Saludo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        getContentPane().add(Saludo);
        Saludo.setBounds(10, 100, 210, 16);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 10)); // NOI18N
        jLabel1.setText("Regalo para Dali");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 400, 300, 14);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FotoMonis:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/1.jpg"))); // NOI18N
        jPanel1.add(Foto);
        Foto.setBounds(10, 20, 290, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 220, 310, 180);
        jPanel1.getAccessibleContext().setAccessibleName("Mirá:");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quiero decirte que:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 1, 12))); // NOI18N

        M_texto.setColumns(20);
        M_texto.setLineWrap(true);
        M_texto.setRows(4);
        M_texto.setTabSize(5);
        jScrollPane2.setViewportView(M_texto);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 120, 310, 100);
        jScrollPane2.getAccessibleContext().setAccessibleName("Tomá el freeconsejo del día:");
        jScrollPane2.getAccessibleContext().setAccessibleDescription("");

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/13.gif"))); // NOI18N
        getContentPane().add(bar);
        bar.setBounds(10, 10, 310, 70);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 330, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WelcomeLittle().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(WelcomeLittle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Foto;
    private javax.swing.JTextArea M_texto;
    private javax.swing.JLabel Saludo;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
