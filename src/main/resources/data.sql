-- Insert authors
INSERT INTO authors (id, name, biography) VALUES
    (1, 'J.K. Rowling', 'British author best known for the Harry Potter series.'),
    (2, 'George Orwell', 'English novelist and essayist.');

-- Insert books
INSERT INTO books (id, title, author_id, price, publication_date) VALUES
    (1, 'Harry Potter and the Philosopher''s Stone', 1, 19.99, '1997-06-26'),
    (2, '1984', 2, 14.99, '1949-06-08');

-- Insert customers
INSERT INTO customers (id, name, email) VALUES
    (1, 'John Smith', 'john.smith@example.com'),
    (2, 'Alice Johnson', 'alice.johnson@example.com');

-- Insert orders
INSERT INTO orders (id, customer_id, book_id, order_date) VALUES
    (1, 1, 1, '2023-06-15'),
    (2, 2, 2, '2023-06-20');
