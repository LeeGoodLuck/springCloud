package com.leeluck.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
/**
 * 	自定义的算法
 * @author Administrator
 *
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
//		return new RoundRobinRule();  //测试定义的是随机算法
		return new RandomRule_lee();
	}
}
