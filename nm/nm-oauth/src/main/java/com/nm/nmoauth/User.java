package com.nm.nmoauth;

/**
 * @author baostorm
 */
public class User {
    protected Integer id ;

    protected String password;

    protected String userName;

    protected String roleName;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getUsername(){
        return this.userName;
    }

    public void setUsername(String userName){
        this.userName = userName;
    }

    public String getRole(){
        return this.roleName;
    }

    public void setRole(String roleName){
        this.roleName = roleName;
    }
}
