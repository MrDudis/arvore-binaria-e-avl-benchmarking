# Árvore Binária Vs. Árvore AVL Benchmarking

Neste código, está implementado uma estrutura de [Árvore Binária](https://pt.wikipedia.org/wiki/%C3%81rvore_bin%C3%A1ria) e [Árvore AVL](https://pt.wikipedia.org/wiki/%C3%81rvore_AVL), com métodos de inserção, busca e remoção. Também possui um código de benchmarking na Main para comparar a performance dessas estruturas, que deve ser observado junto ao [JConsole](https://docs.oracle.com/javase/8/docs/technotes/guides/management/jconsole.html).

Abaixo estão as analises de performance para cada método, junto com uma análise dos resultados.

### Inserção

Foram inseridos 10.000 elementos aleatórios em cada árvore.

|  | Árvore Binária | Árvore AVL |
| ------ | ------ | ------ |
| CPU Usage | 0.8% | 1.3% |
| Heap Memory | 5.1Mb | 5.6Mb |
| Time | 12ms | 24ms |

Podemos ver, que a Árvore AVL usa um pouco mais de CPU e demora um pouco mais para finalizar, isso se dá ao fato que a Árvore AVL deve balancear os elementos, junto a inserção.

### Busca

Foram buscados 10.000 elementos aleatórios em cada árvore.

|  | Árvore Binária | Árvore AVL |
| ------ | ------ | ------ |
| CPU Usage | 0.7% | 1.1% |
| Heap Memory | 5.1Mb | 5.6Mb |
| Time | 8ms | 5ms |

Agora para a busca, a Árvore AVL parece mais rápida, apesar de ainda usar mais CPU, isso é devia ao balanceamento na árvore, que deixa ficar mais fácil encontrar elementos.

### Remoção

Foram removidos 10.000 elementos aleatórios em cada árvore.

|  | Árvore Binária | Árvore AVL |
| ------ | ------ | ------ |
| CPU Usage | 0.5% | 0.6% |
| Heap Memory | 5.0Mb | 5.4Mb |
| Time | 5ms | 7ms |

Apesar de resultados próximos, a Árvore Binária, como na insersão, foi um pouco mais rápida, devido a Árvore AVL ter que rebalancear a árvore após a remoção de um elemento.

#### Conclusão

Para operações de inserção, uma Árvore Binária tende a ser mais rápida do que uma Árvore AVL no curto prazo, pois não requer reequilíbrio imediato após a inserção.

No entanto, a Árvore AVL é mais eficiente a longo prazo, especialmente se você planeja realizar muitas inserções e buscas, pois mantém sua estrutura balanceada.