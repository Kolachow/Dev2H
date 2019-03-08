package Q6.service;

import Q6.model.User;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Provider {

    private List<String> names = Arrays.asList("Grazyna", "Janusz", "Bozena", "Tadeusz", "Euzebiusz");
    private List<String> surnames = Arrays.asList("Bigos", "Beton", "Karzel", "Donica", "Broniszczak");

    public User get() {
        Random random = new Random();
        int randomNameIndex = random.nextInt(names.size());
        int randomSurnameIndex = random.nextInt(surnames.size());

        Random ry = new Random();
        Random rm = new Random();
        Random rd = new Random();
        int year = 1969 + ry.nextInt(2019-1969+1);
        int month = 1 + rm.nextInt(12);
        int day = 1 + rd.nextInt(31);

        if (month==2 && day>28){
            day = day - 3;
        } else {
            if((month%2==0 && month != 8 ) && day==31 ){
                day = day -1;
            }
        }

        String randomName = names.get(randomNameIndex);
        String randomSurname = surnames.get(randomSurnameIndex);
        int randomAge = random.nextInt(83) + 18;
        return new User(randomName, randomSurname, LocalDate.of(year, month, day));
    }
}
