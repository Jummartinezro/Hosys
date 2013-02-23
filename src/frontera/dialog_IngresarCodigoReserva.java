/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dialog_IngresarCodigoReserva.java
 *
 * Created on Oct 22, 2011, 10:15:39 AM
 */
package frontera;

import control.AdministrarReserva;
import control.BusquedaDeHabitaciones;
import entidad.Reserva;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import utilidades.ValidarEntrada;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author juancho
 */
public class dialog_IngresarCodigoReserva extends javax.swing.JDialog {

    private Hosys parent;

    /** Creates new form dialog_IngresarCodigoReserva */
    public dialog_IngresarCodigoReserva(java.awt.Frame parent, boolean modal, int tipo) {
        super(parent, modal);
        initComponents();
        this.parent = (Hosys) parent;
        if (tipo == 1) {
            label_Titulo.setText("Modificar Reserva");
            button_Reserva.setText("Modificar Reserva");
            this.setTitle("Hosys - Modificar Reserva");
        } else if (tipo == 2) {
            label_Titulo.setText("Cancelar Reserva");
            button_Reserva.setText("Cancelar Reserva");
            this.setTitle("Hosys - Cancelar Reserva");
        } else if (tipo == 3) {
            label_Titulo.setText("Check-In");
            button_Reserva.setText("Check-In");
            this.setTitle("Hosys - Check-In");
        }
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
        panel_CodigoDeReserva = new javax.swing.JPanel();
        label_Usuario = new javax.swing.JLabel();
        textField_Usuario = new javax.swing.JTextField();
        button_Reserva = new javax.swing.JButton();
        button_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hosys - Login");

        label_Titulo.setFont(new java.awt.Font("Ubuntu", 1, 36));
        label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/l/calendar.png"))); // NOI18N
        label_Titulo.setText("Modificar Reserva");
        label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        label_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        label_Titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        label_Info.setText("Por favor, Ingrese el código de reserva");
        label_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Info.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                label_InfoKeyReleased(evt);
            }
        });

        label_Usuario.setText("Codigo De Reserva:");

        textField_Usuario.setFont(new java.awt.Font("Ubuntu", 2, 15));
        textField_Usuario.setForeground(java.awt.Color.gray);
        textField_Usuario.setText("Código De Reserva");
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

        javax.swing.GroupLayout panel_CodigoDeReservaLayout = new javax.swing.GroupLayout(panel_CodigoDeReserva);
        panel_CodigoDeReserva.setLayout(panel_CodigoDeReservaLayout);
        panel_CodigoDeReservaLayout.setHorizontalGroup(
            panel_CodigoDeReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CodigoDeReservaLayout.createSequentialGroup()
                .addComponent(label_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_CodigoDeReservaLayout.setVerticalGroup(
            panel_CodigoDeReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CodigoDeReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(label_Usuario)
                .addComponent(textField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        button_Reserva.setText("Modificar Reserva");
        button_Reserva.setEnabled(false);
        button_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ReservaActionPerformed(evt);
            }
        });
        button_Reserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button_ReservaKeyPressed(evt);
            }
        });

        button_Volver.setText("Volver");
        button_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addComponent(label_Info, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(button_Reserva)
                .addGap(18, 18, 18)
                .addComponent(button_Volver)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_CodigoDeReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_CodigoDeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Volver)
                    .addComponent(button_Reserva))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ReservaActionPerformed
        Reserva reserva = new AdministrarReserva().ConsultarReserva(Long.parseLong(textField_Usuario.getText()), true);
        if (reserva != null) {
            BusquedaDeHabitaciones reservar = new BusquedaDeHabitaciones();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if (label_Titulo.getText().equals("Modificar Reserva")) {
                if (reservar.consultarHabitacion(reserva).getCodigoReservaActiva() != (Long.parseLong(textField_Usuario.getText()))) {
                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 2, reserva));
                } else {
                    JOptionPane.showMessageDialog(this, "La reserva no se puede modificar porque ya se ha realizado Check-In con la misma", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                }
            } else if (label_Titulo.getText().equals("Cancelar Reserva")) {
                if (reservar.consultarHabitacion(reserva).getCodigoReservaActiva() != (Long.parseLong(textField_Usuario.getText()))) {
                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 4, reserva));
                } else {
                    JOptionPane.showMessageDialog(this, "La reserva no se puede cancelar porque ya se ha realizado Check-In con la misma", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                }
            } else if (label_Titulo.getText().equals("Check-In")) {
                if (format.format(reserva.getFechaInicial()).equals(format.format(new GregorianCalendar().getTime()))) {
                    if (reservar.consultarHabitacion(reserva).getEstado().equals("Reservada")) {
                        parent.cambiarPanel(new panel_AdministrarReserva(parent, 5, reserva));
                    } else {
                        JOptionPane.showMessageDialog(this, "Ya se ha realizado Check-In con este codigo", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La reserva esta programada para una fecha diferente: " + format.format(reserva.getFechaInicial()), "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                }
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error, El codigo de reserva ingresado no se encuentra en el sistema", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
        }
    }//GEN-LAST:event_button_ReservaActionPerformed

    private void button_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_VolverActionPerformed
        dispose();
    }//GEN-LAST:event_button_VolverActionPerformed

    private void textField_UsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_UsuarioFocusGained
        if (textField_Usuario.getText().equals("Código De Reserva")) {
            textField_Usuario.setFont(new Font(textField_Usuario.getFont().getName(), Font.PLAIN, 15));
            textField_Usuario.setForeground(Color.BLACK);
            textField_Usuario.setText("");
        }
    }//GEN-LAST:event_textField_UsuarioFocusGained

    private void textField_UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_UsuarioFocusLost
        if (textField_Usuario.getText().equals("")) {
            textField_Usuario.setFont(new Font(textField_Usuario.getFont().getName(), Font.ITALIC, 15));
            textField_Usuario.setForeground(Color.GRAY);
            textField_Usuario.setText("Código De Reserva");
        }
    }//GEN-LAST:event_textField_UsuarioFocusLost

    private void label_InfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_label_InfoKeyReleased
        presionarEsc(evt, this);
    }//GEN-LAST:event_label_InfoKeyReleased

    private void textField_UsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_UsuarioKeyReleased

        ValidarEntrada validador = new ValidarEntrada();
        if (validador.ValidarNumeros(textField_Usuario.getText(), 3)) {
            button_Reserva.setEnabled(true);
            textField_Usuario.setForeground(Color.black);
        } else {
            textField_Usuario.setForeground(Color.red);
            button_Reserva.setEnabled(false);
        }
        if (textField_Usuario.getText().equals("")) {
            button_Reserva.setEnabled(false);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (button_Reserva.isEnabled()) {
                if (!textField_Usuario.getText().equals("")) {
                    BusquedaDeHabitaciones reservar = new BusquedaDeHabitaciones();
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Reserva reserva = new AdministrarReserva().ConsultarReserva(Long.parseLong(textField_Usuario.getText()), true);
                    if (reserva != null) {
                        if (label_Titulo.getText().equals("Modificar Reserva")) {
                            if (reservar.consultarHabitacion(reserva).getCodigoReservaActiva() != (Long.parseLong(textField_Usuario.getText()))) {
                                parent.cambiarPanel(new panel_AdministrarReserva(parent, 2, reserva));
                            } else {
                                JOptionPane.showMessageDialog(this, "La reserva no se puede modificar porque ya se ha realizado Check-In con la misma", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                            }
                        } else if (label_Titulo.getText().equals("Cancelar Reserva")) {
                            if (reservar.consultarHabitacion(reserva).getCodigoReservaActiva() != (Long.parseLong(textField_Usuario.getText()))) {
                                parent.cambiarPanel(new panel_AdministrarReserva(parent, 4, reserva));
                            } else {
                                JOptionPane.showMessageDialog(this, "La reserva no se puede cancelar porque ya se ha realizado Check-In con la misma", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                            }
                        } else if (label_Titulo.getText().equals("Check-In")) {
                            if (format.format(reserva.getFechaInicial()).equals(format.format(new GregorianCalendar().getTime()))) {
                                if (reservar.consultarHabitacion(reserva).getEstado().equals("Reservada")) {
                                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 5, reserva));
                                } else {
                                    JOptionPane.showMessageDialog(this, "Ya se ha realizado Check-In con este codigo", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "La reserva esta programada para una fecha diferente: " + format.format(reserva.getFechaInicial()), "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                            }
                        }
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error, El codigo de reserva ingresado no se encuentra en el sistema", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
                    }
                }
            }
        }
    }//GEN-LAST:event_textField_UsuarioKeyReleased

    private void button_ReservaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button_ReservaKeyPressed
        if (!textField_Usuario.getText().equals("")) {
            Reserva reserva = new AdministrarReserva().ConsultarReserva(Long.parseLong(textField_Usuario.getText()), true);
            if (reserva != null) {
                if (label_Titulo.getText().equals("Modificar Reserva")) {
                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 2, reserva));
                } else if (label_Titulo.getText().equals("Cancelar Reserva")) {
                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 4, reserva));
                } else if (label_Titulo.getText().equals("Check-In")) {
                    parent.cambiarPanel(new panel_AdministrarReserva(parent, 5, reserva));
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error, El codigo de reserva ingresado no se encuentra en el sistema", "Error", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/frontera/imagenes/iconos/m/remove.png")));
            }
        }
    }//GEN-LAST:event_button_ReservaKeyPressed

    /**
     *
     * @param obj 
     * @param diag
     */
    private void presionarEsc(Object obj, dialog_IngresarCodigoReserva diag) {
        java.awt.event.KeyEvent e = (java.awt.event.KeyEvent) obj;
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            diag.dispose();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Reserva;
    private javax.swing.JButton button_Volver;
    private javax.swing.JLabel label_Info;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_Usuario;
    private javax.swing.JPanel panel_CodigoDeReserva;
    private javax.swing.JTextField textField_Usuario;
    // End of variables declaration//GEN-END:variables
}