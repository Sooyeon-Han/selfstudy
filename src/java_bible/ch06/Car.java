package java_bible.ch06;

class Car{
	String color;
	String gearType;
	int door;
	
	Car() {this("white","auto",4);}
	
	Car(String color){
		this(color,"auto",4);
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
//	Car(String c, String g, int d){
//		color = c;
//		gearType = g;
//		door = d;
//	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
