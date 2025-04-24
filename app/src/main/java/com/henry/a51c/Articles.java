package com.henry.a51c;

import javax.xml.transform.Source;

public class Articles {

    private String title;
    private String description;
    private String urlToImage;
    private String url;
    private String content;

    public Articles(String content, String description, String title, String url, String urlToImage) {
        this.content = content;
        this.description = description;
        this.title = title;
        this.url = url;
        this.urlToImage = urlToImage;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
