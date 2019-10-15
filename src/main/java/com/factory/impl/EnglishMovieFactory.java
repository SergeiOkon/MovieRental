package com.factory.impl;

import com.factory.MovieFactory;
import com.factory.audio.Audio;
import com.factory.audio.impl.EnglishAudio;
import com.factory.subtitles.Subtitle;
import com.factory.subtitles.impl.EnglishSubtitle;

public class EnglishMovieFactory implements MovieFactory {

    public Audio createAudio() {
        return new EnglishAudio();
    }

    public Subtitle createSubtitle() {
        return new EnglishSubtitle();
    }
}
