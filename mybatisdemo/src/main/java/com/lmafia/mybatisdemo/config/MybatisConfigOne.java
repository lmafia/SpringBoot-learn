package com.lmafia.mybatisdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author L_MaFia
 * @classname MaybatisConfig.java
 * @description TODO
 * @date 2021/2/27
 */
@Configuration
@MapperScan(basePackages = "com.lmafia.mybatisdemo.dao",
        sqlSessionFactoryRef = "sqlSessionFactory1",
        sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MybatisConfigOne {

    @Resource(name = "dataSourceOne")
    DataSource dataSourceOne;

    @Bean
    SqlSessionFactory sqlSessionFactory1() {
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSourceOne);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1() {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
