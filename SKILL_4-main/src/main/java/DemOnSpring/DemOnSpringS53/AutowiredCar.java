package DemOnSpring.DemOnSpringS53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredCar {
	@Autowired//
	AutowiredEngine engine;
	
void drive() {
	
	engine.start();
	System.out.println("Car is running");
}
void displayEngineType(String Type) {
	// engine.typeOfEngine(type);//
	System.out.println("Type of Engine is" + engine.engineType);
}
}
