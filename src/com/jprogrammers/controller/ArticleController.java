package com.jprogrammers.controller;

import com.jprogrammers.model.Article;
import com.jprogrammers.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by EN20 on 2/20/14.
 */
@Controller
@RequestMapping("/article")

public class ArticleController {

    @RequestMapping(value = "/{urlTitle}", method = RequestMethod.GET)
    public String getArticle(@PathVariable String urlTitle, ModelMap model){
        Article article = ArticleService.getArticle(urlTitle);
        if(article == null)
            return "404";
        model.addAttribute("article", article);
        return "article";
    }

}
