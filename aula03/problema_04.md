# Sistema de Controle de Dispositivos IoT (Singleton e Facade)

# Contexto:

Uma aplicação precisa controlar dispositivos inteligentes (lâmpadas, sensores, câmeras) via rede local, centralizando o gerenciamento e simplificando o uso das APIs de cada fabricante.

# Desafio:

Criar uma camada de abstração única que unifique o controle de todos os dispositivos.

# Sugestão de padrões aplicáveis:

- Facade → criar uma interface única para o controle de dispositivos.

- Singleton → garantir que exista apenas uma instância do controlador principal.