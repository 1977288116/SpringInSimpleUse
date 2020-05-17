package com.chenjl.dependencyInjection;

import org.springframework.context.annotation.Bean;

/**
 * 添加了的配置类后功能类似于XML文件
 */
//@Configuration
public class KnightConfig {

    @Bean
    public Knight knight () {
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest () {
        return new SlayDragonQuest(System.out);
    }

}
