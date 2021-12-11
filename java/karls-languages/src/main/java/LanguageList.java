import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return this.languages.isEmpty();
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    public boolean isExciting() {
        if((this.languages.contains("Kotlin")) || (this.languages.contains("Java")))
            return true;
        else
            return false;

    }
}
