package gui;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import database.*;

/**
 *Frame to show all the search operations of the application
 * @author ujjawal
 */
public class SearchFrame extends javax.swing.JFrame {

    
    public SearchFrame(JFrame parent) {
        initComponents();
        setSize(parent.getSize());
        this.parent = parent;
        setIconImage(parent.getIconImage());
        setTitle(parent.getTitle());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        parent = new javax.swing.JFrame();
        SearchPane = new javax.swing.JTabbedPane();
        PairPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        destinationCombo = new javax.swing.JComboBox<>();
        sourceCombo = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        StopPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        StopField = new javax.swing.JTextField();
        stopButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        stopsSearchButton = new javax.swing.JButton();
        stopsNamePanel = new javax.swing.JPanel();
        stopComboBox = new javax.swing.JComboBox<>();
        RoutePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        routeNoField = new javax.swing.JTextField();
        RouteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        routeButton = new javax.swing.JButton();
        routesNamePanel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        SchedulePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        routeSelectionList = new javax.swing.JList<>();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout parentLayout = new javax.swing.GroupLayout(parent.getContentPane());
        parent.getContentPane().setLayout(parentLayout);
        parentLayout.setHorizontalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        parentLayout.setVerticalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        SearchPane.setBackground(new java.awt.Color(51, 51, 51));
        SearchPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchPane.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        SearchPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SearchPaneStateChanged(evt);
            }
        });

        PairPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Destination:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Source:");

        destinationCombo.setEditable(true);
        destinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray()));
        destinationCombo.setSelectedItem("");
        destinationCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sourceCombo.setEditable(true);
        sourceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray()));
        sourceCombo.setSelectedItem("");
        sourceCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/searchIcon.png"))); // NOI18N
        searchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PairPanelLayout = new javax.swing.GroupLayout(PairPanel);
        PairPanel.setLayout(PairPanelLayout);
        PairPanelLayout.setHorizontalGroup(
            PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PairPanelLayout.createSequentialGroup()
                .addGroup(PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PairPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PairPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destinationCombo, 0, 500, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PairPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PairPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton)))
                .addContainerGap())
        );
        PairPanelLayout.setVerticalGroup(
            PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PairPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(sourceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(destinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        destinationCombo.setSelectedItem("");
        sourceCombo.setSelectedItem("");
        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
        searchButton.setFocusPainted(true);

        SearchPane.addTab("Buses Between two stops", PairPanel);

        StopPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bus Stop name:");

        StopField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        StopField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopFieldActionPerformed(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/searchIcon.png"))); // NOI18N
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Don't know the stop's name");

        stopsSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/questi.jpg"))); // NOI18N
        stopsSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopsSearchButtonActionPerformed(evt);
            }
        });

        stopsNamePanel.setBackground(new java.awt.Color(51, 51, 51));
        stopsNamePanel.setVisible(false);

        stopComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray()));
        stopComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stopsNamePanelLayout = new javax.swing.GroupLayout(stopsNamePanel);
        stopsNamePanel.setLayout(stopsNamePanelLayout);
        stopsNamePanelLayout.setHorizontalGroup(
            stopsNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stopsNamePanelLayout.createSequentialGroup()
                .addComponent(stopComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        stopsNamePanelLayout.setVerticalGroup(
            stopsNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stopsNamePanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(stopComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout StopPanelLayout = new javax.swing.GroupLayout(StopPanel);
        StopPanel.setLayout(StopPanelLayout);
        StopPanelLayout.setHorizontalGroup(
            StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StopPanelLayout.createSequentialGroup()
                .addGroup(StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StopPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StopPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopsSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopsNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(StopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StopField)))
                .addContainerGap())
        );
        StopPanelLayout.setVerticalGroup(
            StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stopsSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(StopPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(StopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(stopsNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        stopButton.setContentAreaFilled(false);
        stopButton.setBorderPainted(false);
        stopButton.setFocusPainted(true);

        SearchPane.addTab("All Buses at a stop", StopPanel);

        RoutePanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Route No:");

        routeNoField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RouteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/searchIcon.png"))); // NOI18N
        RouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Don't know the route no");

        routeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/questi.jpg"))); // NOI18N
        routeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeButtonActionPerformed(evt);
            }
        });

        routesNamePanel.setBackground(new java.awt.Color(51, 51, 51));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getAllRouteNO()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout routesNamePanelLayout = new javax.swing.GroupLayout(routesNamePanel);
        routesNamePanel.setLayout(routesNamePanelLayout);
        routesNamePanelLayout.setHorizontalGroup(
            routesNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(routesNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        routesNamePanelLayout.setVerticalGroup(
            routesNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, routesNamePanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout RoutePanelLayout = new javax.swing.GroupLayout(RoutePanel);
        RoutePanel.setLayout(RoutePanelLayout);
        RoutePanelLayout.setHorizontalGroup(
            RoutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoutePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RoutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoutePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(routeNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoutePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
                        .addComponent(RouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(RoutePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(routeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(routesNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        RoutePanelLayout.setVerticalGroup(
            RoutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoutePanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(RoutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(routeNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(RoutePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoutePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoutePanelLayout.createSequentialGroup()
                        .addComponent(routeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RoutePanelLayout.createSequentialGroup()
                        .addComponent(routesNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        stopButton.setContentAreaFilled(false);
        stopButton.setBorderPainted(false);
        stopButton.setFocusPainted(true);

        SearchPane.addTab("Route Search", RoutePanel);
        routesNamePanel.setVisible(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        routeSelectionList.setBackground(new java.awt.Color(102, 102, 102));
        routeSelectionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = DataLoader.getAllRouteNO();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        routeSelectionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                routeSelectionListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(routeSelectionList);

        tablePanel.setBackground(new java.awt.Color(51, 51, 51));

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        resultTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout SchedulePanelLayout = new javax.swing.GroupLayout(SchedulePanel);
        SchedulePanel.setLayout(SchedulePanelLayout);
        SchedulePanelLayout.setHorizontalGroup(
            SchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SchedulePanelLayout.setVerticalGroup(
            SchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SearchPane.addTab(" Complete Schedule", SchedulePanel);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        routeNoField.setText((String) ((JComboBox) evt.getSource()).getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void routeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeButtonActionPerformed
        // TODO add your handling code here:
        routesNamePanel.setVisible(!routesNamePanel.isVisible());
    }//GEN-LAST:event_routeButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        parent.setSize(getSize());
        parent.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void stopsSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopsSearchButtonActionPerformed
        // TODO add your handling code here:
        stopsNamePanel.setVisible(!stopsNamePanel.isVisible());
    }//GEN-LAST:event_stopsSearchButtonActionPerformed

    private void stopComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopComboBoxActionPerformed
        // TODO add your handling code here:
        StopField.setText((String) ((JComboBox) evt.getSource()).getSelectedItem());

    }//GEN-LAST:event_stopComboBoxActionPerformed

    private void StopFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StopFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this,
                "Are you sure to exit the application?", "Really Closing?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String source = (String) sourceCombo.getSelectedItem();
        String destination = (String) destinationCombo.getSelectedItem();
        PairSearchDisplay pairFrame = new PairSearchDisplay(this, source.toUpperCase(), destination.toUpperCase());
        if (!DataLoader.isStop(source) || !DataLoader.isStop(destination)) {
            JOptionPane.showMessageDialog(this, "Invalid Source or Destination.Try Again", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (source.equalsIgnoreCase(destination)) {
            JOptionPane.showMessageDialog(this, "Source can't be same as Destination.Try again", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            pairFrame.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void RouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteButtonActionPerformed
        String routeNo = routeNoField.getText();        // TODO add your handling code here:
        if (!DataLoader.isRouteNo(routeNo)) {
            JOptionPane.showMessageDialog(this, "Invalid Route No. Try again", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            RouteDisplay routeDisplay = new RouteDisplay(this, routeNo);
            routeDisplay.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_RouteButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        String stopName = StopField.getText();
        if (!DataLoader.isStop(stopName)) {
            JOptionPane.showMessageDialog(this, "Invalid Stop Name. Try again", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            StopDisplay stopDisplay = new StopDisplay(this, stopName);
            stopDisplay.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_stopButtonActionPerformed

    private void SearchPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SearchPaneStateChanged
        // TODO add your handling code here:
        tablePanel.setVisible(false);

    }//GEN-LAST:event_SearchPaneStateChanged

    private void routeSelectionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_routeSelectionListValueChanged
        // TODO add your handling code here:
        List<String> selectedRoutes = routeSelectionList.getSelectedValuesList();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        Object[][] data = DataLoader.getAllSelectedRoutes(selectedRoutes);
        DefaultTableModel tableModel = new DefaultTableModel(data, new String[]{"Sr. no.", "Bus Stop", "Arrival Time"});
        resultTable.setModel(tableModel);
        tablePanel.setVisible(true);
    }//GEN-LAST:event_routeSelectionListValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel PairPanel;
    private javax.swing.JButton RouteButton;
    private javax.swing.JPanel RoutePanel;
    private javax.swing.JPanel SchedulePanel;
    private javax.swing.JTabbedPane SearchPane;
    private javax.swing.JTextField StopField;
    private javax.swing.JPanel StopPanel;
    private javax.swing.JComboBox<String> destinationCombo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFrame parent;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton routeButton;
    private javax.swing.JTextField routeNoField;
    private javax.swing.JList<String> routeSelectionList;
    private javax.swing.JPanel routesNamePanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> sourceCombo;
    private javax.swing.JButton stopButton;
    private javax.swing.JComboBox<String> stopComboBox;
    private javax.swing.JPanel stopsNamePanel;
    private javax.swing.JButton stopsSearchButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
