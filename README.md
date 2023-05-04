# mfood

Microserviços de pedidos e pagamentos com seus banco de dados isolados.

### Service discovery  
Registra serviços no servidor. Para que ao receber a requisição do gateway, direcione o serviço certo. Fazendo o balanceamento de carga quando tiver mais de uma instância desse serviço no mesmo instante.

### Comunicação síncrona 
Open feign 

### Circuit breaker e fallback  
Resilience4j

### Migrations 
Flywaydb

#### Fonte: https://cursos.alura.com.br/course/microsservicos-implementando-java-spring
