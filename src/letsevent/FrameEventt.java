/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsevent;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP Pc
 */
public class FrameEventt extends javax.swing.JFrame {
    
    private String idSelected;
    public boolean databaru;
    private Connection con;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;

    /**
     * Creates new form Tes
     */
    public FrameEventt() {
         initComponents();
        databaru = true;
        getData();
    }
    //mengambil data 
    private void getData()
    {
        // menampilkan data dari database
        try 
        {
            DefaultTableModel model = new DefaultTableModel();         
            con = (Connection) Koneksi.getKoneksi();
            st = con.createStatement();
            rs = st.executeQuery("SELECT id_event AS ID, nama_event AS 'Event Name', tanggal_event AS 'Date', lokasi_event AS 'Location' FROM event");
            tblEvent.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException | HeadlessException e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void cleanData(){
        // mengosongkan textbox
        txtId.setText("");
        txtNama.setText("");
        txtLokasi.setText("");
        txtDate.setDate(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtLokasi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        txtId.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNama.setPreferredSize(new java.awt.Dimension(6, 27));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 256, 390, 31));

        txtDate.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 298, 391, 31));
        getContentPane().add(txtLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 337, 390, 32));

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnTambah.setText("Add");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 379, 92, 32));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSimpan.setText("Save/Update");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 379, 100, 32));

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 379, 95, 32));

        btnMasuk.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 379, 92, 32));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 423, 173, 30));

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnCari.setText("Search");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 423, 90, 32));

        tblEvent.setAutoCreateRowSorter(true);
        tblEvent.setBackground(new java.awt.Color(119, 172, 232));
        tblEvent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Event Name", "Date", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEvent.setRowHeight(24);
        tblEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEventMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEvent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 467, 834, 202));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/letsevent/icon _arrow left circled_.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/letsevent/Tabel Eventttt.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        databaru=true;
        cleanData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String idEvent = txtId.getText();
        String namaEvent = txtNama.getText();
        // Mengambil tanggal dari JDateChooser
        Date tanggalEvent = txtDate.getDate();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String strTanggal = format.format(tanggalEvent); // memformat tanggal menjadi string

        String lokasiEvent = txtLokasi.getText();

        if (databaru == true) { // prosess simpan atau edit
            try
            {
                String sql = "INSERT INTO event(nama_event, tanggal_event, lokasi_event) VALUES (?, ?, ?)";
                con = (Connection) Koneksi.getKoneksi();
                ps = con.prepareStatement(sql);
                ps.setString(1, namaEvent);
                ps.setString(2, strTanggal);
                ps.setString(3, lokasiEvent);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil didaftarkan");
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else {
            try
            {
                String sql = "UPDATE event SET nama_event=?, tanggal_event=?, lokasi_event=? WHERE id_event=?";
                con = (Connection) Koneksi.getKoneksi();
                ps = con.prepareStatement(sql);
                ps.setString(1, namaEvent);
                ps.setString(2, strTanggal);
                ps.setString(3, lokasiEvent);
                ps.setString(4, idEvent);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        cleanData();
        getData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String id = txtId.getText();
            con = (Connection) Koneksi.getKoneksi();

            int option = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data? Data tiket yang terkait juga akan terhapus.", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                // Hapus data terkait dari tabel anak (tiket)
                String deleteTiketSql = "DELETE FROM tiket WHERE id_pendaftaran IN (SELECT id_pendaftaran FROM pendaftaran WHERE id_event = ?)";
                PreparedStatement deleteTiketStmt = con.prepareStatement(deleteTiketSql);
                deleteTiketStmt.setString(1, id);
                deleteTiketStmt.executeUpdate();

                // Hapus data terkait dari tabel induk (pendaftaran)
                String deletePendaftaranSql = "DELETE FROM pendaftaran WHERE id_event = ?";
                PreparedStatement deletePendaftaranStmt = con.prepareStatement(deletePendaftaranSql);
                deletePendaftaranStmt.setString(1, id);
                deletePendaftaranStmt.executeUpdate();

                // Hapus data dari tabel induk (event)
                String deleteEventSql = "DELETE FROM event WHERE id_event = ?";
                PreparedStatement deleteEventStmt = con.prepareStatement(deleteEventSql);
                deleteEventStmt.setString(1, id);
                deleteEventStmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Berhasil Dihapus");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        cleanData();
        getData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        // TODO add your handling code here:
        // Ambil nilai ID yang ingin Anda lewatkan
        int idPassEvent = Integer.parseInt(txtId.getText());

        // sembunyikan frame Event
        this.setVisible(false);

        // Buat instance dari frame Pendaftaran
        FramePendaftarann framePendaftarann = new FramePendaftarann();

        // Panggil method di frame B untuk mengatur nilai ID
        framePendaftarann.setIdEvent(Integer.toString(idPassEvent));

        framePendaftarann.getDataMasuk();
        
        // Tampilkan frame B
        framePendaftarann.setVisible(true);
        
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String search = txtCari.getText();
        DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblEvent.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEventMouseClicked
        // TODO add your handling code here:
        databaru=false;
        int selectedRowIndex = tblEvent.getSelectedRow();
        if (selectedRowIndex >= 0) {
            databaru = false; // menampilkan data ke textboxt
            DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
            int selectedRowModelIndex = tblEvent.convertRowIndexToModel(selectedRowIndex);
            String id = model.getValueAt(selectedRowModelIndex, 0).toString();
            String nama = model.getValueAt(selectedRowModelIndex, 1).toString();
            String strTanggal = model.getValueAt(selectedRowModelIndex, 2).toString();
            String lokasi = model.getValueAt(selectedRowModelIndex, 3).toString();

            txtId.setText(id);
            txtNama.setText(nama);

            // Mengubah String tanggal menjadi objek Date
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date tanggalDate = null;
            try {
                tanggalDate = format.parse(strTanggal);
            } catch (ParseException ex) {}

            txtDate.setDate(tanggalDate);
            txtLokasi.setText(lokasi);
        }
    }//GEN-LAST:event_tblEventMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);

        // Buat instance dari frame Event
        FrameAwal frameAwal = new FrameAwal();

        // Tampilkan frame event
        frameAwal.setVisible(true);
     
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(FrameEventt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEventt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEventt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEventt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEventt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTextField txtCari;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
