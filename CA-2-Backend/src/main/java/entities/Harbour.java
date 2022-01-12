package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "harbour")
public class Harbour implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private int id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @NotNull
    @Column(name = "address")
    private String address;

    @Basic(optional = false)
    @NotNull
    @Column(name = "capacity")
    private int capacity;

    public Harbour() {
    }

    public Harbour(int id, String name, String address, int capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
