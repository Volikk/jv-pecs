package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(true, "some", "buld1", "red"));
        bulldozers.add(new Bulldozer(true, "other", "buld2", "yellow"));
        bulldozers.add(new Bulldozer(false, "some", "buld3", "green"));
        return bulldozers;
    }
}
