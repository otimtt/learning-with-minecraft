# Learning with Minecraft

`Learning with Minecraft` é uma ideia de mod para Minecraft de PC focado em aprendizado de idiomas dentro do próprio chat do jogo.

## Ideia principal

O mod analisa o texto que o jogador digita no chat e ajuda na aprendizagem do idioma que ele está estudando. Em vez de apenas corrigir de forma seca, ele entrega feedback útil e fácil de entender.

A proposta é simples:

- o jogador escolhe um idioma para aprender
- o mod identifica erros na frase digitada
- o mod sugere correções
- o mod explica o erro no idioma que o jogador domina
- o jogador pode guardar palavras novas em um painel de aprendizado

## Exemplo de uso

Se um jogador nativo de português estiver aprendendo inglês, o mod pode funcionar assim:

- frase digitada: `I have 20 years`
- correção sugerida: `I am 20 years old`
- explicação em português: em inglês, a idade normalmente é expressa com `to be`, e não com `have`

Isso deixa a aprendizagem mais clara, porque o usuário recebe a explicação em um idioma que ele já entende.

## Funcionalidades pensadas

### 1. Correção de frases no chat

O mod detecta erros comuns de gramática, vocabulário e estrutura de frase antes ou logo após o envio no chat.

### 2. Explicações na língua nativa do jogador

O usuário aprende melhor quando a análise vem no idioma que ele domina. Assim, um brasileiro aprendendo inglês recebe a explicação em português.

### 3. Painel de palavras aprendidas

O jogador pode abrir um painel com o histórico de palavras e expressões aprendidas.

Esse painel pode mostrar:

- palavra original
- tradução
- exemplo de uso
- contexto em que apareceu
- data em que foi aprendida
- status de revisão

### 4. Registro de progresso

O mod pode guardar o que o jogador já viu para evitar repetir o mesmo conteúdo o tempo todo e para facilitar revisões futuras.

## Estrutura do aprendizado

A ideia pode ser organizada em três partes:

1. `Correção em tempo real`
   - analisa a frase digitada
   - sugere correções
   - mostra explicações curtas

2. `Registro de aprendizado`
   - salva palavras e construções novas
   - evita duplicar informações
   - relaciona o aprendizado ao contexto do chat

3. `Painel do jogador`
   - lista palavras aprendidas
   - permite revisar vocabulário
   - ajuda a acompanhar o progresso

## Objetivo do mod

O objetivo do `Learning with Minecraft` é transformar o chat em um ambiente de estudo leve, prático e contextual, sem tirar o jogador da experiência do jogo.

Ele não seria apenas um corretor. A proposta é funcionar como um tutor discreto, que ensina enquanto o jogador joga.

## Próximos passos

Quando o projeto for desenvolvido, os próximos passos podem ser:

- definir a versão base do Minecraft
- escolher a tecnologia do mod
- decidir se a correção será local ou via API
- desenhar a interface do painel de palavras
- estruturar o fluxo de correção e explicação no chat

## Resumo

`Learning with Minecraft` é um mod de aprendizado de idiomas em que o chat do jogo vira uma ferramenta educativa. Ele corrige frases, explica erros na língua nativa do jogador e mantém um painel com palavras aprendidas para revisão futura.
