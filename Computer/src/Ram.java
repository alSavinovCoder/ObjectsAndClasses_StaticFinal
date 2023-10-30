public class Ram {

    private static RamType memoryType;
    private static int memorySize;
    private static double weight;

    public Ram (RamType memoryType, int memorySize, double weight) {
        Ram.memoryType = memoryType;
        Ram.memorySize = memorySize;
        Ram.weight = weight;
    }

    public static double getWeight () {
        return weight;
    }
    public static RamType getMemoryType() {
        return memoryType;
    }
    public static int getMemorySize() {
        return memorySize;
    }
}
