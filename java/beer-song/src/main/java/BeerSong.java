import java.util.Arrays;

public class BeerSong {

    public String sing(int beerNumber, int verseNumber) {
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < verseNumber; i++) {
            sb.append(singOneVerse(beerNumber--));
        }
        return sb.toString();
    }

    private String singOneVerse(int beerNumber) {
        StringBuffer sb = new StringBuffer("");
        Verse v = Arrays.stream(Verse.values())
                .filter(i -> i.verseType == (beerNumber <= 2 && beerNumber >= 0 ? beerNumber : -1))
                .findFirst().get();
        sb.append(String.format(v.partOne, beerNumber, beerNumber) + "\n" +
                v.partTwo + ", " + String.format(v.partThree, beerNumber - 1) + "\n\n");
        return sb.toString();
    }
    public String singSong() {
        return sing(99, 100);
    }

    private enum Verse {
        GENERIC(-1, "%s bottles of beer on the wall, %s bottles of beer.",
                "Take one down and pass it around",
                "%s bottles of beer on the wall."),
        TWO(2, "%s bottles of beer on the wall, %s bottles of beer.",
                "Take one down and pass it around",
                "%s bottle of beer on the wall."),
        ONE(1, "%s bottle of beer on the wall, %s bottle of beer.",
                "Take it down and pass it around",
                "no more bottles of beer on the wall."),
        ZERO(0, "No more bottles of beer on the wall, no more bottles of beer.",
                "Go to the store and buy some more",
                "99 bottles of beer on the wall.");

        int verseType;
        String partOne;
        String partTwo;
        String partThree;
        
        Verse(int type, String one, String two, String three) {
            this.verseType = type;
            this.partOne = one;
            this.partTwo = two;
            this.partThree = three;
        }
    }
}