import java.util.Collection;

public class Programmer {

    private Language mainLanguage;
    private String companyName;
    private Collection<Language> usedLanguages;

    public Programmer(Language language)
    {
        this.mainLanguage = language;
    }

    public void writeCode(Language lang)
    {
        lang.code();
    }

    public Language getMainLanguage()
    {
        return mainLanguage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Collection<Language> getUsedLanguages() {
        return usedLanguages;
    }

    public void setUsedLanguages(Collection<Language> usedLanguages) {
        this.usedLanguages = usedLanguages;
    }
}
