public class Main {
    public static void main(String[] args){

//       SalariedEmployee tim = new SalariedEmployee("Time", "11/11/195", "12/10/2020", "01/01/2020",10);
//        System.out.println(tim);
//        System.out.println("Age" + tim.getAge());
//        System.out.println("Pay" + tim.collectPay());
//        Worker worker = new Worker("Muto", "01/01/1992");
//        System.out.println(worker.getAge());
//
//        Employee employee = new Employee("Cabbar", "01/10/1992", 90,"12/03/21");
//        System.out.println(employee.endDate);
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
    ///Not a good capsulation
//    Player player = new Player();
//    player.name = "Time";
//    player.health = 20;
//    player.weapon = "Sword";
//
//    int damage = 10;
//    player.loseHealth(damage);
//        System.out.println("Reaming health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Reaming health = " + player.healthRemaining());

        ///////
//        EnhancedPlayer muto = new EnhancedPlayer("Muto");
//        System.out.println("Intital health is " + muto.healthRemaining());
//
//        Printer printer = new Printer(50, true);
//        System.out.println(("Initial page count = " + printer.getPagesPrinted()));
//
//        int pagesPrinted = printer.printPage(5);
//        System.out.printf("Current Job pages: %d, Printer Total : %d %n", pagesPrinted, printer.getPagesPrinted());

//        Movie movie = Movie.getMovie("Science", "Star Wars");
//        movie.watchMovie();
//        Scanner s = new Scanner(System.in);
//        while (true){
//            System.out.println("Enter Type(A for Aventure, C for Comedy, S for Science or Q to quit)");
//            String type = s.nextLine();
//            if("Qq".contains(type)) break;
//            System.out.print("Enter  Moive Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }

        Car car = new Car("2022 Ferrari");
        runRace(car);
        Car ferrari = new ElectricCar("2021 Ferrar", 15.6, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car){
        car.runEngine();
        car.drive();
    }

}

