# METODOLOGIA ÁGIL SCRUM - SISTEMA DE EVENTOS

**Projeto:** Sistema de Gestão de Eventos  
**Curso:** Gestão de TI  
**Aluno:** Igor  
**Data:** Novembro/2025

---

## 1. INTRODUÇÃO AO SCRUM

O Scrum é uma metodologia ágil de desenvolvimento de software que organiza o trabalho em ciclos curtos chamados **Sprints**. Cada Sprint tem duração fixa (geralmente 1 a 4 semanas) e entrega uma parte funcional do produto.

### Principais Elementos do Scrum:

- **Sprint:** Ciclo de desenvolvimento com duração fixa (2 semanas neste projeto)
- **Product Backlog:** Lista completa de funcionalidades a serem desenvolvidas
- **Sprint Planning:** Reunião inicial para planejar o trabalho da Sprint
- **Daily Scrum:** Reunião diária de 15 minutos para sincronização da equipe
- **Sprint Review:** Apresentação do incremento funcional ao final da Sprint
- **Sprint Retrospective:** Análise do processo para melhorias contínuas

### Papéis no Scrum:

- **Product Owner:** Define prioridades e requisitos
- **Scrum Master:** Facilita o processo e remove impedimentos
- **Development Team:** Executa o trabalho de desenvolvimento

---

## 2. APLICAÇÃO NO PROJETO

Para o desenvolvimento do Sistema de Eventos, dividimos o trabalho em **2 Sprints de 2 semanas cada**, totalizando 4 semanas de desenvolvimento.

---

## SPRINT 1 - FUNDAÇÃO DO SISTEMA

**Duração:** Semanas 1 e 2  
**Objetivo:** Criar a base do sistema com autenticação e visualização de dados.

### Product Backlog Selecionado:

| ID | User Story | Prioridade |
|----|-----------|------------|
| US001 | Como usuário, quero fazer login no sistema para acessar minhas informações de forma segura | Alta |
| US002 | Como desenvolvedor, quero implementar o padrão MVC para organizar o código de forma profissional | Alta |
| US003 | Como usuário, quero ver um dashboard com estatísticas dos eventos para ter visão geral do sistema | Alta |

### Tarefas Executadas:

**Model (Camada de Dados):**
- ✅ Criação da classe `Usuario` com encapsulamento
- ✅ Criação da classe `Evento` com métodos de negócio
- ✅ Implementação do `UsuarioDAO` (Data Access Object)
- ✅ Dados de teste pré-cadastrados

**Controller (Camada de Lógica):**
- ✅ Desenvolvimento do `LoginController`
- ✅ Implementação da lógica de autenticação
- ✅ Validação de campos vazios
- ✅ Criação do `DashboardController`

**View (Camada de Apresentação):**
- ✅ Desenvolvimento da `LoginView` com interface gráfica
- ✅ Criação do `DashboardView` com cards estatísticos
- ✅ Implementação da navegação entre telas

**Testes:**
- ✅ Testes de login com credenciais válidas
- ✅ Testes de validação de campos
- ✅ Testes de navegação entre telas

### Entrega da Sprint 1:

✅ Sistema de login completamente funcional  
✅ Dashboard exibindo: total de eventos, ingressos vendidos e usuários cadastrados  
✅ Navegação fluida entre tela de login e dashboard  
✅ Interface profissional com cores e fontes adequadas  

### Definition of Done (Critérios de Conclusão):

- [x] Código compila sem erros
- [x] Funcionalidades testadas manualmente
- [x] Interface responsiva e intuitiva
- [x] Código comentado e organizado

### Retrospectiva da Sprint 1:

**O que funcionou bem:**
- A divisão em camadas MVC facilitou muito a organização do código
- Trabalho em duplas aumentou a qualidade do código
- Comunicação diária manteve todos alinhados

**O que pode melhorar:**
- Adicionar mais validações de dados de entrada
- Melhorar tratamento de exceções
- Criar testes automatizados

**Ações para próxima Sprint:**
- Implementar validações robustas
- Adicionar try-catch em pontos críticos
- Documentar melhor o código

---

## SPRINT 2 - RELATÓRIOS E REFINAMENTO

**Duração:** Semanas 3 e 4  
**Objetivo:** Implementar módulo de relatórios e aprimorar a experiência do usuário.

### Product Backlog Selecionado:

| ID | User Story | Prioridade |
|----|-----------|------------|
| US004 | Como gestor, quero visualizar relatórios detalhados dos eventos para tomar decisões estratégicas | Alta |
| US005 | Como usuário, quero ver os eventos em formato de tabela para facilitar a visualização | Alta |
| US006 | Como gestor, quero analisar o percentual de ocupação de cada evento para otimizar recursos | Média |
| US007 | Como usuário, quero uma interface mais profissional e intuitiva | Média |

### Tarefas Executadas:

**Controller:**
- ✅ Criação do `RelatorioController`
- ✅ Implementação do método `gerarRelatorioCompleto()`
- ✅ Cálculo de percentual de ocupação

**View:**
- ✅ Desenvolvimento da `RelatorioView`
- ✅ Implementação de tabela no Dashboard
- ✅ Formatação de dados (datas, percentuais)
- ✅ Melhoria visual geral da interface

**Refinamentos:**
- ✅ Adição de validações de campos vazios
- ✅ Melhorias nas cores e layout
- ✅ Implementação de botão "Sair"
- ✅ Ajustes de responsividade

**Documentação:**
- ✅ Comentários em todas as classes
- ✅ JavaDoc nos métodos principais
- ✅ README do projeto
- ✅ Diagramas UML

### Entrega da Sprint 2:

✅ Sistema completo com módulo de relatórios funcionando perfeitamente  
✅ Tabela interativa mostrando todos os eventos ativos  
✅ Relatórios detalhados com estatísticas completas  
✅ Interface visual profissional e intuitiva  
✅ Código totalmente documentado  
✅ Diagramas UML (Casos de Uso e Classes)  

### Definition of Done (Critérios de Conclusão):

- [x] Todas as funcionalidades implementadas
- [x] Código sem erros ou warnings
- [x] Interface testada em diferentes resoluções
- [x] Documentação completa
- [x] Diagramas UML criados
- [x] Projeto pronto para apresentação

### Retrospectiva da Sprint 2:

**O que funcionou bem:**
- Interface ficou muito profissional e agradável
- Relatórios entregam valor real para o usuário
- Equipe trabalhou de forma sincronizada
- Documentação ficou completa e clara

**O que pode melhorar:**
- Em futuras versões, adicionar banco de dados real (MySQL/PostgreSQL)
- Implementar persistência de dados
- Adicionar mais funcionalidades (cadastro de eventos, edição)
- Criar testes unitários automatizados

**Lições Aprendidas:**
- Planejamento é essencial para sucesso do projeto
- Comunicação diária evita retrabalho
- Divisão em Sprints facilita gerenciamento
- MVC torna código mais organizado e manutenível

---

## 3. CERIMÔNIAS SCRUM REALIZADAS

### 📋 Sprint Planning (Início de cada Sprint)

**Objetivo:** Definir o trabalho da Sprint

**Atividades:**
1. Revisão do Product Backlog
2. Seleção dos itens prioritários
3. Estimativa de esforço
4. Definição da meta da Sprint
5. Criação do Sprint Backlog

**Resultado Sprint 1:** Definidos 3 User Stories principais (US001, US002, US003)  
**Resultado Sprint 2:** Definidos 4 User Stories (US004, US005, US006, US007)

---

### 🗣️ Daily Scrum (Diariamente - 15 minutos)

**Formato:** Reunião em pé (stand-up meeting)

**Três perguntas respondidas por cada membro:**
1. O que fiz ontem?
2. O que farei hoje?
3. Há algum impedimento?

**Exemplo de Daily:**
- Membro 1: "Ontem implementei o LoginController. Hoje vou trabalhar no DashboardView. Sem impedimentos."
- Membro 2: "Ontem criei as classes Model. Hoje vou fazer os testes. Preciso de ajuda com validações."

---

### 🎯 Sprint Review (Final de cada Sprint)

**Objetivo:** Demonstrar o incremento funcional

**Atividades:**
1. Demonstração do produto funcionando
2. Validação com stakeholders
3. Feedback e ajustes
4. Atualização do Product Backlog

**Review Sprint 1:**
- ✅ Login funcionando perfeitamente
- ✅ Dashboard com estatísticas
- ✅ Navegação entre telas

**Review Sprint 2:**
- ✅ Relatórios completos
- ✅ Tabela de eventos
- ✅ Interface profissional
- ✅ Documentação completa

---

### 🔄 Sprint Retrospective (Final de cada Sprint)

**Objetivo:** Melhorar o processo continuamente

**Formato:** Start/Stop/Continue

**Sprint 1 Retrospective:**
- **Start:** Validações mais robustas, testes automatizados
- **Stop:** Commits muito grandes
- **Continue:** Daily meetings, pair programming

**Sprint 2 Retrospective:**
- **Start:** Banco de dados real, mais funcionalidades
- **Stop:** Deixar documentação para o final
- **Continue:** Padrão MVC, interface profissional

---

## 4. CONCEITOS DE POO APLICADOS

### 🏗️ Classes e Objetos

Criamos classes para representar entidades do sistema:
- `Usuario`: Representa um usuário do sistema
- `Evento`: Representa um evento cadastrado
- `UsuarioDAO`: Gerencia acesso aos dados

**Exemplo de Criação de Objeto:**
```java
Usuario usuario = new Usuario(1, "Igor", "igor@email.com", "123", "admin");
```

---

### 🔒 Encapsulamento

Todos os atributos são **privados** com acesso controlado por **getters e setters**:
```java
private String nome;  // Atributo privado

public String getNome() {  // Getter público
    return nome;
}

public void setNome(String nome) {  // Setter público
    this.nome = nome;
}
```

**Benefícios:**
- Proteção dos dados internos
- Controle de acesso
- Facilita manutenção

---

### 🏗️ Construtores

Cada classe possui construtores para facilitar a criação de objetos:

**Construtor Padrão:**
```java
public Usuario() {
}
```

**Construtor Parametrizado:**
```java
public Usuario(int id, String nome, String email, String senha, String tipo) {
    this.id = id;
    this.nome = nome;
    // ...
}
```

---

### ⚙️ Métodos

Métodos implementam comportamentos específicos:

**Métodos de Negócio:**
```java
public boolean validarCredenciais(String email, String senha) {
    return this.email.equals(email) && this.senha.equals(senha);
}

public double getPercentualOcupacao() {
    return (ingressosVendidos * 100.0) / capacidade;
}
```

---

## 5. PADRÃO ARQUITETURAL MVC

### 📦 Model (Modelo)

**Responsabilidade:** Gerenciar dados e regras de negócio

**Classes:**
- `Usuario.java`
- `Evento.java`
- `UsuarioDAO.java`

**Exemplo:**
```java
public class Evento {
    private int capacidade;
    private int ingressosVendidos;
    
    public boolean venderIngresso(int quantidade) {
        if (ingressosVendidos + quantidade <= capacidade) {
            ingressosVendidos += quantidade;
            return true;
        }
        return false;
    }
}
```

---

### 🎮 Controller (Controlador)

**Responsabilidade:** Lógica de aplicação e intermediação

**Classes:**
- `LoginController.java`
- `DashboardController.java`
- `RelatorioController.java`

**Exemplo:**
```java
public class LoginController {
    private UsuarioDAO usuarioDAO;
    
    public boolean processarLogin(String email, String senha) {
        Usuario usuario = usuarioDAO.autenticar(email, senha);
        return usuario != null;
    }
}
```

---

### 🖥️ View (Visão)

**Responsabilidade:** Interface gráfica com usuário

**Classes:**
- `LoginView.java`
- `DashboardView.java`
- `RelatorioView.java`

**Tecnologia:** Java Swing (JFrame, JPanel, JButton, JTable)

---

### 🔄 Fluxo MVC no Projeto:
```
1. Usuário interage com VIEW (clica em "Entrar")
2. VIEW chama método do CONTROLLER
3. CONTROLLER processa lógica e acessa MODEL
4. MODEL retorna dados
5. CONTROLLER atualiza VIEW
6. VIEW exibe resultado ao usuário
```

---

## 6. BENEFÍCIOS DO SCRUM NO PROJETO

✅ **Entregas incrementais:** Funcionalidades prontas a cada 2 semanas  
✅ **Flexibilidade:** Possibilidade de ajustar prioridades entre Sprints  
✅ **Transparência:** Daily meetings mantêm todos informados  
✅ **Melhoria contínua:** Retrospectivas geram aprendizado  
✅ **Foco em valor:** Priorizamos funcionalidades mais importantes  
✅ **Qualidade:** Reviews garantem produto funcionando corretamente  

---

## 7. CONCLUSÃO

A aplicação da metodologia **Scrum** permitiu organizar o desenvolvimento de forma incremental e eficiente, entregando valor a cada Sprint. O **Sistema de Eventos** foi concluído com sucesso em **4 semanas**, demonstrando a eficácia do método ágil para projetos de software acadêmicos.

Os princípios de **POO (Programação Orientada a Objetos)** e o padrão **MVC (Model-View-Controller)** foram aplicados corretamente, resultando em um código:
- ✅ Organizado e estruturado
- ✅ Fácil de manter e evoluir
- ✅ Seguindo boas práticas de programação
- ✅ Profissional e documentado

O projeto comprova que metodologias ágeis e boas práticas de engenharia de software são essenciais para o desenvolvimento de sistemas de qualidade.

---

## 8. REFERÊNCIAS BIBLIOGRÁFICAS

SCHWABER, Ken; SUTHERLAND, Jeff. **The Scrum Guide: The Definitive Guide to Scrum**. Scrum.org, 2020.

DEITEL, Paul; DEITEL, Harvey. **Java: Como Programar**. 10ª edição. São Paulo: Pearson, 2016.

GAMMA, Erich et al. **Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos**. Porto Alegre: Bookman, 2000.

PRESSMAN, Roger S.; MAXIM, Bruce R. **Engenharia de Software: Uma Abordagem Profissional**. 8ª edição. Porto Alegre: AMGH, 2016.

SOMMERVILLE, Ian. **Engenharia de Software**. 10ª edição. São Paulo: Pearson, 2018.

---

**Documento elaborado como parte do Projeto Acadêmico de Gestão de TI**  
**Disciplinas:** Linguagem de Programação I e Engenharia de Software  
**Novembro/2025**
