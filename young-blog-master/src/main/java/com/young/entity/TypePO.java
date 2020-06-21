package com.young.entity;

public class TypePO {
    private Long id;

    @Override
    public String toString() {
        return "TypePO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public TypePO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TypePO() {
    }

    private String name;

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
        this.name = name == null ? null : name.trim();
    }
}