# Gerenciador de Configurações de Aplicações Distribuídas (Singleton ou Prototype)

# Contexto:

Em sistemas distribuídos, diferentes módulos precisam acessar e atualizar configurações globais (por exemplo, parâmetros de rede, credenciais, modos de depuração).

# Desafio:

Garantir acesso consistente às configurações e permitir duplicação controlada de perfis de configuração.

# Sugestão de padrões aplicáveis:

- Singleton → garantir uma única fonte de configuração global.

- Prototype → clonar configurações para diferentes módulos com pequenas variações.