package com.lfg.pojo;

public class User {
    private Integer id;
    private String title;
    private String texts;
    private String daan;
    private String username;
    private String password;


    public User() {
    }

    public User(Integer id, String title, String texts, String daan, String username, String password) {
        this.id = id;
        this.title = title;
        this.texts = texts;
        this.daan = daan;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return texts
     */
    public String getTexts() {
        return texts;
    }

    /**
     * 设置
     * @param texts
     */
    public void setTexts(String texts) {
        this.texts = texts;
    }

    /**
     * 获取
     * @return daan
     */
    public String getDaan() {
        return daan;
    }

    /**
     * 设置
     * @param daan
     */
    public void setDaan(String daan) {
        this.daan = daan;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{id = " + id + ", title = " + title + ", texts = " + texts + ", daan = " + daan + ", username = " + username + ", password = " + password + "}";
    }
}
