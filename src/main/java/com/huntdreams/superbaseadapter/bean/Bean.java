package com.huntdreams.superbaseadapter.bean;

/**
 * Created by noprom on 2015/4/23.
 */
public class Bean {
    private String title;
    private String desc;
    private String time;
    private String phone;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Bean(String title, String phone, String time, String desc) {

        this.title = title;
        this.phone = phone;
        this.time = time;
        this.desc = desc;
    }
}
