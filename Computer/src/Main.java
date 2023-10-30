public class Main {
    public static void main(String[] args) {
        Cpu firstCpu = new Cpu(2.7, 6, "intel", 100);
        Cpu secondCpu = new Cpu(2.7, 8, "intel", 100);
        Cpu thirdCpu = new Cpu(2.4, 6, "amd", 100);

        Ram firstRam = new Ram(RamType.DDR2,4,50);
        Ram secondRam = new Ram(RamType.DDR3,8,50);
        Ram thirdRam = new Ram(RamType.DDR4,16,50);

        InformationStorage firstStorage = new InformationStorage(StorageType.HDD,512,250);
        InformationStorage secondStorage = new InformationStorage(StorageType.HDD,1024,250);
        InformationStorage thirdStorage = new InformationStorage(StorageType.SDD,1024,250);

        Screen firstScreen = new Screen(17.2, ScreenType.TN, 3000);
        Screen secondScreen = new Screen(15.5, ScreenType.IPS, 3500);
        Screen thirdScreen = new Screen(20.1, ScreenType.VA, 4000);

        Keyboard firstKeyboard = new Keyboard(KeybordType.Механическая, KeyboardBacklight.без_подсветки, 500);
        Keyboard secondKeyboard = new Keyboard(KeybordType.Мембранная, KeyboardBacklight.без_подсветки, 500);
        Keyboard thirdKeyboard = new Keyboard(KeybordType.Механическая, KeyboardBacklight.с_подстветкой, 500);

        Computer firstComputer = new Computer("asus", "firstAsus", firstCpu, firstRam,
                firstStorage, firstScreen, firstKeyboard);
        System.out.println(firstComputer.toString());
        Computer secondComputer = new Computer("msi", "katana", secondCpu, secondRam,
                secondStorage, secondScreen, secondKeyboard);
        System.out.println(secondComputer.toString());
        Computer thirdComputer = new Computer("hp", "firstHp", thirdCpu, thirdRam,
                thirdStorage, thirdScreen, thirdKeyboard);
        System.out.println(thirdComputer.toString());

        /*System.out.println("Процессор первого ПК до копии первого пк " + firstComputer.getCpu());
        Computer newFirstComputer = firstComputer.setNewCpu(thirdCpu);
        System.out.println("Процессор первого ПК после копии первого пк " + firstComputer.getCpu());
        System.out.println(newFirstComputer.toString());*/

    }
}