package com.example.zhangbiao.design.been;

public class DesignVO {

    private String name;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DesignVO(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
