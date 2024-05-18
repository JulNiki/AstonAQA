package Task;
public class Main {
    public static void main(String[] args) {
        Employee[] person = new Employee[5];
        person[0] = new Employee("Яхин Филипп Игнатьевич", "Директор", "filipp2595@hotmail.com", "+7 (952) 653-19-96", 74000, 63);
        person[1] = new Employee("Тевосов Максим Павлович", "Сварщик", "maksim67@yandex.ru", "+7 (909) 419-56-56", 52000, 34);
        person[2] = new Employee("Еромеева Рада Валентиновна", "Диспетчер", "rada2022@outlook.com", "+7 (949) 831-46-56", 34000, 25);
        person[3] = new Employee("Румянцева Валентина Порфнрьевна", "Специалист по ВЭД", "valya7387@gmail.com", "++7 (905) 286-93-14", 65000, 46);
        person[4] = new Employee("Янин Валентин Ефимович", "Мастер участка", "valentin1983@outlook.com", "+7 (939) 850-75-73", 73000, 33);

        for (int i = 0; i < 5; i++) {
            person[i].printInfo();
        }

        Park park1 = new Park("Диво Остров");
        Park.Attraction shaker = park1.new Attraction("Шейкер", "с 11.00 до 21.00", 500);
        park1.printInfoPark();
        shaker.printInfoAttraction();

    }
}
