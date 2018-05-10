package Controller;
import data.model.signupmodel;

import javax.faces.bean.ManagedBean;
import java.sql.*;

@ManagedBean(name="signup")


public class signupcontroller {

   signupmodel signupmodel=new signupmodel();

    public signupmodel getSignupmodel() {
        return signupmodel;
    }

    public void setSignupmodel(signupmodel signupmodel) {
        this.signupmodel = signupmodel;
    }

    public String viewApp() {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "HMS", "123");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select*from signup");

            while (rs.next()) {

                String username = rs.getString("mailid");
                String password = rs.getString("password");
                int mobnum = rs.getInt("mobilenum");
                String FirstNme = rs.getString("firstname");
                String lastNme = rs.getString("lastname");

                if (signupmodel.getMailid().equals(username) && signupmodel.getPassword().equals(password)) {
                    String sql = "insert into signup(firstname,lastname,password,mailid,mobilenum) values('" + signupmodel.getFirstname() + "','" + signupmodel.getLastname() +
                            "','" + signupmodel.getPassword() + "','" + signupmodel.getMailid() + "'," + signupmodel.getMobilenum() + ")";

                    stmt.executeUpdate(sql);
                }


                }
            rs.close();
            connection.close();
            return "successreg";


        }
        catch (Exception e) {
            String exp=String.valueOf(e);
            signupmodel.setExp(exp);

        }
        return "fail";
    }
}