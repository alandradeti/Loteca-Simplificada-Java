package Loteca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Lima de Andrade
 * @author Caio Cesar de Deus
 * @author Felipe Silva Lopes
 * @author Amanda Ornelas
 * @author Guilherme Ferreira
 *
 */
public class Loteca {
    // Constante que representa o número máximo de Apostadores que o banco comporta 
    public static int MAXIMO_APOSTADORES = 1000;
    // Constante que indica que o sistema realmente deve ser finalizado
    public static int TERMINA_SISTEMA = 14;
    // Constante que indica que o sistema não deve ser finalizado
    public static int NAO_TERMINA_SISTEMA = 0;
    // Variável Global “bancoApostadores” que representa o Banco de Apostadors 
    // Profissional e Relacionamento, como um vetor de Apostadores.  
    public static Apostador[] bancoApostadores = new Apostador[MAXIMO_APOSTADORES];
    // Total de Apostadores atuais armazenadas no banco
    public static int totalApostadoresBanco = 0;
    //Variável Globar que representa o valor da loteca.
    public static double valorLoteca;
    // Variável Globar que representa o resultado dos jogos do concurso.
    public static int resultadoConcurso[] = new int[Apostador.MAX_JOGOS];

    /**
     * Método: carregarBanco()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: carrega todos os dados
     * das Apostadors pré-cadastradas no banco de dados da empresa de “Recursos
     * Humanos e Relacionamentos Cruzeiro do Sul S.A”.
     */
    public static void carregarBanco() {
        // 1o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Um");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("09/10/1935");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(14) 11111-1111");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo1@hotmail.com");
        int palpites_apostador_1[] = new int[]{1, 0, 2, 1, 0, 2, 1, 0, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_1);
        totalApostadoresBanco++;

        // 2o Apostador	  
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dois");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("22/05/1962");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(19) 2222-2222");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo2@hotmail.com");
        int palpites_apostador_2[] = {1, 1, 1, 1, 0, 2, 1, 2, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_2);
        totalApostadoresBanco++;

        // 3o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Três");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("07/03/1982");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 3333-3333");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo3@hotmail.com");
        int palpites_apostador_3[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_3);
        totalApostadoresBanco++;

        // 4o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Quatro");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("29/06/1973");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 4444-4444");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo4@hotmail.com");
        int palpites_apostador_4[] = {1, 1, 1, 1, 0, 1, 1, 0, 0, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_4);
        totalApostadoresBanco++;

        // 5o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Cinco");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/08/1978");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 5555-5555");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo5@hotmail.com");
        int palpites_apostador_5[] = {1, 2, 2, 1, 0, 2, 1, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_5);
        totalApostadoresBanco++;

        // 6o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Seis");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("13/10/1990");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 6666-6666");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo6@hotmail.com");
        int palpites_apostador_6[] = {1, 2, 0, 2, 1, 2, 1, 1, 2, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_6);
        totalApostadoresBanco++;

        // 7o Apostador
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Sete");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("16/12/1982");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 7777-7777");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo7@hotmail.com");
        int palpites_apostador_7[] = {2, 1, 1, 1, 0, 0, 2, 1, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_7);
        totalApostadoresBanco++;

        // 8o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Oito");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("24/03/1984");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 8888-8888");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo8@hotmail.com");
        int palpites_apostador_8[] = {2, 1, 1, 1, 1, 0, 1, 1, 2, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_8);
        totalApostadoresBanco++;

        // 9o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Nove");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("14/10/1997");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 9999-9999");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo9@hotmail.com");
        int palpites_apostador_9[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_9);
        totalApostadoresBanco++;

        // 10o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dez");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("21/07/1959");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1010-1010");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo10@hotmail.com");
        int palpites_apostador_10[] = {0, 1, 1, 1, 0, 0, 1, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_10);
        totalApostadoresBanco++;

        // Adicionar os outros Apostadores solicitados a partir daqui
        // 11o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Onze");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("01/08/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1111-1111");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo11@hotmail.com");
        int palpites_apostador_11[] = {1, 0, 2, 2, 1, 0, 1, 2, 0, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_11);
        totalApostadoresBanco++;

        // 12o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Doze");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("15/12/1999");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1212-1212");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo12@hotmail.com");
        int palpites_apostador_12[] = {1, 0, 1, 2, 1, 0, 2, 1, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_12);
        totalApostadoresBanco++;

        // 13o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Treze");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("13/10/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1313-1313");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo13@hotmail.com");
        int palpites_apostador_13[] = {0, 1, 0, 1, 2, 2, 0, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_13);
        totalApostadoresBanco++;

        // 14o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Quatorze");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("27/02/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1414-1414");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo14@hotmail.com");
        int palpites_apostador_14[] = {0, 0, 0, 1, 1, 2, 2, 0, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_14);
        totalApostadoresBanco++;

        // 15o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Quinze");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("04/02/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1515-1515");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo15@hotmail.com");
        int palpites_apostador_15[] = {1, 2, 0, 1, 1, 2, 2, 1, 1, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_15);
        totalApostadoresBanco++;

        // 16o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dezesseis ");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("27/02/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1616-1616");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo16@hotmail.com");
        int palpites_apostador_16[] = {0, 0, 0, 1, 1, 2, 2, 0, 1, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_16);
        totalApostadoresBanco++;

        // 17o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dezessete");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("27/09/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1717-1717");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo17@hotmail.com");
        int palpites_apostador_17[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_17);
        totalApostadoresBanco++;

        // 18o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dezoito");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/07/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1818-1818");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo18@hotmail.com");
        int palpites_apostador_18[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_18);
        totalApostadoresBanco++;

        // 19o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Dezenove");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/07/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('M');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 1919-1919");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo19@hotmail.com");
        int palpites_apostador_19[] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_19);
        totalApostadoresBanco++;

        // 20o Apostador 
        bancoApostadores[totalApostadoresBanco] = new Apostador();
        bancoApostadores[totalApostadoresBanco].setNome("Apostador Vinte");
        bancoApostadores[totalApostadoresBanco].setDataDeNascimento("26/08/2000");
        bancoApostadores[totalApostadoresBanco].setSexoBiologico('H');
        bancoApostadores[totalApostadoresBanco].setTelefoneDeContato("(11) 2020-2020");
        bancoApostadores[totalApostadoresBanco].setEmailDeContato("emailexemplo20@hotmail.com");
        int palpites_apostador_20[] = {1, 0, 2, 1, 0, 2, 1, 0, 2, 1};
        bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador_20);
        totalApostadoresBanco++;
    }

    /**
     * Método msgPalpites()
     *
     * @param: palpites: vetor contendo os palpites do jogador com "0" coluna do
     * meio, "1" coluna 1 e "2" coluna 2.
     * @return: texto contendo os palpites formatados. Funcionalidade: monta
     * mensagem contendo os resultados dos palpites para um apostador.
     */
    public static String msgPalpites(int[] palpites) {
        int cont;
        String msg;
        msg = "";
        for (cont = 0; cont < Apostador.MAX_JOGOS; cont++) {
            if (palpites[cont] == 1) {
                msg = msg + "Jogo " + (cont + 1) + ": coluna 1\n";
            } else if (palpites[cont] == 0) {
                msg = msg + "Jogo " + (cont + 1) + ": coluna do meio\n";
            } else {
                msg = msg + "Jogo " + (cont + 1) + ": coluna 2\n";
            }
        }
        return msg;
    }

    /**
     * Método: format()
     *
     * @param: lista de parâmetros "double x" variável a ser formatada.
     * @return: valor "x" de retorno retorna a variavel formatada com somente
     * duas casas decimais. Funcionalidade: formatar um valor real para ter
     * apenas duas casas decimais.
     */
    public static String format(double x) {
        DecimalFormat formata = new DecimalFormat("#0.00");
        return formata.format(x);
    }

    /**
     * Método: apresentarApostadores()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresentar todos os
     * dados das Apostadors pré-cadastradas no banco de dados da empresa de
     * “Recursos Humanos e Relacionamentos Cruzeiro do Sul S.A” utilizando uma
     * interface para os dados de uma pessoa.
     */
    public static void apresentarApostadores() {
        int cont;
        for (cont = 0; cont < totalApostadoresBanco; cont++) {
            JOptionPane.showMessageDialog(null, (cont + 1) + "o Apostador\n\n"
                    + "nome___________________: " + bancoApostadores[cont].getNome() + "\n"
                    + "data de nascimento_____: " + bancoApostadores[cont].getDataDeNascimento() + "\n"
                    + "sexo biológico_________: " + bancoApostadores[cont].getSexoBiologico() + "\n"
                    + "telefone de contato___ : " + bancoApostadores[cont].getTelefoneDeContato() + "\n"
                    + "e-mail de contato_____ : " + bancoApostadores[cont].getEmailDeContato() + "\n"
                    + "Palpites______________ : \n" + msgPalpites(bancoApostadores[cont].getPalpites())
            );
        }
    }

    /**
     * Método: menuOpcoes()
     *
     * @param: lista de parâmetros inexistente.
     * @return: opcao válida selecionada pelo usuário do menu de 13 opções.
     * Funcionalidade: apresentar o menu de 13 opções ao usuário, obter a opção
     * selecionada, validar se opção existe e retornar o valor validado.
     */
    public static int menuOpcoes() {
        int opcao;  // opção selecionada pelo usuário do menu de opções
        // String que monta o conteúdo para o menu de opções
        String menu = "Menu de Opções da Loteca Simplificada\n\n"
                + " 1 - Fornecer o Valor da Loteca\n"
                + " 2 - Cadastrar Resultados do Concurso\n"
                + " 3 - Cadastrar Apostas de Jogos\n"
                + " 4 - Apresentar Apostadores\n"
                + " 5 - Apresentar Valores (Total e Prêmios)\n"
                + " 6 - Apresentar Acertos\n"
                + " 7 - Apresentar Jogos Zerados\n"
                + " 8 - Apresentar Ganhadores 10 acertos\n"
                + " 9 - Apresentar Ganhadores 9 acertos\n"
                + "10 - Apresentar Percentual Sexo Biológico\n"
                + "11 - Apresentar Percentual Traço Marcante\n"
                + "12 - Apresentar Traço Ganhadores 10 acertos\n"
                + "13 - Limpar Resultados do Concurso\n"
                + "14 - Terminar Sistema\n\n"
                + "Informe a opcao desejada:";
        // Obtém a opção selecionada do menu pelo usuário 
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        // Caso a opção selecionada não seja válida informa mensagem,  
        // apresenta menu novamente e solicita nova opção
        while (opcao < 1 || opcao > 14) {
            JOptionPane.showMessageDialog(null, "Opção inválida!!!");
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
        return opcao;
    }

    /**
     * Método: cadastrarNovaApostador()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: cadastra os dados de um
     * apostador no banco. Necessário ler os dados (campos) de cada apostador,
     * UM A UM, por meio de JOptionPane.showInputDialog para cada campo e
     * inserir esses dados no banco da forma:
     * bancoApostadores[++totalApostadoresBanco] = new Apostador();
     * bancoApostadores[totalApostadoresBanco].setNome(
     * JOptionPane.showInputDialog("Forneça o nome da Apostador:") );
     */
    public static void cadastrarNovoApostador() {

        // Cria um espaço no vetor para mais um apostador se não ultrapassou o limite estabelecido
        if (totalApostadoresBanco < MAXIMO_APOSTADORES) {
            int cont = 0;
            int palpites_apostador[] = new int[Apostador.MAX_JOGOS];
            bancoApostadores[totalApostadoresBanco] = new Apostador();

            // Obtém o nome do Apostador
            bancoApostadores[totalApostadoresBanco].setNome(JOptionPane.showInputDialog(null, "Forneça o nome do Apostador:"));

            // Obtém os outros campos
            bancoApostadores[totalApostadoresBanco].setDataDeNascimento(JOptionPane.showInputDialog(null, "Forneça a data de nascimento do Apostador: DD/MM/AAAA"));
            bancoApostadores[totalApostadoresBanco].setSexoBiologico(JOptionPane.showInputDialog(null, "Forneça o sexo do Apostador:").charAt(0));
            bancoApostadores[totalApostadoresBanco].setTelefoneDeContato(JOptionPane.showInputDialog(null, "Forneça o telefone de contado do Apostador: (99) 99999-9999"));
            bancoApostadores[totalApostadoresBanco].setEmailDeContato(JOptionPane.showInputDialog(null, "Forneça o e-mail do Apostador: identificacao@enderecodoprovedor"));
            while (cont < Apostador.MAX_JOGOS) {
                palpites_apostador[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o resultado do " + (cont + 1) + "° jogo: \n"
                        + "1 = Coluna da Esquerda, 0 = Coluna do Meio, 2 = Coluna da Direita"));
                if (palpites_apostador[cont] < 0 || palpites_apostador[cont] > 2) {
                    JOptionPane.showMessageDialog(null, "Utilize apenas 1, 0 ou 2.");
                } else {
                    cont++;
                }
            }
            bancoApostadores[totalApostadoresBanco].setPalpites(palpites_apostador);

            // Um novo apostador foi cadastrado
            totalApostadoresBanco++;
        } else {
            JOptionPane.showMessageDialog(null, "Banco de Apostadores com limite excedido!");
        }
    }

    /**
     * Método: fornecerValorXDaLoteca()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: receber e armazenar o
     * valor da loteca na variável global "valorLoteca".
     */
    public static void fornecerValorXDaLoteca() {

        /*Atribui o valor da loteca para a variável global "valorLoteca" e faz a validação se o valor for menor ou igual a zero.*/
        do {
            valorLoteca = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da Loteca:"));
            if (valorLoteca <= 0) {
                JOptionPane.showMessageDialog(null, "Permitido apenas valores positivos!");
            }
        } while (valorLoteca <= 0);

    }

    /**
     * Método: cadastrarResultadoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: cadastrar o resultado
     * do concurso no vetor global "resultadoConcurso[]".
     */
    public static void cadastrarResultadoConcurso() {

        int cont = 0;
        /*Atribui o resultado dos jogos ao vetor global "resultadoConcurso[]"
    e faz a validação se o resultado do jogo for diferente de 1, 0 ou 2.*/
        while (cont < Apostador.MAX_JOGOS) {
            resultadoConcurso[cont] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o resultado do " + (cont + 1) + "° jogo: \n"
                    + "1 = Coluna da Esquerda, 0 = Coluna do Meio, 2 = Coluna da Direita"));
            if (resultadoConcurso[cont] < 0 || resultadoConcurso[cont] > 2) {
                JOptionPane.showMessageDialog(null, "Utilize apenas 1, 0 ou 2.");
            } else {
                cont++;
            }
        }
    }

    /**
     * Método: cadastrarApostasDeJogos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: Chamar o metodo
     * "cadastrarNovoApostador".
     */
    public static void cadastrarApostasDeJogos() {

        cadastrarNovoApostador();
    }

    /**
     * Método: apresentarValoresTotalEPremios()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresenta o valor total
     * arrecadado com as apostas, o valor destinado ao prêmio, o valor do premio
     * para quem acertar o palpite dos 10 jogos e o valor do premio para quem
     * acertar o palpite de 9 jogos.
     */
    public static void apresentarValoresTotalEPremios() {

        //Realiza a validação se existe valor na variável global "valorLoteca" e calcula os valores totais e dos prêmios.
        if (valorLoteca != 0) {
            double valorTotalApostas = valorLoteca * totalApostadoresBanco;
            double valorTotalPremio = (valorTotalApostas * 0.40);
            double valorPremio10 = (valorTotalPremio * 0.70);
            double valorPremio9 = (valorTotalPremio * 0.30);
            JOptionPane.showMessageDialog(null, "Valor total das apostas: " + format(valorTotalApostas) + "\nValor do prêmio: " + format(valorTotalPremio)
                    + "\nValor do prêmio para 10 acertos: " + format(valorPremio10) + "\nValor do prêmio para 9 acertos: " + format(valorPremio9));
        } else {
            JOptionPane.showMessageDialog(null, "O valor da loteca não foi fornecido!");
        }
    }

    /**
     * Método: apresentarAcertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresenta o nome do
     * apostador e o percentual por ele acertado.
     */
    public static void apresentarAcertos() {

        //Verifica se existe resultado no vetor global "resultadoConcurso".
        if (resultadoConcurso[0] == -1) {
            JOptionPane.showMessageDialog(null, "O Resultado do concurso ainda não foi fornecido.");
        } else {
            int percentualAcertoApostadores[] = new int[totalApostadoresBanco];
            String msg = "";

            //Calcula os acertos dos apostadores e atribui ao vetor "percentualAcertoApostadores".
            for (int i = 0; i < totalApostadoresBanco; i++) {
                for (int j = 0; j < Apostador.MAX_JOGOS; j++) {
                    if (bancoApostadores[i].palpites[j] == resultadoConcurso[j]) {
                        percentualAcertoApostadores[i] += 10;
                    }
                }
            }

            //Acrescenta na variável "msg" o nome do apostador + o percentual por ele acertado.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                msg += (bancoApostadores[i].getNome() + ", percentual acertado: " + percentualAcertoApostadores[i] + "%\n");
            }
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    /**
     * Método: apresentarJogosZerados()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresenta os dados dos
     * participantes que não acertaram nenhum palpite.
     */
    public static void apresentarJogosZerados() {

        //Verifica se existe resultado no vetor global "resultadoConcurso".  
        if (resultadoConcurso[0] == -1) {
            JOptionPane.showMessageDialog(null, "O Resultado do concurso ainda não foi fornecido.");
        } else {
            int jogosZerados = 0;
            int acertoApostadores[] = new int[totalApostadoresBanco];

            //Calcula os acertos dos apostadores e atribui ao vetor "acertoApostadores".
            for (int i = 0; i < totalApostadoresBanco; i++) {
                for (int j = 0; j < Apostador.MAX_JOGOS; j++) {
                    if (bancoApostadores[i].palpites[j] == resultadoConcurso[j]) {
                        acertoApostadores[i]++;
                    }
                }
            }

            //Apresenta os dados dos apostadores que não tiveram nenhum acerto.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (acertoApostadores[i] == 0) {
                    JOptionPane.showMessageDialog(null, (i + 1) + "o Apostador\n\n"
                            + "nome___________________: " + bancoApostadores[i].getNome() + "\n"
                            + "data de nascimento_____: " + bancoApostadores[i].getDataDeNascimento() + "\n"
                            + "sexo biológico_________: " + bancoApostadores[i].getSexoBiologico() + "\n"
                            + "telefone de contato___ : " + bancoApostadores[i].getTelefoneDeContato() + "\n"
                            + "e-mail de contato_____ : " + bancoApostadores[i].getEmailDeContato());
                    jogosZerados += 1;
                }
            }

            //Verifica se houve nenhum apostador com 0 acertos e apresenta uma mensagem.
            if (jogosZerados == 0) {
                JOptionPane.showMessageDialog(null, "Não houve apostador com 0 acertos.");
            }
        }
    }

    /**
     * Método: apresentarGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresenta os ganhadores
     * (nome, telefone e e-mail) que acertaram 10 palpites, além do valor a ser
     * pago individualmente a cada ganhador.
     */
    public static void apresentarGanhadores10Acertos() {

        //Verifica se existe resultado no vetor global "resultadoConcurso". 
        if (resultadoConcurso[0] == -1) {
            JOptionPane.showMessageDialog(null, "O Resultado do concurso ainda não foi fornecido.");
        } else {
            int ganhadores10Acertos = 0;
            int acertoApostadores[] = new int[totalApostadoresBanco];
            double valorTotalApostas = valorLoteca * totalApostadoresBanco;
            double valorTotalPremio = (valorTotalApostas * 0.40);
            double valorPremio10 = (valorTotalPremio * 0.70);

            //Calcula os acertos dos apostadores e atribui ao vetor "acertoApostadores".
            for (int i = 0; i < totalApostadoresBanco; i++) {
                for (int j = 0; j < Apostador.MAX_JOGOS; j++) {
                    if (bancoApostadores[i].palpites[j] == resultadoConcurso[j]) {
                        acertoApostadores[i]++;
                    }
                }
            }

            //Calcula o total de ganhadores com 10 acertos.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (acertoApostadores[i] == 10) {
                    ganhadores10Acertos += 1;
                }
            }

            //Apresenta os dados dos apostadores que obteram 10 acertos + o valor a ser pago a cada ganhador.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (acertoApostadores[i] == 10) {
                    JOptionPane.showMessageDialog(null, (i + 1) + "o Apostador\n\n"
                            + "nome___________________: " + bancoApostadores[i].getNome() + "\n"
                            + "telefone de contato___ : " + bancoApostadores[i].getTelefoneDeContato() + "\n"
                            + "e-mail de contato_____ : " + bancoApostadores[i].getEmailDeContato() + "\n"
                            + "valor a ser pago: " + format(valorPremio10 / ganhadores10Acertos)
                    );
                }
            }

            //Verifica se houve nenhum apostador com 10 acertos e apresenta uma mensagem.
            if (ganhadores10Acertos == 0) {
                JOptionPane.showMessageDialog(null, "Não houve apostador com 10 acertos.");
            }
        }
    }

    /**
     * Método: apresentarGanhadores9Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: apresenta os ganhadores
     * (nome, telefone e e-mail) que acertaram 9 palpites, além do valor a ser
     * pago individualmente a cada ganhador.
     */
    public static void apresentarGanhadores9Acertos() {

        //Verifica se existe resultado no vetor global "resultadoConcurso".
        if (resultadoConcurso[0] == -1) {
            JOptionPane.showMessageDialog(null, "O Resultado do concurso ainda não foi fornecido.");
        } else {
            int ganhadores9Acertos = 0;
            int acertoApostadores[] = new int[totalApostadoresBanco];
            double valorTotalApostas = valorLoteca * totalApostadoresBanco;
            double valorTotalPremio = (valorTotalApostas * 0.40);
            double valorPremio9 = (valorTotalPremio * 0.30);

            //Calcula os acertos dos apostadores e atribui ao vetor "acertoApostadores".
            for (int i = 0; i < totalApostadoresBanco; i++) {
                for (int j = 0; j < Apostador.MAX_JOGOS; j++) {
                    if (bancoApostadores[i].palpites[j] == resultadoConcurso[j]) {
                        acertoApostadores[i]++;
                    }
                }
            }

            //Calcula o total de ganhadores com 9 acertos.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (acertoApostadores[i] == 9) {
                    ganhadores9Acertos += 1;
                }
            }

            //Apresenta os dados dos apostadores que obteram 9 acertos + o valor a ser pago a cada ganhador.
            for (int i = 0; i < totalApostadoresBanco; i++) {
                if (acertoApostadores[i] == 9) {
                    JOptionPane.showMessageDialog(null, (i + 1) + "o Apostador\n\n"
                            + "nome___________________: " + bancoApostadores[i].getNome() + "\n"
                            + "telefone de contato___ : " + bancoApostadores[i].getTelefoneDeContato() + "\n"
                            + "e-mail de contato_____ : " + bancoApostadores[i].getEmailDeContato() + "\n"
                            + "valor a ser pago: " + format(valorPremio9 / ganhadores9Acertos)
                    );
                }
            }

            //Verifica se houve nenhum apostador com 9 acertos e apresenta uma mensagem.
            if (ganhadores9Acertos == 0) {
                JOptionPane.showMessageDialog(null, "Não houve apostador com 9 acertos.");
            }
        }
    }

    /**
     * Método: apresentarPercentualSexoBiologico()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: destaca o percentual de
     * apostadores do sexo feminino e masculino, além do total de apostadores
     * geral.
     */
    public static void apresentarPercentualSexoBiologico() {

        int totalSexoMasculino = 0;
        int totalSexoFeminino = 0;
        double percentualMasculino;
        double percentualFeminino;

        //Percorre todos os apostadores e verifica se o sexo é homem ou mulher.
        for (int i = 0; i < totalApostadoresBanco; i++) {
            if (bancoApostadores[i].nomeSexoBiologico().equals("Homem")) {
                totalSexoMasculino++;
            } else if (bancoApostadores[i].nomeSexoBiologico().equals("Mulher")) {
                totalSexoFeminino++;
            }
        }
        percentualMasculino = Math.round(((double) totalSexoMasculino / totalApostadoresBanco) * 100);
        percentualFeminino = Math.round(((double) totalSexoFeminino / totalApostadoresBanco) * 100);
        JOptionPane.showMessageDialog(null, "Total de Apostadores: " + totalApostadoresBanco
                + "\nPercentual de Apostadores do sexo Masculino: " + percentualMasculino
                + "%\nPercentual de Apostadores do sexo Feminino: " + percentualFeminino + "%");
    }

    /**
     * Método: apresentarPercentualTracoMarcante()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: mostra o percentual de
     * apostadores de cada um dos traços marcantes em ordem crescente.
     */
    public static void apresentarPercentualTracoMarcante() {
        // Variável interna "msg" que representa a mensagem que irá ser mostrada com o percentual do Traço Marcante
        String msg = "";
        // Matriz interna "traco" que na 1º coluna representa o código dos traços marcantes e na 2º coluna representa o percentual de traços marcantes
        double tracoMarcanteApostador[][] = new double[9][2];
        //Vetor interno "vetorTemporario" armazena temporáriamente o percentual de traços marcantes da 2º coluna da matriz "traco"
        double vetorTemporario[];

        //Preenche a primeira coluna da matriz com o código dos traços marcantes
        for (int x = 0; x < 9; x++) {
            tracoMarcanteApostador[x][0] = x;
        }

        //Adiciona a quantidade de pessoas com cada traço marcante na 2º coluna da matriz "traco"
        for (int cont = 0; cont < totalApostadoresBanco; cont++) {

            switch (bancoApostadores[cont].tracoMarcantePersonalidade()) {
                case 0:
                    tracoMarcanteApostador[0][1]++;
                    break;
                case 1:
                    tracoMarcanteApostador[1][1]++;
                    break;
                case 2:
                    tracoMarcanteApostador[2][1]++;
                    break;
                case 3:
                    tracoMarcanteApostador[3][1]++;
                    break;
                case 4:
                    tracoMarcanteApostador[4][1]++;
                    break;
                case 5:
                    tracoMarcanteApostador[5][1]++;
                    break;
                case 6:
                    tracoMarcanteApostador[6][1]++;
                    break;
                case 7:
                    tracoMarcanteApostador[7][1]++;
                    break;
                case 8:
                    tracoMarcanteApostador[8][1]++;
                    break;
            }

        }

        //Calcular o percentual de cada traço marcante na segunda coluna da matriz "traco" 
        for (int x = 0; x < 9; x++) {
            tracoMarcanteApostador[x][1] = (tracoMarcanteApostador[x][1] / totalApostadoresBanco) * 100;
        }

        //Ordenar a matriz "traco" em ordem crescente
        for (int i = 0; i < tracoMarcanteApostador.length; i++) {
            for (int j = i; j < tracoMarcanteApostador.length; j++) {
                if (tracoMarcanteApostador[i][1] > tracoMarcanteApostador[j][1]) {
                    vetorTemporario = tracoMarcanteApostador[i];
                    tracoMarcanteApostador[i] = tracoMarcanteApostador[j];
                    tracoMarcanteApostador[j] = vetorTemporario;
                }
            }
        }

        //Armazenar a mensagem que será exibida
        for (int x = 0; x < 9; x++) {
            switch ((int) tracoMarcanteApostador[x][0]) {
                case 0:
                    msg = msg + "Irresistível: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 1:
                    msg = msg + "Impetuoso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 2:
                    msg = msg + "Discreto: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 3:
                    msg = msg + "Amoroso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 4:
                    msg = msg + "Tímido: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 5:
                    msg = msg + "Paquerador: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 6:
                    msg = msg + "Estudioso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 7:
                    msg = msg + "Sonhador: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
                case 8:
                    msg = msg + "Charmoso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    /**
     * Método: apresentarTracoGanhadores10Acertos()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: mostra o percentual de
     * traço marcante de cada um dos apostadores que acertaram os 10 jogos em
     * ordem decrescente.
     */
    public static void apresentarTracoGanhadores10Acertos() {
        //Verifica se existe resultado no vetor global "resultadoConcurso".  
        if (resultadoConcurso[0] != -1) {
            int acertos = 0;
            int ganhadores10Acertos = 0;
            String msg = "";

            //Verifica o número de acertos dos apostadores e acrescenta +1 na variável "ganhadores10Acertos" caso exista apostadores com 10 acertos.
            for (int cont = 0; cont < totalApostadoresBanco; cont++) {
                for (int g = 0; g < Apostador.MAX_JOGOS; g++) {
                    if (bancoApostadores[cont].palpites[g] == resultadoConcurso[g]) {
                        acertos++;
                    }
                }
                if (acertos == 10) {
                    ganhadores10Acertos++;
                }

                acertos = 0;

            }

            //Verifica se existe apostadores com 10 acertos na variável "ganhadores10Acertos".
            if (ganhadores10Acertos != 0) {

                double tracoMarcanteApostador[][] = new double[9][2];

                //Preenche a primeira coluna da matriz com o código dos traços marcantes.
                for (int x = 0; x < 9; x++) {
                    tracoMarcanteApostador[x][0] = x;
                }

                //Adiciona a quantidade de pessoas com cada traço marcante na 2º coluna da matriz "traco"
                for (int y = 0; y < ganhadores10Acertos; y++) {
                    switch (bancoApostadores[y].tracoMarcantePersonalidade()) {
                        case 0:
                            tracoMarcanteApostador[0][1]++;
                            break;
                        case 1:
                            tracoMarcanteApostador[1][1]++;
                            break;
                        case 2:
                            tracoMarcanteApostador[2][1]++;
                            break;
                        case 3:
                            tracoMarcanteApostador[3][1]++;
                            break;
                        case 4:
                            tracoMarcanteApostador[4][1]++;
                            break;
                        case 5:
                            tracoMarcanteApostador[5][1]++;
                            break;
                        case 6:
                            tracoMarcanteApostador[6][1]++;
                            break;
                        case 7:
                            tracoMarcanteApostador[7][1]++;
                            break;
                        case 8:
                            tracoMarcanteApostador[8][1]++;
                            break;
                    }
                }

                //Calcular o percentual de cada traço marcante na segunda coluna da matriz "traco".
                for (int x = 0; x < 9; x++) {
                    tracoMarcanteApostador[x][1] = (tracoMarcanteApostador[x][1] / ganhadores10Acertos) * 100;
                }

                //Ordenar a matriz "traco" em ordem decrescente.
                for (int i = 0; i < tracoMarcanteApostador.length; i++) {
                    for (int j = i; j < tracoMarcanteApostador.length; j++) {
                        if (tracoMarcanteApostador[i][1] < tracoMarcanteApostador[j][1]) {
                            double[] vetorTemporario = tracoMarcanteApostador[i];
                            tracoMarcanteApostador[i] = tracoMarcanteApostador[j];
                            tracoMarcanteApostador[j] = vetorTemporario;
                        }
                    }
                }

                //Acrescenta na variável "msg" o traço marcante + a porcentagem de pessoas com esse traço.
                for (int x = 0; x < 9; x++) {
                    switch ((int) tracoMarcanteApostador[x][0]) {
                        case 0:
                            msg = msg + "Irresistível: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 1:
                            msg = msg + "Impetuoso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 2:
                            msg = msg + "Discreto: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 3:
                            msg = msg + "Amoroso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 4:
                            msg = msg + "Tímido: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 5:
                            msg = msg + "Paquerador: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 6:
                            msg = msg + "Estudioso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 7:
                            msg = msg + "Sonhador: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                        case 8:
                            msg = msg + "Charmoso: " + format(tracoMarcanteApostador[x][1]) + "%\n";
                            break;
                    }
                }
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Não houveram ganhadores com 10 acertos!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O Resultado do concurso ainda não foi fornecido.");
        }
    }

    /**
     * Método: limparResultadosDoConcurso()
     *
     * @param: lista de parâmetros inexistente.
     * @return: nenhum valor de retorno. Funcionalidade: zera os resultados do
     * concurso fornecidos no metodo cadastrarResultadoConcurso().
     */
    public static void limparResultadosDoConcurso() {

        for (int i = 0; i < Apostador.MAX_JOGOS; i++) {
            resultadoConcurso[i] = -1;
        }
        JOptionPane.showMessageDialog(null, "O resultado do concurso foi apagado.");
    }

    /**
     * Método: verificarTerminoDoSistema()
     *
     * @param: lista de parâmetros inexistente.
     * @return: resposta com a informação de término ou não do sistema.
     * Funcionalidade: verifica se o usuário deseja realmente finalizar o
     * sistema. Se sim, retorna a constante TERMINA_SISTEMA, caso contrário,
     * retorna a constante NAO_TERMINA_SISTEMA.
     */
    public static int verificarTerminoDoSistema() {
        int resposta
                = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar o sistema?",
                        "Finalizar Sistema",
                        JOptionPane.YES_NO_OPTION);

        // Se resposta fornecida for igual a YES
        if (resposta == JOptionPane.YES_OPTION) {
            return TERMINA_SISTEMA;
        } else {
            return NAO_TERMINA_SISTEMA;
        }
    }

    /**
     * Método: main()
     *
     * @param: String [] args: vetor de argumentos fornecidos na linha de
     * comando durante a chamada do sistema.
     * @return: nenhum valor de retorno. Funcionalidades: carrega o banco de
     * dados de pessoas pré-cadastradas da empresa apresentar o menu de 13
     * opções e chamar os módulos correspondentes a cada uma.
     */
    public static void main(String[] args) {

        int opcao; // recebe a opção do menu selecionada pelo usuário
        // Carrega o banco de dados de pessoas pré-cadastradas da empresa
        carregarBanco();
        // Inicia opção com NAO_TERMINA_SISTEMA
        // Estratégia utilizada somente para apresentar pela 1a vez o menu de opções
        // do RHRSis e continuar a exibir enquanto o usuário desejar continuar a usá-lo
        opcao = NAO_TERMINA_SISTEMA;
        //Começa o programa sem resultado para os jogos
        for (int i = 0; i < Apostador.MAX_JOGOS; i++) {
            resultadoConcurso[i] = -1;
        }
        // Verifica se o usuário realmente deseja terminar de executar o sistema
        while (opcao != TERMINA_SISTEMA) {

            switch (menuOpcoes()) {
                // 1 - fornecer valor da X da loteca
                case 1:
                    fornecerValorXDaLoteca();
                    break;

                // 2 - cadastrar resultado do concurso
                case 2:
                    cadastrarResultadoConcurso();
                    break;

                // 3 - Cadastrar Apostas de Jogos 
                case 3:
                    cadastrarApostasDeJogos();
                    break;

                // 4 - Apresentar Apostadores (implementado)
                case 4:
                    apresentarApostadores();
                    break;

                // 5 - Apresentar Valores (Total e Prêmios)	
                case 5:
                    apresentarValoresTotalEPremios();
                    break;

                // 6 - Apresentar Acertos
                case 6:
                    apresentarAcertos();
                    break;

                // 7 - Apresentar Jogos Zerados
                case 7:
                    apresentarJogosZerados();
                    break;

                // 8 - Apresentar Ganhadores 10 acertos
                case 8:
                    apresentarGanhadores10Acertos();
                    break;

                // 9 - Apresentar Ganhadores 9 acertos 
                case 9:
                    apresentarGanhadores9Acertos();
                    break;

                // 10 - Apresentar Percentual Sexo Biológico
                case 10:
                    apresentarPercentualSexoBiologico();
                    break;

                // 11 - Apresentar Percentual Traço Marcante
                case 11:
                    apresentarPercentualTracoMarcante();
                    break;

                // 12 - Apresentar Traço Ganhadores 10 acertos.
                case 12:
                    apresentarTracoGanhadores10Acertos();
                    break;

                // 13 - Limpar Resultados do Concurso.
                case 13:
                    limparResultadosDoConcurso();
                    break;

                // 14 - verifica se o usuário deseja realmente finalizar o sistema.
                //      Se sim, retorna a constante TERMINA_SISTEMA, caso contrário,
                //      retorna a constante NAO_TERMINA_SISTEMA. (Implementado)
                case 14:
                    opcao = verificarTerminoDoSistema();
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Obrigado por utilizar a Loteca Digital Simplificada!\n\n"
                + "Desenvolvedor(es):\n"
                + "Ailton Lima de Andrade\n"
                + "Caio Cesar de Deus\n"
                + "Felipe Silva Lopes\n"
                + "Amanda Ornelas\n
                + "Guilherme Ferreira");
        System.exit(0);
    }
}
