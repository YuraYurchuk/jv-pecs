package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public BulldozerProducer() {
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(5000, 2));
        bulldozerList.add(new Bulldozer(4000, 1));
        bulldozerList.add(new Bulldozer(6000, 3));
        return bulldozerList;
    }
}
