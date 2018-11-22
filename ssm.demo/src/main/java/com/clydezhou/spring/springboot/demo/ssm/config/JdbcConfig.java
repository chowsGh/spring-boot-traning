package com.clydezhou.spring.springboot.demo.ssm.config;

/**
 * 单数据源两种配置方式
 */
@Deprecated
public class JdbcConfig {}
/*
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}*/

/*
//读取JDBC配置，并配置数据源
@Configuration
public class JdbcConfig {
  @Bean
  @ConfigurationProperties(prefix = "jdbc")
  public DataSource dataSource() {
      DruidDataSource dataSource = new DruidDataSource();
      return dataSource;
  }
}
*/
