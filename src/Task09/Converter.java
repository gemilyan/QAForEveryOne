package Task09;

public class Converter {
    public static float mpgToKPM(final float mpg){
        float gallon = 4.54609188f;
        float mile = 1.6039344f;

        return mpg*mile/gallon;
    }

    public static void main(String[] args) {
        System.out.println(mpgToKPM(27.777f));
    }
}
