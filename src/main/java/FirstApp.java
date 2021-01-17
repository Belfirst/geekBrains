public class FirstApp {
    public static void main(String[] args) {
        Employee emplArray[] = new Employee[5];
        emplArray[0] = new Employee("Петров Петр Пертрович","Специалист","Petrovich@mail.ru",89065557788L,25);
        emplArray[1] = new Employee("Иванов Иван Иванович","Инженер", "Ivanov@mail.ru",89058881111L,45);
        emplArray[2] = new Employee("Кошкина Ирина Николаевна","Швея", "Cat@mail.com",89261236532L, 52);
        emplArray[3] = new Employee("Лазарев Иван Аркадьевич", "Начальник", "Lazar@gmail.com", 89264445739L, 48);
        emplArray[4] = new Employee("Смирноа Алексей Анатольевич", "Токарь", "Still@mail.com", 89053002010L,28);
        for(int i = 0; i < emplArray.length; i++) {
            emplArray[i].setAge(40);
        }
    }
}
