package gui;

import database.*;
import javax.swing.*;

/**
 *Frame to handle the complaints
 * @author ujjawal
 */
public class ComplaintsFrame extends javax.swing.JFrame {


    public ComplaintsFrame(JFrame parent) {
        initComponents();
        setSize(parent.getSize());
        this.parent = parent;
        this.setIconImage(parent.getIconImage());
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

        parent = new javax.swing.JFrame();
        compaintPanel = new javax.swing.JPanel();
        complaintScrollPane = new javax.swing.JScrollPane();
        complaintTextArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        complaintDisplayLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

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

        compaintPanel.setBackground(new java.awt.Color(51, 51, 51));

        complaintTextArea.setColumns(20);
        complaintTextArea.setRows(5);
        complaintScrollPane.setViewportView(complaintTextArea);

        submitButton.setBackground(new java.awt.Color(153, 153, 153));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/Submit.png"))); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        complaintDisplayLabel.setForeground(new java.awt.Color(255, 255, 255));
        complaintDisplayLabel.setText("Have a problem? Write to us-");

        javax.swing.GroupLayout compaintPanelLayout = new javax.swing.GroupLayout(compaintPanel);
        compaintPanel.setLayout(compaintPanelLayout);
        compaintPanelLayout.setHorizontalGroup(
            compaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compaintPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(compaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(compaintPanelLayout.createSequentialGroup()
                        .addGap(0, 271, Short.MAX_VALUE)
                        .addComponent(submitButton))
                    .addComponent(complaintScrollPane)
                    .addGroup(compaintPanelLayout.createSequentialGroup()
                        .addComponent(complaintDisplayLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        compaintPanelLayout.setVerticalGroup(
            compaintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compaintPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(complaintDisplayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaintScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap())
        );

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compaintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(compaintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit the application?", "Really Closing?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        parent.setSize(getSize());
        dispose();        // TODO add your handling code here:
        parent.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        DataLoader.writeComplaint(complaintTextArea.getText());
        JOptionPane.showConfirmDialog(this, "Thank you for your feedback!\nYour suggestions are invaluable to us.","Confirmation",JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE);
        complaintTextArea.setText(" ");
    }//GEN-LAST:event_submitButtonActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel compaintPanel;
    private javax.swing.JLabel complaintDisplayLabel;
    private javax.swing.JScrollPane complaintScrollPane;
    private javax.swing.JTextArea complaintTextArea;
    private javax.swing.JFrame parent;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
