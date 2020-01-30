package GUIs;

import TableKlassen.WeatherModel;
import com.mycompany.travel_software_zwetti.weatherClasses.OpenWeatherResponse;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import restMain.RestClient;

public class FastCompareDialog extends javax.swing.JDialog {

    private WeatherModel model;

    public FastCompareDialog(java.awt.Frame parent, boolean modal, WeatherModel model) {
        super(parent, modal);
        this.model = model;
        initComponents();
        fillDateComboBox();
        fillDestinations();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbDes = new javax.swing.JLabel();
        lbDes2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbDes = new javax.swing.JComboBox<>();
        cbDes2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbTemp = new javax.swing.JLabel();
        lbTemp2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbPress = new javax.swing.JLabel();
        lbPress2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbHum = new javax.swing.JLabel();
        lbHum2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbPic = new javax.swing.JLabel();
        lbPic2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btClose = new javax.swing.JButton();

        jLabel10.setText("Temperatur:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Schnellvergleich");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridLayout(7, 3));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);

        lbDes.setBackground(new java.awt.Color(255, 255, 255));
        lbDes.setText("Destination 1");
        lbDes.setOpaque(true);
        getContentPane().add(lbDes);

        lbDes2.setBackground(new java.awt.Color(255, 255, 255));
        lbDes2.setText("Destination 2");
        lbDes2.setOpaque(true);
        getContentPane().add(lbDes2);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Datum:");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);

        cbDes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDesItemStateChanged(evt);
            }
        });
        getContentPane().add(cbDes);

        cbDes2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDes2ItemStateChanged(evt);
            }
        });
        getContentPane().add(cbDes2);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Temperatur:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);

        lbTemp.setBackground(new java.awt.Color(255, 255, 255));
        lbTemp.setOpaque(true);
        getContentPane().add(lbTemp);

        lbTemp2.setBackground(new java.awt.Color(255, 255, 255));
        lbTemp2.setOpaque(true);
        getContentPane().add(lbTemp2);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Luftdruck:");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);

        lbPress.setBackground(new java.awt.Color(255, 255, 255));
        lbPress.setOpaque(true);
        getContentPane().add(lbPress);

        lbPress2.setBackground(new java.awt.Color(255, 255, 255));
        lbPress2.setOpaque(true);
        getContentPane().add(lbPress2);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Luftfeuchtigkeit:");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);

        lbHum.setBackground(new java.awt.Color(255, 255, 255));
        lbHum.setOpaque(true);
        getContentPane().add(lbHum);

        lbHum2.setBackground(new java.awt.Color(255, 255, 255));
        lbHum2.setOpaque(true);
        getContentPane().add(lbHum2);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bild:");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15);

        lbPic.setBackground(new java.awt.Color(255, 255, 255));
        lbPic.setOpaque(true);
        getContentPane().add(lbPic);

        lbPic2.setBackground(new java.awt.Color(255, 255, 255));
        lbPic2.setOpaque(true);
        getContentPane().add(lbPic2);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19);

        btClose.setBackground(new java.awt.Color(255, 255, 255));
        btClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btClose.setText("Vergleich beenden");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btClose);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCloseActionPerformed

    private void cbDesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDesItemStateChanged

        OpenWeatherResponse o = model.getFastDestination(cbDes.getSelectedItem().toString(), 0);
        lbDes.setText(o.getName());
        lbTemp.setText(String.format("%.2f °C", o.getMain().getTemp_max() - 273.15));
        lbHum.setText(String.format("%d %s", o.getMain().getHumidity(), "%"));
        lbPress.setText(String.format("%d mbar", o.getMain().getPressure()));

        ImageIcon icon = new RestClient().getImage(o.getWeather().get(0).getIcon());
        lbPic.setIcon(icon);
        lbPic.setHorizontalAlignment(SwingConstants.CENTER);

    }//GEN-LAST:event_cbDesItemStateChanged

    private void cbDes2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDes2ItemStateChanged
        OpenWeatherResponse o = model.getFastDestination(cbDes2.getSelectedItem().toString(), 1);
        lbDes2.setText(o.getName());
        lbTemp2.setText(String.format("%.2f °C", o.getMain().getTemp_max() - 273.15));
        lbHum2.setText(String.format("%d %s", o.getMain().getHumidity(), "%"));
        lbPress2.setText(String.format("%d mbar", o.getMain().getPressure()));

        ImageIcon icon = new RestClient().getImage(o.getWeather().get(0).getIcon());
        lbPic2.setIcon(icon);
        lbPic2.setHorizontalAlignment(SwingConstants.CENTER);
    }//GEN-LAST:event_cbDes2ItemStateChanged

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
            java.util.logging.Logger.getLogger(FastCompareDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCompareDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCompareDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCompareDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FastCompareDialog dialog = new FastCompareDialog(new javax.swing.JFrame(), true, new WeatherModel());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void fillDateComboBox() {
        for (int i = 0; i < 5; i++) {
            cbDes.addItem(LocalDate.now().plusDays(i).toString());
            cbDes2.addItem(LocalDate.now().plusDays(i).toString());
            //  System.out.println(LocalDate.now().plusDays(i).toString());
        }
    }

    private void fillDestinations() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JComboBox<String> cbDes;
    private javax.swing.JComboBox<String> cbDes2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbDes;
    private javax.swing.JLabel lbDes2;
    private javax.swing.JLabel lbHum;
    private javax.swing.JLabel lbHum2;
    private javax.swing.JLabel lbPic;
    private javax.swing.JLabel lbPic2;
    private javax.swing.JLabel lbPress;
    private javax.swing.JLabel lbPress2;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JLabel lbTemp2;
    // End of variables declaration//GEN-END:variables
}
