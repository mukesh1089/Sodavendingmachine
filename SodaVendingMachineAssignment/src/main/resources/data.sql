 DROP TABLE IF EXISTS Item;
 CREATE TABLE Item (
  name VARCHAR(250) ,
  cost INT,
  quantity INT
);


INSERT INTO Item (`name`, `cost`, `quantity`)
			  VALUES('Cocke', 1.15, 3),
                    ('Pepsi', 1.00, 6),
                    ('Fata', .95, 12),
                    ('ThumsUp', .78, 8),
                    ('Appy', 2.45, 3);
