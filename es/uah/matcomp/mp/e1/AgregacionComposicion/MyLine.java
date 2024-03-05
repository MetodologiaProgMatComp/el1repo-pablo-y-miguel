package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin(){
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd(){
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int[] getBeginXY(){
        int[] beginXY = new int[2];
        beginXY[0] = getBeginX();
        beginXY[1] = getBeginY();
        return beginXY;
    }
    public void setBeginXY(int x, int y){;
        setBeginX(x);
        setBeginY(y);
        int [] beginXY = new int[2];
        beginXY [0] = getBeginX();
        beginXY [1] = getBeginY();
    }
    public int[] getEndXY(){
        int[] beginXY = new int[2];
        beginXY[0] = getEndX();
        beginXY[1] = getEndY();
        return beginXY;
    }
    public void setEndXY(int x, int y){
        setEndX(x);
        setEndY(y);
        int[] endXY = new int[2];
        endXY[0] = getEndX();
        endXY[1] = getEndY();
    }
    public double getLength(){
        double length = begin.distance(end);
        return length;
    }
    public double getGradient(){
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        double gradient = Math.atan2(xDiff, yDiff);
        return gradient;
    }
    public String toString(){
        return "MyLine[begin="+begin.toString()+", end="+end.toString()+"]";
    }

}
