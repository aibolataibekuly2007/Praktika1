public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car("Toyota", "Camry", 2022, 4, "Автомат");
        Vehicle car2 = new Car("BMW", "X5", 2021, 5, "Автомат");
        Vehicle moto1 = new Motorcycle("Yamaha", "R1", 2020, "Спорт", false);

        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        garage1.addVehicle(car1);
        garage1.addVehicle(moto1);

        garage2.addVehicle(car2);

        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        car1.startEngine();
        moto1.startEngine();

        fleet.findVehicle("X5");

        garage1.removeVehicle(moto1);
        fleet.removeGarage(garage2);
    }
}
