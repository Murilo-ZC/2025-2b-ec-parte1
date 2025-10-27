# Loja Virtual com Múltiplos Métodos de Pagamento (Factory Method ou Strategy)

# Contexto:

A loja deve processar pagamentos por cartão, Pix, boleto, e permitir incluir novos métodos no futuro sem alterar o núcleo da aplicação.

# Desafio:

Implementar uma arquitetura flexível para criar e integrar novos meios de pagamento.

# Sugestão de padrões aplicáveis:

- Factory Method → criar dinamicamente instâncias de métodos de pagamento.

- Strategy → definir políticas de pagamento intercambiáveis.