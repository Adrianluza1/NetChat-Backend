package org.netchat.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    private String id;
    private String name;
    private String ipAddress;
    private String subnetMask;

    public Profile() {
    }

    public Profile(String id, String name, String ipAddress, String subnetMask) {
        this.id = id;
        this.name = name;
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }
}
