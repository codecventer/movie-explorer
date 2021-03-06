/*
Filename: ServerFrame.java
Author: Christiaan Venter
Created: 2 December 2021
Operating System: Windows 10
Version: 1.0.0
Description: This file contains the GUI of the server application.
*/

package com.mycompany.projectserver;

// Import dependencies:
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 * Public class of the server's GUI application.
 * @author Christiaan Venter
 */
public class ServerFrame extends javax.swing.JFrame {
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
    
    // Create objects used in server:
    /**
     * Instantiating ServerSocket object.
     */
    ServerSocket echoServer;
    boolean listening;

    /**
     * Creates a new ServerFrame form
     * @throws java.sql.SQLException SQL Exception
     * @throws java.lang.ClassNotFoundException ClassNotFoundException
     */
    public ServerFrame() throws SQLException, ClassNotFoundException {    
        // Connect to database:
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(sourceURL, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(
                null, "Server: An error occured - " + e, "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        initComponents();
        
        // Hide status and buttons until logged in:
        jLabel1.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server Manager");

        jButton1.setText("Start Server");
        jButton1.setActionCommand("btnStart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop Server");
        jButton2.setActionCommand("btnStop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setColumns(17);

        jButton3.setText("Login");
        jButton3.setActionCommand("btnLogin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Server Status: Ready");

        jButton4.setText("Logout");
        jButton4.setActionCommand("btnLogout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPasswordField1.setColumns(17);

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("btnStart");
        jButton2.getAccessibleContext().setAccessibleName("btnStop");
        jTextField1.getAccessibleContext().setAccessibleName("txtUsername");
        jButton3.getAccessibleContext().setAccessibleName("btnLogin");
        jLabel1.getAccessibleContext().setAccessibleName("lblStatus");
        jButton4.getAccessibleContext().setAccessibleName("btnLogout");
        jPasswordField1.getAccessibleContext().setAccessibleName("txtPassword");
        jLabel2.getAccessibleContext().setAccessibleName("lblUsername");
        jLabel3.getAccessibleContext().setAccessibleName("lblPassword");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Login button:
    /**
     * Login button for admin users only.
     * @param evt Unused.
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Create query:
        String query = "SELECT * FROM Client WHERE"
            + " username = ? AND password = ?";
        
        // Execute query:
        try {
            PreparedStatement getUser = connection.prepareStatement(query);
            getUser.setString(1, jTextField1.getText());
            getUser.setString(2, jPasswordField1.getText());
            
            // Store query result in ResultSet:
            ResultSet result = getUser.executeQuery();
            
            // Read through ResultSet:
            if (result.next()) {
                // Display status and buttons:
                jLabel1.setVisible(true);
                jButton1.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(false);
                jButton4.setVisible(true);
                
                // Remove text and disable textfield and passwordfield:
                jTextField1.setText("");
                jPasswordField1.setText("");
                jTextField1.setEnabled(false);
                jPasswordField1.setEnabled(false);
            } else {
                // Error message:
                JOptionPane.showMessageDialog(
                    null, "Incorrect username or password...",
                        "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (SQLException e) {
            // Error message:
            JOptionPane.showMessageDialog(
                null, "An error occured: " + e,
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Logout button:
    /**
     * Logout button for admin users.
     * @param evt Unused.
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Hide status and start/stop server buttons:
        jLabel1.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        
        // Enable textfield and password:
        jTextField1.setEnabled(true);
        jPasswordField1.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Start server:
    /**
     * Button for starting the server.
     * @param evt Unused.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Create new socket:
            echoServer = new ServerSocket(16000);
            listening = true;
            JOptionPane.showMessageDialog(
                null, "Server: The server has started", "Server Started",
                JOptionPane.INFORMATION_MESSAGE
            );
            jLabel1.setText("Server Status: Running");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                null, "Server: An error occured - " + e,
                "Error", JOptionPane.ERROR_MESSAGE
            );
            System.exit(1);
        }

        // Listen for more clients:
        while (listening) {
            try {
                // Create new client socket and start new session:
                /**
                 * Create new client socket for each new client.
                 */
                new Session(echoServer.accept()); 
                JOptionPane.showMessageDialog(
                    null, "Server: New client accepted", "New Client",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                    null, "Server: An error occured - " + e,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            } catch (SQLException ex) {
                Logger.getLogger(ServerFrame.class.getName())
                    .log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ServerFrame.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Stop server button:
    /**
     * Button for stopping the running server.
     * @param evt Unused.
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
         * Instantiate new Session object.
         */
        Session session = new Session();
        
        try {
            session.stopServer();
        } catch (IOException ex) {
            Logger.getLogger(ServerFrame.class.getName())
                .log(Level.SEVERE, null, ex);
        }
        jLabel1.setText("Server Status: Stopped");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Main entry point of application.
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
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ServerFrame().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ServerFrame.class.getName())
                    .log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

// Thread class for handling client requests:
/**
 * Class that is responsible for running threads and handling client requests.
 * @author Christiaan Venter
 */
class Session implements Runnable {
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
    
    // Create objects used in Thread:
    /**
     * @param soc Create new socket object.
     */
    Socket soc;
    
    /**
     * @param br Create new BufferedReader object.
     */
    BufferedReader br;
    
    /**
     * @param pw Create new PrintWriter object.
     */
    PrintWriter pw;
    
    /**
     * @param runner Create new Thread object.
     */
    Thread runner;
    
    /**
     * @param input Create new string variable for receiving client requests.
     */
    String input;
    
    /**
     * @param output Create new string variable for sending server response.
     */
    String output;
    
    /**
     * @param resultList Used to store request results.
     */
    ArrayList<String> resultList = new ArrayList<>();

    /**
     * Sets up the input and output to and from the client. Also calls the main run method of the thread.
     * @param s Assigned to incoming client socket.
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    Session(Socket s) throws SQLException, ClassNotFoundException {
        soc = s;

        // Create new BufferedReader and PrintWriter objects:
        try {
            br = new BufferedReader(
                new InputStreamReader(soc.getInputStream())
            );
            pw = new PrintWriter(
                new BufferedOutputStream(soc.getOutputStream()), true
            );
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                null, "Server: An error occured - " + e ,
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }

        // Start thread:
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    // Additional exception for Thread class:
    /**
     * Additional exception used for Session object.
     */
    Session() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Method for running the thread.
     */
    @Override
    public void run() {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(sourceURL, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(
                null, "Server: An error occured - " + e,
                "Error", JOptionPane.ERROR_MESSAGE
            );
        }
        
        while (runner == Thread.currentThread()) {
            try {
                input = br.readLine();
                if (input != null) {

                    // Query Movie table:
                    if (input.substring(input.length()-1).equals("1")) {

                        // Remove number from string:
                        String inputString = input;
                        String queryMovieString = inputString.substring(
                            0, inputString.length()-1
                        );

                        // Create search query:
                        String movieQuery = "SELECT * FROM Movie"
                            + " WHERE movieName LIKE '%"
                            + queryMovieString + "%'";

                        try {
                            PreparedStatement getMovie = connection
                                .prepareStatement(movieQuery);
                            ResultSet result = getMovie.executeQuery();

                            while (result.next()) {
                                // Store result into ArrayList:
                                resultList.add(result.getString("movieName"));

                                // Return ArrayList to client:
                                output = resultList.stream().map(i -> i)
                                    .collect(Collectors.joining(", "));
                            }

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(
                                null, "Server: An error occured - " + e,
                                "Error", JOptionPane.ERROR_MESSAGE
                            );
                        } finally {
                            // Clear ArrayList for future requests:
                            resultList.clear();
                        }

                    }
                    // Query Genre table:
                    else if (input.substring(input.length()-1).equals("2")) {

                        // Remove number from string:
                        String inputString = input;
                        String queryGenreString = inputString.substring(
                            0, inputString.length()-1
                        );

                        // Create search query:
                        String genreQuery = "SELECT genreName FROM Genre WHERE"
                            + " genreName LIKE '%"
                            + queryGenreString + "%'";

                        try {
                            PreparedStatement getGenre = connection
                                .prepareStatement(genreQuery);
                            ResultSet result = getGenre.executeQuery();

                            while (result.next()) {
                                // Store result into ArrayList:
                                resultList.add(result.getString("genreName"));

                                // Return ArrayList to client:
                                output = resultList.stream().map(i -> i)
                                    .collect(Collectors.joining(", "));
                            }

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(
                                null, "Server: An error occured - " + e,
                                "Error", JOptionPane.ERROR_MESSAGE
                            );
                        } finally {
                            // Clear ArrayList for future requests:
                            resultList.clear();
                        }

                    }
                    // Error message:
                    else {
                        output = "Something went wrong...";
                    }

                    // Pass reponse to client:
                    pw.println(output);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(
                    null, "Server: An error occured - " + e,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(
                    null, "Server: An error occured - " + e,
                    "Error", JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
    
    // Stop server:
    /**
     * Stop server method.
     * @throws IOException 
     */
    void stopServer() throws IOException {
        runner = null;
        pw.close();
        br.close();
        soc.close();
    }

}