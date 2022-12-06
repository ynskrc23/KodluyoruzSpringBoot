package com.karaca.tutorials.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

public class PostContructTutorials {
    @Autowired
    Logger LOG;

    /*public PostContructTutorials() {
        LOG.info("log info çağrıldı");
    }*/

    @PostConstruct
    public void init(){
        LOG.info("log info çağrıldı");
    }
    public static void main(String[] args){
        PostContructTutorials postContructTutorials = new PostContructTutorials();
        System.out.println(postContructTutorials);
    }
}
