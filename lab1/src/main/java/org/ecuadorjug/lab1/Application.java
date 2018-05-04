package org.ecuadorjug.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private JugRepository jugRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        List<Jug> list = new ArrayList<>();

        Set<Member> set = new HashSet<>();
        set.add(new Member("Jose Diaz", "JUG Leader"));
        set.add(new Member("Eddu Melendez", "JUG Co-Leader"));
        set.add(new Member("Ytalo BorjaDizzy", "JUG Member"));

        list.add(new Jug("Peru", "PERU JUG 1", set));
        list.add(new Jug("Colombia", "Barranquilla JUG", null));

        jugRepository.save(list);
    }
}
