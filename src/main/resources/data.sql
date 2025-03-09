INSERT INTO PERSONA (identificacion,nombre,genero,edad,direccion,telefono) VALUES (1234,'ABC ASD','MASCULINO',1,'QUITO','099888');
INSERT INTO CLIENTE (id,clave,estado,identificacion) VALUES (1,'1234','ACT',1234);
INSERT INTO CUENTA (id_cuenta,numero_cuenta,tipo_cuenta,saldo_cuenta,estado_cuenta,id) VALUES (1,'C-001','CORRIENTE',100,'ACT',1);
INSERT INTO CUENTA (id_cuenta,numero_cuenta,tipo_cuenta,saldo_cuenta,estado_cuenta,id) VALUES (2,'A-001','AHORRO',50,'ACT',1);
INSERT INTO MOVIMIENTO (id_movimiento, fecha, saldo, tipo_movimiento, valor, id_cuenta) VALUES (1,NOW(),100,'DEPOSITO',50,1);
