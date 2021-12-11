import java.util.Map;

class RnaTranscription {

    private static final Map<String, String> rnaTranscription =
            Map.ofEntries(
                    Map.entry("G", "C"),
                    Map.entry("C", "G"),
                    Map.entry("T", "A"),
                    Map.entry("A", "U")
                    );
                    

    String transcribe(String dnaStrand) {
        
        String dnaTranscripted = "";
        
         for (int i =0; i< dnaStrand.length(); i++) {

            var transcription = rnaTranscription.get(dnaStrand.substring(i,i+1));
            dnaTranscripted += transcription.toString();
             
    }

        return dnaTranscripted;
}
}
