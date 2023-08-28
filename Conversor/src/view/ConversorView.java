package view;

import conversiones.*;
import utilidades.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ConversorView extends javax.swing.JFrame {

    private final ConversionMoneda conversionDivisa = new ConversionMoneda();
    private final ConversionTemperatura conversionTemperatura = new ConversionTemperatura();
    private final ConversionDeInformacion conversionInformacion = new ConversionDeInformacion();
    private final ConversionPeso conversionPeso = new ConversionPeso();
    private final ConversionDistancia conversionDistancia = new ConversionDistancia();
    
    private final Font GraublauB36 = ImportarFuente.loadFont("src/assets/font/GraublauSansDisplay-Bold.ttf", 36f, Font.BOLD);
    private final Font GraublauR24 = ImportarFuente.loadFont("src/assets/font/GraublauSansDisplay-Regular.ttf", 24f, Font.PLAIN);
    private final Font GraublauR20B = ImportarFuente.loadFont("src/assets/font/GraublauSansDisplay-Regular.ttf", 20f, Font.BOLD);

    private String conversionSeleccionada;
    private Timer timer;

    public ConversorView() {
        initComponents();
        cargarFuentes();
        
        JLabel[] botonesConversion = {lbTemperatura, lbPeso, lbDistancia, lbInformacion, lbDivisa};
        
        for (JLabel aux : botonesConversion) {
            
            aux.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    acutalizarComboBoxs(aux);
                    txtConvertido.setText("0");
                    panelInicial.setVisible(false);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }

            });
            
                timer = new Timer(3000, (ActionEvent e) -> {
                lbMensaje.setText("");
                timer.stop(); 
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelConversiones1 = new javax.swing.JPanel();
        panelInicial = new javax.swing.JPanel();
        lbMsgInicio1 = new javax.swing.JLabel();
        lbMsgInicio2 = new javax.swing.JLabel();
        lbConversionActual = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lbCantidad1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lbConvertirA = new javax.swing.JLabel();
        btnCopiar = new javax.swing.JLabel();
        cbConvertir = new javax.swing.JComboBox<>();
        cbCantidad = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        txtConvertido = new javax.swing.JTextField();
        lbMensaje = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JLabel();
        lbCantidad2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbPeso = new javax.swing.JLabel();
        lbDistancia = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbInformacion = new javax.swing.JLabel();
        lbTemperatura = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbTitulo = new javax.swing.JLabel();
        lbDivisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversiones");
        setIconImage(new ImageIcon("src/assets/images/icono.png").getImage());
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(158, 180, 190));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelConversiones1.setBackground(new java.awt.Color(207, 218, 223));
        panelConversiones1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicial.setBackground(new java.awt.Color(207, 218, 223));
        panelInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMsgInicio1.setBackground(new java.awt.Color(78, 78, 78));
        lbMsgInicio1.setFont(new java.awt.Font("GraublauSansDisplay-Bold", 0, 36)); // NOI18N
        lbMsgInicio1.setForeground(new java.awt.Color(78, 78, 78));
        lbMsgInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMsgInicio1.setText("Selecciona un tipo de ");
        panelInicial.add(lbMsgInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 50));

        lbMsgInicio2.setBackground(new java.awt.Color(78, 78, 78));
        lbMsgInicio2.setFont(new java.awt.Font("GraublauSansDisplay-Bold", 0, 36)); // NOI18N
        lbMsgInicio2.setForeground(new java.awt.Color(78, 78, 78));
        lbMsgInicio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMsgInicio2.setText("conversión para comenzar.");
        panelInicial.add(lbMsgInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 470, 50));

        panelConversiones1.add(panelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 540));

        lbConversionActual.setBackground(new java.awt.Color(78, 78, 78));
        lbConversionActual.setFont(new java.awt.Font("GraublauSansDisplay-Bold", 0, 36)); // NOI18N
        lbConversionActual.setForeground(new java.awt.Color(78, 78, 78));
        lbConversionActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConversionActual.setText("Divisas");
        panelConversiones1.add(lbConversionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 50));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        panelConversiones1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        panelConversiones1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 10));

        lbCantidad1.setBackground(new java.awt.Color(78, 78, 78));
        lbCantidad1.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        lbCantidad1.setForeground(new java.awt.Color(78, 78, 78));
        lbCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCantidad1.setText("Cantidad");
        lbCantidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelConversiones1.add(lbCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        panelConversiones1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, 10));

        lbConvertirA.setBackground(new java.awt.Color(78, 78, 78));
        lbConvertirA.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        lbConvertirA.setForeground(new java.awt.Color(78, 78, 78));
        lbConvertirA.setText("A");
        lbConvertirA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelConversiones1.add(lbConvertirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 30));

        btnCopiar.setBackground(new java.awt.Color(78, 78, 78));
        btnCopiar.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        btnCopiar.setForeground(new java.awt.Color(207, 218, 223));
        btnCopiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCopiar.setText("Copiar");
        btnCopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCopiar.setOpaque(true);
        btnCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCopiarMouseClicked(evt);
            }
        });
        panelConversiones1.add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, 30));

        cbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConvertirActionPerformed(evt);
            }
        });
        panelConversiones1.add(cbConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, -1));

        cbCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCantidadActionPerformed(evt);
            }
        });
        panelConversiones1.add(cbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, -1));

        txtCantidad.setBackground(new java.awt.Color(207, 218, 223));
        txtCantidad.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 24)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(78, 78, 78));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setText("0");
        txtCantidad.setBorder(null);
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        panelConversiones1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 40));

        txtConvertido.setBackground(new java.awt.Color(207, 218, 223));
        txtConvertido.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 24)); // NOI18N
        txtConvertido.setForeground(new java.awt.Color(78, 78, 78));
        txtConvertido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConvertido.setText("0");
        txtConvertido.setBorder(null);
        txtConvertido.setFocusable(false);
        panelConversiones1.add(txtConvertido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 140, 40));

        lbMensaje.setBackground(new java.awt.Color(78, 78, 78));
        lbMensaje.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        lbMensaje.setForeground(new java.awt.Color(78, 78, 78));
        lbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelConversiones1.add(lbMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 270, 30));

        btnConvertir.setBackground(new java.awt.Color(78, 78, 78));
        btnConvertir.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(207, 218, 223));
        btnConvertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConvertir.setText("Convertir");
        btnConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvertir.setOpaque(true);
        btnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMouseClicked(evt);
            }
        });
        panelConversiones1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, 30));

        lbCantidad2.setBackground(new java.awt.Color(78, 78, 78));
        lbCantidad2.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 1, 20)); // NOI18N
        lbCantidad2.setForeground(new java.awt.Color(78, 78, 78));
        lbCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCantidad2.setText("Convertido");
        lbCantidad2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelConversiones1.add(lbCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 30));

        panelFondo.add(panelConversiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 490, 540));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 10));

        lbPeso.setBackground(new java.awt.Color(78, 78, 78));
        lbPeso.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 0, 24)); // NOI18N
        lbPeso.setForeground(new java.awt.Color(78, 78, 78));
        lbPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPeso.setText("Peso");
        lbPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 30));

        lbDistancia.setBackground(new java.awt.Color(78, 78, 78));
        lbDistancia.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 0, 24)); // NOI18N
        lbDistancia.setForeground(new java.awt.Color(78, 78, 78));
        lbDistancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDistancia.setText("Distancia");
        lbDistancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lbDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 120, 10));

        lbInformacion.setBackground(new java.awt.Color(78, 78, 78));
        lbInformacion.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 0, 24)); // NOI18N
        lbInformacion.setForeground(new java.awt.Color(78, 78, 78));
        lbInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInformacion.setText("Información");
        lbInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lbInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 30));

        lbTemperatura.setBackground(new java.awt.Color(78, 78, 78));
        lbTemperatura.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 0, 24)); // NOI18N
        lbTemperatura.setForeground(new java.awt.Color(78, 78, 78));
        lbTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTemperatura.setText("Temperatura");
        lbTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lbTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 150, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 100, 10));

        lbTitulo.setBackground(new java.awt.Color(78, 78, 78));
        lbTitulo.setFont(new java.awt.Font("GraublauSansDisplay-Bold", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(78, 78, 78));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Conversiones");
        panelFondo.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, 200, 50));

        lbDivisa.setBackground(new java.awt.Color(78, 78, 78));
        lbDivisa.setFont(new java.awt.Font("GraublauSansDisplay-Regular", 0, 24)); // NOI18N
        lbDivisa.setForeground(new java.awt.Color(78, 78, 78));
        lbDivisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDivisa.setText("Divisas");
        lbDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lbDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Manejo de Eventos
    
    private void txtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusGained
        txtCantidad.setText(txtCantidad.getText().equals("0") ? "" : txtCantidad.getText());
    }//GEN-LAST:event_txtCantidadFocusGained

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost
        txtCantidad.setText(txtCantidad.getText().isBlank() ? "0" : txtCantidad.getText());
    }//GEN-LAST:event_txtCantidadFocusLost

    private void btnCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiarMouseClicked
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(txtConvertido.getText());
        clipboard.setContents(stringSelection, null);
        lbMensaje.setText("Copiado al portapeles");
        timer.start();
    }//GEN-LAST:event_btnCopiarMouseClicked

    private void cbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConvertirActionPerformed
        if (cbConvertir.getSelectedItem() != null && cbCantidad.getSelectedItem() != null) {
            String itemSelecConver = cbConvertir.getSelectedItem().toString();
            String itemSelecCant = cbCantidad.getSelectedItem().toString();

            if (itemSelecConver.equals(itemSelecCant)) {
                cbCantidad.removeItem(itemSelecCant);
                cbCantidad.addItem(itemSelecCant);
            }
        }
    }//GEN-LAST:event_cbConvertirActionPerformed

    private void cbCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCantidadActionPerformed
        if (cbConvertir.getSelectedItem() != null && cbCantidad.getSelectedItem() != null) {
            String itemSelecConver = cbConvertir.getSelectedItem().toString();
            String itemSelecCant = cbCantidad.getSelectedItem().toString();

            if (itemSelecCant.equals(itemSelecConver)) {
                cbConvertir.removeItem(itemSelecCant);
                cbConvertir.addItem(itemSelecCant);
            }
        }
    }//GEN-LAST:event_cbCantidadActionPerformed

    private void btnConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseClicked
        String itemCant = cbCantidad.getSelectedItem().toString().toUpperCase();
        String itemConver = cbConvertir.getSelectedItem().toString().toUpperCase();
        realizarConversiones(itemCant, itemConver);
    }//GEN-LAST:event_btnConvertirMouseClicked

    //Metododos
    
    private void cargarFuentes(){
        /* 
        Si las fuentes no cargan como en las imagenes de ejemplo, comenta esta todo este metodo e instala manualmente
                              las fuentes que se encuentran en el directorio de assets/font 
        */
        
//        JLabel[] fB36 = {lbMsgInicio1, lbMsgInicio2, lbTitulo, lbConversionActual};
//        JLabel[] fR24P = {lbDistancia, lbDivisa, lbInformacion, lbPeso, lbTemperatura};
//        JLabel[] fR20B = {lbCantidad1, lbCantidad2, lbConvertirA, btnConvertir, btnCopiar, lbMensaje};
//        Font[] fuentes = {GraublauB36, GraublauR24, GraublauR20B};
//        
//        ArrayList<JLabel[]> lbTexto = new ArrayList<>();
//        lbTexto.add(fB36);
//        lbTexto.add(fR24P);
//        lbTexto.add(fR20B);
//        
//        for (int i = 0; i < lbTexto.size(); i++) {
//            JLabel[] auxLb = lbTexto.get(i);
//            Font aux = fuentes[i];
//            
//            for(JLabel lb : auxLb){
//                lb.setFont(aux);
//            }
//        }
    }
    
    public void realizarConversiones(String itemSelecCant, String itemSelecConver) {
        DecimalFormat df = new DecimalFormat("###########.##");
        double resultado = 0;

        try {
            double cantidad = Double.parseDouble(txtCantidad.getText());

            if(!"Temperatura".equals(conversionSeleccionada) && cantidad < 0){
                throw new NumberFormatException();
            }
            
            switch (conversionSeleccionada) {
                case "Divisas" -> resultado = conversionDivisa.convertir(itemSelecCant, itemSelecConver, cantidad);
                case "Temperatura" -> resultado = conversionTemperatura.convertir(itemSelecCant, itemSelecConver, cantidad);
                case "Información" -> resultado = conversionInformacion.convertir(itemSelecCant, itemSelecConver, cantidad);
                case "Peso" -> resultado = conversionPeso.convertir(itemSelecCant, itemSelecConver, cantidad);
                case "Distancia" -> resultado = conversionDistancia.convertir(itemSelecCant, itemSelecConver, cantidad);
            }

            txtConvertido.setText(df.format(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa unicamente numeros");
        }
    }

    public void acutalizarComboBoxs(JLabel auxLb) {
        String[] valores = null;
        conversionSeleccionada = auxLb.getText();

        switch (conversionSeleccionada) {
            case "Divisas" -> valores = new String[]{"Dolar", "Peso Mexicano", "Euro", "Libra", "Won Surcoreano", "Yen"};
            case "Información" -> valores = new String[]{"Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte"};
            case "Temperatura" -> valores = new String[]{"Celsius", "Farenheit", "Kelvin"};
            case "Peso" -> valores = new String[]{"Gramos", "Onzas", "Libras", "Kilogramos", "Toneladas"};
            case "Distancia" -> valores = new String[]{"Milimetro", "Centimetro", "Metro", "Kilometro", "Milla"};
        }

        lbConversionActual.setText(auxLb.getText());
        cbCantidad.removeAllItems();
        cbConvertir.removeAllItems();

        for (String valor : valores) {
            cbCantidad.addItem(valor);
            cbConvertir.addItem(valor);
        }

        cbConvertir.setSelectedIndex(2);
    }
    
    
    //Ignorar -> Codigo autogenerado

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
            java.util.logging.Logger.getLogger(ConversorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConvertir;
    private javax.swing.JLabel btnCopiar;
    private javax.swing.JComboBox<String> cbCantidad;
    private javax.swing.JComboBox<String> cbConvertir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbCantidad1;
    private javax.swing.JLabel lbCantidad2;
    private javax.swing.JLabel lbConversionActual;
    private javax.swing.JLabel lbConvertirA;
    private javax.swing.JLabel lbDistancia;
    private javax.swing.JLabel lbDivisa;
    private javax.swing.JLabel lbInformacion;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbMsgInicio1;
    private javax.swing.JLabel lbMsgInicio2;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbTemperatura;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelConversiones1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtConvertido;
    // End of variables declaration//GEN-END:variables
}
