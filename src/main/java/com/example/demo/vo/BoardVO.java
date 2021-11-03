package com.example.demo.vo;

import java.util.Date;

public class BoardVO {

    private int bno;
    private String title, content, writer, youtube;
    private Date regdate;


    public BoardVO(int bno, String title, String content, String writer, Date regdate, String youtube) {
        super();
        setBno(bno);
        setTitle(title);
        setContent(content);
        setWriter(writer);
        setRegdate(regdate);
        setYoutube(youtube);
    }


    public String getYoutube() {
        return youtube;
    }


    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }


    public BoardVO() {
        super();
        // TODO Auto-generated constructor stub
    }


    public int getBno() {
        return bno;
    }


    public void setBno(int bno) {
        this.bno = bno;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        if (title != null && !title.equals("")) {
            this.title = title;
        } else {
            System.out.println("입력하신 정보를 확인하세요");
        }
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        if (content != null && !content.equals("")) {
            this.content = content;
        } else {
            System.out.println("입력한 정보를 확인해주세요");
        }
    }


    public String getWriter() {
        return writer;
    }


    public void setWriter(String writer) {
        if (writer != null && !writer.equals("")) {
            this.writer = writer;
        } else {
            System.out.println("입력한 정보를 확인해주세요");
        }
    }


    public Date getRegdate() {
        return regdate;
    }


    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }


    @Override
    public String toString() {
        return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
                + regdate + "]";
    }


}

