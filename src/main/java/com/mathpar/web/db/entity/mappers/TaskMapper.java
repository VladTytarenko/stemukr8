package com.mathpar.web.db.entity.mappers;

import com.mathpar.web.db.entity.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int i) throws SQLException {
        Task task = new Task();
        task.id = rs.getLong("id");
        task.taskTitle = rs.getString("task_title");
        task.task = rs.getString("task");
        return null;
    }
}
