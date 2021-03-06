package com.qingmu.mybatisplus.conf;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Description：
 *
 * @author lida
 * @date: created in 2020-11-14 3:22 下午
 */
@Component
@MapperScan("com.qingmu.mybatisplus.mapper")
public class MybatisPlusConfig {
    /**
     * SQL执行效率插件
     *  配置在测试环境和开发环境： @Profile({"dev", "test"})
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

}
