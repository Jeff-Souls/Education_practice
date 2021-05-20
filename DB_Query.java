public class DB_Query extends DB {
    private String query_text;

    public DB_Query(DB db) {
        super(db);
    }


    void do_query(String query_text, DB db){
        this.query_text = query_text;
        db.setData(this.query_text);
    }
}
