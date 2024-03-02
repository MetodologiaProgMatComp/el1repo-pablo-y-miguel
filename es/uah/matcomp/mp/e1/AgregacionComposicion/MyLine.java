package es.uah.matcomp.mp.e1.AgregacionComposicion;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2){

    }
    public MyLine(MyPoint begin, MyPoint end){}
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
    }
    public void setBeginX(MyPoint BeginX){}
    public int getBeginY(){}
    public void setBeginY(){}
    public int getEndX(){}
    public void setEndX(){}
    public int getEndY(){}
    public void setEndY(){}
    public int[] getBeginXY(){}
    public void setBeginXT(){
    }
    public int[] getEndXY(){}
    public void setEndXY(){}
    public double getLength(){}
    public double getGradient(){}
    public String toString(){}

}
