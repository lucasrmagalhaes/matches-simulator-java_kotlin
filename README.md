### Sportheca Mobile DEV Week

<hr>

#### Desenvolvimento Mobile Nativo Para Android

##### Objetivo Geral
Fornercer uma visão geral sobre a área de Desenvolvimento Mobile, com ênfase na criação de Apps Nativos em Android. Para isso, o ambiente de desenvolvimento é configurado com o Android Studio, possibilitando a construção de aplicativos nas linguagens Java e Kotlin.

##### Percurso
- Introdução ao Desenvolvimento Mobile
- Android Nativo: Ambiente de Desenvolvimento
- Android Nativo: Estrutura de Projetos Android

##### Setup: Elementros Centrais
**SDK Manager:** possibilita o gerenciamento de pacotes por meio de ferramentas, APIs e outros componentes; <br>
**AVD Manager:** provê múltiplas possibilidades de emulação através de dispositivos virtuais.

[Android Studio](https://developer.android.com/studio)

##### Iniciando o Projeto
EmptyActivty <br>
Simulator <br>
me.dio.simulator <br>
Kotlin <br>
API 21

[Samsung Flow](https://www.microsoft.com/pt-br/p/samsung-flow/9nblggh5gb0m?activetab=pivot:overviewtab)

<hr>

#### Componentes, Layouts e UI UX Em Apps Android

##### Objetivo Geral
Apresentar alguns dos componentes disponíveis nativamente na SDK Android, explorando o Jetpack sempre que possível. Nesse sentido, os layouts de um App para simulação de partidas esportivas serão definidos. Para isso, os conceitos de prototipação e UI/UX são essencialmente compreendidos.

##### Percurso
- Introdução ao Android Jetpack
- Material Design
- Criação dos Layouts do App

##### Conhecendo o Jetpack
O Android Jetpack é um conjunto de bibliotecas que ajuda desenvolvedores a seguir práticas recomendadas, reduzir códigos boilerplate e programar códigos que funcionam de maneira consistente em diferentes dispositivos e versões do Android. Assim, o desenvolvedor pode se concentrar em seu domínio de aplicação.

##### Usando o View Binding
Facilitar/centralizar o acesso à componentes definidos via layout XML. Com isso, as incômodas/recorrentes chamadas ao método findViewById tornam-se desnecessárias.

##### Usando o SwipeRefreshLayout
```java
implementantion 'androidx.swiperefreshlayout:swiperefreshlayout:1.1.0'
```

##### Get from VCS
Informa a URL do Projeto - GitHub, clona direto no Android Studio.

##### Material Design
É um sistema de design (que engloba UI e UX) criado pelo Google para nos ajudar a criar experiências digitais de alta qualidade para multiplas plataformas.

[Sistema de Cores](https://material.io/design/color/the-color-system.html#tools-for-picking-colors) <br>
[Color Tool](https://material.io/resources/color/#!/?view.left=0&view.right=0)

##### Prototipação do App
Primeira tela: Listagem/Simulação de Partidas <br>
Segunda tela: Detalhes da Partida

##### Atalhos
Replace: Ctrl + R <br>
Abrir Opções: Alt + Enter

##### In res/values/type.xml:
[Style](https://material.io/components/app-bars-top/android#regular-top-app-bar)

<hr>

#### Java e Kotlin

##### Objetivo Geral
Desenvolva os eventos, integrações e interações de usuário em um App Android. Para isso, vamos explorar conceitos essenciais, como: APIs, Orientação a Objetos e Padrões de Projetos; tudo na prática usando Java e Kotlin! <br>
Nesse sentido, bibliotecas consolidadas como Glide e Retrofit serão utilizadas com o objetivo de aumentar ainda mais nossa produtividade e qualidade de código.

##### Percurso
- Criando uma "API" e Modelando seu Domínio
- Conhecendo as Bibliotecas Retrofit e Glide
- Parcelable e Simulação de Partidas 🎲

##### Domínio/Problema
Com base nos protótipos, conseguimos ter uma boa ideia do nosso domínio de aplicação. Nesse contexto, vamos abstrair as entidades relevantes para o App, por exemplo: <br>
- Toda Partida é realizada em um Local;
- Uma Partida possui dois Times (mandante e visitante);
- Os Times têm um nível de força (estrelas)…

##### “API” no GitHub Pages 🤨
Uma Application Programming Interface (API), basicamente, se propõe a expor recursos de um domínio de aplicação. Seu principal objetivo é definir uma interface para integrações concisas e eficientes. <br><br>
Nesse sentido, para que não tenhamos que construir uma API do zero, vamos prover nossos recursos (partidas) via GET por meio do recurso GitHub Pages.

```json
[
  { 
    "descricao": "Eliminatórias Copa 2022",
    "local": {
      "nome": "Maracanã",
      "imagem": "TODO"
    },
    "mandante": {
      "nome": "Brasil",
      "estrelas": 5,
      "imagem": "https://www.bandeirasnacionais.com/data/flags/normal/br.png"
    },
    "visitante": {
      "nome": "Argentina",
      "estrelas": 5,
      "imagem": "https://www.bandeirasnacionais.com/data/flags/normal/ar.png"
    }
  }
]
```

[Matches Simulator API](https://github.com/lucasrmagalhaes/matches_simulator-api)

##### Retrofit
Cliente HTTP para Android e Java, o qual abstrai incrivelmente a complexidade no consumo de APIs. Além disso, possui uma série de conversores JSON, que facilitam a (de)serialização dos dados: <br>
[Retrofit (HTTP Client)](https://square.github.io/retrofit)

```
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
```

```
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
```

##### Glide
Gerenciador de mídia rápido e eficiente, abstraindo o processo de carregamento de imagens em Android, gerenciando desde a decodificação e transformação até o controle de cache das mesmas: <br>
[Glide (Image Loading)](https://github.com/bumptech/glide)

```
implementation 'com.github.bumptech.glide:glide:4.11.0'
```

```
annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
```

##### Permissão de acesso a internet
```
<uses-permission android:name="android.permission.INTERNET"/>
```

[Listas dinâmicas com o RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=pt-br)

##### Parcelable
Parcelable é a estratégia de (de)serialização padrão em Apps Android, ou seja, é a implementação utilizada para troca de mensagens entre as telas de um App. Nesse contexto, o Kotlin Parcelize é uma alternativa muito simples e efetiva:
```
plugins {
   id 'kotlin-parcelize'
}
```

<hr>

#### Firebase

##### Objetivo Geral
Conheça algumas das possibilidades oferecidas pelo Firebase. Nesse contexto, vamos explorar alguns recursos interessantes dessa plataforma, como o Analytics, Crashlytics, entre outros. Com isso, nosso App estará muito mais preparado para uma publicação em produção (Google Play), pois eventuais crashes e insights relacionados ao seu uso poderão ser monitorados proativamente.

##### Introdução ao Firebase
Fornece as ferramentas para desenvolver aplicativos de alta qualidade, ampliar a base de usuários e lucrar mais. Para isso, o Firebase oferece uma poderosa suite de soluções, abstraindo a complexidade em diferentes contextos:
- Construção
- Implantação e Monitoramento
- Engajamento

##### Configurando o Firebase
Passos para adicionar o Firebase em seu App usando o Console do Firebase (recomendado):
* [Criar um projeto do Firebase](https://firebase.google.com/docs/android/setup?hl=pt-br#create-firebase-project)
* [Registrar seu app com o Firebase](https://firebase.google.com/docs/android/setup?hl=pt-br#register-app)
* [Adicionar um arquivo de configuração do Firebase](https://firebase.google.com/docs/android/setup?hl=pt-br#add-config-file)
* [Adicionar SDKs do Firebase ao seu App](https://firebase.google.com/docs/android/setup?hl=pt-br#add-sdks)

##### Crashlytics
O Firebase Crashlytics é uma ferramenta de relatório de falhas leve e em tempo real que ajuda a monitorar, priorizar e corrigir problemas de estabilidade que comprometem a qualidade do seu aplicativo. <br><br>
O Crashlytics economiza tempo na solução de problemas com o agrupamento inteligente das falhas e a exibição das circunstâncias que levam a elas.

##### Configurando o Crashlytics
Passos para adicionar o Firebase Crashlytics:
* [Ativar o Crashlytics no Console do Firebase](https://firebase.google.com/docs/crashlytics/get-started?hl=pt-br&platform=android#enable-in-console)
* [Adicionar o plug-in do Firebase Crashlytics ao seu App](https://firebase.google.com/docs/crashlytics/get-started?hl=pt-br&platform=android#add-plugin)
* [Adicionar o SDK do Firebase Crashlytics ao seu App](https://firebase.google.com/docs/crashlytics/get-started?hl=pt-br&platform=android#add-sdk)
* [Forçar uma falha de teste para concluir a configuração](https://firebase.google.com/docs/crashlytics/get-started?hl=pt-br&platform=android#force-test-crash)