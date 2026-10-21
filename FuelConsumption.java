public class FuelConsumption {
    public static void main(String[] args) {
        double normalFuelPer100km = 8.0;
        double roughFuelExtra = 0.15;
        double tankCapacity = 40.0;

        double roughFuelPer100km = normalFuelPer100km * (1 + roughFuelExtra);

        double normalDistance = (tankCapacity / normalFuelPer100km) * 100;
        double roughDistance = (tankCapacity / roughFuelPer100km) * 100;

        System.out.println("Fuel consumption on normal roads: " + normalFuelPer100km + " liters per 100 km.");
        System.out.println("Fuel consumption on rough roads: " + roughFuelPer100km + " liters per 100 km.");
        System.out.println("The car can travel " + normalDistance + " km on a full tank on normal roads.");
        System.out.println("The car can travel " + roughDistance + " km on a full tank on rough roads.");
    }
}
