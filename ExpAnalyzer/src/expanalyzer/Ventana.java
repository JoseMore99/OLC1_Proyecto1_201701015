/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expanalyzer;

import analizadores.Lex;
import analizadores.MErrores;
import analizadores.Parser;
import static analizadores.Parser.error;
import static analizadores.Parser.instrucciones;
import static analizadores.Parser.lexemas;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Moreira Paz
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtentrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtsalida = new javax.swing.JTextArea();
        lblimage = new javax.swing.JLabel();
        btnAnt = new javax.swing.JButton();
        btnSig = new javax.swing.JButton();
        boximg = new javax.swing.JComboBox<>();
        btnGraf = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        IntemAbrir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtentrada.setColumns(20);
        txtentrada.setRows(5);
        jScrollPane1.setViewportView(txtentrada);

        jLabel1.setText("ENTRADA:");

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel2.setText("SALIDA:");

        txtsalida.setColumns(20);
        txtsalida.setRows(5);
        jScrollPane3.setViewportView(txtsalida);

        btnAnt.setText("Anterior");
        btnAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntActionPerformed(evt);
            }
        });

        btnSig.setText("Siguiente");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        boximg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARBOLES", "SIGUIENTES", "TRANSISIONES", "AFD" }));
        boximg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boximgActionPerformed(evt);
            }
        });

        btnGraf.setText("Ver graficas");
        btnGraf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(btnAnalizar)))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnAnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSig))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(boximg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnGraf)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(boximg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnt)
                            .addComponent(btnSig))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Archivo");

        IntemAbrir.setText("Abrir");
        IntemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntemAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(IntemAbrir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Guardar");

        jMenuItem2.setText("guardar");
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("guardar como");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Interfaces.tabla_s t = new Interfaces.tabla_s();
    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        String texto = txtentrada.getText();
        Lex scanner = new Lex(new BufferedReader(new StringReader(texto)));
        Parser parser = new Parser(scanner);
        try {
            parser.parse();
        } catch (Exception ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!error.isEmpty()){
            FileWriter ficha;
            try {
                ficha = new FileWriter("errores.html");
                PrintWriter escritor = new PrintWriter(ficha);
                  escritor.println("<!DOCTYPE html>\n<html>\n<head><title>errores</title></head>\n<body>\n<table border=\"1\">");
                  escritor.println("<tr><td>#</td><td>tipo</td><td>desc</td><td>linea</td><td>columna</td>");
                  int contador = 1;
                  for (MErrores mErrores : error) {
                    escritor.println("<tr><td>"+contador+"</td>"
                            + "<td>"+mErrores.tipo+"</td>"
                            + "<td>"+mErrores.desc+"</td>"
                            + "<td>"+mErrores.linea+"</td>"
                            + "<td>"+mErrores.columna+"</td></tr>");
                    contador++;
                    }
                  escritor.println("</table></body>\n</html>");
                   ficha.close();
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            instrucciones.forEach((instruccion) -> {
                if (instruccion.getClass() == Interfaces.expresiones.conj_lista.class) {
                    Interfaces.expresiones.conj_lista o = (Interfaces.expresiones.conj_lista) instruccion;
                    o.ejecutar(t);
                }
                if (instruccion.getClass() == Interfaces.expresiones.conj_rango.class) {
                    Interfaces.expresiones.conj_rango o = (Interfaces.expresiones.conj_rango) instruccion;
                    o.ejecutar(t);
                }
                if (instruccion.getClass() == Interfaces.expresiones.ExpRegular.class) {
                    Interfaces.expresiones.ExpRegular o = (Interfaces.expresiones.ExpRegular) instruccion;
                    o.ejecutar(t);
                }

            });
            lexemas.forEach((lex)->{
                if (lex.getClass() == Interfaces.expresiones.lexemas.class) {
                    Interfaces.expresiones.lexemas o = (Interfaces.expresiones.lexemas) lex;
                    o.ejecutar(t);
                }
            });
            
        } catch (Exception e) {

        }
        txtsalida.append("Finalizando analisis...");
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntActionPerformed
        // TODO add your handling code here:
        for (int i = cuentaImg; i > 0; i--) {
            Object o = instrucciones.get(i);
            if (o.getClass() == Interfaces.expresiones.ExpRegular.class) {
                Interfaces.expresiones.ExpRegular e = (Interfaces.expresiones.ExpRegular) o;
               lblimage.setIcon(new ImageIcon(new ImageIcon(rutaImg+e.id+".png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT)));
               cuentaImg--; 
               return;
            }
            cuentaImg--;
        }
          cuentaImg=0;
           for (Object instruccion : instrucciones) {
            if (instruccion.getClass() == Interfaces.expresiones.ExpRegular.class) {
                Interfaces.expresiones.ExpRegular o = (Interfaces.expresiones.ExpRegular) instruccion;
               lblimage.setIcon(new ImageIcon(new ImageIcon(rutaImg+o.id+".png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT)));
               cuentaImg++; 
               break;
            }

            cuentaImg++;
        }
    }//GEN-LAST:event_btnAntActionPerformed

    private void IntemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntemAbrirActionPerformed
        // TODO add your handling code here:
        String direccion;
        JFileChooser buscador = new JFileChooser();
        FileNameExtensionFilter nombre = new FileNameExtensionFilter(
                "EXP", "exp");
        buscador.setFileFilter(nombre);
        int acep = buscador.showOpenDialog(null);

        if (acep == JFileChooser.APPROVE_OPTION) {
            direccion = buscador.getSelectedFile().getAbsolutePath();
            try {
                FileReader archi = new FileReader(direccion);
                BufferedReader bf = new BufferedReader(archi);
                String linea, lineas = "";
                try {
                    while ((linea = bf.readLine()) != null) {
                        lineas = lineas + linea + "\n";
                        txtentrada.append(linea + "\n");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_IntemAbrirActionPerformed
    static int cuentaImg;
    public String rutaImg;
    private void btnGrafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafActionPerformed
        // TODO add your handling code here:
        int opcion = boximg.getSelectedIndex();
        cuentaImg=0;
        rutaImg="src/";
        switch(opcion){
                case 0:
                    rutaImg+="ARBOLES_201701015/arbol";
                    break;
                case 1:
                    rutaImg+="SIGUIENTES_201701015/sig";
                    break;
                case 2:
                    rutaImg+="TRANSICIONES_201701015/trans";
                    break;
                case 3:
                    rutaImg+="AFD_201701015/afd";
                    break;
            }
        
        for (Object instruccion : instrucciones) {
            if (instruccion.getClass() == Interfaces.expresiones.ExpRegular.class) {
                Interfaces.expresiones.ExpRegular o = (Interfaces.expresiones.ExpRegular) instruccion;
               lblimage.setIcon(new ImageIcon(new ImageIcon(rutaImg+o.id+".png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT)));
               cuentaImg++; 
               break;
            }

            cuentaImg++;
        }
        
    }//GEN-LAST:event_btnGrafActionPerformed

    private void boximgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boximgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boximgActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        // TODO add your handling code here:
          for (int i = cuentaImg; i < instrucciones.size(); i++) {
            Object o = instrucciones.get(i);
            if (o.getClass() == Interfaces.expresiones.ExpRegular.class) {
                Interfaces.expresiones.ExpRegular e = (Interfaces.expresiones.ExpRegular) o;
               lblimage.setIcon(new ImageIcon(new ImageIcon(rutaImg+e.id+".png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT)));
               cuentaImg++; 
               return;
            }
            cuentaImg++;
        }
          cuentaImg=0;
           for (Object instruccion : instrucciones) {
            if (instruccion.getClass() == Interfaces.expresiones.ExpRegular.class) {
                Interfaces.expresiones.ExpRegular o = (Interfaces.expresiones.ExpRegular) instruccion;
               lblimage.setIcon(new ImageIcon(new ImageIcon(rutaImg+o.id+".png").getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT)));
               cuentaImg++; 
               break;
            }

            cuentaImg++;
        }
    }//GEN-LAST:event_btnSigActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IntemAbrir;
    private javax.swing.JComboBox<String> boximg;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnAnt;
    private javax.swing.JButton btnGraf;
    private javax.swing.JButton btnSig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextArea txtentrada;
    private javax.swing.JTextArea txtsalida;
    // End of variables declaration//GEN-END:variables
}
