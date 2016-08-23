public class App {
 public static void main(String[] args) {

   Vehicle hatchback = new Vehicle();
    hatchback.mYear = 1994;
    hatchback.mBrand = "Subaru";
    hatchback.mModel = "Legacy";
    hatchback.mMiles = 170000;
    hatchback.mPrice = 4000;

    Vehicle suv = new Vehicle();
    hatchback.mYear = 2002;
    hatchback.mBrand = "Ford";
    hatchback.mModel = "Explorer";
    hatchback.mMiles = 100000;
    hatchback.mPrice = 7000;

    Vehicle sedan = new Vehicle();
    hatchback.mYear = 2015;
    hatchback.mBrand = "Toyota";
    hatchback.mModel = "Camry";
    hatchback.mMiles = 50000;
    hatchback.mPrice = 30000;

    Vehicle truck = new Vehicle();
    hatchback.mYear = 1999;
    hatchback.mBrand = "Ford";
    hatchback.mModel = "Ranger";
    hatchback.mMiles = 100000;
    hatchback.mPrice = 4000;

    Vehicle[] allVehicles = {hatchback, suv, sedan, truck};

    System.out.println("All Vehicles:");

    for ( Vehicle individualVehicle : allVehicles ) {
      System.out.println( individualVehicle.mYear );
      System.out.println( individualVehicle.mBrand );
      System.out.println( individualVehicle.mModel );
      System.out.println( individualVehicle.mMiles );
      System.out.println( individualVehicle.mPrice );
    }
    
 }
}
