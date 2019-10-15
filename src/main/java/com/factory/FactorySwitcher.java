package com.factory;

import com.factory.impl.EnglishMovieFactory;
import com.factory.impl.UkrainianMovieFactory;

public enum FactorySwitcher {
    ENGLISH,
    UKRAINIAN;

    public static MovieFactory getFactory(FactorySwitcher factoryType){
        switch(factoryType){
            case UKRAINIAN:
                return new UkrainianMovieFactory();
            default: ENGLISH:
                return new EnglishMovieFactory();
        }
    }
}
