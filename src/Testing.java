public class Testing {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(22);
        System.out.println("Miles: " + miles);
        System.out.println(MegaBytesConverter.printMegaBytesAndKiloBytes(2500));
    }
}

