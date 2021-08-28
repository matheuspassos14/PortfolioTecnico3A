package cassinojokers;

import java.util.Random;
import javax.swing.JOptionPane;

public class SomaDeDados extends javax.swing.JFrame {
    
    int aposta;
    int conta;
    
    public SomaDeDados() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        ApostaDados = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Rodar dados!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ApostaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApostaDadosActionPerformed(evt);
            }
        });

        jLabel1.setText("Insira sua aposta: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApostaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApostaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aposta = Integer.parseInt(ApostaDados.getText()); 
        int somaP;
        int somaM;
        Random Player1 = new Random();        
        int r1 = Player1.nextInt(6)+1;            
        Random Player2 = new Random();        
        int r2 = Player2.nextInt(6)+1; 
        somaP = r1 + r2;
        
        Random Mesa1 = new Random();        
        int r3 = Mesa1.nextInt(6)+1;            
        Random Mesa2 = new Random();        
        int r4 = Mesa2.nextInt(6)+1; 
        somaM = r3 + r4;
        
        if(somaP == somaM){
            JOptionPane.showMessageDialog(null, "Seus dados : " + r1 + " + " + r2 + " = " + somaP + "\nDados da mesa : " + r3 + " + " + r4 + " = " + somaM);      
            conta = aposta * 10;
            JOptionPane.showMessageDialog(null,"YOU WIN " + conta + " Basks");
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Seus dados : " + r1 + " + " + r2 + " = " + somaP + "\nDados da mesa : " + r3 + " + " + r4 + " = " + somaM);      
            JOptionPane.showMessageDialog(null,"YOU LOSE");
        };
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ApostaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApostaDadosActionPerformed

    }//GEN-LAST:event_ApostaDadosActionPerformed

    
    
    public static void main(String args[]) {
           
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SomaDeDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SomaDeDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApostaDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
