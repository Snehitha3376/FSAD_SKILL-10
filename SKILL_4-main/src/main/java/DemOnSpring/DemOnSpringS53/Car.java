package DemOnSpring.DemOnSpringS53;

public class Car {
    Engine engineObj;
  
    
	public Car(Engine engineObj) {
		super();
		this.engineObj = engineObj;
	}

	public Engine getEngineObj() {
		return engineObj;
	}

	public void setEngineObj(Engine engineObj) {
		this.engineObj = engineObj;
	}
    void displayEngineType() {
    	System.out.println("Type of Car engine is"+engineObj.getEngineType());
    }
}
