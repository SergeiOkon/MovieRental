package com.factory.impl;

import com.factory.MovieFactory;
import com.factory.audio.Audio;
import com.factory.audio.impl.UkrainianAudio;
import com.factory.subtitles.Subtitle;
import com.factory.subtitles.impl.UkrainianSubtitle;

public class UkrainianMovieFactory implements MovieFactory{

    public Audio createAudio() {
        return new UkrainianAudio();
    }

    public Subtitle createSubtitle() {
        return new UkrainianSubtitle();
    }
}