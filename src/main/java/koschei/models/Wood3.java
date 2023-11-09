package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("wood")
public class Wood3 {

    private final Rabbit4 rabbit;

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    } // через конструктор, надо создать зайца

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
