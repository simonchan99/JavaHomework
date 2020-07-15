package Classes;

public class Point {
    int XCoordinate;
    int YCoordinate;

    public Point(){

    }

    public Point(int x, int y){
        this.XCoordinate = x;
        this.YCoordinate = y;
    }

    public void movePoint(int dx, int dy){
        this.XCoordinate = dx;
        this.YCoordinate = dy;
    }

    public void printPoint(){
        System.out.println("X is:"+XCoordinate+" Y is: "+YCoordinate);
    }
}
