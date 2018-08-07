package com.wss.blog.domain.ES;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author xiaobiaodi
 * @create 2018-06-11 8:39
 **/
@Document(indexName = "blog", type = "blog") // 文档
public class EsBlog2 {
    @Id // 主键
    private String id;
    private String title;
    private String summary;
    private String content;

    protected EsBlog2() { // JPA 的规范要求无参构造函数；设为 protected 防止直接使用
    }

    public EsBlog2(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "EsBlog[id='%s',title='%s',summary='%s',content='%s']",
                id, title, summary, content);
    }
}
