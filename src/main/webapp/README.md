## Como iniciar o projeto

### Requisitos para instalar

* Instalar [Node](https://nodejs.org/en) Versão **10 LTS**

* Instalar [Yarn](https://yarnpkg.com/pt-BR/docs/install#windows-stable)

* Instalar [Java JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* Recomendado utilizar [Visual Studio Code](https://code.visualstudio.com/download) para desenvolver o **front-end**

* Recomendado utilizar [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) para desenvolver o **back-end**

  ### Iniciar projeto

  A instalação do back-end e front-end podem ser realizadas simultaneamente

  ---------------------------------------------------------------------

  #### Back-end

  Abrir o **IntelliJ** e clicar em importar projeto do tipo **Maven** e aguardar instalar dependências (é automático). *Para saber se está baixando  e instalando as dependências é só observar na parte inferior central da tela mais ou menos vai estar escrito algo como Carregando*

  Na parte superior direita existe um ícone de *martelo* e logo na direita um campo de seleção, clique nele e depois **edit-configurations**. Clique no **+** e selecione *Maven*, dê um nome para poder identificar apenas e adicione em *Command Line* `spring-boot:run` e por fim *OK*

  No campo de seleção que acabou de selecionar **edit-configurations** selecione a configuração que foi criada.

  Para rodar o projeto clique no ícone de *play*

  

  #### Front-end

  Abrir **Visual Studio Code**, abrir diretório `src\main\webapp` 

  Abrir um **Terminal** na pasta `src\main\webapp` digitar `yarn` e aguardar terminar

  Digite `yarn start` para iniciar

  