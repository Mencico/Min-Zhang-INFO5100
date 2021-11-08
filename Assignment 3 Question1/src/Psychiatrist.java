public class Psychiatrist {

    Moody moody;

    public Psychiatrist(){}

    public Psychiatrist(Moody moody) {
        this.moody = moody;
    }



    public void examine(Moody moody){
        System.out.println("How are you feeling today?");

        moody.queryMood();
    }

    public void observe(Moody moody){
        moody.expressFeelings();
        System.out.println("Observation: " + moody);

    }

    public Moody getMoody() {
        return moody;
    }

    public void setMoody(Moody moody) {
        this.moody = moody;
    }

    public String toString(){
        return "Subject laughs a lot";

    }
}
