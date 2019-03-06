package app.entities;

public class ScientificResearch extends ScientificPublication {
    private String autorName;
    private String autorLastname ;
    private String title;
    private String ageOfPublic;

    public ScientificResearch() {
        this.autorName = "Valera";
        this.autorLastname = "Salo";
        this.title  = "Планеты и бытие";
        this.ageOfPublic  = "1945";
    }

    public String getName() {
        return autorName;
    }

    public void setName(String name) {
        this.autorName = autorName;
    }

    public String getLastName() {
        return autorLastname;
    }

    public void setLastname(String name) {
        this.autorLastname = autorLastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public String getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(String ageOfPublic) {
        this.ageOfPublic = ageOfPublic;
    }
}
