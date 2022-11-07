
package interfaz;

import TransferirDatos.ModeloDeTransferencia;
import Laboratorio3.PanelLab3Ejercicio1;
import Laboratorio3.PanelLab3Ejercicio2;
import Laboratorio3.PanelLab3Ejercicio3;
import Laboratorio3.PanelLab3Ejercicio4;
import Laboratorio3.PanelLab3Ejercicio5;
import Laboratorio3.PanelLab3Ejercicio6;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelLab3 extends javax.swing.JPanel {
    
    
    /**
     * Creates new form PanelLab3
     */
    public PanelLab3() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnProbar = new javax.swing.JButton();
        PanelProbarEjercicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 232, 232));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel1.setText("Laboratorio de recursividad");

        jComboBox1.setFont(new java.awt.Font("Consolas", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnProbar.setBackground(new java.awt.Color(226, 226, 226));
        btnProbar.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        btnProbar.setText("Probar");
        btnProbar.setBorderPainted(false);
        btnProbar.setContentAreaFilled(false);
        btnProbar.setFocusable(false);
        btnProbar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProbar.setOpaque(true);
        btnProbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProbarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProbarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProbarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnProbarMouseReleased(evt);
            }
        });
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });

        PanelProbarEjercicio.setBackground(new java.awt.Color(232, 232, 232));

        javax.swing.GroupLayout PanelProbarEjercicioLayout = new javax.swing.GroupLayout(PanelProbarEjercicio);
        PanelProbarEjercicio.setLayout(PanelProbarEjercicioLayout);
        PanelProbarEjercicioLayout.setHorizontalGroup(
            PanelProbarEjercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelProbarEjercicioLayout.setVerticalGroup(
            PanelProbarEjercicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Ejercicios : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProbarEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProbar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(PanelProbarEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProbarMouseEntered
        btnProbar.setBackground(new Color(59,89,152));
    }//GEN-LAST:event_btnProbarMouseEntered

    private void btnProbarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProbarMouseExited
        btnProbar.setBackground(new Color(226,226,226));
    }//GEN-LAST:event_btnProbarMouseExited

    private void btnProbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProbarMousePressed
        btnProbar.setBackground(new Color(1,50,170));
    }//GEN-LAST:event_btnProbarMousePressed

    private void btnProbarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProbarMouseReleased
        btnProbar.setBackground(new Color(226,226,226));
    }//GEN-LAST:event_btnProbarMouseReleased

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed
        
        try
        {  
            String ejercicio = jComboBox1.getSelectedItem().toString();
            
            switch(ejercicio)
            {
                case "Ejercicio 1":

                    PanelLab3Ejercicio1 panel = new PanelLab3Ejercicio1();
                    CambiarPanel(panel);

                    break;
                case "Ejercicio 2":

                    PanelLab3Ejercicio2 panel2 = new PanelLab3Ejercicio2();
                    CambiarPanel(panel2);

                    break;
                case "Ejercicio 3":

                    PanelLab3Ejercicio3 panel3 = new PanelLab3Ejercicio3();
                    CambiarPanel(panel3);

                    break;
                case "Ejercicio 4":

                    PanelLab3Ejercicio4 panel4 = new PanelLab3Ejercicio4();
                    CambiarPanel(panel4);

                    break;
                case "Ejercicio 5":

                    PanelLab3Ejercicio5 panel5 = new PanelLab3Ejercicio5();
                    CambiarPanel(panel5);

                    break;
                case "Ejercicio 6":

                    PanelLab3Ejercicio6 panel6 = new PanelLab3Ejercicio6();
                    CambiarPanel(panel6);

                    break;
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Seleccione uno de los ejercicios");
        }
    }//GEN-LAST:event_btnProbarActionPerformed
  
    /*
        En la funcion del combobox instanciamos nuestra clase ModeloDeTransferencia creando un 
        objeto para poder asignarle un valor al atributo de la clase mediante la funcion Set
    
        Luego creamos otro objeto llamado panel del tipo PanelVerAsignacion que recibe como parametro
        un objeto, en este caso el objeto asignacion que contiene como atributo un tipo string el cual nos servira
        en el formulario PanelVerAsignacion y mostrar en un textArea
    
        Luego usamos la funcion para cambiar de panel para mostrar todo lo conteindo en el PanelVerAsignacion
        con los datos que ya le pasamos
    */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        ModeloDeTransferencia asignacion = new ModeloDeTransferencia(); 
        
        String ejercicio = jComboBox1.getSelectedItem().toString();
        
        if (ejercicio.equals("Ejercicio 1"))
        {
            
            asignacion.setAsignacion("""
                                     Escribir un programa que lea un arreglo entero de N elementos y que cree un m\u00e9todo
                                     recursivo que los imprima en orden original e inverso. """);
        }
        else if (ejercicio.equals("Ejercicio 2"))
        {
            asignacion.setAsignacion("""
                                     Escriba un programa recursivo que lea una palabra e imprima su inversa. Ejemplo:
                                     palabra: ROMA
                                     Inversa: AMOR""");
        }
        else if (ejercicio.equals("Ejercicio 3"))
        {
            asignacion.setAsignacion("""
                                     Escriba un programa recursivo que pida 10 elementos enteros y calcule el producto de
                                     todos ellos. Imprimir los valores leídos y el producto. Ejemplo:
                                     Elementos:
                                     5 3 2 4 7 1 8 9 5 2
                                     Su producto es: 604,800
                                     """);
        }
        else if (ejercicio.equals("Ejercicio 4"))
        {
            asignacion.setAsignacion("""
                                     Escribir un programa recursivo que lea una cadena de caracteres y que cuente cuantos
                                     espacios en blanco tiene. Ejemplo:
                                     
                                     Esto es una prueba de recursividad
                                     Tiene 5 espacios en blanco.
                                     """);
            
        }
        else if (ejercicio.equals("Ejercicio 5"))
        {
            asignacion.setAsignacion("""
                                     Pedro y Juan abren una cuenta al mismo tiempo en un banco. Pedro la abre con $400 a
                                     una tasa de interés anual del 4% y Juan con $500 a una tasa de interés anual del 2.3%
                                     en el año 2021. Escribir un programa recursivo que determine en cuantos años la cuenta
                                     de Pedro será mayor de la de Juan.
                                     """);
        }
        else if (ejercicio.equals("Ejercicio 6"))
        {
            asignacion.setAsignacion("""
                                     Escriba un programa recursivo que resuelva la secuencia de ULAM: que pida un numero
                                     entero positivo mayor que 1, si el número es par, este deberá de dividirse entre dos 
                                     (este será el nuevo número) y si es impar deberá de multiplicarse por 3 y sumársele 1
                                     (este será el nuevo número). El proceso termina cuando el número llega a 1.
                                     Ejemplo:
                                     N=5
                                     Secuencia de ULAM:
                                     N = 5 16 8 4 2 1
                                     """);
        }
        
        PanelVerAsignacion panel = new PanelVerAsignacion(asignacion); 
        CambiarPanel(panel); 
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    
    private void CambiarPanel(JPanel panel)
    {
        panel.setSize(600,328); //le damos las medidas del panel
        panel.setLocation(0,0);
        
        /*
          PanelProbarEjercicio es un panel que se creo con el fin de poder destinar un área para poder desarrollar los 
          ejercicios, en la funcion CambiarPanel lo utilizamos para mostrar nuevos paneles en el area de este 
        */
        PanelProbarEjercicio.removeAll(); //removeoms lo que hay en el panel
        PanelProbarEjercicio.add(panel, BorderLayout.CENTER); //agragamos a panel de contencion el nuevo panel a mostrar
        PanelProbarEjercicio.revalidate();
        PanelProbarEjercicio.repaint();   //repintamos
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProbarEjercicio;
    private javax.swing.JButton btnProbar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
