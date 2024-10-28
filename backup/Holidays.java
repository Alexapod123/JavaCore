package dz_3_4;

public enum Holidays {
    New_Year (1,1),
    Defender_of_the_Fatherland_Day(23,2),
    International_Women_Day(8,3),
    CurrentDate(java.time.LocalDate.now().getDayOfMonth(), java.time.LocalDate.now().getMonthValue());
    private int day;
    private int month;

    Holidays(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
