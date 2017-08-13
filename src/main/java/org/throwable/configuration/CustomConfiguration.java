package org.throwable.configuration;

import org.throwable.annotation.Bean;
import org.throwable.annotation.Configuration;
import org.throwable.service.CustomBean;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/8/13 17:28
 */
@Configuration
public class CustomConfiguration {

	@Bean(name = {"customBean", "myBean"})
	public CustomBean customBean() {
		return new CustomBean();
	}
}
