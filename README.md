API para el alta de tarjetas
Este es un proyecto de API desarrollado en Java Spring Boot para el alta de tarjetas de crédito.

Requerimientos
Java 8 o superior
Maven
MySQL
Configuración
Clonar el repositorio:


git clone https://github.com/tu-usuario/tu-repositorio.git
Importar el proyecto en tu IDE favorito.

Crear la base de datos en MySQL con el nombre tarjetas_db.

Configurar las credenciales de la base de datos en el archivo application.properties.


spring.datasource.url=jdbc:mysql://localhost:3306/tarjetas_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
Compilar y ejecutar el proyecto:


mvn spring-boot:run
Endpoints
Crear tarjeta

POST /tarjetas
Crea una nueva tarjeta de crédito.

Request

{
"nombre": "Juan Perez",
"numero": "1234567812345678",
"cvv": "123",
"fecha_expiracion": "2025-12-31"
}
Response

{
"id": 1,
"nombre": "Juan Perez",
"numero": "************5678",
"cvv": "***",
"fecha_expiracion": "2025-12-31"
}
Obtener tarjeta

GET /tarjetas/{id}
Obtiene una tarjeta de crédito por ID.

Response

{
"id": 1,
"nombre": "Juan Perez",
"numero": "************5678",
"cvv": "***",
"fecha_expiracion": "2025-12-31"
}
Actualizar tarjeta

PUT /tarjetas/{id}
Actualiza una tarjeta de crédito por ID.

Request

{
"nombre": "Juan Perez",
"numero": "1234567812345678",
"cvv": "123",
"fecha_expiracion": "2026-12-31"
}

Response

{
"id": 1,
"nombre": "Juan Perez",
"numero": "************5678",
"cvv": "***",
"fecha_expiracion": "2026-12-31"
}

Eliminar tarjeta


DELETE /tarjetas/{id}
Elimina una tarjeta de crédito por ID.