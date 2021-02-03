import java.awt.Rectangle;

public class Kadai1{
public static void main (String[] args) {
	Rectangle jiki = new Rectangle(120, 100, 70, 100);
	Rectangle teki1 = new Rectangle(100, 70, 100, 50);
	Rectangle teki2 = new Rectangle(10, 130, 100, 50);
	Rectangle teki3 = new Rectangle(170, 130, 50, 50);
	if(true == jiki.intersects(teki1) && true == jiki.intersects(teki2) && true == jiki.intersects(teki3)) {
System.out.println("敵機1が当たり");
System.out.println("敵機2が当たり");
System.out.println("敵機3が当たり");

	}else if(true == jiki.intersects(teki1) && true == jiki.intersects(teki2)) {
		System.out.println("敵機1が当たり");
		System.out.println("敵機2が当たり");

	}else if(true == jiki.intersects(teki1) && true == jiki.intersects(teki3)){
		System.out.println("敵機1が当たり");
		System.out.println("敵機3が当たり");

	}else if(true == jiki.intersects(teki2) && true == jiki.intersects(teki3)) {
		System.out.println("敵機2が当たり");
		System.out.println("敵機3が当たり");

	}else if(true == jiki.intersects(teki1)) {
		System.out.println("敵機1が当たり");

	}else if(true == jiki.intersects(teki2)) {
		System.out.println("敵機2が当たり");

	}else if(true == jiki.intersects(teki3)) {
		System.out.println("敵機3が当たり");

	}else {
		System.out.println("敵機はいない");

	}


}
}