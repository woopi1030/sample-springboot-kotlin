## 참고

- [HealchController]
  - [@Value("\${profile}") private val profile: String] 에서 $앞에 이스케이프 문자를 사용하는 이유 
    - `$ 기호는 Kotlin에서 문자열 템플릿을 나타내는 특수 문자이기 때문에, 실제로 $를 사용하려면 역슬레시(\)를 사용하여 이스케이프 해야 함
    - 만약 역슬레시를 사용하지 않으면 Kotlin은 ${profile}을 변수로 해석하려고 시도할 것이고, 이는 의도한 동작이 아니게 됨 
    - `\(역슬래시)를 넣어야 Spring이 ${profile}을 프로퍼티 값으로 올바르게 해석할 수 있음