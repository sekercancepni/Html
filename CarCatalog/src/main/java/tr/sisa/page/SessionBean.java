package tr.sisa.page;

import tr.sisa.Car;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class SessionBean {

    private ArrayList<Car> carList;

    @PostConstruct
    public void init(){
        carList=new ArrayList<>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
}
