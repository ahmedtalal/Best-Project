/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elfikysys;

import Models.DatabaseConnection;
import elfikysys.GUI.AddUsPass;
import elfikysys.GUI.Login;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javcoder
 */
public class ElfikySys {

    public static void main(String[] args) throws IOException {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT * FROM login";
        try {
            conn = DatabaseConnection.getconnection();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            if (rs.next() == false) {
                AddUsPass add = new AddUsPass();
                add.setVisible(true);
            } else {
                Login lo = new Login();
                lo.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ElfikySys.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
        }

    }

}
