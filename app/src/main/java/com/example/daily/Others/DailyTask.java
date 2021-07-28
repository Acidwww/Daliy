package com.example.daily.Others;

public class DailyTask {
    private long id;
    private String title;
    private String content;
    private String time;
    private int tag;

    public DailyTask(){

    }

    public DailyTask(String content,String title,String time, int tag){
        this.content = content;
        this.title = title;
        this.time = time;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return content + "\n" + time.substring(5,16) + " " + id;
    }
}
