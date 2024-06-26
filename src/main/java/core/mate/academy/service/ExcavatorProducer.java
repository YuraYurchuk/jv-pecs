package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    public ExcavatorProducer() {
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(3, 3));
        excavatorList.add(new Excavator(2, 2));
        excavatorList.add(new Excavator(4, 4));
        return excavatorList;
    }
}
