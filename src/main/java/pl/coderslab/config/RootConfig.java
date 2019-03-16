package pl.coderslab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebConfig.class, DbConfig.class})
public class RootConfig {


}
