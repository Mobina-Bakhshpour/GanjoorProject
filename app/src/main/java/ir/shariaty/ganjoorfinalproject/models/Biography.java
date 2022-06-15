package ir.shariaty.ganjoorfinalproject.models;

public class Biography {
    private String name;
    private String birthPlace;
    private String birthYearInLHijri;
    private String deathYearInLHijri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthYearInLHijri() {
        return birthYearInLHijri;
    }

    public void setBirthYearInLHijri(String birthYearInLHijri) {
        this.birthYearInLHijri = birthYearInLHijri;
    }

    public String getDeathYearInLHijri() {
        return deathYearInLHijri;
    }

    public void setDeathYearInLHijri(String deathYearInLHijri) {
        this.deathYearInLHijri = deathYearInLHijri;
    }

}
