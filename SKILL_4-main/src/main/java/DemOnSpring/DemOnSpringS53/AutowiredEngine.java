package DemOnSpring.DemOnSpringS53;

import org.springframework.stereotype.Component;

@Component


public class AutowiredEngine {
	String engineType;
	void start()
	{
		System.out.println("Engine started ");
	}
	void typeOfEngine(String type) {
		this.engineType =type;
	}

}
