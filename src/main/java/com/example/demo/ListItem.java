package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ListItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String listitemtitle;

    @NotNull
    @Size(min=4)
    private String listitemdesc;

    @NotNull
    @Size(min=10)
    private String duedate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getListitemtitle() {
        return listitemtitle;
    }

    public void setListitemtitle(String listitemtitle) {
        this.listitemtitle = listitemtitle;
    }

    public String getListitemdesc() {
        return listitemdesc;
    }

    public void setListitemdesc(String listitemdesc) {
        this.listitemdesc = listitemdesc;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
}




