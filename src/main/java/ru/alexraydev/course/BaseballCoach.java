package ru.alexraydev.course;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

    public BaseballCoach() {

    }

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}








