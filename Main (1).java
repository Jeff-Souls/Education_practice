import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User stuff = new User();
        stuff.setRole("Stuff");
        stuff.setAdd_services("Рабинович Адольф Иосифович");
        stuff.setRoom_list(new int[]{1, 2, 3});

        User client = new User();
        client.setRole("Клиент");
        client.setStart_date("17.05.2021");
        client.setEnd_date("21.05.2021");
        client.setAdd_services("Жмышенко Валерий Альбертович");
        client.setRoom_list(new int[]{1});
        client.setType_room(false); // Обычный
        client.setMoney(3000);

        stuff.setData("ФИО клиента: " + client.getAdd_services() + ", Дата заезда: " + client.getStart_date() +
                ", Дата выезда: " + client.getEnd_date() + ", Номер комнаты: " + Arrays.toString(client.getRoom_list()) +
                ", Тип номера: " + client.getType_room() + ", Оплата номера: " + client.getMoney());

        DB db = new DB("Admin",stuff.getRole(),"db","1234");
        if(db.is_db_open("db","1234")){
            DB_Query db_query = new DB_Query(db);
            stuff.enter_data_in_db(db_query, db);
        }
        else
            System.out.println("No connect to DB");

        System.out.println();
        System.out.println("Информация в БД: " + db.getData());
    }
}