public class Couple {
    private Person bride;
    private Person groom;

    public Couple (Person b, Person g){
        this.bride = b;
        this.groom = g;
    }

    public Person getBride(){return this.bride;}
    public Person getGroom(){return this.groom;}

    public String toString(){
        return this.bride+" and "+this.groom;
    }
}
