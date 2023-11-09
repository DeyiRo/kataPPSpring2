package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ocean")
public class Ocean1 {

    @Autowired
    private Island2 island;  // океан через переменную, подтягивает созданный бин  остров из апп конфиг.
                             // в бине Остров уже есть дерево

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
