package com.kylexu.springlearn.ch3.confuse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
@Qualifier("code")
public class IceCream implements Dessert {
}
