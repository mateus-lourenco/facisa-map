package br.edu.unifacisa.main;

import java.util.Scanner;

import br.edu.unifacisa.entities.Agente;
import br.edu.unifacisa.entities.Endereco;
import br.edu.unifacisa.entities.Passageiro;
import br.edu.unifacisa.entities.Pessoa;
import br.edu.unifacisa.entities.Tripulacao;

public class AviacaoApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome = null;
		String rua = null;
		String cidade = null;
		String uf = null;
		Pessoa pessoa = null;

		System.out.print("Digite o nome da Pessoa : ");
		nome = in.nextLine();
		System.out.print("Digite a rua de " + nome + " : ");
		rua = in.nextLine();
		System.out.print("Qual a cidade : ");
		cidade = in.nextLine();
		System.out.print("Qual a unidade federativa : ");
		uf = in.nextLine();

		pessoa = new Pessoa(nome, new Endereco(rua, cidade, uf));

		Tripulacao trip = null;
		System.out.print("Insira o numero da tripulacao : ");
		trip = new Tripulacao(pessoa, in.nextInt());

		Passageiro pass = null;
		System.out.print("Insira o numero de Smiles: ");
		pass = new Passageiro(pessoa, in.nextInt());

		Agente agente = null;
		System.out.print("Insira o id: ");
		agente = new Agente(pessoa, in.nextInt());

		System.out.println(trip.toString());
		System.out.println(pass.toString());
		System.out.println(agente.toString());

		in.close();
	}
}
