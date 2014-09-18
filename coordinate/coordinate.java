public class coordinate{
    private int x, y;
    
    public int  ViewX(){
	return x;
    }

    public int  ViewY(){
	return y;
    }

    public void SetX(int z){
	x = z;
    }

    public void SetY(int z){
	y = z;
    }

    public void SetXY(int nx, int ny){
	x = nx;
	y = ny;
    }

    public String toString(){
	return "(" + x + "," + y + ")";
    }

}
