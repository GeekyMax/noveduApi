package cn.novedu.bean;

/**
 * @author Max Huang
 */
public class ClazzEnvironment {
    /**
     * 唯一id
     */
    private String id;
    /**
     * 上课id
     */
    private String clazzId;
    /**
     * 上课时间
     */
    private String time;
    /**
     * 上课地点
     */
    private String place;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}