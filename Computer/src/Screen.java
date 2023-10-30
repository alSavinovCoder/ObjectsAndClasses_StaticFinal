public class Screen {

    private static double diagonal;
    private static ScreenType screenType;
    private static double weight;

    public Screen (double diagonal, ScreenType screenType, double weight) {
        Screen.diagonal = diagonal;
        Screen.screenType = screenType;
        Screen.weight = weight;
    }

    public static double getWeight () {
        return weight;
    }
    public static double getDiagonal() {
        return diagonal;
    }
    public static ScreenType getScreenType() {
        return screenType;
    }
}
