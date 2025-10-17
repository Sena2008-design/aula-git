package aulaheranca10;

    public class AnaliseCurriculoIFBA {
    
        public static void main(String[] args) {
    
            Scanner input = (System.in);
    
            // Coleta dos dados do candidato
            System.out.println("=== Sistema de Análise de Currículos - IFBA ===");
    
            System.out.print("Digite o nome do candidato: ");
            String nome = input.nextLine();
    
            System.out.print("Digite a formação do candidato: ");
            String formacao = input.nextLine();
    
            System.out.print("Digite os anos de experiência: ");
            int experiencia = input.nextInt();
            input.nextLine(); // limpa o buffer
    
            System.out.print("Digite as principais competências (separadas por vírgula): ");
            String competencias = input.nextLine();
    
            // Cálculo de pontuação simples
            double pontuacao = calcularPontuacao(experiencia, competencias, formacao);
    
            // Exibição dos resultados
            System.out.println("\n--- Resultado da Análise ---");
            System.out.println("Nome: " + nome);
            System.out.println("Formação: " + formacao);
            System.out.println("Anos de Experiência: " + experiencia);
            System.out.println("Competências: " + competencias);
            System.out.println("Pontuação Final: " + pontuacao);
    
            // Classificação
            if (pontuacao >= 10) {
                System.out.println("Status: Candidato altamente qualificado!");
            } else if (pontuacao >= 6) {
                System.out.println("Status: Candidato adequado.");
            } else {
                System.out.println("Status: Candidato com perfil iniciante.");
            }
    
            input.close();
        }
    
        // Função simples para calcular pontuação do candidato
        public static double calcularPontuacao(int experiencia, String competencias, String formacao) {
            double pontos = experiencia * 1.5;
    
            // Critérios básicos de bônus
            if (competencias.toLowerCase().contains("java")) pontos += 2;
            if (competencias.toLowerCase().contains("sql")) pontos += 1.5;
            if (formacao.toLowerCase().contains("engenharia") || formacao.toLowerCase().contains("sistemas")) pontos += 3;
    
            return pontos;
        }
    }
     

