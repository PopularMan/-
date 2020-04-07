package bat.spring.springbatis.dao;

import bat.spring.springbatis.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

/**
 * 上午11:26 2020/4/7
 * Created By CC.Z
 * Version:1.0.
 */
@Mapper
public interface UserMapper extends JpaRepository<User, Integer> {

	@Select("select * from User")
	@Override
	public List<User> findAll();


}
