public class Cpu {

    private static double frequency;
    private static int coresNumber;
    private static String vendor;
    private static double weight;

    public Cpu (double frequency, int coresNumber, String vendor, double weight) {
        Cpu.frequency = frequency;
        Cpu.coresNumber = coresNumber;
        Cpu.vendor = vendor;
        Cpu.weight = weight;
    }

    public static double getWeight () {
        return weight;
    }
    public static int getCoresNumber() {
        return coresNumber;
    }
    public static double getFrequency() {
        return frequency;
    }
    public static String getVendor() {
        return vendor;
    }
}
