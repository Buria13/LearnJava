package enumeration;

public class Runner {
    public static void main(String[] args) {
        MusicType type = MusicType.CLASSIC;
        String value = "Rock   ";
        MusicType type1 = MusicType.valueOf(value.toUpperCase().trim());


    }
}
