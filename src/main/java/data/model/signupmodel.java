package data.model;




public class signupmodel {
private String Firstname;
private String Lastname;
private String Password;
private String Mailid;
private int Mobilenum;
private String exp;


    public signupmodel() {
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMailid() {
        return Mailid;
    }

    public void setMailid(String mailid) {
        Mailid = mailid;
    }

    public int getMobilenum() {
        return Mobilenum;
    }

    public void setMobilenum(int mobilenum) {
        Mobilenum = mobilenum;
    }
}
