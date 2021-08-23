package com.example.feednews;


import java.util.ArrayList;

public class MainNews {

    private String status;
    private String statusResults;
    private ArrayList<ModelClass> articles;

    public MainNews(String status, String statusResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.statusResults = statusResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusResults() {
        return statusResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusResults(String statusResults) {
        this.statusResults = statusResults;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
