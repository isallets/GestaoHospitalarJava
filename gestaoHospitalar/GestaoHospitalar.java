package gestaohospitalar2;

import java.util.Scanner;

public class GestaoHospitalar {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        // Vetores.
        Paciente pacientes[] = new Paciente[100];
        Medico medicos[] = new Medico[100];
        
        GerenciaMedicos gm = new GerenciaMedicos(medicos);
        GerenciaPacientes gp = new GerenciaPacientes(pacientes);
        
        int op1, op2;
        
        do{
            System.out.println("--==[Gestão Hospitalar]==--");
            System.out.println("1 - Médicos");
            System.out.println("2 - Pacientes");
            System.out.println("3 - Sair");
            System.out.println("Opção: ");
            op1 = e.nextInt();
            e.skip("\n");
            
            switch(op1){
                case 1:
                    do{
                        System.out.println("--==[Médicos]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Relatório");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch(op2){
                            case 1:
                                gm.cadastrar();
                                break;
                            case 2:
                                gm.alterar();
                                break;
                            case 3:
                                gm.excluir();
                                break;
                            case 4:
                                gm.consultar();
                                break;
                            case 5:
                                gm.relatorio();
                        }
                    }while(op2 != 6);
                    break;
                case 2:
                    do{
                        System.out.println("--==[Pacientes]==--");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Relatório");
                        System.out.println("6 - Voltar ao menu principal");
                        System.out.println("Opção: ");
                        op2 = e.nextInt();
                        e.skip("\n");

                        switch(op2){
                            case 1:
                                gp.cadastrar();
                                break;
                            case 2:
                                gp.alterar();
                                break;
                            case 3:
                                gp.excluir();
                                break;
                            case 4:
                                gp.consultar();
                                break;
                            case 5:
                                gp.relatorio();
                        }
                    }while(op2 != 6);
            }
        }while(op1 != 3);
    }
}
