public class InformationStorage {

    private static StorageType memoryType;
    private static int memorySize;
    private static double weight;

    public InformationStorage (StorageType memoryType, int memorySize, double weight) {
        InformationStorage.memoryType = memoryType;
        InformationStorage.memorySize = memorySize;
        InformationStorage.weight = weight;
    }

    public static double getWeight () {
        return weight;
    }
    public static StorageType getMemoryType() {
        return memoryType;
    }
    public static int getMemorySize() {
        return memorySize;
    }
}
