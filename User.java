public class User {
    private String role;
    private String start_date;
    private String end_date;
    private int[] room_list;
    private String data;
    private String add_services;
    private boolean type_room;
    private int money;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public int[] getRoom_list() {
        return room_list;
    }
    public void setRoom_list(int[] room_list) {
        this.room_list = room_list;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getAdd_services() {
        return add_services;
    }
    public void setAdd_services(String add_services) {
        this.add_services = add_services;
    }
    public boolean getType_room() {
        return type_room;
    }
    public void setType_room(boolean type_room) {
        this.type_room = type_room;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void enter_data_in_db(DB_Query db_query, DB db){
        db_query.do_query(this.getData(), db);
    }

}
