package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rabbit")
public class Rabbit4 {

    private Duck5 duck;

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;  // через сеттер
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
