INSERT INTO user(name, email, password) VALUES ('Nina Brown', 'nina@teste.com', 'adminadmin');
INSERT INTO user(name, email, password) VALUES ('Leila Red', 'leila@teste.com', 'adminadmin');

INSERT INTO role(role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role(role_name) VALUES ('ROLE_ADMIN');

INSERT INTO user_role(user_id, role_id) VALUES (1, 1);
INSERT INTO user_role(user_id, role_id) VALUES (2, 1);
INSERT INTO user_role(user_id, role_id) VALUES (2, 2);