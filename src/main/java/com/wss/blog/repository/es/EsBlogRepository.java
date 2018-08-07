package com.wss.blog.repository.es;

import com.wss.blog.domain.ES.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author xiaobiaodi
 * @create 2018-06-11 0:01
 **/
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {

    /**
     * 模糊查询(去重)
     * @param title
     * @param summary
     * @param content
     * @param tags
     * @param pageable
     * @return
     */
    Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(
            String title,String summary,String content,String tags,Pageable pageable);

    /**
     * 根据 Blog 的id 查询 EsBlog
     * @param blogId
     * @return
     */
    EsBlog findByBlogId(Long blogId);
}
