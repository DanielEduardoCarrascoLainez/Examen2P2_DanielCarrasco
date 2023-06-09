/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2labp2_danielcarrasco;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class MainExamen extends javax.swing.JFrame {

    ArrayList<Equipos> equiposLista = new ArrayList();
    ArrayList<Deporte> deportesLista = new ArrayList();
    ArrayList<Torneo> torneoLista= new ArrayList();
    private DefaultTreeModel modeloArbol;

    public void Torneos() {

        //RAIZ, NO TOCAR
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Torneos");
        DefaultMutableTreeNode Q1N = new DefaultMutableTreeNode("Q1");
        DefaultMutableTreeNode Q2N = new DefaultMutableTreeNode("Q2");
        DefaultMutableTreeNode Q4N = new DefaultMutableTreeNode("Q4");
        DefaultMutableTreeNode Q5N = new DefaultMutableTreeNode("Q5");
        //RAIZ, NO TOCAR
        
        //AGREGAR
        raiz.add(Q1N);
        raiz.add(Q2N);
        raiz.add(Q4N);
        raiz.add(Q5N);
        //FIN AGREGAR Q

        //CREAR
        if (((String) comboQs.getSelectedItem()).equalsIgnoreCase("Q1")) {
            for (int i = 0; i < deportesLista.size(); i++) {
                if (deportesLista.get(i).getNombreD().equalsIgnoreCase(tf_DeporteName.getText())) {
                    DefaultMutableTreeNode nombreNodo = new DefaultMutableTreeNode(deportesLista.get(i).getNombreD());
                    Q1N.add(nombreNodo);
                }

            }
            //DefaultMutableTreeNode nombreNodo = new DefaultMutableTreeNode(tf_DeporteName.getText());

        } else if (((String) comboQs.getSelectedItem()).equalsIgnoreCase("Q2")) {
            for (int i = 0; i < deportesLista.size(); i++) {
                if (deportesLista.get(i).getNombreD().equalsIgnoreCase(tf_DeporteName.getText())) {
                    DefaultMutableTreeNode nombreNodo = new DefaultMutableTreeNode(deportesLista.get(i).getNombreD());
                    Q2N.add(nombreNodo);
                }

            }
        } else if (((String) comboQs.getSelectedItem()).equalsIgnoreCase("Q4")) {
            for (int i = 0; i < deportesLista.size(); i++) {
                if (deportesLista.get(i).getNombreD().equalsIgnoreCase(tf_DeporteName.getText())) {
                    DefaultMutableTreeNode nombreNodo = new DefaultMutableTreeNode(deportesLista.get(i).getNombreD());
                    Q4N.add(nombreNodo);
                }

            }
        } else if (((String) comboQs.getSelectedItem()).equalsIgnoreCase("Q5")) {
            for (int i = 0; i < deportesLista.size(); i++) {
                if (deportesLista.get(i).getNombreD().equalsIgnoreCase(tf_DeporteName.getText())) {
                    DefaultMutableTreeNode nombreNodo = new DefaultMutableTreeNode(deportesLista.get(i).getNombreD());
                    Q5N.add(nombreNodo);
                }

            }
        }

        /*DefaultMutableTreeNode futbolN = new DefaultMutableTreeNode("Fútbol");
        DefaultMutableTreeNode baloncestoN = new DefaultMutableTreeNode("Baloncesto");
        DefaultMutableTreeNode voleibolR = new DefaultMutableTreeNode("Voleibol");
        Q1N.add(futbolN);
        Q1N.add(baloncestoN);
        Q2N.add(futbolN);
        Q2N.add(voleibolR);
        Q4N.add(baloncestoN);
        Q4N.add(voleibolR);
        Q5N.add(futbolN);
        Q5N.add(voleibolR);*/
        //FIN PRUEBAS PARA CREAR
        //CREAR DEPORTES
        DefaultMutableTreeNode pruebaFutbol1 = new DefaultMutableTreeNode("Torneo de Fútbol 1");
        DefaultMutableTreeNode pruebaFutbol2 = new DefaultMutableTreeNode("Torneo de Fútbol 2");
        DefaultMutableTreeNode pruebaBaloncesto1 = new DefaultMutableTreeNode("Torneo de Baloncesto 1");
        DefaultMutableTreeNode pruebaBaloncesto2 = new DefaultMutableTreeNode("Torneo de Baloncesto 2");
        DefaultMutableTreeNode pruebaVolei1 = new DefaultMutableTreeNode("Torneo de Voleibol 1");
        DefaultMutableTreeNode pruebaVolei2 = new DefaultMutableTreeNode("Torneo de Voleibol 2");

        //Ignora mis pruebas del arbol
        /*futbolN.add(pruebaFutbol1);
        futbolN.add(pruebaFutbol2);
        baloncestoN.add(pruebaBaloncesto1);
        baloncestoN.add(pruebaBaloncesto2);
        voleibolR.add(pruebaVolei1);
        voleibolR.add(pruebaVolei2);*/
        // Crear modelo de árbol y establecer en el JTree

        modeloArbol = new DefaultTreeModel(raiz);
        Arbolito.setModel(modeloArbol);
    }

    /**
     * Creates new form MainExamen
     */
    public MainExamen() {
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

        DialogEquipos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_NombreEq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        DialogDeporte = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_DeporteName = new javax.swing.JTextField();
        comboQs = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        DialogTorneos = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        tf_torneo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        PopMenu = new javax.swing.JPopupMenu();
        Listar = new javax.swing.JMenuItem();
        Mostrar = new javax.swing.JMenuItem();
        AgregarTorneos = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbolito = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AAA = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Equipos");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Equipo");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Downloads\\jugador-de-ataque.png")); // NOI18N

        jButton5.setText("Agregar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NombreEq, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tf_NombreEq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout DialogEquiposLayout = new javax.swing.GroupLayout(DialogEquipos.getContentPane());
        DialogEquipos.getContentPane().setLayout(DialogEquiposLayout);
        DialogEquiposLayout.setHorizontalGroup(
            DialogEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogEquiposLayout.setVerticalGroup(
            DialogEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agregar Deportes");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del Deporte");

        comboQs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q4", "Q5" }));

        jButton3.setText("Agregar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboQs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_DeporteName)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_DeporteName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(comboQs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogDeporteLayout = new javax.swing.GroupLayout(DialogDeporte.getContentPane());
        DialogDeporte.getContentPane().setLayout(DialogDeporteLayout);
        DialogDeporteLayout.setHorizontalGroup(
            DialogDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DialogDeporteLayout.setVerticalGroup(
            DialogDeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jButton6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jButton6.setText("Agregar Torneo");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_torneo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(tf_torneo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton6)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogTorneosLayout = new javax.swing.GroupLayout(DialogTorneos.getContentPane());
        DialogTorneos.getContentPane().setLayout(DialogTorneosLayout);
        DialogTorneosLayout.setHorizontalGroup(
            DialogTorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DialogTorneosLayout.setVerticalGroup(
            DialogTorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PopMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PopMenuMouseClicked(evt);
            }
        });

        Listar.setText("jMenuItem1");
        PopMenu.add(Listar);

        Mostrar.setText("jMenuItem1");
        PopMenu.add(Mostrar);

        AgregarTorneos.setText("jMenuItem1");
        AgregarTorneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarTorneosMouseClicked(evt);
            }
        });
        PopMenu.add(AgregarTorneos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(105, 78, 181));

        Arbolito.setBackground(new java.awt.Color(191, 169, 255));
        Arbolito.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        Arbolito.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Arbolito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolitoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Arbolito);

        jButton1.setBackground(new java.awt.Color(77, 45, 171));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar Equipos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(77, 45, 171));
        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar Deportes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Downloads\\traje.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UNITEC TORNEOS");

        jButton4.setBackground(new java.awt.Color(77, 45, 171));
        jButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Agregar Torneos");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        AAA.setText("Revisa el codigo porfa please");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 106, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AAA)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AAA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        //BOTON LLEVA A DIALOG AGREGAR
        DialogEquipos.setVisible(true);
        DialogEquipos.pack();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        //AGREGAR EQUIPO
        String nombreE = tf_NombreEq.getText();
        //String deporte=(String)DeportesExistentes.getSelectedItem();

        Equipos equipo = new Equipos(nombreE, 0);
        equiposLista.add(equipo);

        tf_NombreEq.setText("");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        //AGREGAR DEPORTES
        String nombreDeporte = tf_DeporteName.getText();
        String periodo = (String) comboQs.getSelectedItem();

        if (tf_DeporteName.getText() != null) {
            Deporte deportes = new Deporte(nombreDeporte, periodo);
            deportesLista.add(deportes);
            Torneos();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        }

        tf_DeporteName.setText("");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        DialogDeporte.setVisible(true);
        DialogDeporte.pack();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        //AGREGAR TORNEOS
        String respuesta=JOptionPane.showInputDialog("Donde quiere ingresar el torneo?");
        
        Torneos();
    }//GEN-LAST:event_jButton4MouseClicked

    private void PopMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PopMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PopMenuMouseClicked

    private void ArbolitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolitoMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 3) {
            PopMenu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_ArbolitoMouseClicked

    private void AgregarTorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarTorneosMouseClicked
        // TODO add your handling code here:
        //DIALOG
        DialogTorneos.setVisible(true);
        DialogTorneos.pack();
    }//GEN-LAST:event_AgregarTorneosMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        /*String torneoName= tf_torneo.getText();
        //Torneo torneos= new Torneo();
        
        if (tf_torneo.getText() != null) {
            Torneo torneos= new Torneo(torneoName);
            torneoLista.add(torneos);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        }
        
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
        DefaultTreeModel modelito=(DefaultTreeModel)Arbolito.getModel();
        for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(torneoName)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Torneo(torneoName));
                    
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                    modelito.reload();
                    
                    DefaultMutableTreeNode x = new DefaultMutableTreeNode(raiz.getChildAt(i).getChildAt(0));
                }
        }

        tf_DeporteName.setText("");*/
    }//GEN-LAST:event_jButton6MouseClicked

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
            java.util.logging.Logger.getLogger(MainExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainExamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AAA;
    private javax.swing.JMenuItem AgregarTorneos;
    private javax.swing.JTree Arbolito;
    private javax.swing.JDialog DialogDeporte;
    private javax.swing.JDialog DialogEquipos;
    private javax.swing.JDialog DialogTorneos;
    private javax.swing.JMenuItem Listar;
    private javax.swing.JMenuItem Mostrar;
    private javax.swing.JPopupMenu PopMenu;
    private javax.swing.JComboBox<String> comboQs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tf_DeporteName;
    private javax.swing.JTextField tf_NombreEq;
    private javax.swing.JTextField tf_torneo;
    // End of variables declaration//GEN-END:variables
}
