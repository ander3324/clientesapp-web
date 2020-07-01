insert into clientes(ape, nom, fec_nac) values('Ortiz', 'Ale', '1995-05-12');
insert into clientes(ape, nom, fec_nac) values('Lagarza', 'Marquinhos', '1998-03-31');
insert into clientes(ape, nom, fec_nac) values('Zalazar', 'Mariana', '1992-05-12');
insert into clientes(ape, nom, fec_nac) values('Ibarra', 'Lucas', '1996-05-12');

insert into permisos(permiso) values('ROLE_ADMIN');
insert into permisos(permiso) values('ROLE_USER');

insert into usuarios (usuario, clave, activo, fk_id_per) values('admin', '$2a$10$pJWiSdAKZBqMRJPVQ3LoGu9.UuCCMfYrslOl9299Rch24605Li27W', 1, 1);
insert into usuarios (usuario, clave, activo, fk_id_per) values('usuario', '$2a$10$nmsnELze.Ca7dMnsbfGIuuczJlKMAk9SGCkgDczmosj91zCAMsFoO', 1, 2);