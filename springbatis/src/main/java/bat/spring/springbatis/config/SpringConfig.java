package bat.spring.springbatis.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 上午9:31 2020/4/7
 * Created By CC.Z
 * Version:1.0.
 */
@Configuration
@ComponentScan(basePackages = { "bat.spring.springbatis"})
@MapperScan("bat.spring.springbatis.dao")
public class SpringConfig {

	@Bean("dataSource")
	DataSource mysqlDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("admin");
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		return  dataSource;
	}

	@Bean
	SqlSessionFactoryBean sqlSessionFactory() throws PropertyVetoException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(mysqlDataSource());
		return sqlSessionFactoryBean;
	}

}
