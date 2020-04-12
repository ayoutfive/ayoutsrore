package com.itcast.sercvice.springcloud_service_consumer.pojo;



/**
 * @Auther: Noviciate
 * @Date: 2020/4/6/006 22:27
 * @Description: code
 * @Version: 0.0.1
 */


public class User {

    private Long id;

    private String username;

    private String password;

    private String name;



    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
