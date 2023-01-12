public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> start Engine");
    }
    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){}
}

 class GasPoweredCar extends  Car{
    private double avgKmPerLitre;
    private int cylinders;

     public GasPoweredCar(String description) {
         super(description);
     }

     public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
         super(description);
         this.avgKmPerLitre = avgKmPerLitre;
         this.cylinders = cylinders;
     }

     @Override
     public void startEngine() {
         System.out.printf("Gas -> All %d cylinders are fired up, Ready !%n", cylinders);

     }

     @Override
     protected void runEngine() {
         System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerLitre);
     }
 }

class ElectricCar extends  Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> Bew switch %d cylinders are fired up, Ready !%n", batterySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerCharge);
    }
}

class HybridPoweredCar extends  Car{
    private double avgKmPerLitre;
    private int cylinders;

    public HybridPoweredCar(String description) {
        super(description);
    }

    public HybridPoweredCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready !%n", cylinders);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerLitre);
    }
}

