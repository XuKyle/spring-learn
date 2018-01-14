package com.kylexu.springlearn.ch1.config;

import com.kylexu.springlearn.ch1.BraveKnight;
import com.kylexu.springlearn.ch1.Knight;
import com.kylexu.springlearn.ch1.Quest;
import com.kylexu.springlearn.ch1.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
