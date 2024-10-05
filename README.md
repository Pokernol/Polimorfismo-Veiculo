# **Sistema de Cadastro de Veículos 🚗🏍️**

### **Descrição 📄:**

Este projeto em Java demonstra a aplicação de conceitos de programação orientada a objetos, como herança, polimorfismo e abstração, para criar um sistema de cadastro de veículos (carros e motos). O sistema permite inserir diferentes tipos de veículos e listar suas características, ajustando os preços com base em critérios específicos para cada tipo.

### **Estrutura do Projeto 🏗️:**

- **Pacotes 📦:**
  - `br.com.fatecmogidascruzes.server`: Contém a classe principal `Main` para execução do programa.
  - `br.com.fatecmogidascruzes.model.entity`: Contém as classes relacionadas aos veículos, como `Veiculo`, `Carro` e `Moto`.
- **Classes 📚:**
  - **Veiculo:** Classe abstrata que representa um veículo genérico, com atributos como modelo e preço.
  - **Carro:** Classe concreta que herda de `Veiculo` e define características específicas de carros, como quilometragem.
  - **Moto:** Classe concreta que herda de `Veiculo` e define características específicas de motos, como ano de fabricação.

### **Funcionalidades ⚙️:**

- **Cadastro de veículos 📝:** O sistema permite cadastrar veículos do tipo carro e moto. Cada tipo de veículo possui suas próprias características (quilometragem para carros e ano de fabricação para motos).
- **Listagem de veículos 📋:** O sistema exibe as informações de todos os veículos cadastrados.
- **Ajuste de preços 💲:** Após o cadastro dos veículos, o sistema faz uma análise:
  - Para motos fabricadas a partir de 2008, o preço será ajustado em 10%.
  - Para carros com mais de 100.000 km rodados, o preço será reduzido em 8%.
  - O total dos preços é recalculado e exibido após esses ajustes.

### **Como executar 🚀:**

1. **Compilar:** Utilize um compilador Java para compilar as classes.
1. **Executar:** Execute a classe `Main`.
1. **Operações disponíveis 🔧:**
  - Inserir um carro.
  - Inserir uma moto.
  - Listar todos os veículos cadastrados e visualizar suas características.
  - Recalcular e ajustar os preços de acordo com as regras do sistema.

### **Próximos passos 🛤️:**

- **Implementar mais tipos de veículos 🚚:** Adicionar outros tipos de veículos, como caminhões ou bicicletas.
- **Persistência de dados 💾:** Permitir a gravação dos dados em um banco de dados para que os veículos cadastrados sejam armazenados permanentemente.
- **Interface gráfica 🖥️:** Utilizar uma biblioteca como JavaFX para criar uma interface gráfica mais amigável.

### **Observações 📝:**

- Este projeto visa demonstrar os conceitos de herança e polimorfismo, aplicados ao cadastro e gestão de veículos.
- O sistema pode ser expandido para suportar mais funcionalidades e tipos de veículos.