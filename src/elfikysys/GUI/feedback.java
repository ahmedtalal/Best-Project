package elfikysys.GUI;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class feedback implements Serializable {

    private String data;
    private String enwan;
    private String price;
    private String date;
    int kind;
    ArrayList<feedback> ar = new ArrayList<>();

    public void date() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.setDate(dateFormat.format(date));
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEnwan() {
        return enwan;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setEnwan(String enwan) {
        this.enwan = enwan;
    }

    public void setAr(ArrayList<feedback> ar) {
        this.ar = ar;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<feedback> getAr() {
        return ar;
    }

    public String getData() {
        return data;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getKind() {
        return kind;
    }

    public boolean commitinsert(String path) {
        Statement stmt;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ElfikySys?useUnicode=yes&characterEncoding=UTF-8", "root", "password");
            stmt = con.createStatement();
            String query = "INSERT INTO export VALUES('" + this.enwan + "','" + this.date + "','" + this.price + "','" + this.kind + "','" + this.data + "')";
            stmt.executeUpdate(query);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean commitremove(String path) {
        Statement stmt;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ElfikySys?useUnicode=yes&characterEncoding=UTF-8", "root", "password");
            stmt = con.createStatement();
            String query = "DELETE FROM export WHERE date='" + this.date + "'";
            stmt.executeUpdate(query);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean commitupdate(String path) {
        Statement stmt;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ElfikySys?useUnicode=yes&characterEncoding=UTF-8", "root", "password");
            stmt = con.createStatement();
            String query = "UPDATE export SET code='" + this.enwan + "',date='" + this.date + "',price='" + this.price + "',kind='" + this.kind + "',data='" + this.data + "'";
            stmt.executeUpdate(query);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean load(String path) {
        for (int i = ar.size() - 1; i >= 0; i--) {
            ar.remove(i);
        }
        Statement stmt;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ElfikySys?useUnicode=yes&characterEncoding=UTF-8", "root", "password");
            stmt = con.createStatement();
            String query = "SELECT * FROM export";
            ResultSet res = stmt.executeQuery(query);
            while (res.next()) {
                feedback thiss = new feedback();
                thiss.setDate(res.getString("date"));
                thiss.setData(res.getString("data"));
                thiss.setEnwan(res.getString("code"));
                thiss.setPrice(res.getString("price"));
                thiss.setKind(Integer.parseInt(res.getString("kind")));
                ar.add(thiss);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(feedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public int addnote(String data, String enwan, String price, int kind) {
        load("feedback.bin");
        this.data = data;
        this.enwan = enwan;
        this.price = price;
        this.kind = kind;
        this.date();
        commitinsert("feedback.bin");
        return 1;
    }

    public void updatenote(String data, String enwan, String price, int loc) {
        load("feedback.bin");
        this.data = data;
        this.enwan = enwan;
        this.price = price;
        this.date = ar.get(loc).getDate();
        this.kind = ar.get(loc).getKind();
        commitupdate("feedback.bin");
    }

    public int delet(int loc) {
        load("feedback.bin");
        this.date = ar.get(loc).getDate();
        commitremove("feedback.bin");
        return 1;
    }
}
