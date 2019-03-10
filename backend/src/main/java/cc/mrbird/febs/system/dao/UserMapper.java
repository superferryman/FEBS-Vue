package cc.mrbird.febs.system.dao;

import cc.mrbird.febs.system.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

	IPage<List<User>> findUserDetail(Page page, @Param("query") User user);

	List<User> findUserDetail(@Param("query") User user);
}