-- Activity1
--CREATE TABLE salesman(salesman_id int, salesman_name varchar(32), salesman_city varchar(32), commission int);
--DESCRIBE salesmen;

--Activity2


  INSERT  INTO salesman VALUES(5009, 'james jack', 'New York',18);
  INSERT  INTO salesman VALUES(5002, 'Nail Knite','Paris',13);
  INSERT  INTO salesman VALUES(5005, 'Pit Alex','London',11);
  INSERT  INTO salesman VALUES(5005, 'Chandra','Bangalore',17);


Select * from salesmen;

-- Activity 3
SELECT salesman_id, salesman_city FROM salesman;
SELECT * FROM salesmen WHERE salesman_city='Paris';
SELECT salesman_id, commission FROM salesmen WHERE salesman_name='Paul Adam';

-- Activity4
ALTER TABLE salesmen ADD grade int;
UPDATE salesmen SET grade=100;
SELECT * FROM salesmen;

-- Activity5
UPDATE salesmen SET grade = 200 WHERE SALESMAN_CITY = 'Bangalore';
UPDATE salesmen SET grade = 300 WHERE SALESMAN_NAME = 'james hoong';
UPDATE salesmen SET SALESMAN_NAME = 'Pierra' WHERE SALESMAN_NAME = 'Chandra';

SELECT * FROM salesmen;