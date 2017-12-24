package com.mathpar.web.db.dao;

import com.mathpar.web.db.entity.EduGroup;
import com.mathpar.web.db.entity.Subject;
import com.mathpar.web.db.entity.mappers.EduGroupMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DbGroups {


    private NamedParameterJdbcTemplate jdbcTpl;

    public void save(Subject subj) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", subj.getSubjectName());
        parameters.put("teacher_id", subj.getTeacherId());
        jdbcTpl.update("INSERT INTO subject(name, teacher_id) VALUES (:name, :teacher_id)", parameters);
    }

    public List<EduGroup> getGroups() {
        //String sql = ;
        return jdbcTpl.query("SELECT * FROM edu_groups", new EduGroupMapper());
    }

    /*public static void main(String[] args) {
        DbGroups dbs = new DbGroups();
        dbs.save(new Subject(1, 1, "Mathththt"));
        //System.out.println(lsb.isEmpty());
    }*/

    public static void main(String[] args) {
        DbGroups dbg = new DbGroups();
        List<EduGroup> edl = dbg.getGroups();
        if (edl.isEmpty())
            System.out.println( "empty");
        else
            System.out.println("not empty");
    }

}