import java.time.LocalDate;

public class Wedding {
    private LocalDate date;
    private Couple couple;
    private String location;

    public Wedding(Couple c, LocalDate d, String l){
        this.date=d;
        this.couple=c;
        this.location=l;
    }

    public Couple getCouple(){return this.couple;}
    public LocalDate getDate(){return this.date;}
    public String getLocation(){return this.location;}

    public String invite(){
        return "You are invited to the wedding of "+this.couple+"\non "+this.date+" at "+this.location+"\nWe look forward to seeing you there!";
    }
}
