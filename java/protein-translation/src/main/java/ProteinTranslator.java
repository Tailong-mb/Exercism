import java.util.ArrayList;
import java.util.List;
import java.util.Map;


class ProteinTranslator {
    private static final Map<String, String> translations =
            Map.ofEntries(
                    Map.entry("AUG", "Methionine"),
                    Map.entry("UUU", "Phenylalanine"),
                    Map.entry("UUC", "Phenylalanine"),
                    Map.entry("UUA", "Leucine"),
                    Map.entry("UUG", "Leucine"),
                    Map.entry("UCU", "Serine"),
                    Map.entry("UCC", "Serine"),
                    Map.entry("UCA", "Serine"),
                    Map.entry("UCG", "Serine"),
                    Map.entry("UAU", "Tyrosine"),
                    Map.entry("UAC", "Tyrosine"),
                    Map.entry("UGU", "Cysteine"),
                    Map.entry("UGC", "Cysteine"),
                    Map.entry("UGG", "Tryptophan"),
                    Map.entry("UAA", "STOP"),
                    Map.entry("UAG", "STOP"),
                    Map.entry("UGA", "STOP"));
    
    List<String> translate(String rnaSequence) {

        var rnaSequenceTranslated = new ArrayList<String>();

        for (int i =0; i<rnaSequence.length(); i += 3) {

            var translated = translations.get(rnaSequence.substring(i, i+3));

            if (translated.equals("STOP")) 
                break;

            rnaSequenceTranslated.add(translated);
      
        }

      return rnaSequenceTranslated;

    }
}