import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * Created by marcking2 on 7/20/17.
 */
public class CarApp {

    public static void main(String[] args) {

//        Car carInstance = new Car ();

//        carInstance.setMakeM("Aston Martin");
//        carInstance.setModelM("Lagonda");
//        carInstance.setYearM(1976);
//        carInstance.setPriceM(112808);

//        System.out.println(carInstance);

        Scanner scnr = new Scanner(System.in);

        System.out.print("\n\n\nHAL9000: Hello Marc. \nHow many car entries today?: ");
        int n = scnr.nextInt();
        scnr.nextLine();

        Car[] carArray = new Car[n];
//        ArrayList<Car> carArrayList = new ArrayList<Car>();

        for(int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car();
            System.out.print("\nEnter Make: ");
            carArray[i].setMakeM(scnr.nextLine());
            System.out.print("\nEnter Model: ");
            carArray[i].setModelM(scnr.nextLine());
            System.out.print("\nEnter Year: ");
            carArray[i].setYearM(scnr.nextInt());
            System.out.print("\nEnter Price: ");
            carArray[i].setPriceM(scnr.nextDouble());
            scnr.nextLine();
        }
        System.out.printf("\n\n\n%-12s%-12s%-12s%-12s\n", "Make", "Model", "Year", "Price(USD)");
        for (Car x :carArray
                ) {
            System.out.println(x);
        }
    }
}
