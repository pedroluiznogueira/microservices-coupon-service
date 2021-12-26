insert into coupon (id,code,discount,exp_date)
values(default,'SUPERSALE',20,'2021');
insert into coupon (id,code,discount,exp_date)
values(default,'SUPERSALEE',40,'2022');
insert into coupon (id,code,discount,exp_date)
values(default,'SUPERSALEEE',30,'2042');
insert into coupon (id,code,discount,exp_date)
values(default,'SUPERSALEEEE',50,'2022');

insert into user(first_name,last_name,email,password)
values ('doug','bailey','doug@bailey.com','$2a$10$U2STWqktwFbvPPsfblVeIuy11vQ1S/0LYLeXQf1ZL0cMXc9HuTEA2');
insert into user(first_name,last_name,email,password)
values ('john','ferguson','john@ferguson.com','$2a$10$YzcbPL.fnzbWndjEcRkDmO1E4vOvyVYP5kLsJvtZnR1f8nlXjvq/G');

insert into role values(1,'ROLE_ADMIN');
insert into role values(2,'ROLE_USER');

insert into user_role values(1,1);
insert into user_role values(2,2);