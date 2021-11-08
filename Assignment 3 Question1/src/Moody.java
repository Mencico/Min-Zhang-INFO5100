public abstract class Moody {

    String mood;

    public Moody() {}

    public Moody(String mood){
        this.mood = mood;
    }

    public abstract String getMood();


    public abstract void expressFeelings();


    public void queryMood(){
        System.out.println("I feel "+ this.mood +" today");

    };

}
