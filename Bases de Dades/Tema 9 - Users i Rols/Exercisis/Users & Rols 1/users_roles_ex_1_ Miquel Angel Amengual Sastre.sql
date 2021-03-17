-- ex1
# mysql -u root -p;

-- ex2
use centers;

-- ex3
show tables from centers;

-- ex4
select * from mysql.user;
select * from activity;
select * from material;
select * from material_external;
select * from material_internal;
select * from plant;
select * from routing;
select * from work_center;

-- ex 5
show grants for centers;

-- ex6
show grants for 'root'@'localhost';

-- ex7
SHOW FULL PROCESSLIST;

-- Ex8: Es caracter comodi % es el que engloba tots els dominis

-- ex9
create user 'mamengual'@'localhost' identified by '9876';
grant all privileges on *.* to 'mamengual'@'localhost';
flush privileges; -- saving all the changes

-- ex10
Show grants for 'mamengual'@'localhost';

-- ex11
create user 'guest_user'@'localhost' identified by '9876';
grant select on *.* to 'guest_user'@'localhost';
grant update on *.* to 'guest_user'@'localhost';
grant view on *.* to 'guest_user'@'localhost';

-- ex12
Show grants for 'guest_user'@'localhost';

-- ex13
rename user 'guest_user'@'localhost' to 'limited_user'@'localhost';

-- ex14
revoke update on *.* from 'limited_user'@'localhost';

-- ex15
Show grants for 'limited_user'@'localhost';
-- ex16
revoke select on *.* from 'limited_user'@'localhost';
revoke view on *.* from 'limited_user'@'localhost';

-- ex17
drop user limited_user;

-- ex 18
create user 'developer_user'@'localhost' identified by '9876';
grant select on *.* to 'developer_user'@'localhost';
grant update on *.* to 'developer_user'@'localhost';
grant view on *.* to 'developer_user'@'localhost';
grant insert on *.* to 'developer_user'@'localhost';
grant tables on *.* to 'developer_user'@'localhost';
grant alter on *.* to 'developer_user'@'localhost';

-- ex19
show grants for 'developer_user'@'localhost';
-- ex20
rename user 'developer_user'@'localhost' to 'dev_user'@'localhost';

-- ex21
revoke view on *.* from 'dev_user'@'localhost';

-- ex22
show grants for 'dev_user'@'localhost';

-- ex23
revoke update on *.* from 'dev_user'@'localhost';
revoke alter on *.* from 'dev_user'@'localhost';

-- ex24
drop user dev_user;