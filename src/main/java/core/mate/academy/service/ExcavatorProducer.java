package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("someBoom", "someAttach", "exc1", "grey"));
        excavators.add(new Excavator("otherBoom", "otherAttach", "exc2", "blue"));
        excavators.add(new Excavator("someBoom", "someAttach", "exc3", "grey"));
        return excavators;
    }
}
