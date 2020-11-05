package sk.it.strausz;

import org.springframework.stereotype.Component;

@Component
public class RESTFortune implements FortuneService{

    @Override
    public String getDailyFortune() {
        return null;
    }
}
