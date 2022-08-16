package Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        Country Poland = new Country("Poland", 'P');
        Country Sweden = new Country("Sweden", 'S');
        Country Norway = new Country("Norway", 'N');
        Country Denmark = new Country("Denmark", 'D');
        Country Estonia = new Country("Estonia", 'E');

        List<Market> Markets = new ArrayList<>();
        Markets.add(new Market("Taxi", new ArrayList<>(asList(Poland, Denmark, Norway))));
        Markets.add(new Market("Business", new ArrayList<>(asList(Estonia, Norway, Poland))));
        Markets.add(new Market("Cargo", new ArrayList<>(asList(Poland, Denmark, Norway))));
        Markets.add(new Market("Transport", new ArrayList<>(asList(Sweden, Poland, Estonia))));
        Markets.add(new Market("Bus", new ArrayList<>(asList(Sweden, Poland, Norway))));

        List<Dimensions> Dimensions = new ArrayList<>();
        Dimensions.add(new Dimensions(12, 15, 560));
        Dimensions.add(new Dimensions(15, 160, 302));
        Dimensions.add(new Dimensions(10, 850, 90));
        Dimensions.add(new Dimensions(689, 9120, 1220));
        Dimensions.add(new Dimensions(730, 1401, 522));
        Dimensions.add(new Dimensions(730, 191, 52));
        Dimensions.add(new Dimensions(730, 561, 552));
        Dimensions.add(new Dimensions(430, 1401, 5872));
        Dimensions.add(new Dimensions(730, 801, 524));
        Dimensions.add(new Dimensions(630, 1401, 5452));

        List<Producent> Producents = new ArrayList<>();
        Producents.add(new Producent("Fiat", "500"));
        Producents.add(new Producent("BMW", "e34"));
        Producents.add(new Producent("BMW", "e60"));
        Producents.add(new Producent("Ford", "Fiesta"));
        Producents.add(new Producent("Skoda", "Fabia"));
        Producents.add(new Producent("Kia", "Ceed"));
        Producents.add(new Producent("Citroen", "Berlingo"));
        Producents.add(new Producent("BMW", "X6"));
        Producents.add(new Producent("BMW", "X7"));
        Producents.add(new Producent("BMW", "Z4"));

        List<Car> Cars = new ArrayList<>();
        Cars.add(new Car(Producents.get(0), true, Markets.get(0), Segment(), Dimensions.get(0)));
        Cars.add(new Car(Producents.get(1), false, Markets.get(1), Segment(), Dimensions.get(1)));
        Cars.add(new Car(Producents.get(2), true, Markets.get(2), Segment(), Dimensions.get(2)));
        Cars.add(new Car(Producents.get(3), false, Markets.get(3), Segment(), Dimensions.get(3)));
        Cars.add(new Car(Producents.get(4), true, Markets.get(4), Segment(), Dimensions.get(4)));
        Cars.add(new Car(Producents.get(5), true, Markets.get(1), Segment(), Dimensions.get(5)));
        Cars.add(new Car(Producents.get(6), true, Markets.get(0), Segment(), Dimensions.get(9)));
        Cars.add(new Car(Producents.get(7), true, Markets.get(2), Segment(), Dimensions.get(9)));
        Cars.add(new Car(Producents.get(8), true, Markets.get(0), Segment(), Dimensions.get(9)));
        Cars.add(new Car(Producents.get(9), true, Markets.get(3), Segment(), Dimensions.get(9)));

        System.out.println("Here's a list of BMW markets cars with automatic gear and a capacity tank larger than 300 liters: ");
        for (Car newCar : Cars) {
            if (newCar.producent.getModel().equals("BMW") && newCar.isAutomaticGear && newCar.dimensions.getTankCapacity() > 300) {
                System.out.println("Market: " + newCar.market.getName());
                for (int i = 0; i < Markets.get(i).getCountries().size(); i++) {
                    System.out.println(newCar.market.getCountries().get(i).getCountryName() + " " + newCar.market.getCountries().get(i).getCountryCode());
                }
            }
        }
    }

    public static String Segment() {
        List<String> segments = new ArrayList<>(asList("Standard", "Medium", "Premium"));
        Random random = new Random();
        String randomSegment = segments.get(random.nextInt(segments.size()));
        return randomSegment;
    }
}