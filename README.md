# Binary Search Tree (BST) Program

Marcela precisa de ajuda para desenvolver um programa que trabalhe com uma Árvore Binária de Busca (Binary Search Tree - BST). O programa deve suportar os seguintes comandos:

### Comandos disponíveis

- `I n`: Insere o elemento `n` na Árvore Binária de Busca atual.
- `PREFIXA`: Imprime o percurso em pré-ordem da árvore.
- `INFIXA`: Imprime o percurso em ordem da árvore.
- `POSFIXA`: Imprime o percurso em pós-ordem da árvore.
- `P n`: Busca pelo elemento `n`, imprimindo uma mensagem indicando se `n` existe.

A qualquer momento deve ser possível inserir um novo elemento, imprimir qualquer percurso (pré, em ou pós-ordem) ou buscar por um elemento existente na árvore.

A entrada conterá `N` linhas, cada uma representando uma operação sobre a árvore (inicialmente vazia). A primeira linha sempre será uma inserção (`I`). As próximas linhas podem conter qualquer comando descrito acima. O fim da entrada é determinado por EOF.

> **Observação**: Não haverá elementos repetidos na árvore.

### Exemplo de Entrada e Saída

| Entrada             | Saída                |
|---------------------|----------------------|
| I c                 |                      |
| I f                 |                      |
| I a                 |                      |
| I h                 |                      |
| INFIXA              | a c f h              |
| PREFIXA             | c a f h              |
| POSFIXA             | a h f c              |
| P z                 | z nao existe         |
| P h                 | h existe             |
| I g                 |                      |
| INFIXA              | a c f g h            |

> ⚠️ **Importante**: Não deixe espaços em branco ao final das linhas de saída, ou ocorrerá erro de apresentação (_Presentation Error_).

---

✅ Projeto ideal para treinar manipulação de árvores binárias, recursão e percursos de árvore (pré, em, pós-ordem).
