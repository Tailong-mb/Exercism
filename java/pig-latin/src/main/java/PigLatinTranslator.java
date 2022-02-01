public class PigLatinTranslator{

    public String translate(String wordToTranslate){
        return wordToTranslate.replaceAll("\\b([aeiou]+|xr|yt)([a-z]*)\\b", "$0ay")
                              .replaceAll("\\b([a-z]*qu|[^ aeiouy]+|[^ aeiou]+)(y?[a-z]+)(?<!ay)\\b", "$2$1ay");
    }
}