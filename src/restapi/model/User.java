package restapi.model;

import java.util.Date; // < 현재 시간 알기위해서 사용.


// 롬북을 사용하면 get, set을 사용안하고 어노테이션을 붙이면 되지만, 현재로서는 라이브러리 사용 없이 진행.

public class User {
    private Integer id;
    private String name;
    private Date joinDate;

    public User() {}

    public User(Integer id, String name, Date joinDate) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
