package oop.exercises.oop.task1;

public class Main {
    public static void main(String[] args) {
//        //
//        Point2D class
//        Implement the Point2D class. It should contain:
//        two 􀂧oat 􀂦elds : x , y
//        non-arguments constructor which will set x , y 􀂦elds to 0
//        two-arguments constructor: float x , float y
//        getter methods which will be responsible for returning x , y 􀂦elds values
//        getXY method which will return x , y values as two-element array
//        setter methods which will be responsible for setting x , y 􀂦elds values
//        setXY method which will be responsible for settting x and y
//        toString method which should return string in the following format: (x,
//                y)
//        Point3D class
//        Using the Point2D class implement the Point3D class. It should extend the
//        Point2D class. It should contain:
//        private 􀂧oat 􀂦eld: z
//        three-arguments constructor: float x , float y , float z
//        getter method which will be responsible for returning the z 􀂦eld value
//        getXYZ method which will return x , y , z values as three-element array
//        setter method which will be responsible for setting the z 􀂦eld value
//        setXYZ method which will be responsible for setting x , y , z
//        toString method which should return string in the following format: (x,
//                y, z)
//        Please provide an example usage of above implementation.
        Point2D point2d = new Point2D(50,100);
        System.out.println(point2d);
        point2d.setXY(100,200);
        System.out.println(point2d);
        Point3D point3d = new Point3D(300,600,900);
        System.out.println(point3d);
        point3d.setXYZ(350,650,950);
        System.out.println(point3d);
        point3d.setXY(400,800);
        System.out.println(point3d);

    }
}
