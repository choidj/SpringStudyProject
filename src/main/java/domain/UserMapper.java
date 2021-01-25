package domain;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select(value = "select * from users")
    public List<User> getUserList();
}
