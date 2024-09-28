# **Sistema de Cadastro de Classes Abstratas**

### **Descrição:**

Este projeto em Java demonstra a aplicação de conceitos de programação orientada a objetos, como herança, polimorfismo e abstração, para criar um sistema simples de cadastro de animais e clientes.

### **Estrutura do Projeto:**

- **Pacotes:**
  - `br.com.fatecmogidascruzes.server`: Contém a classe principal `Main` para execução do programa.
  - `br.com.fatecmogidascruzes.entityAnimal`: Contém as classes relacionadas aos animais, como `Animal`, `Mamifero`, `Ave`, `Cachorro` e `Coruja`.
  - `br.com.fatecmogidascruzes.entityCliente`: Contém as classes relacionadas aos clientes, como `Cliente`, `PessoaFisica` e `PessoaJuridica`.
- **Classes:**
  - **Animal:** Classe abstrata que representa um animal de forma genérica.
  - **Mamifero:** Classe abstrata que herda de `Animal` e define características específicas de mamíferos.
  - **Ave:** Classe abstrata que herda de `Animal` e define características específicas de aves.
  - **Cachorro e Coruja:** Classes concretas que herdam de `Mamifero` e `Ave`, respectivamente, e implementam seus métodos específicos.
  - **Cliente:** Classe abstrata que representa um cliente de forma genérica.
  - **PessoaFisica e PessoaJuridica:** Classes concretas que herdam de `Cliente` e definem características específicas de cada tipo de cliente.

### **Funcionalidades:**

- **Cadastro de animais:** Permite criar objetos de diferentes tipos de animais (cachorro, coruja) e exibir suas características.
- **Cadastro de clientes:** Permite criar objetos de diferentes tipos de clientes (pessoa física, pessoa jurídica) e exibir suas informações.
- **Herança e polimorfismo:** Demonstra o uso de herança para criar hierarquias de classes e polimorfismo para tratar objetos de diferentes tipos de forma uniforme.
- **Abstração:** Utiliza classes abstratas para representar conceitos genéricos (Animal, Cliente).

### **Como executar:**

1. **Compilar:** Utilize um compilador Java para compilar as classes.
1. **Executar:** Execute a classe `Main`.
1. **Selecionar opção:** Escolha entre testar animais ou clientes.

### **Próximos passos:**

- **Implementar mais funcionalidades:** Adicionar métodos para calcular a idade de um animal, realizar operações bancárias para clientes, etc.
- **Criar uma interface gráfica:** Utilizar uma biblioteca como Swing ou JavaFX para criar uma interface mais amigável.
- **Utilizar um banco de dados:** Permitir a persistência dos dados dos animais e clientes.
- **Melhorar a validação de dados:** Implementar validações mais robustas para garantir a integridade dos dados.

### **Observações:**

- Este é um exemplo simples para demonstrar os conceitos de programação orientada a objetos.
- O código pode ser expandido e personalizado para atender a necessidades específicas.
- É importante seguir os princípios da programação orientada a objetos, como encapsulamento, herança e polimorfismo.
