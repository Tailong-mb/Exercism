import java.util.Arrays;

class ResistorColorDuo {

     final String[] Colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int value(String[] colors) {
        if(colors.length > 1)
        return  Arrays.asList(Colors).indexOf(colors[0])*10 + Arrays.asList(Colors).indexOf(colors[1]);
        else 
        throw new IllegalArgumentException("Put two colors or more.");
    }
}
