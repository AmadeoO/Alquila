DROP TABLE IF EXISTS Inmueble;

CREATE TABLE Inmueble(
    id_inmueble varchar(64) PRIMARY KEY AUTO_INCREMENT,
    direccion varchar(200),
    detalles_legales varchar(200),
    detalles_inmueble varchar(200),
    otros_detalles varchar(200),
    tipo_inmueble varchar(30),
    precio float(10)
)
