public class coordinate{
    private int x, y;
    
    // constructors
    
    public coordinate(int x, int y){
	SetXY(x, y);
    }

    public coordinate(){  //default constructor
    }

    
    //methods
    public int  ViewX(){
	return x;
    }

    public int  ViewY(){
	return y;
    }

    public void SetX(int x){
	this.x = x;
    }

    public void SetY(int y){
	this.y = y;
    }

    public void SetXY(int x, int y){
	SetX(x);
	SetY(y);
    }

    public String toString(){
	return "(" + x + "," + y + ")";
    }

}
