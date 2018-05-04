/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ecuadorjug.lab1;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Jug {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "jugId")
    Set<Member> members;

    public Jug() {
    }

    public Jug(String name, String location, String mascot, Set<Member> members) {
        this.name = name;
        this.location = location;
        this.mascot = mascot;
        this.members = members;
    }

    public Jug(String name, String location, Set<Member> members) {
        this.name = name;
        this.location = location;
        this.members = members;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

}
