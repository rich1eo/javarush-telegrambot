package com.github.javarushcommunity.jrtb.service;

/*
* Service for finding new posts.
* */
public interface FindNewPostsService {

    /*
    * Find new posts and notify subscribes about it.
    * */
    void findNewPosts();
}
