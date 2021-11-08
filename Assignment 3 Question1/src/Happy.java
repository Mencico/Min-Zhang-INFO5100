public class Happy extends Moody{

    public Happy() {
    }

    public Happy(String mood) {
        super(mood);
    }


    public String toString(){
        return "Subject laughs a lot";
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");

    }
}
