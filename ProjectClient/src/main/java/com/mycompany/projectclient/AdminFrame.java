/*
Filename: ServerFrame.java
Author: Christiaan Venter
Created: 2 December 2021
Operating System: Windows 10
Version: 1.0.0
Description: This file contains the GUI of the admin application.
*/

package com.mycompany.projectclient;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 * Public class of admin GUI application.
 * @author Christiaan Venter
 */
public class AdminFrame extends javax.swing.JFrame {
    // Set SQL Server objects with user and password:
    /**
     * Connection variable for connecting to SQL Server DB.
     */
    Connection connection;
    
    /**
     * Driver name of SQL Server driver used in application.
     */
    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    /**
     * URL of SQL Server DB.
     */
    String sourceURL = "jdbc:sqlserver://localhost:1433;databaseName=Movies_DB";
    
    /**
     * Username used to connect to SQL Server DB. Replace with own username.
     */
    String user = "user"; //Replace with own username
    
    /**
     * Password used to connect to SQL Server DB. Replace with own password.
     */
    String password = "password"; // Replace with own password
    
    /**
     * Creates new AdminFrame form.
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public AdminFrame() throws SQLException, ClassNotFoundException {
        // Connect to database:
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(sourceURL, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occured: " + e,
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }
        
        initComponents();
        
        // Hide components on launch:
        jPanel1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField5.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jLabel7.setVisible(false);
        jTextField4.setVisible(false);
        jButton4.setVisible(false);
        
        // Ensure text is removed:
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jPasswordField1.setText("");
        
        // Deselect radio buttons:
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMDB Admin");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        jTextField1.setColumns(8);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Name:");

        jLabel5.setText("Genre:");

        jTextField3.setColumns(12);

        jTextField5.setColumns(12);

        jButton3.setText("Delete Movie");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Add Movie");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPasswordField1.setColumns(8);

        jLabel1.setText("Description:");

        jTextField2.setColumns(12);

        jRadioButton1.setText("Action");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Crime");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Comedy");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Romantic Comedy");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jRadioButton1.getAccessibleContext().setAccessibleName("radioAction");
        jRadioButton2.getAccessibleContext().setAccessibleName("radioCrime");
        jRadioButton3.getAccessibleContext().setAccessibleName("radioComedy");
        jRadioButton4.getAccessibleContext().setAccessibleName("radioRomcom");

        jLabel6.setText("Name:");

        jLabel7.setText("Name:");

        jTextField4.setColumns(12);

        jButton4.setText("Add Genre");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField4)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(43, 43, 43)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("lblUsername");
        jLabel3.getAccessibleContext().setAccessibleName("lblPassword");
        jTextField1.getAccessibleContext().setAccessibleName("txtUsername");
        jButton1.getAccessibleContext().setAccessibleName("btnLogin");
        jButton2.getAccessibleContext().setAccessibleName("btnLogout");
        jLabel4.getAccessibleContext().setAccessibleName("lblName1");
        jTextField3.getAccessibleContext().setAccessibleName("txtName1");
        jTextField5.getAccessibleContext().setAccessibleName("txtName2");
        jButton3.getAccessibleContext().setAccessibleName("btnDeleteMovie");
        jButton5.getAccessibleContext().setAccessibleName("btnAddMovie");
        jPasswordField1.getAccessibleContext().setAccessibleName("txtPassword");
        jLabel1.getAccessibleContext().setAccessibleName("lblDescription");
        jTextField2.getAccessibleContext().setAccessibleName("txtDescription");
        jLabel6.getAccessibleContext().setAccessibleName("lblName2");
        jLabel7.getAccessibleContext().setAccessibleName("lblName3");
        jTextField4.getAccessibleContext().setAccessibleName("txtName3");
        jButton4.getAccessibleContext().setAccessibleName("btnAddGenre");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Admin login button:
    /**
     * Method for admin login.
     * @param evt Unused.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Create query:
        String query = "SELECT * FROM Client WHERE"
            + " username = ? AND password = ?";
        
        // Ensure radiobuttons are not selected:
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        // Execute query:
        try {
            PreparedStatement getUser = connection.prepareStatement(query);
            getUser.setString(1, jTextField1.getText());
            getUser.setString(2, jPasswordField1.getText());
            
            // Store query result in ResultSet:
            ResultSet result = getUser.executeQuery();
            
            // Read through ResultSet:
            if (result.next()) {                
                // Ensure text is removed:
                jTextField1.setText("");
                jPasswordField1.setText("");
                
                // Display admin components:
                jPanel1.setVisible(true);
                jLabel1.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField5.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton5.setVisible(true);
                jLabel7.setVisible(true);
                jTextField4.setVisible(true);
                jButton4.setVisible(true);
                
                // Hide login components:
                jTextField1.setVisible(false);
                jPasswordField1.setVisible(false);
                jButton1.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
            } else {
                // Error message:
                JOptionPane.showMessageDialog(null,
                    "Incorrect username or password...", "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (SQLException e) {
            // Error message:
            JOptionPane.showMessageDialog(null, "An error occured: " + e,
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Logout button:
    /**
     * Method for admin logout.
     * @param evt Unused.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Display login components:
        jTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jButton1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        
        // Ensure text is removed:
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField4.setText("");

        // Hide admin components:
        jPanel1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField5.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jLabel7.setVisible(false);
        jTextField4.setVisible(false);
        jButton4.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Add movie button:
    /**
     * Method for adding movie to DB on click.
     * @param evt Unused.
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int genreId = 0;

        // Set value of genre:
        if (jRadioButton1.isSelected()) {
            genreId = 1;
        } else if (jRadioButton2.isSelected()) {
            genreId = 2;
        } else if (jRadioButton3.isSelected()) {
            genreId = 3;
        } else if (jRadioButton4.isSelected()) {
            genreId = 4;
        } else {
            JOptionPane.showMessageDialog(null, "Please select a genre",
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }
        
        // Check is textfields are not empty:
        if (jTextField3.getText().equals("") ||
            jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(
                    null, "Name or description cannot be empty", "Error",
                    JOptionPane.ERROR_MESSAGE
                );
        } else {
            // Create query:
            String query = "INSERT INTO Movie (movieName, description, genreId)"
                + " VALUES (?, ?, ?)";

            // Execute query:
            try {
                PreparedStatement addMovie = connection.prepareStatement(query);
                addMovie.setString(1, jTextField3.getText());
                addMovie.setString(2, jTextField2.getText());
                addMovie.setInt(3, genreId);

                // Execute query:
                addMovie.executeUpdate();

                // Successful login dialog:
                JOptionPane.showMessageDialog(null, "Successfully added movie",
                    "Success", JOptionPane.INFORMATION_MESSAGE
                );

                // Ensure text is removed:
                jTextField2.setText("");
                jTextField3.setText("");

                // Deselect radio buttons:
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
            } catch (SQLException e) {
                // Error message:
                JOptionPane.showMessageDialog(null, "An error occured: " + e,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            }   
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Action genre radio button:
    /**
     * Deselect remaining RadioButtons.
     * @param evt Unused.
     */
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Crime genre radio button:
    /**
     * Deselect remaining RadioButtons.
     * @param evt Unused.
     */
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    // Comedy genre radio button:
    /**
     * Deselect remaining RadioButtons.
     * @param evt Unused.
     */
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // Romantic Comedy genre radio button:
    /**
     * Deselect remaining RadioButtons.
     * @param evt Unused.
     */
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    // Delete movie button:
    /**
     * Delete movie entered into text box.
     * @param evt Unused.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Delete if movie found:
        String deleteQuery = "DELETE FROM Movie WHERE movieName = ?";
        
        if (jTextField5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Movie name cannot be empty",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                PreparedStatement deleteMovie =
                    connection.prepareStatement(deleteQuery);
                deleteMovie.setString(1, jTextField5.getText());

                // Execute delete query:
                deleteMovie.executeUpdate();

                // Successful login dialog:
                JOptionPane.showMessageDialog(null, "Movie has been deleted",
                    "Success", JOptionPane.INFORMATION_MESSAGE
                );

                // Ensure text is removed:
                jTextField5.setText("");
            } catch (SQLException e) {
                 // Error message:
                JOptionPane.showMessageDialog(null, "An error occured: " + e,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Close menu item:
    /**
     * Method for closing application.
     * @param evt Unused.
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Add genre button:
    /**
     * Method for adding genre to DB.
     * @param evt Unused.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Create query:
        String query = "INSERT INTO Genre (genreName) VALUES (?)";
        
        String genreText = jTextField4.getText();
        
        // Execute query:
        if (genreText.matches("[a-zA-Z]+")) {
            try {
                PreparedStatement addGenre = connection.prepareStatement(query);
                addGenre.setString(1, jTextField4.getText());

                // Execute query:
                addGenre.executeUpdate();

                // Successful login dialog:
                JOptionPane.showMessageDialog(null, "Successfully added genre",
                    "Success", JOptionPane.INFORMATION_MESSAGE
                );

                // Ensure text is removed:
                jTextField4.setText("");

            } catch (SQLException e) {
                // Error message:
                JOptionPane.showMessageDialog(null, "An error occured: " + e ,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            JOptionPane.showMessageDialog(
                null, "Only alphabetical characters allowed", "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Main entry point admin GUI.
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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdminFrame().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminFrame.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}