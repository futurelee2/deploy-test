package com.example.deploytest.data;

import com.example.deploytest.entitiy.Greetings;
import com.example.deploytest.repository.GreetingRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInit {
    private final GreetingRepository greetingRepository;

    public DataInit(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @PostConstruct
    public void init(){
        greetingRepository.deleteAll();
        greetingRepository.save(new Greetings(
                null, "en", "hello"
        ));
        greetingRepository.save(new Greetings(
                null, "jp", "ㅋㅋ"
        ));
        greetingRepository.save(new Greetings(
                null, "kr", "ㅎㅇ"
        ));
    }


}
