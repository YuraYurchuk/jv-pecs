package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    public TruckProducer() {
    }

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(25, 4));
        truckList.add(new Truck(22, 4));
        truckList.add(new Truck(28, 4));
        return truckList;
    }
}
