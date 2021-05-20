public class DB {
    private String hostname;
    private String username;
    private String dbname;
    private String dbpassword;
    private String data;

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public DB(DB db){
        this.hostname = db.hostname;
        this.username = db.username;
        this.dbname = db.dbname;
        this.dbpassword = db.dbpassword;
    }

    public DB(String hostname, String username, String dbname, String dbpassword) {
        this.hostname = hostname;
        this.username = username;
        this.dbname = dbname;
        this.dbpassword = dbpassword;
    }

    boolean is_db_open(String dbname, String dbpassword){
        return this.dbname.equals(dbname) && this.dbpassword.equals(dbpassword);
    }
}
