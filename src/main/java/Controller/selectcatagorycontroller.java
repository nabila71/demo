package Controller;
import data.model.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "selectcatagorycontroller")
@SessionScoped
public class selectcatagorycontroller {
    private selectcatagory sc=new selectcatagory();

    public selectcatagory getSc() {
        return sc;
    }

    public void setSc(selectcatagory sc) {
        this.sc = sc;
    }
    public String isNextPage(){
        return "selectcatagory";
    }
}
