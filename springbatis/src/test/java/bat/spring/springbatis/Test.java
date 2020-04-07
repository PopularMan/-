package bat.spring.springbatis;

import bat.spring.springbatis.config.SpringConfig;
import bat.spring.springbatis.dao.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 上午10:41 2020/4/7
 * Created By CC.Z
 * Version:1.0.
 */



public class Test {
	@org.junit.Test
	public void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(context.getBean("dataSource"));
		UserMapper userMapper = context.getBean(UserMapper.class);
		System.out.println(userMapper.findAll().get(0).getName());
	}
}
