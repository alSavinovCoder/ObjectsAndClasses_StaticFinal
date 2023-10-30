public class Keyboard {
    private static KeybordType keyboardType;
    private static KeyboardBacklight backlight;
    private static double weight;

    public Keyboard (KeybordType keyboardType, KeyboardBacklight backlight, double weight) {
        Keyboard.keyboardType = keyboardType;
        Keyboard.backlight = backlight;
        Keyboard.weight = weight;
    }

    public static double getWeight () {
        return weight;
    }
    public static KeybordType getKeyboardType() {
        return keyboardType;
    }
    public static KeyboardBacklight isBacklight() {
        return backlight;
    }
}
