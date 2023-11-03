# Explorando Padrões de Projetos na Prática com Java

Cadastro dos clientes buscando o endereco na api do CEP

Projeto explorando alguns padrões usando o Spring Framework
- strategy
- singleton
- facade - ClienteServiceImpl

ClienteServiceImpl: 
Implementacao da Strategy ClientService -> injetada via @Autowired e como a classe é um Service, 
sera tratada como um Singleton
Singleton: intejando componentes do Spring com @Autowired
Strategy: implementando metodos definidos na interface
Facade: abstraindo integracoes com subsistemas, provendo interface simples