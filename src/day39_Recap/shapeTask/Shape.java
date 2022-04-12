package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if the name is null
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1); // giving 0 because program terminates without any error!
            // 1 means: something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name); // if I call the setter; repeat same code fragment again
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */