import ch.aplu.turtle.*;
import java.awt.*;
public class TestTurtle{
	public static void main(String[] args){
		Turtle sean=new Turtle();
		sean.setColor(Color.GREEN);
		sean.setPos(50,50);
		for(int i=0;i<4;i++){
			sean.forward(70);
			sean.right(100);
			System.out.print("Sean位置:(" + sean.getX()+"," + sean.getY()+")");
			System.out.print("距離原點:(" + sean.distance(0,0) + ")");
	}
	Turtle amy= new  Turtle(sean);
	amy.setColor(Color.RED);
	amy.penDown();
	for(int i=0;i<3;i++){
		amy.bk(100);
		amy.left(120);
		System.out.print("amy位置:(" + amy.getX() + "," + amy.getY() + ")");
			System.out.print("距離sean:(" + amy.distance(sean.getX(),sean.getY()));
		}
	}
}