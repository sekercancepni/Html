package tr.sisa.page;

import tr.sisa.Car;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;

@ManagedBean
@ViewScoped
public class TestBean {
    private String inputName = "";
    private int inputModel;
    private String inputColor = "";
    private int inputWeight;
    private int inputPrice;
    private int inputIndex;

    private String carName = "";
    private int carModel;
    private String carColor = "";
    private int carWeight ;
    private int carIndex;
    private int carPrice;

    private ArrayList<Car> cars = new ArrayList<Car>();
    private ArrayList<Car> cars_orj = new ArrayList<Car>();

    @ManagedProperty(value="#{sessionBean}")
    private SessionBean sessionBean;
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public ArrayList<Car> getCars_orj() {
        return cars_orj;
    }

    public void setCars_orj(ArrayList<Car> cars_orj) {
        this.cars_orj = cars_orj;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    public int getCarIndex() {
        return carIndex;
    }

    public void setCarIndex(int carIndex) {
        this.carIndex = carIndex;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getInputModel() {
        return inputModel;
    }

    public void setInputModel(int inputModel) {
        this.inputModel = inputModel;
    }

    public int getInputPrice() {
        return inputPrice;
    }

    public void setInputPrice(int inputPrice) {
        this.inputPrice = inputPrice;
    }


    public int getInputIndex() {
        return inputIndex;
    }

    public void setInputIndex(int inputIndex) {
        this.inputIndex = inputIndex;
    }


    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputColor() {
        return inputColor;
    }

    public void setInputColor(String inputColor) {
        this.inputColor = inputColor;
    }

    public int getInputWeight() {
        return inputWeight;
    }

    public void setInputWeight(int inputWeight) {
        this.inputWeight = inputWeight;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @PostConstruct
    public void init(){
        Car car1 = new Car("Opel",2000,"Red",1500,20000);
        Car car2 = new Car("Bmw",2010,"Black",1660,30000);
        Car car3 = new Car("Mercedes",2009,"White",1700,24000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars_orj.addAll(cars);
    }

    public String getcarName() {
        return carName;
    }

    public void setcarName(String carName) {
        this.carName = carName;
    }

    public void add(){
      /*  System.out.println("action...");
      for(Car car:cars){
          System.out.println("car:"+car.getName());
      }
        cars=cars_orj.stream().filter(c-> c.getName().toUpperCase().contains(inputField.toUpperCase())).collect(Collectors.toCollection(ArrayList<Car>::new));
        System.out.println("after filter...");
        cars.stream().forEach(car->{
            System.out.println(car.getName());
        });
    */
        carName = inputName;
        carModel = inputModel;
        carColor = inputColor;
        carWeight = inputWeight;
        carPrice = inputPrice;
        Car car = new Car(carName,carModel,carColor,carWeight,carPrice);
        sessionBean.getCarList().add(car);
        this.cars.add(car);
    }

    public void remove() throws Exception{
        try{
            if(cars.get(0) != null) {
                carIndex = inputIndex;
                cars.remove(carIndex);
            }
        }catch (Exception e){
            System.out.println("Basarısız.");
        }
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }
}

