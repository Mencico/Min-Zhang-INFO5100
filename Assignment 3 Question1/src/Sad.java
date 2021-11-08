public class Sad extends Moody {

    public Sad() {}

    public Sad(String mood) {
        super(mood);
    }


    public String toString(){
        return "Subject cries a lot";
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public void expressFeelings() {
        System.out.println("waah’  ‘boo hoo’  ‘weep’ ‘sob’");

    }
}
