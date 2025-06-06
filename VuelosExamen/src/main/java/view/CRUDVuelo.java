/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.VuelosControler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import modelo.Vuelos;

/**
 *
 * @author Pamel
 */
public class CRUDVuelo extends javax.swing.JFrame {

SimpleDateFormat format = new SimpleDateFormat("EEE dd MMM yyyy hh:mm");

        private static DefaultTableModel tabla;
    private int renglon;
   

    /**      
     * @param model
     */
    public CRUDVuelo(Vuelos model) {
        initComponents();
      

       tabla = (DefaultTableModel) tblvuelos.getModel();
        btncreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VuelosControler.createVuelo();

            }
        });

       

        btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VuelosControler.updateVuelo();
            }
        });
        btndelate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //VuelosControler.deleteVuelo();
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

        jpnbotones = new javax.swing.JPanel();
        pnlindex = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvuelos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblvuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblvuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblvuelosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblvuelos);

        javax.swing.GroupLayout pnlindexLayout = new javax.swing.GroupLayout(pnlindex);
        pnlindex.setLayout(pnlindexLayout);
        pnlindexLayout.setHorizontalGroup(
            pnlindexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlindexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlindexLayout.setVerticalGroup(
            pnlindexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlindexLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Vuelos");
        jLabel1.setToolTipText("");

        btncreate.setText("Agregar Vuelo");

        btnupdate.setText("Modificar Vuelo");

        btndelate.setText("Eliminar Vuelo");
        btndelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jpnbotones, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(138, 138, 138))
            .addComponent(pnlindex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(btndelate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnbotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncreate)
                            .addComponent(btndelate)
                            .addComponent(btnupdate))))
                .addGap(26, 26, 26)
                .addComponent(pnlindex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btndelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndelateActionPerformed

    private void tblvuelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblvuelosMousePressed
        // TODO add your handling code here:
        
        JTable tabla = (JTable)evt.getSource();
        renglon = tabla.rowAtPoint(evt.getPoint());
        System.out.println(renglon);
        if (evt.getClickCount() == 2) {
            int row = tabla.rowAtPoint(evt.getPoint());
            System.out.println(row);
        }
    }//GEN-LAST:event_tblvuelosMousePressed

    /**
     */
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelate;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnbotones;
    private javax.swing.JPanel pnlindex;
    private javax.swing.JTable tblvuelos;
    // End of variables declaration//GEN-END:variables

public void updateTabla(Vuelos model){
    int row = CRUDVuelo.tabla.getColumnCount();
    CRUDVuelo.tabla.addRow(new Object []{row+1,model.getCodigo(),model.getDestino(),model.getOrigen(),model.getFecha_completa(),model.getNumeroPasajeros()});
}

public void getTableRow(Vuelos model)throws ParseException{
    model.setCodigo(CRUDVuelo.tabla.getValueAt(renglon, 1).toString());
    model.setOrigen(CRUDVuelo.tabla.getValueAt(renglon, 2).toString());
    model.setDestino(CRUDVuelo.tabla.getValueAt(renglon, 3).toString());
    model.setFecha_completa(format.parse(CRUDVuelo.tabla.getValueAt(renglon, 4).toString()));
    model.setNumeroPasajeros(Integer.parseInt(CRUDVuelo.tabla.getValueAt(renglon, 5).toString()));
}

    void updateTableRow(Vuelos model) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }




}


