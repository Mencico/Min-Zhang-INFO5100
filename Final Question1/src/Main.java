public class Main {

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }
        public static void  main(String[] argv) {
            int[][] room={
                    {0,0,0,0},
                    {0,0,0,0},
                    {-1,0,0,0},
                    {0,0,-1,0}
            };
            Roomba roomba=new Roomba(room);
        }
    }

