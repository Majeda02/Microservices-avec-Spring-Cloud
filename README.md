## "# Microservices-avec-Spring-Cloud" 
### Objectifs
* Comprendre les apports concrets de Spring Cloud pour les microservices.
* Distinguer les briques: Eureka (découverte), Config (configuration), Gateway (routage), Résilience (circuit breaker).
* Savoir où ces briques s’intègrent et comment elles se complètent.

### Architecture du TP

#### Microservices
- **SERVICE-CLIENT** : gestion des clients (CRUD, H2 en mémoire, port `8088`)
- **SERVICE-VOITURE** : gestion des voitures et communication avec SERVICE-CLIENT via **OpenFeign** (port `8089`)
- **Eureka Server** : registre des services pour la découverte dynamique (port `8761`)
- **API Gateway** : point d’entrée unique et routage vers les services (port `8888`)

#### Concepts Clés
- Services autonomes et indépendants
- Communication légère : HTTP/REST
- Isolation des données : chaque service possède son propre stockage
- Scalabilité horizontale via load balancing

#### Spring Cloud en Bref
- **Découverte de services** : enregistrement et lookup dynamique (Eureka)
- **Routage et agrégation** : API Gateway
- **Configuration centralisée** : Spring Cloud Config
- **Résilience** : Circuit Breaker, timeouts, retries (Resilience4j)
- **Observabilité** : Sleuth/Zipkin, health checks (Actuator)

### Eureka Server
<img width="1919" height="952" alt="Capture d&#39;écran 2025-12-01 093322" src="https://github.com/user-attachments/assets/fb3a8de7-de4c-4daa-a99e-fc465a0d8112" />
<img width="1919" height="961" alt="Capture d&#39;écran 2025-12-01 093537" src="https://github.com/user-attachments/assets/9b0d1ae3-db62-429b-a2a9-5dac7d6b1f72" />

### SERVICE-CLIENT
<img width="1919" height="956" alt="Capture d&#39;écran 2025-12-01 093918" src="https://github.com/user-attachments/assets/7698ffb6-fa35-410b-8391-312ab20be1ca" />
<img width="1915" height="953" alt="Capture d&#39;écran 2025-12-01 094533" src="https://github.com/user-attachments/assets/9a8998aa-5a83-4547-9e16-2a39f14c483a" />
<img width="1919" height="956" alt="Capture d&#39;écran 2025-12-01 094551" src="https://github.com/user-attachments/assets/05803b67-6106-4a5e-8005-5534b95051de" />
<img width="1919" height="953" alt="Capture d&#39;écran 2025-12-01 094614" src="https://github.com/user-attachments/assets/645b02c5-f430-454a-9252-5cac14304457" />

### Gateway
<img width="1917" height="953" alt="Capture d&#39;écran 2025-12-01 094938" src="https://github.com/user-attachments/assets/d50f33e3-e3cb-48d0-b800-9a504250538f" />
<img width="1919" height="951" alt="Capture d&#39;écran 2025-12-01 095343" src="https://github.com/user-attachments/assets/ef2a7ecd-1d58-4866-82f7-7e9b6e07a7cc" />
<img width="1919" height="959" alt="Capture d&#39;écran 2025-12-01 100017" src="https://github.com/user-attachments/assets/dcdebb3c-2f06-4da2-85cd-5c66063c84c9" />
<img width="1919" height="1006" alt="Capture d&#39;écran 2025-12-01 100129" src="https://github.com/user-attachments/assets/bb42dd55-7f68-41b1-8f7e-8428bf41da5a" />
<img width="1919" height="957" alt="Capture d&#39;écran 2025-12-01 104354" src="https://github.com/user-attachments/assets/9cfb95fa-553a-4cf5-92c1-86eaa798afab" />
<img width="1919" height="952" alt="Capture d&#39;écran 2025-12-01 104522" src="https://github.com/user-attachments/assets/797ffbff-94bc-48a6-9b66-80c70772ee59" />

### SERVICE-VOITURE
<img width="660" height="545" alt="Capture d&#39;écran 2025-12-01 122857" src="https://github.com/user-attachments/assets/9ab19df3-62dd-44f1-9737-b97a3b3a1d17" />
<img width="1919" height="1010" alt="Capture d&#39;écran 2025-12-01 195247" src="https://github.com/user-attachments/assets/c5182706-5ea1-4823-a735-3c0ce89f2868" />
<img width="1919" height="953" alt="Capture d&#39;écran 2025-12-01 195005" src="https://github.com/user-attachments/assets/546158f6-3cbc-4f62-aa97-a0b304f22dc6" />
<img width="1919" height="952" alt="Capture d&#39;écran 2025-12-01 201615" src="https://github.com/user-attachments/assets/a5d6703a-3c9b-4995-a2a5-36a73e047277" />
<img width="1919" height="954" alt="Capture d&#39;écran 2025-12-01 201914" src="https://github.com/user-attachments/assets/2aeb6ce4-4acc-4ab9-ac41-7106f5429df1" />








