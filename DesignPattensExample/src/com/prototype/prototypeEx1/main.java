package com.prototype.prototypeEx1;

public class main {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(1,1,3);
		Circle circle2;
		try {
			circle2 = circle1.copy();
		
			System.out.println(
					circle1.getX()+","+
					circle1.getY()+","+
					circle1.getR());
			
			System.out.println(
					circle2.getX()+","+
					circle2.getY()+","+
					circle2.getR());		
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
