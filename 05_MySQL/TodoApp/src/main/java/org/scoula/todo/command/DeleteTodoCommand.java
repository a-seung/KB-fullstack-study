package org.scoula.todo.command;

import org.scoula.lib.cli.ui.Input;
import org.scoula.todo.dao.TodoListDao;


public class DeleteTodoCommand {
    TodoListDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        int id = Input.getInt("삭제할 Todo Id: ");
        dao.delete(id);

        System.out.println();
    }
}
