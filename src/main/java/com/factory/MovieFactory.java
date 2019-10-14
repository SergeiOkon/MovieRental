package com.factory;

import com.factory.audio.Audio;
import com.factory.subtitles.Subtitle;

public interface MovieFactory {

    Audio createAudio();

    Subtitle createSubtitle();
}
