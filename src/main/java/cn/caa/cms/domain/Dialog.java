package cn.caa.cms.domain;

import java.util.Date;

public class Dialog {
    private Integer id;

    private Integer dId;

    private String dName;

    private String dHead;

    private String dContent;

    private String dVoice;

    private Integer dType;

    private String qcode;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdHead() {
        return dHead;
    }

    public void setdHead(String dHead) {
        this.dHead = dHead == null ? null : dHead.trim();
    }

    public String getdContent() {
        return dContent;
    }

    public void setdContent(String dContent) {
        this.dContent = dContent == null ? null : dContent.trim();
    }

    public String getdVoice() {
        return dVoice;
    }

    public void setdVoice(String dVoice) {
        this.dVoice = dVoice == null ? null : dVoice.trim();
    }

    public Integer getdType() {
        return dType;
    }

    public void setdType(Integer dType) {
        this.dType = dType;
    }

    public String getQcode() {
        return qcode;
    }

    public void setQcode(String qcode) {
        this.qcode = qcode == null ? null : qcode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}