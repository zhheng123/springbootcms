package cn.caa.cms.domain;

import java.util.Date;

public class Engineer {
    private Integer id;

    private String nickName;

    private String realName;

    private String idcard;

    private String phone;

    private Integer grade;

    private String gradeImage;

    private Integer replyTime;

    private String introduct;

    private Integer ansPrice;

    private Integer balance;

    private String openid;

    private String unionid;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getGradeImage() {
        return gradeImage;
    }

    public void setGradeImage(String gradeImage) {
        this.gradeImage = gradeImage == null ? null : gradeImage.trim();
    }

    public Integer getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Integer replyTime) {
        this.replyTime = replyTime;
    }

    public String getIntroduct() {
        return introduct;
    }

    public void setIntroduct(String introduct) {
        this.introduct = introduct == null ? null : introduct.trim();
    }

    public Integer getAnsPrice() {
        return ansPrice;
    }

    public void setAnsPrice(Integer ansPrice) {
        this.ansPrice = ansPrice;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}