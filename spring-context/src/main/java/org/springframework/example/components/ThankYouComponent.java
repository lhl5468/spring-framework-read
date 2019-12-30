package org.springframework.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(value=SCOPE_PROTOTYPE)
public class ThankYouComponent {
	@Autowired
	private HelloComponent helloComponent;

	public ThankYouComponent(){
		System.out.println("thank you");
	}
}