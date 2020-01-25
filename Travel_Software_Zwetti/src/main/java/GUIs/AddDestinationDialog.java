package GUIs;

import TableKlassen.SEARCHTYP;
import javax.swing.JLabel;

public class AddDestinationDialog extends javax.swing.JDialog {

    private String codes = "AF:Afghanistan;;AX:Åland;;AL:Albanien;;DZ:Algerien;;AS:Amerikanisch-Samoa;;AD:Andorra;;AO:Angola;;AI:Anguilla;;AQ:Antarktis;;AG:Antigua und Barbuda;;AR:Argentinien;;AM:Armenien;;AW:Aruba;;AU:Australien;;AT:Österreich;;AZ:Aserbaidschan;;BS:Bahamas;;BH:Bahrain;;BD:Bangladesch;;BB:Barbados;;BY:Weißrussland;;BE:Belgien;;BZ:Belize;;BJ:Benin;;BM:Bermuda;;BT:Bhutan;;BO:Bolivien;;BQ:Bonaire, Sint Eustatius und Saba ;;BA:Bosnien und Herzegowina;;BW:Botswana;;BV:Bouvetinsel;;BR:Brasilien;;IO:Britisches Territorium im Indischen Ozean;;VG:Britische Jungferninseln;;BN:Brunei;;BG:Bulgarien;;BF:Burkina Faso;;BI:Burundi;;KH:Kambodscha;;CM:Kamerun;;CA:Kanada;;CV:Kap Verde;;KY:Kaimaninseln;;CF:Zentralafrikanische Republik;;TD:Tschad;;CL:Chile;;CN:China;;CX:Weihnachtsinsel;;CC:Kokosinseln;;CO:Kolumbien;;KM:Komoren;;CK:Cookinseln;;CR:Costa Rica;;HR:Kroatien;;CU:Kuba;;CW:Curacao;;CY:Zypern;;CZ:Tschechische Republik;;CD:Demokratische Republik Kongo;;DK:Dänemark;;DJ:Dschibuti;;DM:Dominica;;DO:Dominikanische Republik;;TL:Osttimor;;EC:Ecuador;;EG:Ägypten;;SV:El Salvador;;GQ:Äquatorialguinea;;ER:Eritrea;;EE:Estland;;ET:Äthiopien;;FK:Falkland-Inseln;;FO:Färöer-Inseln;;FJ:Fidschi;;FI:Finnland;;FR:Frankreich;;GF:Französisch-Guayana;;PF:Französisch-Polynesien;;TF:Französische Süd- und Antarktisgebiete;;GA:Gabun;;GM:Gambia;;GE:Georgien;;DE:Deutschland;;GH:Ghana;;GI:Gibraltar;;GR:Griechenland;;GL:Grönland;;GD:Grenada;;GP:Guadeloupe;;GU:Guam;;GT:Guatemala;;GG:Guernsey;;GN:Guinea;;GW:Guinea-Bissau;;GY:Guyana;;HT:Haiti;;HM:Heard und McDonaldinseln;;HN:Honduras;;HK:Hongkong;;HU:Ungarn;;IS:Island;;IN:Indien;;ID:Indonesien;;IR:Iran;;IQ:Irak;;IE:Irland;;IM:Isle of Man;;IL:Israel;;IT:Italien;;CI:Elfenbeinküste;;JM:Jamaika;;JP:Japan;;JE:Jersey;;JO:Jordanien;;KZ:Kasachstan;;KE:Kenia;;KI:Kiribati;;XK:Kosovo;;KW:Kuwait;;KG:Kirgisistan;;LA:Laos;;LV:Lettland;;LB:Libanon;;LS:Lesotho;;LR:Liberia;;LY:Libyen;;LI:Liechtenstein;;LT:Litauen;;LU:Luxemburg;;MO:Macao;;MK:Mazedonien;;MG:Madagaskar;;MW:Malawi;;MY:Malaysia;;MV:Malediven;;ML:Mali;;MT:Malta;;MH:Marshallinseln;;MQ:Martinique;;MR:Mauretanien;;MU:Mauritius;;YT:Mayotte;;MX:Mexiko;;FM:Mikronesien;;MD:Moldawien;;MC:Monaco;;MN:Mongolei;;ME:Montenegro;;MS:Montserrat;;MA:Marokko;;MZ:Mosambik;;MM:Myanmar;;NA:Namibia;;NR:Nauru;;NP:Nepal;;NL:Niederlande;;AN:Niederländische Antillen;;NC:Neukaledonien;;NZ:Neuseeland;;NI:Nicaragua;;NE:Niger;;NG:Nigeria;;NU:Niue;;NF:Norfolkinsel;;KP:Nordkorea;;MP:Nördliche Marianen;;NO:Norwegen;;OM:Oman;;PK:Pakistan;;PW:Palau;;PS:Palästinensische Autonomiegebiete;;PA:Panama;;PG:Papua-Neuguinea;;PY:Paraguay;;PE:Peru;;PH:Philippinen;;PN:Pitcairninseln;;PL:Polen;;PT:Portugal;;PR:Puerto Rico;;QA:Katar;;CG:Republik Kongo;;RE:Réunion;;RO:Rumänien;;RU:Russland;;RW:Ruanda;;BL:Saint-Barthélemy;;SH:St. Helena;;KN:St. Kitts und Nevis;;LC:St. Lucia;;MF:St. Martin;;PM:Saint-Pierre und Miquelon;;VC:St. Vincent und die Grenadinen;;WS:Samoa;;SM:San Marino;;ST:São Tomé und Príncipe;;SA:Saudi-Arabien;;SN:Senegal;;RS:Serbien;;CS:Serbien und Montenegro;;SC:Seychellen;;SL:Sierra Leone;;SG:Singapur;;SX:Sint Maarten;;SK:Slowakei;;SI:Slowenien;;SB:Salomon-Inseln;;SO:Somalia;;ZA:Südafrika;;GS:Südgeorgien und die Südlichen Sandwichinseln;;KR:Südkorea;;SS:Südsudan;;ES:Spanien;;LK:Sri Lanka;;SD:Sudan;;SR:Suriname;;SJ:Svalbard und Jan Mayen;;SZ:Swasiland;;SE:Schweden;;CH:Schweiz;;SY:Syrien;;TW:Taiwan;;TJ:Tadschikistan;;TZ:Tansania;;TH:Thailand;;TG:Togo;;TK:Tokelau;;TO:Tonga;;TT:Trinidad und Tobago;;TN:Tunesien;;TR:Türkei;;TM:Turkmenistan;;TC:Turks- und Caicosinseln;;TV:Tuvalu;;VI:Amerikanische Jungferninseln;;UG:Uganda;;UA:Ukraine;;AE:Vereinte Arabische Emirate;;GB:Großbritannien;;US:Vereinigte Staaten von Amerika (USA);;UM:United States Minor Outlying Islands;;UY:Uruguay;;UZ:Usbekistan;;VU:Vanuatu;;VA:Vatikanstadt;;VE:Venezuela;;VN:Vietnam;;WF:Wallis und Futuna;;EH:Westsahara;;YE:Jemen;;ZM:Sambia;;ZW:Simbabwe;;";
    private boolean ok;
    private SearchString searchString;
    private boolean selection = true; //true for PLZ

    public boolean isSelection() {
        return selection;
    }

    public SearchString getSearchString() {
        return searchString;
    }

    public boolean isOk() {
        return ok;
    }

    public AddDestinationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillComboBox();
        buttonGroup1.add(rbName);
        buttonGroup1.add(rbPLZ);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btAdd = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        pSelect = new javax.swing.JPanel();
        lbPLZ = new javax.swing.JLabel();
        tfPlz = new javax.swing.JTextField();
        lbLand = new javax.swing.JLabel();
        cbLand = new javax.swing.JComboBox<>();
        rbPLZ = new javax.swing.JRadioButton();
        rbName = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btAdd.setText("Hinzufügen");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btClose.setText("Abbrechen");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        pSelect.setLayout(new java.awt.GridLayout(2, 2));

        lbPLZ.setText("PLZ:");
        pSelect.add(lbPLZ);

        tfPlz.setMinimumSize(new java.awt.Dimension(7, 17));
        pSelect.add(tfPlz);

        lbLand.setText("Land:");
        pSelect.add(lbLand);

        pSelect.add(cbLand);

        rbPLZ.setSelected(true);
        rbPLZ.setText("PLZ");
        rbPLZ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbPLZItemStateChanged(evt);
            }
        });
        rbPLZ.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPLZStateChanged(evt);
            }
        });
        rbPLZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPLZActionPerformed(evt);
            }
        });

        rbName.setText("Name");
        rbName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbNameItemStateChanged(evt);
            }
        });
        rbName.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNameStateChanged(evt);
            }
        });

        jLabel3.setText("Search by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rbPLZ)
                        .addGap(18, 18, 18)
                        .addComponent(rbName)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPLZ)
                    .addComponent(rbName)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(pSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        ok = false;
        this.dispose();

    }//GEN-LAST:event_btCloseActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if (selection) {
            String seletedItem = this.cbLand.getSelectedItem().toString();
            searchString = new SearchString(tfPlz.getText(), seletedItem.substring(seletedItem.indexOf(":") + 2), "", SEARCHTYP.ZIP);
        } else {
            searchString = new SearchString("", "", tfPlz.getText(), SEARCHTYP.NAME);
        }

        ok = true;
        this.dispose();
    }//GEN-LAST:event_btAddActionPerformed

    private void rbPLZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPLZActionPerformed
        //   System.out.println("Das erste");
    }//GEN-LAST:event_rbPLZActionPerformed

    private void rbPLZStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPLZStateChanged
        // System.out.println("PLZ");
    }//GEN-LAST:event_rbPLZStateChanged

    private void rbNameStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNameStateChanged
        //  System.out.println("Name");
    }//GEN-LAST:event_rbNameStateChanged

    private void rbNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbNameItemStateChanged
        System.out.println("NAME");
        selection = false;
        lbLand.setVisible(false);
        cbLand.setVisible(false);
        lbPLZ.setText("Name:");

    }//GEN-LAST:event_rbNameItemStateChanged

    private void rbPLZItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbPLZItemStateChanged
        System.out.println("PLZ");
        selection = true;
        lbLand.setVisible(true);
        cbLand.setVisible(true);
        lbPLZ.setText("PLZ:");

    }//GEN-LAST:event_rbPLZItemStateChanged

    private void fillComboBox() {

        String[] ss = codes.split(";;");

        for (String s : ss) {

            String[] land = s.split(":");
            s = "" + land[1] + " : " + land[0];

            cbLand.addItem(s);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddDestinationDialog dialog = new AddDestinationDialog(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClose;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLand;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbLand;
    private javax.swing.JLabel lbPLZ;
    private javax.swing.JPanel pSelect;
    private javax.swing.JRadioButton rbName;
    private javax.swing.JRadioButton rbPLZ;
    private javax.swing.JTextField tfPlz;
    // End of variables declaration//GEN-END:variables
}
