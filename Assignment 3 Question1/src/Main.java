public class Main {
    public static void main(String[] args) {
        Moody moody1 = new Happy("happy");
        Psychiatrist psy1 = new Psychiatrist(moody1);

        psy1.examine(moody1);
        System.out.println("");
        psy1.observe(moody1);
        System.out.println("");



        Moody moody2 = new Sad("sad");
        Psychiatrist psy2 = new Psychiatrist(moody2);


        psy2.examine(moody2);
        System.out.println("");
        psy2.observe(moody2);




    }
}
