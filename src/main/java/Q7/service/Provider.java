package Q7.service;

import Q7.model.Supplier;
import Q7.model.WeekDay;

import java.time.LocalDate;

public class Provider implements Supplier {
    @Override
    public void getDayOfTheWeek() {
        int dayOfTheWeek = LocalDate.now().getDayOfWeek().getValue();
        System.out.println(WeekDay.createFromInt(dayOfTheWeek).getName() + "!");
    }
}
