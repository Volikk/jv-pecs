package core.mate.academy.service;

/**
 * Your implementation of MachineService.
 */
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
        } else {
            machines = new ArrayList<>();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
