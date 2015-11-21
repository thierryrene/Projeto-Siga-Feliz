

# Projeto-Siga-Feliz
Código fonte JAVA  - Venda de Passagens

PROJETO: RESERVA	DE	PASSAGENS

DESCRIÇÃO	DO	PROJETO

</br>A Empresa de ônibus “Siga Feliz” precisa de um sistema para realizar o controle de passagens
vendidas. Sabe-se que um ônibus possui 48 lugares, sendo 24 janela e 24 corredor. Faça um
programa que utilize dois vetores para controlar as poltronas ocupadas na janela e no
corredor. Considerar que 0 (zero) representa poltrona desocupada e 1 (um), poltrona
ocupada. </br>

Inicialmente, todas as poltronas estarão livres, ou seja, setadas com ZERO. Depois disso, o
programa deverá apresentar um menu com as seguintes opções:</br>

<ul>
<li>MENU – VENDA DE PASSAGENS</li>
<li>1. Vender passagem</li>
<li>2. Mapa de ocupação</li>
<li>3. Encerrar</li>
</ul>

</br>Quando a opção escolhida for 1 - VENDER PASSAGEM, deverá ser perguntado qual é o
número da poltrona desejada. Caso o número da poltrona esteja livre, solicitar se o usuário
deseja janela (J) ou corredor (C). Dadas essas duas entradas, o programa deverá, então,
emitir uma das seguintes mensagens (Ver item restrições):</br>

<ul>
<li>• VENDA EFETIVADA – se a poltrona solicitada estiver livre! Ao efetivar a venda o
programa deve marcar a poltrona como ocupada. Dado o exemplo da figura 1, se o
usuário escolher a poltrona 1 na janela, emitir a mensagem “venda efetivada”, marcar
a poltrona como ocupada e retornar ao menu principal.</li>
</br>
<li>• POLTRONA OCUPADA – se a poltrona solicitada não estiver disponível para venda!</li>

</br>Se a poltrona 4 no corredor estiver vendida, Se o usuário quiser comprar a poltrona 4 no corredor,
deve-se emitir a mensagem “poltrona ocupada” e retornar ao menu principal.</br>
</br>
<li>• ÔNIBUS LOTADO – quando todas as poltronas já estiverem ocupadas.</li>
</ul>

</br>Quando a opção escolhida for 2 - MAPA DE OCUPAÇÃO, deverá ser mostrada uma
listagem apresentando o mapa de ocupação do ônibus, conforme segue:

<table>
<tr>
  <td>JANELA</td><td>CORREDOR</td>
</tr>  
<tr>
  <td>1 – Livre</td><td>1 – Livre</td>
</tr>
<tr>
  <td>2 – Ocupada</td><td>2 – Livre</td>
</tr>
<tr>
  <td>3 – Livre</td><td>3 – Livre</td>
</tr>
<tr>
  <td>4 – Ocupada</td><td>4 – Livre</td>
</tr><tr>
  <td>5 – Livre</td><td>5 – Livre</td>
</tr>
<tr>
  <td> ...</td>
</tr>
</table>

</br>Quando for escolhida a opção 3 - ENCERRAR, finalizar a execução do programa. Para
tanto, utilizar a instrução: System.exit(0).

</br>A execução do programa deve finalizar somente quando o usuário escolher a opção ENCERRAR.

<h3>RESTRIÇÕES</h3>
Para o item 1 do menu (Vender Passagem) - O usuário deve informar o número da
poltrona entre 1 e 24. O algoritmo deve validar esse número. Caso o usuário digite um
número inválido uma mensagem de erro dever ser informada e o número da poltrona deve
ser solicitado novamente.

</br>A escolha entre corredor e janela dever ser lida como J (Janela) e C (Corredor). Caso o
usuário digite uma letra diferente uma mensagem de erro (Ex: Tipo errado!) deve ser
informada e o tipo da poltrona deve ser solicitado novamente. Visto que o usuário já digitou
o número da poltrona, o algoritmo deve apenas solicitar novamente, o tipo J (Janela) ou C
(Corredor).

</br>O algoritmo SOMENTE pode ser finalizado quando o usuário escolher a opção 3 – Encerrar.

</br>Após a escolha das opções 1 ou 2, o algoritmo deve apresentar as mensagens necessárias e
retornar ao menu principal.
