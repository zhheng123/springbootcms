package cn.caa.cms.domain;

import java.util.Date;

public class UserQuestion {
    private Integer id;

    private Integer queId;

    private String content;

    private Integer price;

    private String queImage;

    private String queBrand;

    private Integer queType;

    private Integer queWay;

    private Integer isClose;

    private Integer engId;

    private Date createTime2;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getQueImage() {
        return queImage;
    }

    public void setQueImage(String queImage) {
        this.queImage = queImage == null ? null : queImage.trim();
    }

    public String getQueBrand() {
        return queBrand;
    }

    public void setQueBrand(String queBrand) {
        this.queBrand = queBrand == null ? null : queBrand.trim();
    }

    public Integer getQueType() {
        return queType;
    }

    public void setQueType(Integer queType) {
        this.queType = queType;
    }

    public Integer getQueWay() {
        return queWay;
    }

    public void setQueWay(Integer queWay) {
        this.queWay = queWay;
    }

    public Integer getIsClose() {
        return isClose;
    }

    public void setIsClose(Integer isClose) {
        this.isClose = isClose;
    }

    public Integer getEngId() {
        return engId;
    }

    public void setEngId(Integer engId) {
        this.engId = engId;
    }

    public Date getCreateTime2() {
        return createTime2;
    }

    public void setCreateTime2(Date createTime2) {
        this.createTime2 = createTime2;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}