# Binary Search Tree (BST) Program

Marcela needs help developing a program that works with a Binary Search Tree (BST). The program must support the following commands:

### Available Commands

- `I n`: Insert the element `n` into the current Binary Search Tree.
- `PREFIXA`: Print the pre-order traversal of the tree.
- `INFIXA`: Print the in-order traversal of the tree.
- `POSFIXA`: Print the post-order traversal of the tree.
- `P n`: Search for the element `n`, printing a message indicating whether `n` exists.

At any time, it should be possible to insert a new element, print any of the tree traversals (pre-order, in-order, post-order), or search for any element in the tree.

The input will contain `N` lines, each representing an operation on the tree (which is initially empty). The first line will always be an insertion (`I`). The following lines can contain any of the commands listed above. Input ends with EOF.

> **Note**: There will be no repeated elements in the tree.

### Example Input and Output

| Input               | Output                |
|---------------------|-----------------------|
| I c                 |                       |
| I f                 |                       |
| I a                 |                       |
| I h                 |                       |
| INFIXA              | a c f h               |
| PREFIXA             | c a f h               |
| POSFIXA             | a h f c               |
| P z                 | z nao existe          |
| P h                 | h existe              |
| I g                 |                       |
| INFIXA              | a c f g h             |

> ⚠️ **Important**: Do not leave trailing spaces at the end of output lines, or you will get a _Presentation Error_.

---

✅ This is a great project to practice working with binary trees, recursion, and different tree traversals (pre-order, in-order, post-order).
