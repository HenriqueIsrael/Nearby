# **Nearby - Clube de Benefícios** 

## **Descrição**

O **Nearby** é um aplicativo Android que facilita o acesso a cupons e benefícios exclusivos para serem utilizados em estabelecimentos próximos à sua localização. Com integração ao **Google Maps API**, o app permite visualizar e navegar até os locais participantes, garantindo praticidade e economia ao usuário.

## **Observações**
Este projeto foi desenvolvido com fins de estudo. Algumas informações importantes:
- 📍 A localização no app está mocada (fixada em uma posição pré-definida).
- 🛠️ Para visualizar os estabelecimentos, é necessário [executar o backend local](#execução-do-backend-local) . Certifique-se de configurar e iniciar o servidor antes de executar o app.
- 🚧 Algumas funcionalidades podem ser limitadas, pois o **foco principal foi aplicar conceitos de arquitetura, tecnologias modernas e boas práticas no desenvolvimento Android.**
  
## **Funcionalidades**  
- 📋 **Listagem** dos estabelecimentos próximos.
- 🔍 **Filtro de categorias** (restaurantes, lojas, serviços, supermercado, entretenimento, cinema...). 
- 🎟️ **Cupons e benefícios exclusivos** para os estabelecimentos.  
- 📍 **Localização  dos estabelecimentos** no mapa interativo.  
- 🚀 **Interface intuitiva e responsiva** desenvolvida com Jetpack Compose.  
- 🔄 **Sincronização rápida e eficiente** de dados com uso de coroutines e Flow.
  
## **Tecnologias Utilizadas**  
- **Kotlin** - Linguagem principal do projeto.  
- **Android Studio** - IDE para desenvolvimento.  
- **Arquitetura MVI + Clean Architecture** - Para organização e separação de responsabilidades.  
- **Jetpack Compose** - Construção de UI moderna e declarativa.  
- **ViewModel e Lifecycle** - Gerenciamento de dados e ciclo de vida da UI.  
- **Navigation** - Navegação entre telas de forma eficiente e declarativa.  
- **Google Maps API** - Exibição de mapas e localização de estabelecimentos.  
- **Flow e Coroutines** - Programação assíncrona e reativa.  
- **Ktor** - Cliente HTTP para comunicação com APIs.  
- **Kotlinx Serialization** - Serialização e desserialização de dados JSON.  
- **Coil** - Carregamento de imagens de forma rápida e eficiente.
- **Zxing** - leitura de QR Codes.  
- **Gradle** - Ferramenta de automação e gerenciamento de dependências.
  
## **Vídeo de Apresentação**  

https://github.com/user-attachments/assets/c618f4f4-d81c-49a4-8064-76d169874d7f



## **Execução do Backend Local**
1. Para a API funcionar, é preciso ter o Node instalado na sua máquina. Caso não tenha, siga essa documentação: [Instalando o Node e o NPM](https://efficient-sloth-d85.notion.site/Instalando-o-Node-e-o-NPM-d162e2582d5c48499bc6703526912456).
2. Extraia a pasta `api.zip` e abra o conteúdo pelo VS Code.
3. execute o comando: `npm install` e em seguida `npm start`.
   
## **Instalação e Configuração**  
1. **Clone o repositório**:  
   ```bash
   git clone https://github.com/seu-usuario/nearby-app.git
2. Abra o projeto pelo Android Studio.
3. Antes de buildar, configure o arquivo `NearbyRemoteDataSource.kt`. Se estiver usando um dispositivo físico a variável `BASE_URL` (linha 18) deve ser = ` LOCAL_HOST_PHYSICAL_BASE_URL`, entretanto, se estiver usando um emulador `BASE_URL`  = ` LOCAL_HOST_EMULATOR_BASE_URL`.
4. Criar uma api key no Google Cloud para consumir a api do Google Maps. Documentação para criação de chave [aqui](https://developers.google.com/maps/get-started?hl=pt-br#create-project).
5. Substituir a linha 34 no arquivo AndroidManifest.xml pela api key criada.
6. Com o servidor rodando e api key configurada, você está pronto para buildar o projeto ▶️

## **Contato**
Se você tiver dúvidas, sugestões ou quiser colaborar, entre em contato:

- **Email:** [henriqueisraeloliveira74@gmail.com](mailto:henriqueisraeloliveira74@gmail.com)
- **LinkedIn:** [Henrique Israel](https://www.linkedin.com/in/henrique-israel/)
