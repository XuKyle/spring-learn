package com.kylexu.springlearn.ch1;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest quest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }
}
