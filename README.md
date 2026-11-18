# Moriya Hero Setlist

Página estática (GitHub Pages) que exibe as setlists da Moriya Music Stations.

## Estrutura

| Arquivo | Função |
|---|---|
| `index.html` | Página e lógica de exibição |
| `eventos.json` | **Índice**: lista os arquivos de setlist que serão exibidos |
| `setlist/Setlist-parte-1.json` | Dados da Parte 1 |
| `setlist/Setlist-parte-2.json` | Dados da Parte 2 |

> A cópia `Setlist-parte-1.json` que ficou na **raiz** não é mais usada. Pode apagá-la para não confundir.

O `eventos.json` **não contém músicas**: ele só aponta para os arquivos. Exemplo:

```json
[
    "setlist/Setlist-parte-1.json",
    "setlist/Setlist-parte-2.json"
]
```

Cada arquivo da lista é carregado e exibido como um card de setlist separado, recolhido por padrão.

## Como adicionar uma nova setlist

1. Copie `setlist/Setlist-parte-1.json` para `setlist/Setlist-parte-3.json`.
2. Altere `nome`, `linkDownload` e o array `mapas` com as músicas da nova parte.
3. Abra `eventos.json` e acrescente o caminho do arquivo:

```json
[
    "setlist/Setlist-parte-1.json",
    "setlist/Setlist-parte-2.json",
    "setlist/Setlist-parte-3.json"
]
```

4. Faça commit e push. O GitHub Pages publica em cerca de 1 minuto.

Se o arquivo listado não existir (ou tiver JSON inválido), a página mostra um aviso naquele setlist e continua exibindo os demais.

## Formato do arquivo de setlist

Cada arquivo pode conter **um objeto** ou **uma lista de objetos** no formato abaixo:

```json
{
    "nome": "Moriya Music Stations - Parte 3",
    "dataInicio": "",
    "dataFim": "",
    "linkDownload": "https://github.com/JJMAGame/Moriya-Music-Stations/releases/tag/setlistpersonalizado",
    "mapas": [
        {
            "nome": "Artista - Música",
            "base": 3,
            "dificuldade": "1,2,3,4"
        }
    ],
    "videoId": "",
    "rainbow": false
}
```

### Campos

- **nome** — título exibido no card (sempre visível, mesmo recolhido).
- **dataInicio / dataFim** — opcionais. Se preenchidos com data válida, exibem o status (AO VIVO / EM BREVE / ENCERRADO). Vazios = sem status.
- **linkDownload** — link do `.zip` da setlist; se vazio, o botão não aparece.
- **mapas** — lista de músicas:
  - **nome** — artista e música;
  - **base** — nível de 1 a 99 (define a cor do selo “Nível X”); sem valor, assume 1;
  - **dificuldade** — `"1,2,3,4"` para Fácil/Médio/Difícil/Expert, ou apenas `"4"` para só Expert.
- **videoId** — ID do vídeo do YouTube (opcional).
- **rainbow** — `true` deixa o título com o efeito arco-íris.

## Publicar no GitHub Pages

O Pages serve exatamente os arquivos que estiverem no repositório. Para os dois JSONs aparecerem no site:

1. Envie a pasta `setlist/` com os dois arquivos (GitHub web: **Add file → Upload files**, e arraste a pasta).
2. Envie também o `eventos.json` atualizado e o `index.html`.
3. Confirme que os caminhos no índice batem com os nomes reais (maiúsculas/minúsculas importam).
4. Aguarde a publicação e force a atualização com **Ctrl + Shift + R**.

## Cache

O carregamento usa `?v=` + `no-store` para evitar que o GitHub Pages exiba versões antigas dos JSON.
