package Controller;

import data.model.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "appointmentController")
@SessionScoped
public class appointmentController {
    private appointment a=new appointment();

    public appointment getA() {
        return a;
    }

    public void setA(appointment a) {
        this.a = a;
    }
    public String isNextPage(){
        return "appointment";
    }
}
