package com.playanetworks.springmvc.vo;

public class BoardVO {
    private Integer bNo;
    private String  title;
    private String  content;
    private String  writer;
    private String  regDate;
    private int     viewCnt;

    public Integer getbNo() {
        return bNo;
    }

    public void setbNo(Integer bNo) {
        this.bNo = bNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "BoardVO [bNo" + bNo + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate=" + regDate + ", viewCnt=" + viewCnt
                + "]";
    }
}
