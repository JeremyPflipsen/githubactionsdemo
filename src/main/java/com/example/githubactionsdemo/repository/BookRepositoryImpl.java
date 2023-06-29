package com.example.githubactionsdemo.repository;

import com.example.githubactionsdemo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM books WHERE id = ?";
        Object[] params = {id};

        // RowMapper to map the query result to a Book object
        RowMapper<Book> rowMapper = (resultSet, rowNum) -> {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setTitle(resultSet.getString("title"));
            book.setAuthorId(resultSet.getInt("author_id"));
            book.setPrice(resultSet.getBigDecimal("price"));
            book.setPublicationDate(resultSet.getDate("publication_date"));
            return book;
        };

        // Execute the query and return the book
        return jdbcTemplate.queryForObject(sql, params, rowMapper);
    }

}
