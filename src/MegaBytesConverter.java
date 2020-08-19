public class MegaBytesConverter {
    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return -1;
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB AND " + remainder + " KB");
            return megaBytes;
        }
    }
}
