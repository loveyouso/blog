package com.wss.blog.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * 权限
 * @author xiaobiaodi
 * @create 2018-06-08 11:48
 **/
@Entity
@Data
public class Authority implements GrantedAuthority {

    @Id  //id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增策咯
    private Long id;

    @Column(nullable = false)   //映射字段不能为空
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
