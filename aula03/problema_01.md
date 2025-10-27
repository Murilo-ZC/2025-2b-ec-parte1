# Sistema de Notificações Multicanal (Observer ou Strategy)

## Contexto:

Empresas modernas precisam enviar notificações por diferentes canais (e-mail, SMS, WhatsApp, push notification).
O sistema deve permitir adicionar novos canais de forma simples, sem alterar o código existente.

## Desafio:

Implemente um sistema de notificações configurável, em que a lógica de envio de mensagens seja facilmente extensível.

## Sugestão de padrões aplicáveis:

- Observer → notificar múltiplos observadores (canais).

- Strategy → permitir diferentes estratégias de envio.