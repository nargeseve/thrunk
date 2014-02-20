package com.jprogrammers.service;

import com.jprogrammers.model.Article;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by Vahid Forghani
 */

public class ArticleService extends GenericDAOImpl<Article> {
	
	static GenericDAOImpl<Article> articleDao;
	
	static{
		articleDao = new GenericDAOImpl<Article>();
	}
	
	public static List<Article> getArticles() {
		
		String query = "FROM Article";
		
		List<Article> articles = articleDao.findMany(query, null);
		
		return articles;
	}
	
	public static Article getArticle(long articleId){
		
		String query = "FROM Article WHERE id = " + articleId;
		
		Article article = articleDao.findOne(query, null);
		
		return article;
		
	}

    public static Article getArticle(String urlTitle){

        String query = "FROM Article WHERE urlTitle = '" + urlTitle + "'";

        Article article = articleDao.findOne(query, null);

        return article;

    }

    public static Article addArticle(String title, String urlTitle, String content) {

        Article article = new Article();

        article.setId(CounterService.increment());
        article.setTitle(title);
        article.setUrlTitle(urlTitle);
        article.setContent(content);


        articleDao.save(article, null);

        return article;
    }
	
	public static Article editArticle(long articleId, String title, String urlTitle, String content){
		
		Article article = getArticle(articleId);

        article.setTitle(title);
        article.setUrlTitle(urlTitle);
        article.setContent(content);
		
		articleDao.save(article, null);
		
		return article;
		
	}

    public static Article editArticle(Article article){

        articleDao.save(article, null);

        return article;

    }
	
	public static boolean deleteArticle(long articleId, Session session){
		
		Article article = getArticle(articleId);

		articleDao.delete(article, session);
		
		return true;
	}
}
