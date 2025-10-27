# Editor de Imagens Modular (Decorator ou Command)

# Contexto:

Um editor de imagens simples precisa permitir que filtros (preto e branco, brilho, contraste, etc.) sejam aplicados de forma dinâmica e combinável.

# Desafio:

Permitir empilhar filtros sem alterar o código base da imagem ou das operações principais.

# Sugestão de padrões aplicáveis:

- Decorator → aplicar efeitos empilháveis sobre a imagem.

- Command → permitir desfazer/refazer operações de edição.
