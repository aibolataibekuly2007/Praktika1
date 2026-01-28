import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages = new ArrayList<>();

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж добавлен в автопарк");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж удалён из автопарка");
    }

    public void findVehicle(String model) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.model.equalsIgnoreCase(model)) {
                    System.out.println("Найдено ТС: " + vehicle.getInfo());
                    return;
                }
            }
        }
        System.out.println("Транспортное средство не найдено");
    }
}
