package sk.it.strausz;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{

    private String[] data ={
            "Beware of the wolf",
            "Diligence is mother",
            "The journey is the reward"
    };

    private Random random = new Random();

    @Override
    public String getDailyFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
