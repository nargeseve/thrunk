package com.jprogrammers.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by EN20 on 2/20/14.
 */
@Entity
public class Article {
    private long id;
    private String title;
    private String urlTitle;
    private String content;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "urlTitle", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getUrlTitle() {
        return urlTitle;
    }

    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle;
    }

    @Basic
    @Column(name = "content", nullable = true, insertable = true, updatable = true, length = 65535, precision = 0)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != article.id) return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (urlTitle != null ? !urlTitle.equals(article.urlTitle) : article.urlTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (urlTitle != null ? urlTitle.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
