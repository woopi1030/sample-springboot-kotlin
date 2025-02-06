# sample-springboot-kotlin
sample-springboot-kotlin

- ### package 구조
root-project  
│── module-core        # 공통 유틸 및 기본 기능 모듈  
│  
│── module-domain      # 도메인 모델 및 JPA 엔티티 모듈 (module-core 의존)  
│   └── (module-core)  
│  
│── module-service-a   # 특정 서비스 A (module-domain 의존)  
│   └── (module-domain)  
│  
│── module-service-b   # 특정 서비스 B (module-domain 의존)  
│   └── (module-domain)  
│  
│── module-service-c   # 특정 서비스 C (module-domain 의존)  
│   └── (module-domain)  
│  
│── module-api         # API 계층 (각 서비스 모듈 의존)  
│   ├── (module-service-a)  
│   ├── (module-service-b)  
│   ├── (module-service-c)  


