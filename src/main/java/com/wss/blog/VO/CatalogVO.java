package com.wss.blog.VO;

import com.wss.blog.domain.Catalog;

/**
 * CatalogVO
 * @author xiaobiaodi
 * @create 2018-06-10 21:16
 **/
public class CatalogVO {

    private String username;
    private Catalog catalog;

    public CatalogVO(){
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
