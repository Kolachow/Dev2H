package Q7.model;

public enum WeekDay {
    PONIEDZIALEK("Poniedzialek", 1), WTOREK("Wtorek", 2), SRODA("Sroda", 3), CZWARTEK("Czwartek", 4),
    PIATEK("Piatek", 5), SOBOTA("Sobota", 6), NIEDZIELA("Niedziela", 7);

    private String name;
    private int dayNumber;

    WeekDay(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }

    public String getName() {
        return name;
    }

    public static WeekDay createFromInt(int weekday) {
        return WeekDay.values()[weekday - 1];
    }
}
