package com.abc.openlaw.domain;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scamisay on 05/02/16.
 */
public class Law {

    @Id
    private String id;

    private String general;

    private List<Article> articles;

    public Law(String general) {
        this.general = general;
    }

    public Law addArticle(Article anArticle){
        if(articles == null){
            articles = new ArrayList<Article>();
        }
        articles.add(anArticle);
        return this;
    }
}
