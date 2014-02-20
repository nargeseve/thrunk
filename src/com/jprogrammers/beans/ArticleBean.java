package com.jprogrammers.beans;

import com.jprogrammers.language.LanguageUtil;
import com.jprogrammers.model.Article;
import com.jprogrammers.service.ArticleService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Created by EN20 on 2/20/14.
 */
@ManagedBean
public class ArticleBean extends Article {

    public void addArticle(){
        ArticleService.addArticle(getTitle(), getUrlTitle(), getContent());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, LanguageUtil.get("article_added_successfully"), ""));
    }

}
