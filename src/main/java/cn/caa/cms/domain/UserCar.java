package cn.caa.cms.domain;

public class UserCar {
    private Integer id;

    private Integer userId;

    private String userCar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCar() {
        return userCar;
    }

    public void setUserCar(String userCar) {
        this.userCar = userCar == null ? null : userCar.trim();
    }
}