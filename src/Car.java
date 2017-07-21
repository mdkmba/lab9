/**
 * Created by marcking2 on 7/20/17.
 */
public class Car {

    private String makeM;
    private String modelM;
    private int yearM;
    private double priceM;

    public Car() {
        makeM = "";
        modelM = "";
        yearM = 0;
        priceM = 0;
    }

    public Car(String make, String model, int year, double price) {
        makeM = make;
        modelM = model;
        yearM = year;
        priceM = price;
    }

    public String getMakeM() {
        return makeM;
    }

    public String getModelM() {
        return modelM;
    }

    public int getYearM() {
        return yearM;
    }

    public double getPriceM() {
        return priceM;

    }

    public void setMakeM(String make) {

        makeM = make;
    }

    public void setModelM(String model){

        modelM = model;
    }

    public void setYearM(int year){

        yearM = year;
    }

    public void setPriceM(double price){
    priceM = price;
    }

    public String toString (){

        String result = "";
//        System.out.println("\n\nMake: " + makeM + "\n" + "Model: " + modelM + "\n" + "Year: " + yearM + "\n" + "Price: $" + priceM);

//        System.out.printf("\n\n\n%-12s%-12s%-12s%-12s\n", "Make", "Model", "Year", "Price(USD)");
        System.out.printf("%-12s%-12s%-12d%-12.2f", makeM, modelM, yearM, priceM);
        return result;
    }

}
