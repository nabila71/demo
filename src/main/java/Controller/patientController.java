package Controller;
import data.model.patient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "patientController")
@SessionScoped

public class patientController {
    private patient p=new patient();

    public patient getP() {
        return p;
    }

    public void setP(patient p) {
        this.p = p;
    }


    public String isNextPage(){
        return "success";
    }
}
