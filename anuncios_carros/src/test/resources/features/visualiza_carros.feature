# language: pt
Funcionalidade: Visualizar carros
  Pesquisar carros pela marca e modelo na pagina inicial
  Eu quero visualizar lista de carros
  Para poder escolher qual eu vou comprar

  Esquema do Cenario: Deve mostrar uma lista de carros da mesma marca e modelo
    Dado que estou na tela inicial e faco uma pesquisa de carros usados da marca Citroen e modelo Aircross
    Quando abre tela com lista dos carros e o primeiro modelo do carro <carroNr> na tela e dentro do link eh <modeloCarro> valor <valorCarro> ano <anoCarro> km <kmCarro> cor <corCarro> e cambio <cambioCarro>
    Entao clico no modelo <carroNr> e abre tela
    Entao valido o Modelo e Valor do carro <carroNr> e o produto aparece na confirmacao com o modelo <modeloCarro> valor <valorCarro> ano <anoCarro> km <kmCarro> cor <corCarro> cambio <cambioCarro>

    Exemplos: 
      | carroNr | modeloCarro                                  | valorCarro     | anoCarro     | kmCarro  | corCarro | cambioCarro  |
      | "1"     | "Citroën Aircross 1.6 16V Live (Flex) (Aut)" | "R$ 58.990,00" | "2018/ 2019" | "13.000" | "Branco" | "automático" |
      | "2"     | "Citroën Aircross 1.6 16V Live (Flex) (Aut)" | "R$ 47.900,00" | "2017/ 2018" | "56.054" | "Branco" | "automático" |
