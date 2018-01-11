package com.kylexu.springlearn.ch2.xmlconfig.properties;

import com.kylexu.springlearn.ch2.xmlconfig.CompactDisc;
import com.kylexu.springlearn.ch2.xmlconfig.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
