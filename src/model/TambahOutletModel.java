/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author World
 */
public class TambahOutletModel extends baseModel {

    connection con;

    public TambahOutletModel() throws SQLException {
        super();
        this.con = new connection("postgres", "franklampard08", "macarina");
    }

//    public boolean save(String query) throws SQLException {
//        String queri = "INSERT INTO outlet( id_outlet, nama_outlet, alamat_outlet, admin_outlet) VALUES ( " + query + " )";
//        System.out.println(queri);
//        return super.save(queri);
//
//    }
//        
    public boolean update(String query) throws SQLException {
        String queri = "update outlet set " + query;
        return super.update(queri);
    }

    public DefaultTableModel getTableModel() throws SQLException {
        Object[] header = {"id_order", "nama outlet", "alamat outlet", "admin"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "select * from outlet";
//        System.out.println(sql);

        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = con.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[4];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

}
