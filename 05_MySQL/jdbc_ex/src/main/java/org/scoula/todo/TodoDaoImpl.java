package org.scoula.todo;

import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class TodoDaoImpl implements TodoDao {
    private final Connection conn;

    public TodoDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public int getTotalCount(String user_id) {
        String sql = "SELECT COUNT(*) FROM todo_user WHERE user_id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void getTodosByUserId(String user_id) {
        String sql = "SELECT * FROM todo WHERE user_id=?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            ArrayList<TodoVo> todos = new ArrayList<>();
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo = rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    TodoVo todoData = new TodoVo(id, userId, todo, is_completed, created_at);
                    todos.add(todoData);
                }
                System.out.println("===== " + user_id + "님의 Todo 전체 목록 =====");
                if (todos.size() > 0) {
                    todos.forEach((todo) -> System.out.println(todo));
                } else {
                    System.out.println("## 작성하신 Todo 목록이 없습니다. ##");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void getCompletedTodosByUserId(String user_id) {
        String sql = "SELECT * FROM todo_user WHERE user_id=? AND is_completed=1";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            ArrayList<TodoVo> todos = new ArrayList<>();
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("user_id");
                    String todo = rs.getString("todo");
                    boolean is_completed = rs.getBoolean("is_completed");
                    Timestamp created_at = rs.getTimestamp("created_at");

                    TodoVo todoData = new TodoVo(id, user_id, todo, is_completed, created_at);
                    todos.add(todoData);
                }
                System.out.println("===== " + user_id + "님의 Todo 전체 목록 =====");
                if (todos.size() > 0) {
                    todos.forEach((todo) -> System.out.println(todo));
                } else {
                    System.out.println("## 작성하신 Todo 목록이 없습니다. ##");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getUncompletedTodosUserId(String user_Id) {

    }

    @Override
    public void makeTodoCompleted(int id, String user_Id) {

    }

    @Override
    public void createTodo(String todo, String user_Id) {

    }

    @Override
    public void deleteTodo(int id, String user_Id) {

    }

    @Override
    public void getAllTodosWithUserName() {

    }
}
