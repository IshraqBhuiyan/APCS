public class demo{
    public static void main(String[]args){

	coordinate coordinates;
	coordinates = new coordinate();
		
	System.out.println(coordinates.ViewX());
	coordinates.SetX(5);
	coordinates.SetY(6);
	System.out.println(coordinates.ViewY());
	System.out.println(coordinates.ViewX());
	coordinates.SetXY(4, 8);
	System.out.println(coordinates.toString());
    }
}
