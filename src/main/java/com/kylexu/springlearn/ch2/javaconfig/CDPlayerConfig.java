package com.kylexu.springlearn.ch2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration注解表明这个类是一个配置类，该类应该包含在Spring应用上下文中如何创建bean的细节
//移除了@ComponentScan注解，此时的CDPlayerConfig类就没有任何作用了
@Configuration
public class CDPlayerConfig {

    //@Bean注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean。方法体中包含了最终产生bean实例的逻辑。
    //默认情况下，bean的ID与带有@Bean注解的方法名是一样的。在本例中，bean的名字将会是sgtPeppers。如果你想为其设置成一个不同的名字的话，那么可以重命名该方法，也可以通过name属性指定一个不同的名字
    @Bean(name = "lonelyHeartsClubBrand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    //看起来，CompactDisc是通过调用sgtPeppers()得到的，但情况并非完全如此。因为sgtPeppers()方法上添加了@Bean注解，Spring将会拦截所有对它的调用，并确保直接返回该方法所创建的bean，而不是每次都对其进行实际的调用
    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public MediaPlayer anothorCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }


    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    @Bean
    public CDPlayer anothorCDPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
