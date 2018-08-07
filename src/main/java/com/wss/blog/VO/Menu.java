package com.wss.blog.VO;

import lombok.Data;

/**
 *后端管理的菜单
 * @author xiaobiaodi
 * @create 2018-06-07 23:12
 **/
@Data
public class Menu {
    private String name; // 菜单名称
    private String url; // 菜单 URL

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
