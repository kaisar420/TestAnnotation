package util;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;


/**
 * Created by iparhan on 17-5-11.
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator KeyGenerator(){
      return  new KeyGenerator() {
          @Override
          public Object generate(Object o, Method method, Object... objects) {
                StringBuilder stringBuilder = new StringBuilder();

              return null;
          }
      };
    }


}
