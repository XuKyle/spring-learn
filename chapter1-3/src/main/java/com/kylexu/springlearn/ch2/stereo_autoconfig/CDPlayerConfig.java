package com.kylexu.springlearn.ch2.stereo_autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//组件扫描默认是不启用的。我们还需要显式配置一下Spring，从而命令它去寻找带有@Component注解的类
//@ComponentScan注解启用了组件扫描
//@ComponentScan默认会扫描与配置类相同的包->这个包以及这个包下的所有子包

//@ComponentScan("com.kylexu.springlearn.ch2.stereo_autoconfig")//指定扫描的基础包
//@ComponentScan(basePackages = "com.kylexu.springlearn.ch2.stereo_autoconfig")//basePackages属性指定扫描的基础包
//@ComponentScan(basePackages = {"com.kylexu.springlearn.ch2.stereo_autoconfig"})//basePackages属性指定 多个 扫描的基础包
//@ComponentScan(basePackageClasses = {SgtPeppers.class})//basePackages属性指定 多个 扫描的基础包
public class CDPlayerConfig {
}
