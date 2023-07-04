-- Table: authors
CREATE TABLE authors (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    biography TEXT
);

-- Table: books
CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    author_id INT,
    price DECIMAL(8,2),
    publication_date DATE,
    FOREIGN KEY (author_id) REFERENCES authors(id)
);

-- Table: customers
CREATE TABLE customers (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

-- Table: orders
CREATE TABLE orders (
    id INT PRIMARY KEY,
    customer_id INT,
    book_id INT,
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (book_id) REFERENCES books(id)
);
