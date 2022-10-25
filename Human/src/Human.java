import java.time.YearMonth;

public class Human{
    private
    String first_name;
    String last_name;
    int born_year;
    static int year = YearMonth.now().getYear();

    public Human(String first_name, String last_name, int born_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.born_year = born_year;
    }

    public Human() {
        this.first_name = "Иван";
        this.last_name = "Петров";
        this.born_year = 1980;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public int age(int born_year, int year){
        return year - born_year;
    }

    public void printHuman(){
        System.out.println("Имя: " + first_name + ". Фамилия: " +  last_name + ". Возраст: " + age(born_year, year) + ".");
    }
}