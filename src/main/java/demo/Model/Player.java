package demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;


@Entity

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private Date birthday;

    @Column
    private int numcan;

    @Column
    private int asis;

    @Column
    private int rebo;

    @Column
    private String posi;
    @JsonIgnore
    @ManyToOne
    private Team team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getNumcan() {
        return numcan;
    }

    public void setNumcan(int numcan) {
        this.numcan = numcan;
    }

    public int getAsis() {
        return asis;
    }

    public void setAsis(int asis) {
        this.asis = asis;
    }

    public int getRebo() {
        return rebo;
    }

    public void setRebo(int rebo) {
        this.rebo = rebo;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", numcan=" + numcan +
                ", asis=" + asis +
                ", rebo=" + rebo +
                ", posi='" + posi + '\'' +
                //", team=" + team +
                '}';
    }
}
