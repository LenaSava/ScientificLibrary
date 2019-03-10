package app.model.entities;

public class Monograph extends ScientificPublication {
    private String typeOfPublication;
    static String autorName;
    static String subject;
    private int ageOfPublic;
    static String link = "Monograph, Autor name is Artur Pirojkov";

    public Monograph(String typeOfPublication, String autorName, String subject, int ageOfPublic) {
        this.typeOfPublication = typeOfPublication;
        this.autorName = autorName;
        this.subject = subject;
        this.ageOfPublic = ageOfPublic;

    }

    public String getTypeOfPublication() {
        return typeOfPublication;
    }

    public void setTypeOfPublication(String name) {
        this.typeOfPublication = typeOfPublication;
    }

    public String getName() {
        return autorName;
    }

    public void setName(String name) {
        this.autorName = autorName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String name) {
        this.subject = subject;
    }

    public int getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(int ageOfPublic) {
        this.ageOfPublic = ageOfPublic;
    }

    public static String getLink() {
        return autorName + subject;
    }

    @Override
    public String toString() {
            return "Type of Publication: " + getTypeOfPublication() +
                    ", Autor name is " + getName() + '\'' +
                    ", Subject of topic is " + '\"' + getSubject() + '\"' +
                    ", age of publication = " + getAgeOfPublic() + " year!";
        }

}
