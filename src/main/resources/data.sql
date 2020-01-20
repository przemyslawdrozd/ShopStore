INSERT INTO customer VALUES(1, 'Ann', 'Smith', 'ann@gmail.com');
INSERT INTO customer VALUES(2, 'Boi', 'Tim', 'boi@gmail.com');
INSERT INTO customer VALUES(3, 'Alfred', 'Kijno', 'boi@gmail.com');
INSERT INTO customer VALUES(4, 'User', 'uu', 'boi@gmail.com');

INSERT INTO cust_order VALUES(1, CURRENT_DATE);
INSERT INTO cust_order VALUES(2, CURRENT_DATE);
INSERT INTO cust_order VALUES(3, CURRENT_DATE);

INSERT INTO item VALUES(1, CURRENT_DATE, 'orange', 3.15, 3, 1);
INSERT INTO item VALUES(2, '2010-12-09', 'apple', 3.45, 5, 1);
INSERT INTO item VALUES(3, CURRENT_DATE, 'cherry', 3.15, 1, 2);
INSERT INTO item VALUES(4, CURRENT_DATE, 'nuts', 3.15, 1, 2);
INSERT INTO item VALUES(5, CURRENT_DATE, 'beer', 3.15, 1, 1);
INSERT INTO item VALUES(6, CURRENT_DATE, 'chess', 3.15, 1, 3);

INSERT INTO employee VALUES(1, 'admin', '123');