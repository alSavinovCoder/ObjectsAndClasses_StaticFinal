public class Computer {

    public final String vendor;
    public final String name;
    public final Cpu cpu;
    public final Ram ram;
    public final InformationStorage informationStorage;
    public final Screen screen;
    public final Keyboard keyboard;

    public Computer(String vendor, String name, Cpu cpu, Ram ram,
                    InformationStorage informationStorage, Screen screen,
                    Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }
    public Cpu getCpu() {
        return cpu;
    }
    public Ram getRam() {
        return ram;
    }
    public InformationStorage getInformationStorage() {
        return informationStorage;
    }
    public Screen getScreen() {
        return screen;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getTotalWeight () {
        return Cpu.getWeight() + Ram.getWeight() + InformationStorage.getWeight() +
                Screen.getWeight() + Keyboard.getWeight();
    }

    public Computer setNewVendor (String vendor) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewName (String name) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewCpu (Cpu cpu) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewRam (Ram ram) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewInformationStorage (InformationStorage informationStorage) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewScreen (Screen screen) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public Computer setNewKeyboard (Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram,
                informationStorage, screen,
                keyboard);
    }
    public String toString () {
        return "Производитель компьютера : " + vendor + "\n" +
               "Название компьютера : " + name + "\n" +
               "Процессор произведён фирмой " + cpu.getVendor() + ", имеет " +
               cpu.getCoresNumber() + " и тактовую частоту " + cpu.getFrequency() +
               "ГГц" + "\n" +
               "Оперативная память: " + ram.getMemoryType() +
               " объёмом памяти " + ram.getMemorySize() + "гб" + "\n" +
               "Накопитель информации: " + informationStorage.getMemoryType() +
               " объёмом памяти " + informationStorage.getMemorySize() + "гб" + "\n" +
               "Экран диагональю " + screen.getDiagonal() + " дюймов " + ", тип экрана - "
               + screen.getScreenType() + "\n" +
               keyboard.getKeyboardType() + " клавиатура " + keyboard.isBacklight() + "\n" +
               "Общая масса компьютера составила: " + getTotalWeight() + " грамм" + "\n";

    }

}
