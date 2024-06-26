package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {

    public TruckProducer() {
    }

    @Override
    public List<Machine> get() {
        List<Machine> truckList = new ArrayList<>();
        truckList.add(new Truck(25, 4));
        truckList.add(new Truck(22, 4));
        truckList.add(new Truck(28, 4));
        return truckList;
    }
}
