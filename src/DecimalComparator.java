public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myDouble1, double myDouble2){
        int checking1 = (int)(myDouble1 * 1000);
        int checking2 = (int) (myDouble2 * 1000);
        if (checking1 - checking2 == 0) return true;
        return false;
    }
}
