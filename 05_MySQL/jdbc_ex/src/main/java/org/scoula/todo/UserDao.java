package org.scoula.todo;

public interface UserDao {
    UserVo loginUser(String user_id, String password);
}
