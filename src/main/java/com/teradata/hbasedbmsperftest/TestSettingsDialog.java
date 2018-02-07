/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teradata.hbasedbmsperftest;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author glennm
 */
public class TestSettingsDialog extends javax.swing.JDialog {

    private boolean committed = false;

    /**
     * Get the value of committed
     *
     * @return the value of committed
     */
    public boolean isCommitted() {
        return committed;
    }

    private TestParameters testParameters = new TestParameters();

    /**
     * Get the value of testParameters
     *
     * @return the value of testParameters
     */
    public TestParameters getTestParameters() {
        return testParameters;
    }

    /**
     * Set the value of testParameters
     *
     * @param testParameters new value of testParameters
     */
    public void setTestParameters(TestParameters testParameters) {
        this.testParameters = testParameters;
        
        startingIdTextField.setText(Long.toString(testParameters.getStartId()));
        startingIdTextField.selectAll();
        putCountTextField.setText(Long.toString(testParameters.getNumberOfIds()));
        putCountTextField.selectAll();
        getCountTextField.setText(Long.toString(testParameters.getScanCount()));
        getCountTextField.selectAll();
        deleteAllDataCheckBox.setSelected(testParameters.isDeleteAllDataFirst());
        useBatchOperationsCheckBox.setSelected(testParameters.isUseBatchOperations());
    }

    
    public void setDbmsPropertiesFile(String path) {
        dbmsPropertiesFileTextField.setText(path);
        dbmsPropertiesFileTextField.selectAll();
    }
    
    public String getDbmsPropertiesFile() {
        return dbmsPropertiesFileTextField.getText();
    }
    
    
    public void setHBasePropertiesFile(String path) {
        hbasePropertiesFileTextField.setText(path);
        hbasePropertiesFileTextField.selectAll();
    }
    
    public String getHBasePropertiesFile() {
        return hbasePropertiesFileTextField.getText();
    }
    
    /**
     * Creates new form TestSettingsDialog
     */
    public TestSettingsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startingIdTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        putCountTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dbmsPropertiesFileTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hbasePropertiesFileTextField = new javax.swing.JTextField();
        dbmsBrowseButton = new javax.swing.JButton();
        hbaseBrowseButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        getCountTextField = new javax.swing.JTextField();
        deleteAllDataCheckBox = new javax.swing.JCheckBox();
        useBatchOperationsCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test Settings");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Settings"));

        jLabel1.setText("Starting ID:");

        startingIdTextField.setText("y");
        startingIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TestSettingsDialog.this.focusLost(evt);
            }
        });
        startingIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyHandler(evt);
            }
        });

        jLabel2.setText("Put Count:");

        putCountTextField.setText("x");
        putCountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TestSettingsDialog.this.focusLost(evt);
            }
        });

        jLabel3.setText("DBMS Properties File:");

        dbmsPropertiesFileTextField.setText("jTextField1");
        dbmsPropertiesFileTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TestSettingsDialog.this.focusLost(evt);
            }
        });

        jLabel4.setText("HBase Properties File:");

        hbasePropertiesFileTextField.setText("jTextField2");
        hbasePropertiesFileTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TestSettingsDialog.this.focusLost(evt);
            }
        });

        dbmsBrowseButton.setText("Browse");
        dbmsBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbmsBrowseButtonActionPerformed(evt);
            }
        });

        hbaseBrowseButton.setText("Browse");
        hbaseBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbaseBrowseButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Put Parameters:");

        jLabel6.setText("Get Parameters:");

        jLabel7.setText("Get Count:");

        getCountTextField.setText("z");
        getCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCountTextFieldActionPerformed(evt);
            }
        });

        deleteAllDataCheckBox.setText("Delete all data in table before put test?");

        useBatchOperationsCheckBox.setText("Use batches operations for put");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(putCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteAllDataCheckBox)
                                    .addComponent(useBatchOperationsCheckBox)))
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dbmsPropertiesFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(hbasePropertiesFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbmsBrowseButton)
                                    .addComponent(hbaseBrowseButton)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(startingIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(putCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(deleteAllDataCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useBatchOperationsCheckBox)
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(getCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbmsPropertiesFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dbmsBrowseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hbasePropertiesFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(hbaseBrowseButton))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        okButton.setText("OK");
        okButton.setSelected(true);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        lblErrorMessage.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(lblErrorMessage))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (validateInput(testParameters)) {
            committed = true;       // Register the fact that we've validated and committed the data for processing.
            setVisible(false);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void dbmsBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbmsBrowseButtonActionPerformed
        File f = new File(dbmsPropertiesFileTextField.getText());
        JFileChooser fileOpen = new JFileChooser(f.getParent());
        
        int result = fileOpen.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            dbmsPropertiesFileTextField.setText(fileOpen.getSelectedFile().getAbsolutePath());
        }
        
    }//GEN-LAST:event_dbmsBrowseButtonActionPerformed

    private void hbaseBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbaseBrowseButtonActionPerformed
        File f = new File(hbasePropertiesFileTextField.getText());
        JFileChooser fileOpen = new JFileChooser(f.getParent());
        
        int result = fileOpen.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            hbasePropertiesFileTextField.setText(fileOpen.getSelectedFile().getAbsolutePath());
        }
        
    }//GEN-LAST:event_hbaseBrowseButtonActionPerformed

    private void focusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLost
        Object source = evt.getSource();
        
        if (source instanceof JTextField) {
            JTextField textField = (JTextField) source;
            textField.selectAll();
        }
    }//GEN-LAST:event_focusLost

    private void keyHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyHandler
        int keyCode = evt.getKeyCode();
        
//        System.out.println("Key pressed: " + evt);
        if (keyCode == KeyEvent.VK_ESCAPE) {
            cancelButtonActionPerformed(null);
        }
        
        if (keyCode == KeyEvent.VK_ENTER) {
            okButtonActionPerformed(null);
        }
        
    }//GEN-LAST:event_keyHandler

    private void getCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCountTextFieldActionPerformed

    
    private boolean validateInput(TestParameters testParameters) {
        String value = null;
        String fieldName = null;
        javax.swing.JTextField field = null;
        try {
            field = startingIdTextField;
            fieldName = "Starting Value";
            value = field.getText();
            testParameters.setStartId(Long.parseLong(value));
            
            field = putCountTextField;
            fieldName = "Put Count ";
            value = field.getText();
            testParameters.setNumberOfIds(Long.parseLong(value));
            
            field = getCountTextField;
            fieldName = "Get Count";
            value = field.getText();
            testParameters.setScanCount(Integer.parseInt(value));
            
            testParameters.setDeleteAllDataFirst(deleteAllDataCheckBox.isSelected());
            testParameters.setUseBatchOperations(useBatchOperationsCheckBox.isSelected());
            
        } catch (NumberFormatException e) {
            lblErrorMessage.setText(String.format("Input Error: the \"%s\" value is \"%s\" but must be a number", fieldName, value));
            field.requestFocus();
            field.selectAll();
            return false;
        }
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(TestSettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestSettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestSettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestSettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TestSettingsDialog dialog = new TestSettingsDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton dbmsBrowseButton;
    private javax.swing.JTextField dbmsPropertiesFileTextField;
    private javax.swing.JCheckBox deleteAllDataCheckBox;
    private javax.swing.JTextField getCountTextField;
    private javax.swing.JButton hbaseBrowseButton;
    private javax.swing.JTextField hbasePropertiesFileTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField putCountTextField;
    private javax.swing.JTextField startingIdTextField;
    private javax.swing.JCheckBox useBatchOperationsCheckBox;
    // End of variables declaration//GEN-END:variables
}
