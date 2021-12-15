public class Roomba implements iRobot{
    int[][] room;
    Main.Direction dir;
    int x;
    int y;
    Roomba(int[][] room){
        this.room=room;
        dir=Main.Direction.DOWN;
        x=0;
        y=0;
    }
    final public boolean move(){
        int addx,addy;
        if(dir==Main.Direction.DOWN){
            addx=0;
            addy=1;
        }
        else if(dir==Main.Direction.UP){
            addx=0;
            addy=-1;
        }
        else if(dir==Main.Direction.LEFT){
            addx=-1;
            addy=0;
        }
        else{
            addx=1;
            addy=0;
        }
        if(x+addx>=0&&x+addx<room[0].length&&y+addy>=0&&y+addy<room.length&&room[y+addy][x+addx]!=-1){
            x+=addx;
            y+=addy;
            return true;
        }
        return false;
    }
    final public void turnLeft(){
        if(dir==Main.Direction.DOWN){
            dir=Main.Direction.RIGHT;
        }
        else if(dir==Main.Direction.UP){
            dir=Main.Direction.LEFT;
        }
        else if(dir==Main.Direction.LEFT){
            dir=Main.Direction.DOWN;
        }
        else{
            dir=Main.Direction.UP;
        }
    }
    final public void turnRight(){

        if(dir==Main.Direction.DOWN){
            dir=Main.Direction.LEFT;
        }
        else if(dir==Main.Direction.UP){
            dir=Main.Direction.RIGHT;
        }
        else if(dir==Main.Direction.LEFT){
            dir=Main.Direction.UP;
        }
        else{
            dir=Main.Direction.DOWN;
        }
    }
    final public void clean(){
        if(room[y][x]==0){
            room[y][x]=1;
        }
    }


}
