package GUIs;

import TableKlassen.WeatherRenderer;
import TableKlassen.WeatherModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class WeatherGUI extends javax.swing.JFrame {

    private WeatherModel model = new WeatherModel();

    public WeatherGUI() {
        initComponents();
        fillDateComboBox();
        editTable();

        try {
            model.loadDestinations(cbDates.getSelectedItem().toString());

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());

            //  Logger.getLogger(WeatherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miDeleteDestination = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        destinationsTable = new javax.swing.JTable();
        AddDestination1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbDates = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbDes2 = new javax.swing.JLabel();
        lbDes1 = new javax.swing.JLabel();
        btStartFastCompare = new javax.swing.JButton();
        btAddToFastCompare = new javax.swing.JButton();
        btDeleteFastCompare = new javax.swing.JButton();

        miDeleteDestination.setText("RemoveDestination");
        miDeleteDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeleteDestinationActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miDeleteDestination);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reise Sucher");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        destinationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        destinationsTable.setComponentPopupMenu(jPopupMenu1);
        destinationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(destinationsTable);

        AddDestination1.setText("Add Destination");
        AddDestination1.setMaximumSize(new java.awt.Dimension(49, 25));
        AddDestination1.setMinimumSize(new java.awt.Dimension(49, 25));
        AddDestination1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDestination1ActionPerformed(evt);
            }
        });

        jLabel1.setText("SearchForFollowingDay");

        cbDates.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDatesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbDates, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDates, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Schnellvergleich");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lbDes2.setText("....");

        lbDes1.setText("....");

        btStartFastCompare.setText("Schnellvergleich starten");
        btStartFastCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartFastCompareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStartFastCompare, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbDes1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lbDes2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btStartFastCompare))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(lbDes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );

        btAddToFastCompare.setText(">");
        btAddToFastCompare.setPreferredSize(new java.awt.Dimension(40, 40));
        btAddToFastCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddToFastCompareActionPerformed(evt);
            }
        });

        btDeleteFastCompare.setText("<");
        btDeleteFastCompare.setPreferredSize(new java.awt.Dimension(40, 40));
        btDeleteFastCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteFastCompareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddDestination1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAddToFastCompare, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(btDeleteFastCompare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(AddDestination1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btAddToFastCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteFastCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt opens the AddDialog calls add Methote in Model
     */
    private void AddDestination1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDestination1ActionPerformed
        AddDestinationDialog d = new AddDestinationDialog(this, true);
        d.setVisible(true);
        if (d.isOk()) {
            try {
                model.add(d.getSearchString());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Der Ort wurde nicht gefunden!");

            }
        }


    }//GEN-LAST:event_AddDestination1ActionPerformed

    /**
     *
     * @param evt gets the selected row Calls delete for the selected row
     */
    private void miDeleteDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeleteDestinationActionPerformed
        try {
            //Delete
            int row = this.destinationsTable.getSelectedRow();
            model.deleteDestination(row);
        } catch (Exception ex) {
            Logger.getLogger(WeatherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_miDeleteDestinationActionPerformed

    /**
     *
     * @param evt Loads the destinations for the selected date
     */
    private void cbDatesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDatesItemStateChanged

        try {
            model.loadDestinations(cbDates.getSelectedItem().toString());
        } catch (Exception ex) {

            Logger.getLogger(WeatherGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDatesItemStateChanged

    private void destinationsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationsTableMouseClicked
        //löschen
    }//GEN-LAST:event_destinationsTableMouseClicked

    /**
     *
     * @param evt Opens the FastCompareDialog
     */
    private void btStartFastCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartFastCompareActionPerformed

        if (!lbDes2.getText().equals("....") && !lbDes1.getText().equals("....")) {

            FastCompareDialog d = new FastCompareDialog(this, true, model);
            d.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Wähle zuerst 2 Zielorte aus!");
        }

    }//GEN-LAST:event_btStartFastCompareActionPerformed

    /**
     *
     * @param evt Adds the seletcted Destination to FastCompare List
     */
    private void btAddToFastCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddToFastCompareActionPerformed
        try {

            int row = destinationsTable.getSelectedRow();
            if (row == -1) {
                throw new Exception("Makiere zuerst einen Zielort!");
            }
            model.addFastDestination(row);
            lbDes1.setText(model.getFastDestinations().get(0).getCity().getName());
            if (model.getFastDestinations().size() == 2) {
                lbDes2.setText(model.getFastDestinations().get(1).getCity().getName());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btAddToFastCompareActionPerformed

    /**
     *
     * @param evt Clears the FastCompare List
     */
    private void btDeleteFastCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteFastCompareActionPerformed

        model.deleteFastCompare();
        lbDes1.setText("....");
        lbDes2.setText("....");
    }//GEN-LAST:event_btDeleteFastCompareActionPerformed

    /**
     * Fills the ComboBox with the next 5 Dates
     */
    private void fillDateComboBox() {
        for (int i = 0; i < 5; i++) {
            cbDates.addItem(LocalDate.now().plusDays(i).toString());

        }
    }

    /**
     * designs the table and set Renderer and Model
     */
    private void editTable() {
        destinationsTable.setModel(model);
        destinationsTable.setDefaultRenderer(Object.class, new WeatherRenderer());
        destinationsTable.setRowHeight(40);
        JTableHeader jth = destinationsTable.getTableHeader();

        jth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int sortBy = destinationsTable.columnAtPoint(e.getPoint());

                model.sort(sortBy);
            }

        });
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDestination1;
    private javax.swing.JButton btAddToFastCompare;
    private javax.swing.JButton btDeleteFastCompare;
    private javax.swing.JButton btStartFastCompare;
    private javax.swing.JComboBox<String> cbDates;
    private javax.swing.JTable destinationsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDes1;
    private javax.swing.JLabel lbDes2;
    private javax.swing.JMenuItem miDeleteDestination;
    // End of variables declaration//GEN-END:variables
}
