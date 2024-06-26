/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author acer
 */
public class DashBoardForm extends javax.swing.JFrame {

    /**
     * Creates new form DashBoardForm
     */
    public DashBoardForm() {
        initComponents();
       book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookManagement bookForm = new BookManagement();
                bookForm.setVisible(true);
                dispose(); // Close the current form
            }
        });
       
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        book = new javax.swing.JButton();
        borrowbook = new javax.swing.JButton();
        returnbook = new javax.swing.JButton();
        author = new javax.swing.JButton();
        borrower = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/booksignin.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        book.setBackground(new java.awt.Color(0, 153, 153));
        book.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("Book");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookMouseExited(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        borrowbook.setBackground(new java.awt.Color(0, 153, 153));
        borrowbook.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        borrowbook.setForeground(new java.awt.Color(255, 255, 255));
        borrowbook.setText("Borrrow Book");
        borrowbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowbookMouseExited(evt);
            }
        });
        borrowbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowbookActionPerformed(evt);
            }
        });

        returnbook.setBackground(new java.awt.Color(0, 153, 153));
        returnbook.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        returnbook.setForeground(new java.awt.Color(255, 255, 255));
        returnbook.setText("Return Book");
        returnbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnbookMouseExited(evt);
            }
        });
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });

        author.setBackground(new java.awt.Color(0, 153, 153));
        author.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        author.setForeground(new java.awt.Color(255, 255, 255));
        author.setText("Author");
        author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                authorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                authorMouseExited(evt);
            }
        });
        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });

        borrower.setBackground(new java.awt.Color(0, 153, 153));
        borrower.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        borrower.setForeground(new java.awt.Color(255, 255, 255));
        borrower.setText("Borrower");
        borrower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowerMouseExited(evt);
            }
        });
        borrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowerActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 153, 153));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(returnbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrowbook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrower, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(borrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrowbook, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnbook, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        BookManagement books = new BookManagement();
        dispose();
    }//GEN-LAST:event_bookActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        dispose(); // Close the DashBoardForm
    }//GEN-LAST:event_logoutActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed

        Author authorForm = new Author();
        authorForm.setVisible(true);
        dispose(); // Close the current form
  
    }//GEN-LAST:event_authorActionPerformed

    private void borrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowerActionPerformed
        Borrower borrowerForm = new Borrower();
        borrowerForm.setVisible(true);
        dispose(); // Close the current form
    }//GEN-LAST:event_borrowerActionPerformed

    private void borrowbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowbookActionPerformed
        BorrowingBook BorrowingBookForm = new BorrowingBook();
        BorrowingBookForm.setVisible(true);
        dispose(); // Close the current form
    }//GEN-LAST:event_borrowbookActionPerformed

    private void bookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseEntered
        Color clr = new Color(0,51,51);
        book.setBackground(clr);
    }//GEN-LAST:event_bookMouseEntered

    private void bookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseExited
        Color clr = new Color(0,153,153);
        book.setBackground(clr);
    }//GEN-LAST:event_bookMouseExited

    private void returnbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnbookMouseEntered
         Color clr = new Color(0,51,51);
        returnbook.setBackground(clr);
    }//GEN-LAST:event_returnbookMouseEntered

    private void returnbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnbookMouseExited
        Color clr = new Color(0,153,153);
        returnbook.setBackground(clr);
    }//GEN-LAST:event_returnbookMouseExited

    private void borrowbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowbookMouseEntered
        Color clr = new Color(0,51,51);
        borrowbook.setBackground(clr);
    }//GEN-LAST:event_borrowbookMouseEntered

    private void borrowbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowbookMouseExited
        Color clr = new Color(0,153,153);
        borrowbook.setBackground(clr);
    }//GEN-LAST:event_borrowbookMouseExited

    private void authorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorMouseEntered
        Color clr = new Color(0,51,51);
        author.setBackground(clr);
    }//GEN-LAST:event_authorMouseEntered

    private void authorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorMouseExited
        Color clr = new Color(0,153,153);
        author.setBackground(clr);
    }//GEN-LAST:event_authorMouseExited

    private void borrowerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowerMouseExited
        Color clr = new Color(0,153,153);
        borrower.setBackground(clr);
    }//GEN-LAST:event_borrowerMouseExited

    private void borrowerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowerMouseEntered
        Color clr = new Color(0,51,51);
        borrower.setBackground(clr);
    }//GEN-LAST:event_borrowerMouseEntered

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        Color clr = new Color(0,51,51);
        logout.setBackground(clr);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        Color clr = new Color(0,153,153);
        logout.setBackground(clr);
    }//GEN-LAST:event_logoutMouseExited

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
        ReturningBook returnbook = new ReturningBook();
        returnbook.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnbookActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton author;
    private javax.swing.JButton book;
    private javax.swing.JButton borrowbook;
    private javax.swing.JButton borrower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton returnbook;
    // End of variables declaration//GEN-END:variables
}
