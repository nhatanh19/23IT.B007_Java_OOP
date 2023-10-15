import java.util.Random;

public class Ball_Player {
    private float x,y,z;

    public Ball_Player(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public String toString() {
        return "(" + this.x + ',' + this.y + ',' + this.z + ")";
    }
}

class Player{
    int number;
    float x,y,z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    void move(float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    void jump(float zDisp){
        this.z += zDisp;
    }
    public boolean near(Ball_Player ball){
        if(Math.sqrt(Math.pow(ball.getX() - this.x, 2) + Math.pow(ball.getY()-this.y, 2) + Math.pow(ball.getZ()-this.z, 2)) < 8){
            return true;
        }else{
            return false;
        }
    }

    public void kick(Ball_Player ball){
        Random rand = new Random();
        ball.setX(ball.getX()+rand.nextInt(15));
        ball.setY(ball.getY()+rand.nextInt(22));
        ball.setZ(ball.getZ()+rand.nextInt(4));
    }
}
