import java.util.PrimitiveIterator;

public enum Centers {
    PARIS("Eiffel palace"),
    LONDON("Big bridge"),
    BISHKEK("Very beautiful"),
    BERLIN("The air is clean"),
    MADRID("Santiago Barnabe Stadium ");

    private String country;

    Centers(String country) {
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
