package Factory;

import Service.CounterService;
import Service.CounterServiceImpl;

import java.util.Objects;

public class CounterServiceFactory {

   private static CounterService counterService;

    public static synchronized CounterService getInstance() {
        if(Objects.isNull(counterService)) {
            counterService = new CounterServiceImpl();
        }
        return counterService;
    }
}
