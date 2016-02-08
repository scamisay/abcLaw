package com.abc.openlaw.controller.commands;

import java.util.List;

/**
 * Created by scamisay on 07/02/16.
 */
public class LawCommand {

    private String name;
    private String general;
    private List<ArticleCommand> articles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public List<ArticleCommand> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleCommand> articles) {
        this.articles = articles;
    }
}
