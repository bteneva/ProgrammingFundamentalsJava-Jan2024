package ObjectAndClasses.AdvertisementMessage;

public class AdvertisementMessage{
    //fields
    private String phrase;
    private String event;
    private String author;
    private String city;

    //constructor
    public AdvertisementMessage(String phrase, String event, String author, String city){
        this.phrase = phrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }
    //methods
    public String getAuthor(String author){
        return this.author;
    }
    public String getPhrase(String phrase){
        return this.phrase;
    }
    public String getEvent(String event){
        return this.event;
    }
    public String getCity(String city){
        return this.city;
    }

}
