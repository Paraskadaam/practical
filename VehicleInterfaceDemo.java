interface Vehicle
{
	void accelerate();
	void brake();
	void fuel();
	}
class Bicycle implements Vehicle
{
	Bicycle()
	{
		System.out.println("Bicycle Object");
		}
public void accelerate()
{
	System.out.println("Accelerate using pedals");
	      }
public void brake()
{
	System.out.println("Hand held brakes");
	    }
public void fuel()
{
	System.out.println("No fuel");
	  }
	}
class Bike implements Vehicle
{
	Bike()
{
	System.out.println("Bike Object");
      }
public void accelerate()
{
	System.out.println("Accelerate using Accelerator");
    }
public void brake()
{
	System.out.println("Hand and foot brakes");
   }

public void fuel()
{
	System.out.println("Petrol");
  }
 }
class Car implements Vehicle
{
	Car()
	{
		System.out.println("Car Object");
		}
public void accelerate()
{
	System.out.println("Accelerate using foot");
	}
public void brake()
{
	System.out.println("Foot brake");
      }
public void fuel()
{
	System.out.println("Petrol or diesel or Gas");
     }
   }
class VehicleInterfaceDemo
{
	public static void main(String args[])
	{
		Bicycle bc = new Bicycle();
		bc.accelerate();
		bc.brake();
		bc.fuel();
		Bike bk = new Bike();
		bk.accelerate();
		bk.brake();
		bk.fuel();
		Car c = new Car();
		c.accelerate();
		c.brake();
		c.fuel();
	}
}


Output:


C:\Users\student\Desktop\SEIT 60>javac VehicleInterfaceDemo.java

C:\Users\student\Desktop\SEIT 60>java VehicleInterfaceDemo
Bicycle Object
Accelerate using pedals
Hand held brakes
No fuel
Bike Object
Accelerate using Accelerator
Hand and foot brakes
Petrol
Car Object
Accelerate using foot
Foot brake
Petrol or diesel or Gas