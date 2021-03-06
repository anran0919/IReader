package com.anakin.ireader.presenter.impl;

import com.anakin.ireader.presenter.IArticlePresenter;
import com.anakin.ireader.presenter.listener.OnArticleListener;
import com.anakin.ireader.ui.view.IArticleView;

import javax.inject.Inject;

/**
 * 创建者     demo
 * 创建时间   2016/11/25 0025 10:55
 */
public class ArticlePresenter implements IArticlePresenter,OnArticleListener {


    private  IArticleView mView;

    @Inject
    public ArticlePresenter(IArticleView view) {
        this.mView= view;
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onFail() {

    }

    @Override
    public void getArticles() {

    }
}
