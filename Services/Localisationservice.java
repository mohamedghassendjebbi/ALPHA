/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import entity.localisation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import localisation.Datasource;

/**
 *
 * @author ghassen
 */
public class Localisationservice implements Iservice<localisation>{
    private Connection cnx;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet re;
    public Localisationservice() {
    cnx=Datasource.getInstance().getcnx();
    }
    @Override
    public void insert(localisation t) {
        String req="insert into localisation values ('"+t.getIdLocation()+"','"+t.getAdresseDebut()+"','"+t.getAddresseFin()+"','"+t.getDate()+"','"+t.getCIN_tn()+"')";
        try {
            st=cnx.createStatement();
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(Localisationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean update(localisation t) {
    String sql="UPDATE Elocalisation";
    try {
            pst=cnx.prepareStatement(sql);
            pst.executeUpdate();
            return true;
    }
            catch (SQLException ex) {
            Logger.getLogger(Localisationservice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(String y) {
         String req="delete from localisation where id_localisation=?";
          try {
            pst=cnx.prepareStatement(req);
            pst.setString(1,y);
            pst.executeUpdate();
            return  true;
        } catch (SQLException ex) {
            Logger.getLogger(Localisationservice.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<localisation> displayAll() {
         String req="select * from localisation";
        List<localisation> list=new ArrayList<>();
        try {
            
            st=cnx.createStatement();
            re=st.executeQuery(req);
            while(re.next())
            {
                list.add(new localisation(re.getString(1), re.getString(2),re.getString(3),re.getDate(4),re.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Localisationservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
