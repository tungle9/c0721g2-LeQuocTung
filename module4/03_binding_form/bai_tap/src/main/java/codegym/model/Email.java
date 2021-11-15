package codegym.model;

public class Email {
    String languages;
    int page;
    String filler;
    String signature;

    public Email() {

    }

    public Email(String languages, int page, String filler, String signature) {
        this.languages = languages;
        this.page = page;
        this.filler = filler;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Email{" +
                "languages='" + languages + '\'' +
                ", page=" + page +
                ", filler='" + filler + '\'' +
                ", signature='" + signature + '\'' +
                '}';
    }
}
