package com.lmafia.springbootlabs.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author L_MaFia
 * @classname jdbcTemplateConfig.java
 * @description TODO
 * @date 2021/2/27
 */
@Configuration
public class JdbcTemplateConfig {
    @Bean
    JdbcTemplate jdbcTemplateOne(@Qualifier("dataSourceOne") DataSource dataSourceOne) {
        return new JdbcTemplate(dataSourceOne);
    }

    @Bean
    JdbcTemplate jdbcTemplateTwo(@Qualifier("dataSourceTwo") DataSource dataSourceTwo) {
        return new JdbcTemplate(dataSourceTwo);
    }
}
