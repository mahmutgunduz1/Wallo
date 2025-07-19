package com.example.wallo.Models;

import com.google.gson.annotations.SerializedName;

public class WalloModels {
    @SerializedName("id")
    public String id;
    
    @SerializedName("url")
    public String url;
    
    @SerializedName("width")
    public Integer width;
    
    @SerializedName("height")
    public Integer height;
    
    @SerializedName("title")
    public String title;
    
    @SerializedName("description")
    public String description;
    
    // Varsayılan constructor
    public WalloModels() {
    }
    
    // Tam constructor
    public WalloModels(String id, String url, Integer width, Integer height, String title, String description) {
        this.id = id;
        this.url = url;
        this.width = width;
        this.height = height;
        this.title = title;
        this.description = description;
    }
}
