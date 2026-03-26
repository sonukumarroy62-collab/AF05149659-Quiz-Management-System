package com.app;

import java.sql.*;   // 🔥 IMPORTANT
import java.util.*;

public class QuestionDAO {

    public List<Question> getAllQuestions() {
        List<Question> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            if (con == null) {
                System.out.println("❌ Database not connected!");
                return list;
            }

            String sql = "SELECT * FROM questions";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Question q = new Question(
                        rs.getInt("id"),
                        rs.getString("question"),
                        rs.getString("option1"),
                        rs.getString("option2"),
                        rs.getString("option3"),
                        rs.getString("option4"),
                        rs.getInt("correct_answer")
                );
                list.add(q);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return list;
    }
}