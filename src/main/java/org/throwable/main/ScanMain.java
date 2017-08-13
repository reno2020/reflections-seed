package org.throwable.main;

import org.reflections.Reflections;
import org.reflections.scanners.*;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.throwable.annotation.Bean;
import org.throwable.annotation.Configuration;
import org.throwable.annotation.Service;

import javax.persistence.Id;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/8/13 17:29
 */
public class ScanMain {

	public static void main(String[] args) {
		String targetPackage = "org.throwable";
		Reflections reflections = new Reflections(
				new ConfigurationBuilder()
				.setUrls(ClasspathHelper.forPackage(targetPackage))
				.setScanners(
						new SubTypesScanner(),
						new TypeAnnotationsScanner(),
						new MethodAnnotationsScanner(),
						new FieldAnnotationsScanner(),
						new MethodParameterScanner(),
						new MethodParameterNamesScanner()
				)
		);
		Set<Class<?>> configurationClasses = reflections.getTypesAnnotatedWith(Configuration.class);
		Set<Class<?>> serviceClasses = reflections.getTypesAnnotatedWith(Service.class);
		Set<Method> beanMethods = reflections.getMethodsAnnotatedWith(Bean.class);
		Set<Field> ids = reflections.getFieldsAnnotatedWith(Id.class);
		System.out.println("success");
	}
}
