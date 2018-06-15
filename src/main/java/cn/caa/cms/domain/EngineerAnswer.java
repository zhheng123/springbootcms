package cn.caa.cms.domain;

import java.util.Date;

public class EngineerAnswer {
    private Integer id;

    private Integer ansId;

    private Date ansTime;

    private String ansContent;

    private Integer isAdopt;

    private String ansVoice;

    private String acode;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public Date getAnsTime() {
        return ansTime;
    }

    public void setAnsTime(Date ansTime) {
        this.ansTime = ansTime;
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent == null ? null : ansContent.trim();
    }

    public Integer getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(Integer isAdopt) {
        this.isAdopt = isAdopt;
    }

    public String getAnsVoice() {
        return ansVoice;
    }

    public void setAnsVoice(String ansVoice) {
        this.ansVoice = ansVoice == null ? null : ansVoice.trim();
    }

    public String getAcode() {
        return acode;
    }

    public void setAcode(String acode) {
        this.acode = acode == null ? null : acode.trim();
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