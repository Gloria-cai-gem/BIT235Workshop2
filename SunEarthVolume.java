public class SunEarthVolume {
    public static void main(String[] args) {
        double pi = 3.14;

        double earthDiameter = 7600;
        double sunDiameter = 865000;

        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;

        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        double ratio = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is: " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is: " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the Sun's volume to the Earth's volume is: " + ratio);
    }
}
