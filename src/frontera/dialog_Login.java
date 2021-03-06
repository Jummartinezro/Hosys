/*
 * dialog_Login.java
 *
 * Created on Oct 22, 2011, 10:15:39 AM
 */
package frontera;

import utilidades.ValidarEntrada;
import utilidades.ValidarLogin;
import entidad.Recepcionista;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Interfaz Grafica Para Ingresar Al Programa
 * @author Juan Manuel Martinez Romero
 */
public class dialog_Login extends javax.swing.JDialog {

    Hosys parent;

    /** Creates new form dialog_Login */
    public dialog_Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = (Hosys) parent;
        label_Info.requestFocusInWindow();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Titulo = new javax.swing.JLabel();
        label_Info = new javax.swing.JLabel();
        panel_Login = new javax.swing.JPanel();
        label_Usuario = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        textField_Usuario = new javax.swing.JTextField();
        passwordField_Password = new javax.swing.JPasswordField();
        button_IniciarSesion = new javax.swing.JButton();
        button_Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Hosys - Login");
        setResizable(false);

        label_Titulo.setFont(new java.awt.Font("Ubuntu", 1, 36));
        label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/xL/H.png"))); // NOI18N
        label_Titulo.setText("Hosys");
        label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        label_Info.setText("Por favor, Ingrese su nombre de usuario y contraseña");
        label_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Info.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                label_InfoKeyReleased(evt);
            }
        });

        label_Usuario.setText("Usuario:");

        label_Password.setText("Contraseña:");

        textField_Usuario.setFont(new java.awt.Font("Ubuntu", 2, 15));
        textField_Usuario.setForeground(java.awt.Color.gray);
        textField_Usuario.setText("Nombre De Usuario");
        textField_Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField_UsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_UsuarioFocusLost(evt);
            }
        });
        textField_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField_UsuarioKeyReleased(evt);
            }
        });

        passwordField_Password.setFont(new java.awt.Font("Tahoma", 2, 15));
        passwordField_Password.setText("jPasswordField1");
        passwordField_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordField_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordField_PasswordFocusLost(evt);
            }
        });
        passwordField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField_PasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_LoginLayout = new javax.swing.GroupLayout(panel_Login);
        panel_Login.setLayout(panel_LoginLayout);
        panel_LoginLayout.setHorizontalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Usuario)
                    .addComponent(label_Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(textField_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_LoginLayout.setVerticalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Usuario)
                    .addComponent(textField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Password)
                    .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        button_IniciarSesion.setText("Iniciar Sesión");
        button_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_IniciarSesionActionPerformed(evt);
            }
        });
        button_IniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button_IniciarSesionKeyPressed(evt);
            }
        });

        button_Cerrar.setText("Cerrar");
        button_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addComponent(label_Info, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addComponent(panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(button_IniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(button_Cerrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Cerrar)
                    .addComponent(button_IniciarSesion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // TODO Documentar
    private void button_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_IniciarSesionActionPerformed
        if (new ValidarLogin().autenticarUsuario(new Recepcionista(textField_Usuario.getText(),
                new String(passwordField_Password.getPassword())))) {
            parent.setEnabled(true);
            this.dispose();
        } else {
            label_Info.setText("Datos incorrectos, ingrese nuevamente");
            label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            label_Info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
            label_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            label_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/xS/remove.png")));
            label_Info.setForeground(Color.red);
            passwordField_Password.setText("");
        }

    }//GEN-LAST:event_button_IniciarSesionActionPerformed
// TODO Documentar
    private void button_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button_CerrarActionPerformed
// TODO Documentar
    private void textField_UsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_UsuarioFocusGained
        if (textField_Usuario.getText().equals("Nombre De Usuario")) {
            textField_Usuario.setFont(new Font(textField_Usuario.getFont().getName(), Font.PLAIN, 15));
            textField_Usuario.setForeground(Color.BLACK);
            textField_Usuario.setText("");
        }
    }//GEN-LAST:event_textField_UsuarioFocusGained
// TODO Documentar
    private void textField_UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_UsuarioFocusLost
        if (textField_Usuario.getText().equals("")) {
            textField_Usuario.setFont(new Font(textField_Usuario.getFont().getName(), Font.ITALIC, 15));
            textField_Usuario.setForeground(Color.GRAY);
            textField_Usuario.setText("Nombre De Usuario");
        }
    }//GEN-LAST:event_textField_UsuarioFocusLost
// TODO Documentar
    private void passwordField_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField_PasswordFocusGained
        String text = String.valueOf(passwordField_Password.getPassword());
        if (text.equals("jPasswordField1")) {
            passwordField_Password.setText(null);
        }
    }//GEN-LAST:event_passwordField_PasswordFocusGained
// TODO Documentar
    private void passwordField_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordField_PasswordFocusLost
        if (passwordField_Password.getPassword().length == 0) {
            passwordField_Password.setText("jPasswordField1");
        }
    }//GEN-LAST:event_passwordField_PasswordFocusLost
// TODO Documentar
    private void textField_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_UsuarioKeyReleased
        presionarESC(evt);
        if (!(evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE
                || evt.getKeyCode() == KeyEvent.VK_BEGIN
                || (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_LEFT) || (evt.isShiftDown() && evt.getKeyCode() == KeyEvent.VK_RIGHT)
                || evt.getKeyCode() == KeyEvent.VK_SHIFT)) {
            ValidarEntrada validar = new ValidarEntrada();
            if (validar.ValidarLetras(textField_Usuario.getText())) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    textField_Usuario.setText(validar.ConvertirMinusculas(validar.QuitarEspacios(textField_Usuario.getText())));
                    passwordField_Password.requestFocusInWindow();
                } else {
                    textField_Usuario.setText(validar.ConvertirMinusculas(validar.QuitarEspacios(textField_Usuario.getText())));
                    textField_Usuario.setForeground(Color.black);
                    button_IniciarSesion.setEnabled(true);
                }
            } else {
                textField_Usuario.setForeground(Color.red);
                button_IniciarSesion.setEnabled(false);
            }
            if (textField_Usuario.getText().equals("")) {
                button_IniciarSesion.setEnabled(false);
            }
        }
    }//GEN-LAST:event_textField_UsuarioKeyReleased
// TODO Documentar
    private void passwordField_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordField_PasswordKeyReleased
        presionarESC(evt);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (new ValidarLogin().autenticarUsuario(new Recepcionista(textField_Usuario.getText(),
                    new String(passwordField_Password.getPassword())))) {
                parent.setEnabled(true);
                this.dispose();
            } else {
                label_Info.setText("Datos incorrectos, ingrese nuevamente");
                label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                label_Info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                label_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                label_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/xS/remove.png")));
                label_Info.setForeground(Color.red);
                passwordField_Password.setText("");
            }
        }
    }//GEN-LAST:event_passwordField_PasswordKeyReleased
// TODO Documentar
    private void button_IniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_IniciarSesionKeyPressed
        presionarESC(evt);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (new ValidarLogin().autenticarUsuario(new Recepcionista(textField_Usuario.getText(),
                    new String(passwordField_Password.getPassword())))) {
                parent.setEnabled(true);
                this.dispose();
            } else {
                label_Info.setText("Datos incorrectos, ingrese nuevamente");
                label_Info.setVerticalAlignment(javax.swing.SwingConstants.TOP);
                label_Info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                label_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                label_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/xS/remove.png")));
                label_Info.setForeground(Color.red);
                passwordField_Password.setText("");
            }
        }
    }//GEN-LAST:event_button_IniciarSesionKeyPressed

    private void label_InfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_label_InfoKeyReleased
        presionarESC(evt);
    }//GEN-LAST:event_label_InfoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cerrar;
    private javax.swing.JButton button_IniciarSesion;
    private javax.swing.JLabel label_Info;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_Usuario;
    private javax.swing.JPanel panel_Login;
    private javax.swing.JPasswordField passwordField_Password;
    private javax.swing.JTextField textField_Usuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Verifica si la tecla que fue presionada es la tecla ESC y si es la tecla ESC
     * se cierra el cuadro de dialogo
     * @param e Evento que lanza la tecla al ser presionada
     */
    private void presionarESC(java.awt.event.KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
    }
}
