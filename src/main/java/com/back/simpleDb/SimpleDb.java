package com.back.simpleDb;


public class SimpleDb {
    //testcode에 SimpleDb 파라미터를 저장할 변수 선언
    private String host;
    private String userName;
    private String password;
    private String dbName;

    public void setDevMode(boolean b) {
    }

    public void run(String dropTableIfExistsArticle) {
    }

    public SimpleDb(String localhost, String root, String root123414, String simpleDb__test) {
        this.host = host;
        this.userName = userName;
        this.password = password;
        this.dbName = dbName;
    }

    public void run(String s, String title, String body, boolean isBlind) {
    }
    public Sql genSql() {
        return new Sql();
    }
}
