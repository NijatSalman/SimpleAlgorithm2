package Shape;

public class test {

	public static void main(String[] args) {
		
		Shape[] shapearray = new Shape[6];
		
	 Circle c=new Circle(5);
     Square s=new Square(6);
     Triangle t=new Triangle(7);
     Sphera s1 = new Sphera(5);
     Tetrahedron t1 = new Tetrahedron(6);
     Cube c1 = new Cube(7);
     
     shapearray[0] = c;
     shapearray[1] = s;
     shapearray[2] = t;
     shapearray[3] = c1;
     shapearray[4] = s1;
     shapearray[5] = t1;
     
     for (Shape shape : shapearray) {
		System.out.println(shape);
	}
     
//     for (Shape shape : shapearray) {
//    	 if (shape instanceof TwodimensionalShape) {
//			System.out.println("sahe: " + shape.getArea());
//		}else {
//			ThreedimensionalShape tmp = (ThreedimensionalShape) shape;
//			System.out.println("sahe: " + tmp.getArea() + " hecm: " + tmp.getVolume());
//		}
//	}
     
//     System.out.println(c);
//     System.out.println(s);
//     System.out.println(t);
//     System.out.println(c1);
//     System.out.println(s1);
//     System.out.println(t1);
	}

}
