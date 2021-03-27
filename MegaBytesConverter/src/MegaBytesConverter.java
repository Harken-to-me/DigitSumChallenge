public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int modd = kiloBytes % 1024;
            int moddresult = kiloBytes - modd;
            System.out.println(kiloBytes + " KB = " + moddresult/1024 + " MB and " + modd + " KB");
        }
    }
}
