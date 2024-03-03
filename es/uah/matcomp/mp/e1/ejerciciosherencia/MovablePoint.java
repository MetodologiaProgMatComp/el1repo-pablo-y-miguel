package es.uah.matcomp.mp.e1.ejerciciosherencia;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x , y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        return speed;
    }
    @Override
    public String toString(){
        return super.toString() +",speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
