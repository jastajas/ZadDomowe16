public enum WeatherDescription {
    SUN("słonecznie"),
    CLOUDS("pochmurnie"),
    RAIN("deszczowo/śnieżnie"),
    STORM("burza");

    public String description;

    WeatherDescription (String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
