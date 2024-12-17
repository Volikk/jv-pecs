package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(16,"long","box","tr1","red"));
        trucks.add(new Truck(22,"short","line","tr2","red"));
        trucks.add(new Truck(17,"very-long","other","tr2","red"));
        trucks.add(new Truck(18,"medium","box","tr3","red"));
        return trucks;
    }
}
