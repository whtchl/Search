package com.lucasurbas.search.search.interactor;

import com.lucasurbas.search.architecture.Interactor;
import com.lucasurbas.search.search.presenter.SearchPresenterForInteractor;

/**
 * Created by Lucas on 29/08/15.
 */
public interface SearchInteractor extends Interactor<SearchPresenterForInteractor> {

    //void getSearchHistory();

    void search(String query);
}
