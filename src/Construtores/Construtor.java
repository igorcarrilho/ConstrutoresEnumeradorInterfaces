package Construtores;
import Construtores.Aluno.STATUS;
import Construtores.Aluno.MATRICULA;
import jdk.swing.interop.SwingInterOpUtils;

public class Construtor {
    public static void main(String[] args){
        // passando os dados através do construtor com sobrecarga
        Aluno alu = new Aluno(8, 8, 8);
        //calculando a média
        double mediaAlunoFinal = alu.calcularMediaAluno();

        //definindo situação do aluno
        if(mediaAlunoFinal < 6){
            alu.situacaoAluno = STATUS.REPROVADO;
        }else{
            alu.situacaoAluno = STATUS.APROVADO;
        }

        System.out.println("A média do aluno é: " + alu.calcularMediaAluno() + " e o aluno está " + alu.situacaoAluno);

        //usa enum matrícula
        alu.situacaoMatricula = MATRICULA.MATRICULADO;
        System.out.println("O aluno está: " + alu.situacaoMatricula);
    }
}
