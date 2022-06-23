package com.cftc.connect;

import com.cftc.connect.ConnectAuthApp;
import com.cftc.connect.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ConnectAuthApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
