Create database BikeDB;

use BikeDB;

CREATE TABLE
    bike
    (id BIGINT NOT NULL,
        contact BOOLEAN NOT NULL,
        email varchar(30) ,
        model VARCHAR(30) ,
		name VARCHAR(30) ,
        phone VARCHAR(30) ,
        purchase_date DATETIME,
        purchase_price NUMERIC,
        serial_number VARCHAR(30) ,
        PRIMARY KEY (id) );

CREATE TABLE
    hibernate_sequence
    (
        next_val BIGINT
    );

INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (1, 1, 'jeff@bikes.com', 'Globo MTB 29 Full Suspension', 'Jeff Miller', '328-443-5555', '2016-03-13 02:32:21', '1100');
INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (2, 0, 'samantha@bikes.com', 'Globo Carbon Fiber Race Series', 'Samantha Davis', '448-397-5555', '2016-03-13 02:32:21', '1999');
INSERT INTO bike (id, contact, email, model, name, phone, purchase_date, purchase_price)
  VALUES (3, 1, 'dave@bikes.com', 'Globo Time Trial Blade', 'Dave Warren', '563-891-5555', '2016-03-13 02:32:21', '2100');

INSERT INTO hibernate_sequence (next_val) VALUES (4);


select * from bikes; 


