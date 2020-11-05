package sk.it.strausz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Qualifier("randomService")
    @Autowired
    private  FortuneService fortuneService;

/*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

    public TennisCoach() {
    }

   /* @Autowired
    public void doSomething(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    */

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
