import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        this.attractions.add(attraction);
    }

    public void displayParkInfo() {
        System.out.println("ПАРК: " + parkName);
        System.out.println("СПИСОК АТТРАКЦИОНОВ:");
        for (Attraction a : attractions) {
            a.printAttractionDetails();
        }
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionDetails() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workingHours + " , Стоимость: " + cost + " бел. руб.");
        }
    }

    public static void main(String[] args) {
        Park centralPark = new Park("Центральный парк г. Гомеля");

        centralPark.addAttraction("Колесо обозрения", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Американские горки", "10:00 - 22:00", 40.0);
        centralPark.addAttraction("Карусель «Вальс»", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Комната страха", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Кривое зеркало", "10:00 - 22:00", 40.0);
        centralPark.addAttraction("Карусель «Ракета»", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Машинки", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Тир", "10:00 - 22:00", 40.0);
        centralPark.addAttraction("Водные горки", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("4D кинотеатр", "10:00 - 22:00", 50.0);
        centralPark.addAttraction("Силомер", "10:00 - 22:00", 40.0);
        centralPark.addAttraction("Карусель «На взлет!»", "10:00 - 22:00", 50.0);

        centralPark.displayParkInfo();
    }
}